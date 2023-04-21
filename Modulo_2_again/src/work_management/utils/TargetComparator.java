package work_management.utils;

import work_management.model.Target;

import java.util.Comparator;

public class TargetComparator implements Comparator<Target> {
    @Override
    public int compare(Target o1, Target o2) {
        int result1 = o2.getMoney().compareTo(o1.getMoney());
        int result2 = o1.getName().compareTo(o2.getName());
        if (result1 !=0){
            return result1;
        }else if (result1 == 0){
            return result2;
        }
        return result1;
    }
}
