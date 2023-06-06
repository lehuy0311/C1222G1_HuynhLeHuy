package com.car_management.service;

import com.car_management.model.hop_dong;

import java.util.List;

public interface IContractService {
    List<hop_dong> displayContract();
    void createNewContract(hop_dong hopdong);
    void deleteContract(int id);
    void updateContract(hop_dong hopDong);
    hop_dong searchContractById(int id);
}
