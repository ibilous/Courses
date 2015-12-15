/*
1.	insert new user
2.	delete new user
3.	update user set city LVIV where empty
4.	update user. Set country  = USA where it is ‘United States’ and Set country  = NZ where it is ‘New Zealand’
5.	select all users
6.	select users from lviv and from USA
7.	select users where country starts from ‘A’’
8.	select users where city starts from ‘C’ and ends on ‘n’
9.	select users where country = US<any symbol>
10.	select users from countries: India, USA, Australia, Canada 
11.	select users and sort them by  registration_timestamp
12.	select how many users live in each country
13.	12 + count of users are greater than 1
14.	select unique list of countries
15.	select unique list of cities and their countries, sort by country
16.	select user which haven’t user_verification record
17.	select user  and his identifications  (userid= 1510279)  (userids = 1510279, 1510750, 1511877)
18.	select all users and their user_verification 
19.	select how much time each user spent 
*/


#1
insert into user(id, first_name, last_name) 
values(1512341, 'roma', 'L')

select * from user 
order by id
DESC 
limit 2

#2
delete from user
where id=1512341

#3
update user
SeT city = 'LVIV'
where city is null OR city = ''

#4
update user
SET country = 
case
when country = 'United States' then 'USA'
when country = 'New Zealand' then 'NZ'
end

#5
select * from user

#6
select * from user where city = 'LVIV' and country = 'USA'

#7
select * from user
where country like "U%"

#8
select * from user
where city like "C%n"

#9
select * from user
where country like 'US_'

#10
select first_name, last_name from user
where country in ('India', 'Australia', 'Canada', 'USA')

#11
select * from user u
where u.country = 'Usa'
order by  u.REGISTRATION_TIMESTAMP DESC

#12
select city, COUNT(id) as count 
from user
-- where city = 'Lviv'
group by city

select count(id) from user where city = 'Lviv'

#13
select city, COUNT(id) as count 
from user
where city in ('Lviv', 'Talcahuano')
group by city
having count >300

#19
select u.id, SUM(TIMESTAMPDIFF(MINUTE, started, ended ))  from user u
join sessions s on s.USER_ID = u.id
where s.started > '2015-01-01'
group by u.id

#14
select distinct country from user

#15
select distinct country, city from user
where country is not null and city  = 'lviv'
order by country

select distinct city, country from user
where country is not null
order by country


select * from user
where country is not null and city  = 'lviv'


#16

select * from user 
where id not in (select user_id from user_verification)

select  u.*, uv.*  from user u
left join user_verification uv on u.id = uv.user_id 
where uv.USER_VERIFICATION_ID  is null

#18
select  u.*, uv.*  from user u
left join user_verification uv on u.id = uv.user_id 


select  u.*, uv.*  from user u
right join user_verification uv on u.id = uv.user_id 



