package work_management.controller;

import work_management.service.ITargetService;
import work_management.service.TargetService;

import java.util.Scanner;

public class WorkController {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        ITargetService iTargetService = new TargetService();
        int choice;
        do {
            System.out.println("---------Menu-----------");
            System.out.println("1. Display");
            System.out.println("2. Add");
            System.out.println("3. Delete");
            System.out.println("4. Edit");
            System.out.println("5. Search by id");
            System.out.println("6. Search by name ");
            System.out.println("7. Sort by name ascending");
            System.out.println("8. Sort by money ascending");
            System.out.println("9. Exit");
            System.out.print("Please input your choice:");

            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    iTargetService.getAll();
                    break;
                case 2:
                    iTargetService.add();
                    break;
                case 3:
                    iTargetService.delete();
                    break;
                case 4:
                    iTargetService.edit();
                    break;
                case 5:
                    iTargetService.findById();
                    break;
                case 6:
                    iTargetService.findByName();
                    break;
                case 7:
                    iTargetService.sortName();
                    break;
                case 8:
                    iTargetService.sortMoney();
                    break;
                case 9:
                    System.exit(9);
                    break;
            }
        }while (choice != 9);
    }

}
