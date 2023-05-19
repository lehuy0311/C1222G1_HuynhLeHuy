package com.example.customer_management;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebServlet(name ="ListCustomerServlet", value = "/display-list-customer")
public class ListCustomerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("Mai Văn Hoàn", LocalDate.of(1983, 8, 20), "Hà Nội","https://i.pinimg.com/originals/1d/95/2c/1d952ca4ac5d0e95884b1aea8b973a12.jpg" ));
        customerList.add(new Customer("Nguyễn Văn Nam", LocalDate.of(1983, 8, 21), "Bắc Giang","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS6FuQarZbXE47dskzECYpRj2NsbLjwSS-cBA&usqp=CAU" ));
        customerList.add(new Customer("Nguyễn Thái Hòa ", LocalDate.of(1983, 8, 22), "Nam Định","https://i.ytimg.com/vi/WTewBc3d8Wc/maxresdefault.jpg" ));
        customerList.add(new Customer("Trần Đăng Khoa", LocalDate.of(1983, 8, 17), "Hà Tây","https://budtronkhatkhao.com/wp-content/uploads/2022/08/hinh-anh-pokemon-chibi-11.jpg" ));
        customerList.add(new Customer("Nguyễn Đình Thi", LocalDate.of(1983, 8, 19), "Hà Nội","https://i.pinimg.com/550x/66/42/4b/66424bd2658512b7c7ae8422678272a2.jpg" ));
        req.setAttribute("customerList", customerList);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/list-customer.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
