package case_study.repository.contract;

import case_study.models.Contract;

import java.util.List;

public interface IContractRepository {
    List<Contract> getAll();

    void add(List<Contract> contracts);
    int edit(int contractID);

    int delete(int contractID);


}
