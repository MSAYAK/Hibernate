--create procedure get_sum(in first_num int, in second_num int,out result int)
--begin atomic
--set result=first_num+second_num;
--end
--/;

create or replace procedure get_sum(first_num in int, second_num in int, result out int) 
as
begin 
result := first_num+second_num;
end;
