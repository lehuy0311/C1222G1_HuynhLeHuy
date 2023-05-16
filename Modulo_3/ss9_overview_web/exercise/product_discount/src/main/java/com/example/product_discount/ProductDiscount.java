package com.example.product_discount;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name ="ProductDiscount", value = "/index")
public class ProductDiscount extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int  price = Integer.parseInt(req.getParameter("price"));
        int discount =Integer.parseInt(req.getParameter("discount"));
        double discountAmount = price * discount * 0.01;
        double discountPrice = price - discountAmount;
        req.setAttribute("discountAmount" , discountAmount);
        req.setAttribute("discountPrice" , discountPrice);
        req.getRequestDispatcher("/result.jsp").forward(req,resp);
    }
}
