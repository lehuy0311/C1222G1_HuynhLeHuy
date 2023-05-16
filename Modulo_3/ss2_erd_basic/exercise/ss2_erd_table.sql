create database ss2_erd_table;
use ss2_erd_table;

create table phieu_xuat(
	so_phieu_xuat int primary key auto_increment,
    ngay_xuat date
);

create table vat_tu(
	ma_vat_tu int primary key auto_increment,
    ten_vat_tu varchar(50)
);

 create table phieu_nhap(
	so_phieu_nhap int primary key auto_increment,
    ngay_nhap date
 );
 
  create table nha_cung_cap(
	ma_ncc int primary key auto_increment,
    ten_ncc varchar(50),
    dia_chi varchar(50),
    sdt varchar(20)
 );
 
 create table so_dien_thoai(
	ma_so_dien_thoai int primary key auto_increment,
	so_dien_thoai varchar(20),
	ma_ncc int ,
	foreign key (ma_ncc) references nha_cung_cap(ma_ncc)
);
 
 create table don_dat_hang(
	so_don_hang int primary key auto_increment,
    ngay_dat_hang date,
    ma_ncc int,
    foreign key (ma_ncc) references nha_cung_cap(ma_ncc)
 );
 
 create table chi_tiet_phieu_xuat(
	so_phieu_xuat int,
    ma_vat_tu int,
    don_gia_xuat float,
    so_luong_xuat int,
    primary key(so_phieu_xuat, ma_vat_tu),
    foreign key (so_phieu_xuat) references phieu_xuat(so_phieu_xuat),
    foreign key (ma_vat_tu) references vat_tu(ma_vat_tu)
 );
 
  create table chi_tiet_phieu_nhap(
	so_phieu_nhap int,
    ma_vat_tu int,
    don_gia_nhap float,
    so_luong_nhap int,
    primary key(so_phieu_nhap, ma_vat_tu),
    foreign key (so_phieu_nhap) references phieu_nhap(so_phieu_nhap),
    foreign key (ma_vat_tu) references vat_tu(ma_vat_tu)
 );
 
 create table chi_tiet_don_dat_hang(
	ma_vat_tu int,
    so_don_hang int,
    primary key(ma_vat_tu, so_don_hang),
    foreign key (ma_vat_tu) references vat_tu(ma_vat_tu),
    foreign key (so_don_hang) references don_dat_hang(so_don_hang)
 );