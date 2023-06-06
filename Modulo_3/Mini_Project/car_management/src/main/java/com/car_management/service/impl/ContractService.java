package com.car_management.service.impl;

import com.car_management.model.hop_dong;
import com.car_management.repository.IContractRepository;
import com.car_management.repository.impl.ContractRepository;
import com.car_management.service.IContractService;

import java.util.List;

public class ContractService implements IContractService {
    private IContractRepository iContractRepository = new ContractRepository();
    @Override
    public List<hop_dong> displayContract() {
        return iContractRepository.displayContract();
    }

    @Override
    public void createNewContract(hop_dong hopdong) {
        iContractRepository.createNewContract(hopdong);
    }

    @Override
    public void deleteContract(int id) {
        iContractRepository.deleteContract(id);
    }

    @Override
    public void updateContract(hop_dong hopDong) {
        iContractRepository.updateContract(hopDong);
    }

    @Override
    public hop_dong searchContractById(int id) {
        return iContractRepository.searchContractById(id);
    }
}
