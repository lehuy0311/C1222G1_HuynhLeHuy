package electric_management.repository;

import electric_management.common.ReadFile;
import electric_management.common.WriteFile;
import electric_management.model.Bill;

import java.util.List;

public class BillRepository implements IBillRepository {
    public static List<Bill> billList = ReadFile.readFile();
    @Override
    public List<Bill> display() {
        return ReadFile.readFile();
    }

    @Override
    public void add(List<Bill> billList) {
        WriteFile.writeFile(billList);
    }

    @Override
    public void delete(int idDelete) {
        billList.remove(idDelete);
        WriteFile.writeFile(billList);
    }

    @Override
    public void edit(int index, Bill bill) {
        billList = ReadFile.readFile();
        billList.set(index, bill);
        WriteFile.writeFile(billList);
    }

    @Override
    public Bill findById(int idFind) {
        for(Bill bill : billList){
            if (bill.getId().equals(idFind)){
                return bill;
            }
        }
        return null;
    }
}

