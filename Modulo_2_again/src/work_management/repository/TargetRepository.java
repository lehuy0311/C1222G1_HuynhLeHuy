package work_management.repository;

import work_management.common.ReadFile;
import work_management.common.WriteFile;
import work_management.model.Target;

import java.util.ArrayList;
import java.util.List;

public class TargetRepository implements ITargetRepository{
    public static final String PATH = "src/work_management/data/Target.csv";

    public static List<Target> targetList = ReadFile.readFile(PATH);
    @Override
    public List<Target> display() {
        return ReadFile.readFile(PATH);
    }

    @Override
    public void add(List<Target> targetList) {
        WriteFile.writeFile(targetList);
    }

    @Override
    public void delete(int index) {
//        targetList = ReadFile.readFile(PATH);
//        targetList.remove(target);
//        WriteFile.writeFile(PATH, target);
        targetList.remove(index);
    }

    @Override
    public void edit(int index, Target target) {
        targetList = ReadFile.readFile(PATH);
        targetList.set(index, target);
        WriteFile.writeFile(targetList);
    }

    @Override
    public Target findById(int id) {
        return null;
    }

    @Override
    public List<Target> findByName(String name) {
        return null;
    }

    @Override
    public void sortName() {

    }

    @Override
    public void sortMoney() {

    }
}
