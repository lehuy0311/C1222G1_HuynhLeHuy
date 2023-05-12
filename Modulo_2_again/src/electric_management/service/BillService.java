package electric_management.service;

import electric_management.common.ReadFile;
import electric_management.model.Bill;
import electric_management.repository.BillRepository;
import electric_management.repository.IBillRepository;

import java.util.List;
import java.util.Scanner;

public class BillService implements IBillService {
    private IBillRepository iBillRepository = new BillRepository();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void getAll() {
        List<Bill> billList = iBillRepository.display();
        if (billList.size() == 0){
            System.out.println("No data");
        }else {
            for (Bill bill: billList){
                System.out.println(bill.writeToCsv());
            }
        }

    }
    public boolean check(String id){
        List<Bill> billList = iBillRepository.display();
        for (Bill bill:billList){
            if(bill.getId().equals(id)){
                return true
            }
        }
        return false;
    }

    @Override
    public void add() {
        List<Bill> billList = iBillRepository.display();
        System.out.println("Input id");
        String id = scanner.nextLine();
        if(check(id) == false){
            System.out.println("Input name");
            String name = scanner.nextLine();
            System.out.println("Input type");
            String type = scanner.nextLine();
            System.out.println("Input price");
            Double price = Double.parseDouble(scanner.nextLine());

            Bill bill = new Bill(id, name, type, price);
            billList.add(bill);
            iBillRepository.add(billList);
            System.out.println("Add success");

        }else {
            System.out.println("Id exist");
        }

    }

    @Override
    public void delete() {
        List<Bill> billList = iBillRepository.display();
        System.out.println("Input id remove");
        int idRemove = Integer.parseInt(scanner.nextLine());
        for (int i =0; i< billList.size();i++){
            if (billList.get(i).getId().equals(idRemove)){
                System.out.println("Are you sure?");
                System.out.println("1.Yes");
                System.out.println("2.No");
                String choice = scanner.nextLine();
                if (choice.equals("1")){
                    iBillRepository.delete(i);
                    billList.remove(billList.get(i));
                    System.out.println("Delete success");
                    return;
                }else {
                    System.out.println("Return the menu");
                }
            }
        }
        System.out.println("Not found id");
    }

    @Override
    public void edit() {
        List<Bill> billList = ReadFile.readFile();
        System.out.println("Input id edit");
        String id ;
        int index;
        try {
            id = scanner.nextLine();
            boolean flag = false;
        }catch (Exception e){
            System.out.println("Error!");
        }

    }

    @Override
    public void findById() {
        System.out.println("Input id want find");
        String idFind = scanner.nextLine();
        Bill billFind

    }
}
