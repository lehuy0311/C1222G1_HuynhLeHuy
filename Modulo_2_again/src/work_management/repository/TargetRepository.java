package work_management.repository;

import work_management.common.ReadFile;
import work_management.common.WriteFile;
import work_management.model.Target;
import work_management.utils.TargetComparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TargetRepository implements ITargetRepository{
    public static final String TARGET_FILE_PATH = "src/work_management/data/Target.csv";

    public static List<Target> targetList = ReadFile.readFile(TARGET_FILE_PATH);
    @Override
    public List<Target> display() {
        return ReadFile.readFile(TARGET_FILE_PATH);
    }

    @Override
    public void add(List<Target> targetList) {
        WriteFile.writeFile(targetList);
    }

    @Override
    public void delete(int index) {
        targetList.remove(index);
        WriteFile.writeFile(targetList);
    }

    @Override
    public void edit(int index, Target target) {
        targetList = ReadFile.readFile(TARGET_FILE_PATH);
        targetList.set(index, target);
        WriteFile.writeFile(targetList);
    }

    @Override
    public Target findById(int idFind) {
        for(Target target: targetList){
            if(target.getId() == idFind){
                return target;
            }
        }
        return null;
    }

    @Override
    public List<Target> findByName(String nameFind) {
        List<Target> targetList1 = new ArrayList<>();
        for (int i =0; i< targetList.size();i++){
            if(targetList.get(i).getName().contains(nameFind)){
                targetList1.add(targetList.get(i));
            }
        }
        return targetList1;
    }

    @Override
    public void sortByName() {
        Collections.sort(targetList);
        for (Target target: targetList){
            System.out.println(target);
        }

    }

    @Override
    public void sortByMoney() {
        Collections.sort(targetList, new TargetComparator());
        for (Target target : targetList){
            System.out.println(target);
        }
    }
}
