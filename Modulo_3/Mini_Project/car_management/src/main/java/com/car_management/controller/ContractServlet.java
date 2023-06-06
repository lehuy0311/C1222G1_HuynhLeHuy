package com.car_management.controller;

import com.car_management.model.hop_dong;
import com.car_management.service.IContractService;
import com.car_management.service.impl.ContractService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name ="ContractServlet", value = "/ContractServlet")
public class ContractServlet extends HttpServlet {
    private IContractService iContractService =new ContractService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "showFormCreateContract":
                showFormCreateContract(req, resp);
//              response.sendRedirect("/view/contract/create_contract.jsp");
            case "showFormEditContract":
                showFormEditContract(req,resp);
            default:
                showListContract(req, resp);
        }
    }

    private void showListContract(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<hop_dong> list = iContractService.displayContract();
        request.setAttribute("list", list);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/contract/list_contract.jsp");
        requestDispatcher.forward(request, response);
    }

    private void showFormCreateContract(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view/contract/create_contract.jsp");
        requestDispatcher.forward(request, response);
//      response.sendRedirect("/view/contract/create_contract.jsp");

    }

    private void showFormEditContract(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id=Integer.parseInt(request.getParameter("id"));
        hop_dong hop_dong= iContractService.searchContractById(id);
        request.setAttribute("hop_dong",hop_dong);
        RequestDispatcher requestDispatcher= request.getRequestDispatcher("/view/contract/edit_contract.jsp");
        requestDispatcher.forward(request, response);
        response.sendRedirect("/view/contract/edit_contract.jsp");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createNewContract(req, resp);
                break;
            case "delete":
                deleteContract(req, resp);
                break;
            case "edit":
                editContract(req, resp);
            default:
                showListContract(req, resp);
        }
    }

    private void editContract(HttpServletRequest request, HttpServletResponse response) throws IOException{
        int idContract_edit = Integer.parseInt(request.getParameter("idContract_edit"));
        String dateContract_edit = request.getParameter("dateContract_edit");
        double deposits_edit = Double.parseDouble(request.getParameter("deposits_edit"));
        int quantityCar_edit = Integer.parseInt(request.getParameter("quantityCar_edit"));
        int idPayment_edit = Integer.parseInt(request.getParameter("idPayment_edit"));
        int idCar_edit = Integer.parseInt(request.getParameter("idCar_edit"));
        int idEmployee_edit = Integer.parseInt(request.getParameter("idEmployee_edit"));
        int idCustomer_edit = Integer.parseInt(request.getParameter("idCustomer_edit"));
        iContractService.updateContract(new hop_dong(idContract_edit, dateContract_edit, deposits_edit,
                quantityCar_edit,idPayment_edit,idCar_edit,idEmployee_edit,idCustomer_edit));
        response.sendRedirect("/ContractServlet");
    }

    private void deleteContract(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("idDelete"));
        iContractService.deleteContract(id);
        try {
            response.sendRedirect("/ContractServlet");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void createNewContract(HttpServletRequest request, HttpServletResponse response) {
        int idContract = Integer.parseInt(request.getParameter("idContract"));
        String dateContract = request.getParameter("dateContract");
        double deposits = Double.parseDouble(request.getParameter("deposits"));
        int quantityCar = Integer.parseInt(request.getParameter("quantityCar"));
        int idPayment = Integer.parseInt(request.getParameter("idPayment"));
        int idCar = Integer.parseInt(request.getParameter("idCar"));
        int idEmployee = Integer.parseInt(request.getParameter("idEmployee"));
        int idCustomer = Integer.parseInt(request.getParameter("idCustomer"));

        hop_dong hop_dong = new hop_dong(idContract, dateContract, deposits,
                quantityCar,idPayment,idCar,idEmployee,idCustomer);
        iContractService.createNewContract(hop_dong);
        try {
            response.sendRedirect("/ContractServlet");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
