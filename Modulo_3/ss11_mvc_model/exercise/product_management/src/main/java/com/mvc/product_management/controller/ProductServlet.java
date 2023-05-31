package com.mvc.product_management.controller;

import com.mvc.product_management.model.Product;
import com.mvc.product_management.service.ProductService;
import com.sun.jndi.toolkit.ctx.HeadTail;
import jdk.dynalink.linker.LinkerServices;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name="ProductServlet", value = "/products")

public class ProductServlet extends HttpServlet {
    private ProductService productService = new ProductService();
    private HttpServletRequest req;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "create":
                showFromAdd(req, resp);
                break;
            case "edit":
                showFormEdit(req, resp);
                break;
            case "view":
                viewDetailProduct(req, resp);
                break;
            case "delete":
                showFormDelete(req, resp);
                break;
            default:
                showProductList(req, resp);
                break;
        }
    }

    private void showProductList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> productList = productService.getProductList();
        req.setAttribute("productList", productList );
        RequestDispatcher dispatcher = req.getRequestDispatcher("/product/ListCustomer.jsp");
        dispatcher.forward(req,resp);

    }

    private void showFormDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Product product = productService.getProductById(id);
        req.setAttribute("product", product);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/product/FormDelete.jsp");
        dispatcher.forward(req, resp);
    }

    private void viewDetailProduct(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Product product = productService.getProductById(id);
        req.setAttribute("product", product);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/product/DetailProduct.jsp");
        dispatcher.forward(req, resp);
    }

    private void showFormEdit(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        int id = Integer.parseInt(req.getParameter("id"));
        Product product = productService.getProductById(id);
        req.setAttribute("product", product);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/product/FormEdit.jsp");
        dispatcher.forward(req, resp);
    }

    private void showFromAdd(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/product/FormAdd.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "create":
                create(req, resp);
                break;
            case "edit":
                edit(req, resp);
                break;
            case "delete":
                delete(req, resp);
                break;
            case "search":
                searchByName(req, resp);
                break;
            default:
                showProductList(req, resp);
                break;
        }
    }

    private void searchByName(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        List<Product> productList = new ArrayList<>();
        String name = req.getParameter("nameSearch");
        for (Product product: productService.findByName(name)) {
            productList.add(product);
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("product/ListCustomer.jsp");
        req.setAttribute("productList", productList);
        dispatcher.forward(req, resp);
    }

    private void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        int deleteId = Integer.parseInt(req.getParameter("deleteId"));
        productService.deleteProduct(deleteId);
        resp.sendRedirect("/product/ListCustomer.jsp");
    }

    private void edit(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int editId = Integer.parseInt(req.getParameter("editId"));
        String name = req.getParameter("name");
        String describe = req.getParameter("describe");
        String price = req.getParameter("price");
        Product editProduct = new Product(editId,name, describe, price);
        productService.updateProduct(editId, editProduct);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/product/ListCustomer.jsp");
        dispatcher.forward(req, resp);
    }

    private void create(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        int newId = Integer.parseInt(req.getParameter("newId"));
        String name = req.getParameter("name");
        String describe = req.getParameter("describe");
        String price = req.getParameter("price");
        Product newProduct = new Product(newId,name, describe, price);
        productService.addNewProduct(newProduct);
//        RequestDispatcher dispatcher = req.getRequestDispatcher("/product/ListCustomer.jsp");
//        dispatcher.forward(req, resp);
        resp.sendRedirect("/products");
    }
}
