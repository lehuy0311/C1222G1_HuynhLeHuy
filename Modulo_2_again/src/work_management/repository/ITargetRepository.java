package work_management.repository;

import work_management.model.Target;

import java.util.List;

public interface ITargetRepository {
    List<Target> display();
    void add(List<Target> targetList);
    void delete(int idDelete);
    void edit(int index, Target target);
    Target findById(int id);
    List<Target> findByName(String name);
    void sortByName();
    void sortByMoney();

}
