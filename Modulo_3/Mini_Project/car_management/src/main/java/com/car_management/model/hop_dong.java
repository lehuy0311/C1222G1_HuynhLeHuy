package com.car_management.model;

import java.util.Date;

public class hop_dong {
    private int ma_hop_dong;
    private String ngay_lam_hop_dong;
    private double tien_dat_coc;
    private int so_luong_xe;
    private int ma_phuong_thuc_thanh_toan;
    private int ma_xe;
    private int ma_nhan_vien;
    private int ma_khach_hang;
    public hop_dong() {
    }

    public hop_dong(int ma_hop_dong, String ngay_lam_hop_dong, double tien_dat_coc,
                    int so_luong_xe, int ma_phuong_thuc_thanh_toan, int ma_xe,
                    int ma_nhan_vien, int ma_khach_hang) {
        this.ma_hop_dong = ma_hop_dong;
        this.ngay_lam_hop_dong = ngay_lam_hop_dong;
        this.tien_dat_coc = tien_dat_coc;
        this.so_luong_xe = so_luong_xe;
        this.ma_phuong_thuc_thanh_toan = ma_phuong_thuc_thanh_toan;
        this.ma_xe = ma_xe;
        this.ma_nhan_vien = ma_nhan_vien;
        this.ma_khach_hang = ma_khach_hang;
    }

    public int getMa_hop_dong() {
        return ma_hop_dong;
    }

    public void setMa_hop_dong(int ma_hop_dong) {
        this.ma_hop_dong = ma_hop_dong;
    }

    public String getNgay_lam_hop_dong() {
        return ngay_lam_hop_dong;
    }

    public void setNgay_lam_hop_dong(String ngay_lam_hop_dong) {
        this.ngay_lam_hop_dong = ngay_lam_hop_dong;
    }

    public double getTien_dat_coc() {
        return tien_dat_coc;
    }

    public void setTien_dat_coc(double tien_dat_coc) {
        this.tien_dat_coc = tien_dat_coc;
    }

    public int getSo_luong_xe() {
        return so_luong_xe;
    }

    public void setSo_luong_xe(int so_luong_xe) {
        this.so_luong_xe = so_luong_xe;
    }

    public int getMa_phuong_thuc_thanh_toan() {
        return ma_phuong_thuc_thanh_toan;
    }

    public void setMa_phuong_thuc_thanh_toan(int ma_phuong_thuc_thanh_toan) {
        this.ma_phuong_thuc_thanh_toan = ma_phuong_thuc_thanh_toan;
    }

    public int getMa_xe() {
        return ma_xe;
    }

    public void setMa_xe(int ma_xe) {
        this.ma_xe = ma_xe;
    }

    public int getMa_nhan_vien() {
        return ma_nhan_vien;
    }

    public void setMa_nhan_vien(int ma_nhan_vien) {
        this.ma_nhan_vien = ma_nhan_vien;
    }

    public int getMa_khach_hang() {
        return ma_khach_hang;
    }

    public void setMa_khach_hang(int ma_khach_hang) {
        this.ma_khach_hang = ma_khach_hang;
    }

}
