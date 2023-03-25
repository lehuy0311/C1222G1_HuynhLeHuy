create database case_study_module_3;
use case_study_module_3;
create table contract_furama(-- hợp đồng--
id_contract int primary key,
date_start_contract datetime,
date_end_contract datetime,
deposit double,
id_employee int,
id_customer int,--
id_service int--
);