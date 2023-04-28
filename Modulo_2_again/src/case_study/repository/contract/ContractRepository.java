package case_study.repository.contract;

import case_study.models.Contract;
import case_study.utils.ReadFileContract;
import case_study.utils.WriteFileContract;

import java.util.List;

public class ContractRepository implements IContractRepository {
    private List<Contract> contracts = ReadFileContract.read();

    @Override
    public List<Contract> getAll() {
        return ReadFileContract.read();
    }

    @Override
    public void add(List<Contract> contracts) {
        WriteFileContract.write(contracts);
    }

    @Override
    public int edit(int contractID) {
        for (int i = 0; i < contracts.size(); i++) {
            if(contractID == contracts.get(i).getContractID()) return i;
        }
        return -1;
    }

    @Override
    public int delete(int contractID) {
        for (int i = 0; i < contracts.size(); i++) {
            if(contractID == contracts.get(i).getContractID()) return i;
        }
        return -1;
    }
}
