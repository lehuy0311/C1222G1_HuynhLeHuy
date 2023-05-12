package electric_management.view;

import electric_management.control.BillManagement;

public class Main {
    public static void main(String[] args) {
        BillManagement billManagement = new BillManagement();
        billManagement.menu();
    }
}
