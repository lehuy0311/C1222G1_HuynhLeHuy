package work_management.repository;

import work_management.model.Target;

import java.util.List;

public interface ITargetRepository {
    void display();
    void add(Target target);
    void delete(int index);
    void edit(int index, Target target);
    Target findById(int id);
    List<Target> findByName(String name);
    void sortName();
    void sortMoney();

}
