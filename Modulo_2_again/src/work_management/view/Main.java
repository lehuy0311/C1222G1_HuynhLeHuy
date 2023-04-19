package work_management.view;

import work_management.controller.WorkController;
import work_management.model.Target;

public class Main {
    public static void main(String[] args) {
        WorkController workController = new WorkController();
        workController.menu();
    }
}
