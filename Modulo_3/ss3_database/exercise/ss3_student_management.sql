create database ss3_student_management;
use ss3_student_management;

CREATE TABLE class
(
    class_id   INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    class_name VARCHAR(60) NOT NULL,
    start_date DATETIME    NOT NULL,
    Status     BIT
);

CREATE TABLE Student
(
    student_id   INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    student_name VARCHAR(30) NOT NULL,
    address      VARCHAR(50),
    phone        VARCHAR(20),
    Status       BIT,
    class_id     INT         NOT NULL,
    FOREIGN KEY (class_id) REFERENCES class (class_id)
);

CREATE TABLE `subject`
(
    sub_id   INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    sub_name VARCHAR(30) NOT NULL,
    credit   TINYINT     NOT NULL DEFAULT 1 CHECK ( Credit >= 1 ),
    Status   BIT                  DEFAULT 1
);

CREATE TABLE mark
(
    mark_id    INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    sub_id     INT NOT NULL,
    student_id INT NOT NULL,
    mark       FLOAT   DEFAULT 0 CHECK ( Mark BETWEEN 0 AND 100),
    exam_times TINYINT DEFAULT 1,
    UNIQUE (sub_id, student_id),
    FOREIGN KEY (sub_id) REFERENCES Subject (sub_id),
    FOREIGN KEY (student_id) REFERENCES student (student_id)
);

INSERT INTO class
VALUES (1, 'A1', '2008-12-20', 1);
INSERT INTO class
VALUES (2, 'A2', '2008-12-22', 1);
INSERT INTO class
VALUES (3, 'B3', current_date, 0);

INSERT INTO student (student_name, address, phone, Status, class_id)
VALUES ('Hung', 'Ha Noi', '0912113113', 1, 1);
INSERT INTO student (student_name, address, Status, class_id)
VALUES ('Hoa', 'Hai phong', 1, 1);
INSERT INTO student (student_name, address, phone, Status, class_id)
VALUES ('Manh', 'HCM', '0123123123', 0, 2);

INSERT INTO `subject`
VALUES (1, 'CF', 5, 1),
       (2, 'C', 6, 1),
       (3, 'HDJ', 5, 1),
       (4, 'RDBMS', 10, 1);
       
INSERT INTO Mark (sub_id, student_id, mark, exam_times)
VALUES (1, 1, 8, 1),
       (1, 2, 10, 2),
       (2, 1, 12, 1);
       
-- Query --

select * from student as s
where (s.student_name like "h%");

select *from class as c
where (c.start_date like '%-12-%');

select *from subject as su
where (su.credit >=3 and su.credit <=5);

set sql_safe_updates = 0;
update student 
set class_id = 2 
where student_name = 'hung';
set sql_safe_updates = 1;

select s.student_name , su.sub_name , m.mark 
from student s
join subject su
on s.student_id = su.sub_id
join mark m
on su.sub_id = m.mark_id
order by m.mark desc;

