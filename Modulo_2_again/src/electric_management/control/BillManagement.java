package electric_management.control;


import java.util.Scanner;

public class BillManagement {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        String choice;
        do{
            System.out.println("-------Menu----------");
            System.out.println("1.Display");
            System.out.println("2.Add");
            System.out.println("3.Delete");
            System.out.println("4.Edit");
            System.out.println("5.Exit");
            System.out.println("Please input your choice");

            choice = scanner.nextLine();
            switch (choice){
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    System.exit(5);
                    break;
                default:
                    System.out.println("Please input again!!");
            }
        }while (!choice.equals("5"));
    }

}
