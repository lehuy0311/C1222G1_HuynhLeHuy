package more_again.service.impl;

import more_again.common.ReadFilePerson;
import more_again.models.Customer;
import more_again.models.Employee;
import more_again.repository.ICustomerRepository;
import more_again.repository.IEmployeeRepository;
import more_again.repository.impl.CustomerRepository;
import more_again.repository.impl.EmployeeRepository;
import more_again.service.ICustomerService;

import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private ICustomerRepository iCustomerRepository = new CustomerRepository();
    private Scanner scanner = new Scanner(System.in);
    public static final String CUSTOMER_PATH ="src/more_again/data/Customer.csv";

    public void displayCustomer(){
        iCustomerRepository.displayCustomer();
    }
    public void addCustomer(){
        List<Customer> customerList = ReadFilePerson.readCustomer(CUSTOMER_PATH);
        System.out.println("Nhập id khách hàng: ");
        try{
            int id = Integer.parseInt(scanner.nextLine());
            boolean flag = true;
            for(int i =0; i<customerList.size(); i++){
                if (id == customerList.get(i).getId()){
                    flag = false;
                    break;
                }
            }
            if (flag = true){
                System.out.println("Nhập tên khách hàng");
                String name = scanner.nextLine();
                System.out.println("Nhập ngày sinh");
                String dateOfBirth = scanner.nextLine();
                System.out.println("Nhập giới tính");
                String temp = scanner.nextLine();
                Boolean gender;
                if (temp.equals("Nam ")){
                    gender = true;
                }else if (temp.equals("Nữ")){
                    gender = false;
                }else {
                    gender = null;
                }
                System.out.println("Nhập cmnd");
                String cmnd = scanner.nextLine();
                System.out.println("Nhập số điện thoại");
                String phone = scanner.nextLine();
                System.out.println("Nhập email");
                String email = scanner.nextLine();
                System.out.println("Loại khách hàng");
                String type=scanner.nextLine();
                System.out.println("Vị trí đang làm");
                String address = scanner.nextLine();

                Customer customer = new Customer(id, name,
                        dateOfBirth, gender, cmnd, phone,
                        email, type, address);
                iCustomerRepository.addCustomer(customer);
            }else {
                System.out.println("ID đã tồn tại!!");
            }

        }catch (NumberFormatException e){
            System.out.println("Mời bạn hập lại số");
        }catch (Exception e){
            System.out.println("Mời nhập lại!!");
        }
    }

    public void editCustomer() {
        List<Customer> customerList = ReadFilePerson.readCustomer(CUSTOMER_PATH);
        System.out.println("Nhập id khách hàng: ");
        int id;
        int index;
        try {
            id = Integer.parseInt(scanner.nextLine());
            boolean flag = false;
            index = -1;
            for (int i = 0; i < customerList.size(); i++) {
                if (id == customerList.get(i).getId()) {
                    index = i;
                    flag = true;
                    break;
                }
            }
            if (flag == true) {
                System.out.println("Đã tìm thấy Id");

                System.out.println("Nhập tên employee");
                String name = scanner.nextLine();
                System.out.println("Nhập ngày sinh");
                String dateOfBirth = scanner.nextLine();
                System.out.println("Nhập giới tính");
                String temp = scanner.nextLine();
                Boolean gender;
                if (temp.equals("Nam ")) {
                    gender = true;
                } else if (temp.equals("Nữ")) {
                    gender = false;
                } else {
                    gender = null;
                }
                System.out.println("Nhập cmnd");
                String cmnd = scanner.nextLine();
                System.out.println("Nhập số điện thoại");
                String phone = scanner.nextLine();
                System.out.println("Nhập email");
                String email = scanner.nextLine();
                System.out.println("Loại khách hàng");
                String type = scanner.nextLine();
                System.out.println("Vị trí");
                String address = scanner.nextLine();


                Customer customer = new Customer(id, name,
                        dateOfBirth, gender, cmnd, phone,
                        email, type, address);

                iCustomerRepository.editCustomer(index, customer);

            } else {
                System.out.println("ID no find");
                editCustomer();
            }
        } catch (NumberFormatException e) {
            System.out.println("Mời nhập lại!!");
            editCustomer();
        } catch (Exception e) {
            System.out.println("Error");
        }

    }

    public void removeCustomer() {

    }
}
