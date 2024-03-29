package work_management.service;

import work_management.common.ReadFile;
import work_management.model.Target;
import work_management.repository.ITargetRepository;
import work_management.repository.TargetRepository;

import java.util.List;
import java.util.Scanner;

public class TargetService implements ITargetService{
    private ITargetRepository iTargetRepository = new TargetRepository();
    private Scanner scanner = new Scanner(System.in);
    public static final String TARGET_FILE_PATH = "src/work_management/data/Target.csv";
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
        //List<Target> targetList = ReadFile.readFile(TARGET_FILE_PATH);
        List<Target> targetList = iTargetRepository.display();
        System.out.println("Input id remove");
        int idRemove = Integer.parseInt(scanner.nextLine());
        for (int i =0; i<targetList.size();i++){
            if (targetList.get(i).getId() == idRemove){
                System.out.println("Are you sure?");
                System.out.println("1. Yes");
                System.out.println("2. No");
                String choice = scanner.nextLine();
                if (choice.equals("1")){
                    iTargetRepository.delete(i);
                    targetList.remove(targetList.get(i));
                    //WriteFile.writeFile(targetList);
                    System.out.println("Delete success!!");
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
        List<Target> targetList = ReadFile.readFile(TARGET_FILE_PATH);
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

    @Override
    public void findById() {
        System.out.println("input Id want find");
        int idFind = Integer.parseInt(scanner.nextLine());
        Target targetFind = iTargetRepository.findById(idFind);
        System.out.println(targetFind);
    }

    @Override
    public void findByName() {
        System.out.println("Input Name want find");
        String nameFind = scanner.nextLine();
        List<Target> result = iTargetRepository.findByName(nameFind);
        for (int i=0; i<result.size();i++){
            System.out.println(result.get(i));
        }
    }

    @Override
    public void sortName() {
        iTargetRepository.sortByName();
    }

    @Override
    public void sortMoney() {
        iTargetRepository.sortByMoney();
    }

}
