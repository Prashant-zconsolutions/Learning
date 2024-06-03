
 -- CREATE SEQUENCE OBJECT
 CREATE SEQUENCE dept_emp_id
    START with 1
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 11
    CYCLE;

	-- CREATE TABLE USEING SEQUENCE OBJECT
	CREATE TABLE department(
		dept_id integer DEFAULT nextval('dept_emp_id'),
		dept_name char(30)
	)

	INSERT INTO department(dept_name)VALUES('AI Dept2');

	SELECT * FROM department

	delete from department
	where dept_id = 2;

	-- Triggers
	-- create backup table
	CREATE TABLE backupt(
		dept_id integer DEFAULT  nextval('dept_emp_id'),
		dept_name char(30)
	)

	-- create trigger
	CREATE TRIGGER t2
	BEFORE DELETE ON department
	FOR EACH ROW
	BEGIN

	INSERT INTO backupt VALUES(:old.dept_id,:old.dept_name);

	end;


