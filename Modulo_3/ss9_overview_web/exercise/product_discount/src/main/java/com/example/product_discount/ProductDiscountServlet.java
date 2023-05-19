package com.example.product_discount;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name ="ProductDiscountServlet", value = "/display-discount")
public class ProductDiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        int listPrice = Integer.parseInt(req.getParameter("ListPrice"));
        int discountPercent = Integer.parseInt(req.getParameter("DiscountPercent"));
        double discountAmount = listPrice * discountPercent * 0.01;
        int discountPrice = (int) (listPrice - discountAmount);
        writer.println("<html><body>");
        writer.println("<h1>Discount Amount: " + discountAmount + "</h1>");
        writer.println("<h1>Discount Price: " + discountPrice + "</h1>");
        writer.println("</body></html>");

    }
}
