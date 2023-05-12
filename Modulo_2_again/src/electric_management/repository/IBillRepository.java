package electric_management.repository;

import electric_management.model.Bill;

import java.util.List;

public interface IBillRepository {
    List<Bill> display();
    void add(List<Bill> billList);
    void delete(int idDelete);
    void edit(int index, Bill bill);
    Bill findById(int id);
}
