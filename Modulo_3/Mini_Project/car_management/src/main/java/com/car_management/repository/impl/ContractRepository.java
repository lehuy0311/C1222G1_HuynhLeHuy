package com.car_management.repository.impl;

import com.car_management.model.hop_dong;
import com.car_management.repository.BaseRepository;
import com.car_management.repository.IContractRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContractRepository implements IContractRepository {
    private static final String SELECT ="select * from hop_dong";
    private static final String INSERT ="insert into hop_dong(ngay_lam_hop_dong,tien_dat_coc," +
                                        "so_luong_xe,ma_phuong_thuc_thanh_toan,ma_xe," +
                                        "ma_nhan_vien,ma_khach_hang)" +
                                        "values(?,?,?,?,?,?,?)";
    private static final String DELETE ="delete from hop_dong where ma_hop_dong = ?";
    private static final String UPDATE ="UPDATE contract SET `ma_hop_dong` = ?, `ngay_lam_hop_dong` = ?, " +
            "`tien_dat_coc` = ?, `so_luong_xe` = ?, `ma_phuong_thuc_thanh_toan` = ?, `ma_xe` =?, " +
            "`ma_nhan_vien` = ?,`ma_khach_hang` = ? WHERE (`id` = ?)";
    @Override
    public List<hop_dong> displayContract() {
        Connection connection = BaseRepository.getConnection();
        List<hop_dong> hopDongs = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT);
            while (resultSet.next()){
                int idContract = resultSet.getInt("ma_hop_dong");
                String dateContract = resultSet.getString("ngay_lam_hop_dong");
                double deposits = resultSet.getDouble("tien_dat_coc");
                int quantityCar = resultSet.getInt("so_luong_xe");
                int idPayment = resultSet.getInt("ma_phuong_thuc_thanh_toan");
                int idCar = resultSet.getInt("ma_xe");
                int idEmployee = resultSet.getInt("ma_nhan_vien");
                int idCustomer = resultSet.getInt("ma_khach_hang");

                hopDongs.add(new hop_dong(idContract,dateContract,deposits,quantityCar,idPayment,idCar,idEmployee,idCustomer));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return hopDongs;
    }

    @Override
    public void createNewContract(hop_dong hopdong) {
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT);
            preparedStatement.setString(1,hopdong.getNgay_lam_hop_dong());
            preparedStatement.setDouble(2,hopdong.getTien_dat_coc());
            preparedStatement.setInt(3,hopdong.getSo_luong_xe());
            preparedStatement.setInt(4,hopdong.getMa_phuong_thuc_thanh_toan());
            preparedStatement.setInt(5,hopdong.getMa_xe());
            preparedStatement.setInt(6,hopdong.getMa_nhan_vien());
            preparedStatement.setInt(7,hopdong.getMa_khach_hang());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void deleteContract(int id) {
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE);
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void updateContract(hop_dong hop_dong) {
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE);
            preparedStatement.setInt(1,hop_dong.getMa_hop_dong() );
            preparedStatement.setString(2,hop_dong.getNgay_lam_hop_dong() );
            preparedStatement.setDouble(3,hop_dong.getTien_dat_coc());
            preparedStatement.setInt(4,hop_dong.getSo_luong_xe() );
            preparedStatement.setInt(5,hop_dong.getMa_phuong_thuc_thanh_toan() );
            preparedStatement.setInt(6,hop_dong.getMa_xe());;
            preparedStatement.setInt(7, hop_dong.getMa_nhan_vien());
            preparedStatement.setInt(8,hop_dong.getMa_khach_hang());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public hop_dong searchContractById(int id) {
        List<hop_dong> hopDongList = displayContract();
        for (hop_dong element: hopDongList) {
            if(element.getMa_hop_dong() == id){
                return element;
            }
        }
        return null;
    }

}
