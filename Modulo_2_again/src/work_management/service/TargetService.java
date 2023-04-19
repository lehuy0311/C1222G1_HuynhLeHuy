package work_management.service;

import ss5_am.Employee;
import work_management.common.ReadFile;
import work_management.model.Target;
import work_management.repository.ITargetRepository;
import work_management.repository.TargetRepository;

import java.util.List;
import java.util.Scanner;

public class TargetService implements ITargetService{
    private ITargetRepository iTargetRepository = new TargetRepository();
    private Scanner scanner = new Scanner(System.in);
    public static final String PATH = "src/work_management/data/Target.csv";
    @Override
    public void getAll() {
        List<Target> targetList = iTargetRepository.display();
        if(targetList.size() ==0){
            System.out.println("No data");
        }else {
            for(Target target : targetList){
                System.out.println(target.writeToCsv());
            }
        }
    }

    public boolean check(int id){
        List<Target> targetList = iTargetRepository.display();
        for (Target target : targetList){
            if (target.getId() == id){
                return true;
            }
        }
        return false;
    }

    @Override
    public void add() {
        List<Target> targetList = iTargetRepository.display();
        System.out.println("Input id");
        int id = Integer.parseInt(scanner.nextLine());
        if (check(id) == false ){
            System.out.println("Input name");
            String name = scanner.nextLine();
            System.out.println("Input date");
            String date = scanner.nextLine();
            System.out.println("Input money");
            String money = scanner.nextLine();
            System.out.println("Input description");
            String description = scanner.nextLine();

            Target target = new Target(id, name, date,money, description);
            targetList.add(target);
            iTargetRepository.add(targetList);
            System.out.println("Add success");
        }else {
            System.out.println("ID exist");
        }
    }

    @Override
    public void delete() {
        List<Target> targetList = ReadFile.readFile(PATH);
        System.out.println("Input id");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i =0; i<targetList.size();i++){
            if (targetList.get(i).getId() == id){
                System.out.println("Are you sure?");
                System.out.println("1. Yes");
                System.out.println("2. No");
                String choice = scanner.nextLine();
                if (choice.equals("1")){
                    iTargetRepository.delete(i);
                    System.out.println("Delete success!!");
                    return;
                }
            }
        }
        System.out.println("Not found id");
    }

    @Override
    public void edit() {
        List<Target> targetList = ReadFile.readFile(PATH);
        System.out.println("Input id");
        int id;
        int index;
        try {
            id = Integer.parseInt(scanner.nextLine());
            boolean flag = false;
            index =-1;
            for (int i=0; i<targetList.size();i++){
                if(id == targetList.get(i).getId()){
                    index =i;
                    flag = true;
                    break;
                }
            }
            if (flag == true){
                System.out.println("Found ID");

                System.out.println("Input name");
                String name = scanner.nextLine();
                System.out.println("Input date");
                String date = scanner.nextLine();
                System.out.println("Input money");
                String money = scanner.nextLine();
                System.out.println("Input description");
                String description = scanner.nextLine();

                Target target = new Target(id, name, date, money, description);
                iTargetRepository.edit(index, target);

            }else {
                System.out.println("ID no find");
                edit();
            }
        }catch (NumberFormatException e){
            System.out.println("Input again Id!");
            edit();
        }catch (Exception e){
            System.out.println("Error");
        }
    }

}
