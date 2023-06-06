package com.car_management.repository;

import com.car_management.model.hop_dong;

import java.util.List;

public interface IContractRepository {
    List<hop_dong> displayContract();
    void createNewContract(hop_dong hopdong);
    void deleteContract(int id);

    void updateContract(hop_dong hop_dong);
    hop_dong searchContractById(int id);

}
