create table department(
	department_id integer primary key,
	department_name varchar(255)
);

create table employee(
	employee_id integer primary key,
	employee_name varchar(255),
	salary float,
	department_id integer,
	foreign key(department_id) references department(department_id)
);

insert into employee values(3,'Ram', 12000,3);

1.
select employee_id, employee_name, department_name
from employee e, department d
where e.department_id=d.department_id;


2.
select employee_name, salary
from employee
order by salary desc;


3.
select department_name, avg(salary) as avg_salary
from employee e, department d
where d.department_id=e.department_id
group by department_name;