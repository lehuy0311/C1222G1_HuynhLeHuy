create database case_study_2;
use case_study_2;

create table user_nhan_vien(
tai_khoan int primary key,
mat_khau varchar(45),
foreign key(tai_khoan) references nhan_vien(tai_khoan)
 );
 
 create table nhan_vien(
 ma_nhan_vien int auto_increment primary key,
 ten_nhan_vien varchar(45),
 dia_chi varchar(45),
 gioi_tinh bit,
 ngay_sinh date,
 sdt int,
 email varchar(45)
 );
 
 create table khach_hang(
 ma_khach_hang int auto_increment primary key,
 ten_khach_hang varchar(45),
 dia_chi varchar (45),
 ngay_sinh date,
 gioi_tinh bit,
 sdt int,
 email varchar(45),
 cccd int
 );
 
 create table loai_xe(
 ma_loai_xe int auto_increment primary key,
 ten_loai_xe varchar(45),
 ma_bao_hanh int
 );
 
 insert into loai_xe(ten_loai_xe, ma_bao_hanh)
 value("SUV",1),
 ("sedan",2);
 
 create table tinh_trang(
 ma_tinh_trang int auto_increment primary key,
 ten_tinh_trang varchar(45)
 );
 
 insert into tinh_trang(ten_tinh_trang)
 value("co_san"),
("khong_co_san");

  create table thong_so(
 ma_thong_so int auto_increment primary key,
 chieu_dai int,
 chieu_rong int,
 chieu_cao int,
 dung_tich_xilanh int,
 khoi_luong_xe int,
 toc_do_toi_da int
 );
 
 insert into thong_so(chieu_dai, chieu_rong, chieu_cao, dung_tich_xilanh, khoi_luong_xe, toc_do_toi_da)
 value(4.5,2,1.8,20,1.2,200),
 (5,2.3,2,20,1.5,220),
 (4.5,2,1.8,20,2,250);
 
 create table xe(
 ma_xe int auto_increment primary key,
 ten_xe varchar(45),
 mau_sac_xe varchar(45),
 ngay_san_xuat date,
 mo_ta varchar(100),
ma_thong_so int,
 ma_loai_xe int,
 ma_tinh_trang int,
 foreign key(ma_loai_xe) references loai_xe(ma_loai_xe),
 foreign key(ma_tinh_trang) references tinh_trang(ma_tinh_trang),
 foreign key(ma_thong_so) references thong_so(ma_thong_so)
 );
 
insert into xe(ten_xe,mau_sac_xe,ngay_san_xuat,mo_ta,ma_thong_so,ma_loai_xe,ma_tinh_trang)
value("GLC300","đỏ","2020-12-04","new",1,1,1),
("A-class Sedan","trắng","2022-12-04","new",1,2,1),
("S-class Sedan","đen","2023-12-04","new",1,1,1);

create table phuong_thuc_thanh_toan(
 ma_phuong_thuc_thanh_toan int auto_increment primary key,
 ten_phuong_thuc_thanh_toan varchar(45)
 );
 
 
 create table hop_dong(
ma_hop_dong int auto_increment primary key,
ngay_lam_hop_dong datetime not null,
tien_dat_coc double not null,
so_luong_xe int,
ma_phuong_thuc_thanh_toan int,
ma_xe int,
ma_nhan_vien int,
ma_khach_hang int,
foreign key (ma_phuong_thuc_thanh_toan) references phuong_thuc_thanh_toan(ma_phuong_thuc_thanh_toan),
foreign key (ma_xe) references xe(ma_xe),
foreign key ( ma_nhan_vien) references nhan_vien(ma_nhan_vien),
foreign key ( ma_khach_hang) references khach_hang(ma_khach_hang)
 );
 
 insert into hop_dong(ngay_lam_hop_dong, tien_dat_coc,so_luong_xe,ma_phuong_thuc_thanh_toan, ma_xe ,ma_nhan_vien,ma_khach_hang)
 value ('2023-03-06', 20000,1,1,1,1,1);

INSERT INTO khach_hang(`ten_khach_hang`, `dia_chi`, `ngay_sinh`, `gioi_tinh`, `sdt`, `email`, `cccd`) 
VALUES ('Nguyễn Thị Hào', 123, '1970-11-07', 0, '643431213', 'thihao07@gmail.com', 5);
INSERT INTO `case_study_2`.`phuong_thuc_thanh_toan` (`ma_phuong_thuc_thanh_toan`, `ten_phuong_thuc_thanh_toan`) VALUES ('1', 'money');

INSERT INTO nhan_vien(`ma_nhan_vien`, `ten_nhan_vien`, `dia_chi`, `gioi_tinh`, `ngay_sinh`, `sdt`, `email`)
 VALUES ('1', 'Hoang', '4324', 1,  '1970-11-07', '312', '3123');











