package All_SQL_Operations;

public class SQL {
/*

Enter password: ****
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 209
Server version: 8.0.30 MySQL Community Server - GPL

Copyright (c) 2000, 2022, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> show databases;
+-------------------------+
| Database                |
+-------------------------+
| crime_management_system |
| information_schema      |
| mysql                   |
| performance_schema      |
| student_inforamtion     |
+-------------------------+
5 rows in set (0.03 sec)

mysql> use crime_management_system;
Database changed
mysql> select * from criminal;
+-------------+---------------+-------------------+-------------+-------------+------------------+-------------+------+--------+-----------------+--------------+-----------+----------------+
| Criminal_Id | Criminal_Name | Criminal_NickName | Arrest_Date | DateOfCrime | Criminal_Address | Place_Crime | Age  | Gender | Occupation      | BirthMark    | CrimeType | CrimeDetails   |
+-------------+---------------+-------------------+-------------+-------------+------------------+-------------+------+--------+-----------------+--------------+-----------+----------------+
|           1 | Ramesh        | Ramy              | 2021-05-15  | 2020-02-25  | Delhi            | Mumbai      |   25 | Male   | Painter         | Face-Scratch | Robbery   | Money-Heist    |
|           2 | Elizabeth     | Ana               | 2022-08-25  | 2020-05-15  | England          | Bangalore   |   24 | Female | Turist          | Face-SCARS   | Teft      | Painting-Theft |
|           3 | Suresh        | surya             | 2020-09-12  | 2012-05-06  | Karnataka        | Mumbai      |   54 | Male   | Don-Buisnessman | Tatto        | Homicide  | Full-Murder    |
|           4 | Anthony       | Any               | 2020-02-01  | 2018-09-09  | Bihar            | Thane       |   26 | Male   | Teacher         | DoubleFinger | Homicide  | Half           |
|           5 | Akash         | Akki              | 2021-05-13  | 2018-08-29  | Sonpur           | Nagpur      |   32 | Male   | Farmer          | EyeDamage    | Theft     | Money          |
|           6 | Gajanan       | Kajya             | 2015-06-18  | 2013-04-23  | Jodhpur          | Mumbai      |   23 | Male   | Student         | Head_Scratch | Theft     | Money          |
|           7 | Raghav        | raghu             | 2018-05-18  | 2005-12-12  | Nagpur           | Rayagad     |   33 | Male   | Carpenter       | Baldness     | Sharper   | Sharper,Thung  |
+-------------+---------------+-------------------+-------------+-------------+------------------+-------------+------+--------+-----------------+--------------+-----------+----------------+
7 rows in set (0.04 sec)

mysql> select * from police_station;
+-----------+----------------------------+------------------------+
| StationId | PoliceStation_Name         | PoliceStation_Area     |
+-----------+----------------------------+------------------------+
|         1 | Andheri Police Station     | West Mumbai            |
|         2 | VV Puram Police Station    | East of Bangalore city |
|         3 | Azad Maidan Police Station | South Mumbai           |
|         4 | D B Marg Police Station    | West Mumbai            |
+-----------+----------------------------+------------------------+
4 rows in set (0.01 sec)

mysql> select * from policeStation_criminal;
+-----------+------------+
| StationId | CriminalId |
+-----------+------------+
|         1 |          1 |
|         3 |          3 |
|         3 |          1 |
|         2 |          2 |
|         4 |          3 |
|         2 |          2 |
+-----------+------------+
6 rows in set (0.01 sec)

mysql> create table Crime(
    ->
    -> CrimeType VARCHAR(45),
    -> CrimeDetails VARCHAR(45),
    -> Suspects_Name varchar(45),
    -> Victims_Name varchar(45),
    -> DateOfCrime VARCHAR(45),
    -> Place_Crime VARCHAR(45)
    -> );
Query OK, 0 rows affected (0.09 sec)

mysql> desc Crime;
+---------------+-------------+------+-----+---------+-------+
| Field         | Type        | Null | Key | Default | Extra |
+---------------+-------------+------+-----+---------+-------+
| CrimeType     | varchar(45) | YES  |     | NULL    |       |
| CrimeDetails  | varchar(45) | YES  |     | NULL    |       |
| Suspects_Name | varchar(45) | YES  |     | NULL    |       |
| Victims_Name  | varchar(45) | YES  |     | NULL    |       |
| DateOfCrime   | varchar(45) | YES  |     | NULL    |       |
| Place_Crime   | varchar(45) | YES  |     | NULL    |       |
+---------------+-------------+------+-----+---------+-------+
6 rows in set (0.02 sec)

mysql> alter table Criminal drop column Criminal_NickName ;
Query OK, 0 rows affected (0.07 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> alter table Criminal drop column DateOfCrime;
Query OK, 0 rows affected (0.03 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> alter table Criminal add column Crime_status varchar(45);
Query OK, 0 rows affected (0.03 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> desc criminal;
+------------------+-------------+------+-----+---------+----------------+
| Field            | Type        | Null | Key | Default | Extra          |
+------------------+-------------+------+-----+---------+----------------+
| Criminal_Id      | int         | NO   | PRI | NULL    | auto_increment |
| Criminal_Name    | varchar(45) | YES  |     | NULL    |                |
| Arrest_Date      | varchar(45) | YES  |     | NULL    |                |
| Criminal_Address | varchar(45) | YES  |     | NULL    |                |
| Place_Crime      | varchar(45) | YES  |     | NULL    |                |
| Age              | int         | YES  |     | NULL    |                |
| Gender           | varchar(45) | YES  |     | NULL    |                |
| Occupation       | varchar(45) | YES  |     | NULL    |                |
| BirthMark        | varchar(45) | YES  |     | NULL    |                |
| CrimeType        | varchar(45) | YES  |     | NULL    |                |
| CrimeDetails     | varchar(45) | YES  |     | NULL    |                |
| Crime_status     | varchar(45) | YES  |     | NULL    |                |
+------------------+-------------+------+-----+---------+----------------+
12 rows in set (0.00 sec)

mysql> select * from criminal;
+-------------+---------------+-------------+------------------+-------------+------+--------+-----------------+--------------+-----------+----------------+--------------+
| Criminal_Id | Criminal_Name | Arrest_Date | Criminal_Address | Place_Crime | Age  | Gender | Occupation      | BirthMark    | CrimeType | CrimeDetails   | Crime_status |
+-------------+---------------+-------------+------------------+-------------+------+--------+-----------------+--------------+-----------+----------------+--------------+
|           1 | Ramesh        | 2021-05-15  | Delhi            | Mumbai      |   25 | Male   | Painter         | Face-Scratch | Robbery   | Money-Heist    | NULL         |
|           2 | Elizabeth     | 2022-08-25  | England          | Bangalore   |   24 | Female | Turist          | Face-SCARS   | Teft      | Painting-Theft | NULL         |
|           3 | Suresh        | 2020-09-12  | Karnataka        | Mumbai      |   54 | Male   | Don-Buisnessman | Tatto        | Homicide  | Full-Murder    | NULL         |
|           4 | Anthony       | 2020-02-01  | Bihar            | Thane       |   26 | Male   | Teacher         | DoubleFinger | Homicide  | Half           | NULL         |
|           5 | Akash         | 2021-05-13  | Sonpur           | Nagpur      |   32 | Male   | Farmer          | EyeDamage    | Theft     | Money          | NULL         |
|           6 | Gajanan       | 2015-06-18  | Jodhpur          | Mumbai      |   23 | Male   | Student         | Head_Scratch | Theft     | Money          | NULL         |
|           7 | Raghav        | 2018-05-18  | Nagpur           | Rayagad     |   33 | Male   | Carpenter       | Baldness     | Sharper   | Sharper,Thung  | NULL         |
+-------------+---------------+-------------+------------------+-------------+------+--------+-----------------+--------------+-----------+----------------+--------------+
7 rows in set (0.01 sec)

mysql> desc Crime;
+---------------+-------------+------+-----+---------+-------+
| Field         | Type        | Null | Key | Default | Extra |
+---------------+-------------+------+-----+---------+-------+
| CrimeType     | varchar(45) | YES  |     | NULL    |       |
| CrimeDetails  | varchar(45) | YES  |     | NULL    |       |
| Suspects_Name | varchar(45) | YES  |     | NULL    |       |
| Victims_Name  | varchar(45) | YES  |     | NULL    |       |
| DateOfCrime   | varchar(45) | YES  |     | NULL    |       |
| Place_Crime   | varchar(45) | YES  |     | NULL    |       |
+---------------+-------------+------+-----+---------+-------+
6 rows in set (0.00 sec)

mysql> isert into Crime values('Robbery','Money-Heist','Mukesh','Inamdar','2020-05-16','Mumbai');
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'isert into Crime values('Robbery','Money-Heist','Mukesh','Inamdar','2020-05-16',' at line 1
mysql> isert into table Crime values('Robbery','Money-Heist','Mukesh','Inamdar','2020-05-16','Mumbai');
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'isert into table Crime values('Robbery','Money-Heist','Mukesh','Inamdar','2020-0' at line 1
mysql> insert into Crime values('Robbery','Money-Heist','Mukesh','Inamdar','2020-05-16','Mumbai');
Query OK, 1 row affected (0.01 sec)

mysql> insert into Crime values('Theft','Painting-Theft','Elizabeth','MM Musium','2022-08-25','England');
Query OK, 1 row affected (0.01 sec)

mysql> insert into Crime values('Homicide','Full-Murder','Suresh','Irrappa','2020-05-16','Mumbai');
Query OK, 1 row affected (0.01 sec)

mysql> insert into Crime values('Homicide','Half-Murder','Suresh','Marappa','2019-05-28','Bangalore');
Query OK, 1 row affected (0.00 sec)

mysql> insert into Crime values('Theft','Money-Heist','suman','sardar','2018-05-28','Karnataka');
Query OK, 1 row affected (0.01 sec)

mysql> insert into Crime values('Theft','Money-Heist','Zamin','Simran','2019-05-28','Mumbai');
Query OK, 1 row affected (0.01 sec)

mysql> insert into Crime values('Sharper','Shrper,Thung','Zuber','Sitaram','2021-09-22','Nagpur');
Query OK, 1 row affected (0.01 sec)

mysql> select * from Crime;
+-----------+----------------+---------------+--------------+-------------+-------------+
| CrimeType | CrimeDetails   | Suspects_Name | Victims_Name | DateOfCrime | Place_Crime |
+-----------+----------------+---------------+--------------+-------------+-------------+
| Robbery   | Money-Heist    | Mukesh        | Inamdar      | 2020-05-16  | Mumbai      |
| Theft     | Painting-Theft | Elizabeth     | MM Musium    | 2022-08-25  | England     |
| Homicide  | Full-Murder    | Suresh        | Irrappa      | 2020-05-16  | Mumbai      |
| Homicide  | Half-Murder    | Suresh        | Marappa      | 2019-05-28  | Bangalore   |
| Theft     | Money-Heist    | suman         | sardar       | 2018-05-28  | Karnataka   |
| Theft     | Money-Heist    | Zamin         | Simran       | 2019-05-28  | Mumbai      |
| Sharper   | Shrper,Thung   | Zuber         | Sitaram      | 2021-09-22  | Nagpur      |
+-----------+----------------+---------------+--------------+-------------+-------------+
7 rows in set (0.00 sec)

mysql> insert into Crime values('Homicide','Killing','Soman','Aman','2022-09-22','Mumbai');
Query OK, 1 row affected (0.09 sec)

mysql> insert into Crime values('Theft','Money-Heist','Soman','Susu','2022-09-15','Rayagad');
Query OK, 1 row affected (0.01 sec)

mysql> select  Place_Crime from Crime change 'England' to 'Rayagad';
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'change 'England' to 'Rayagad'' at line 1
mysql> update Crime set Place_Crime="Rayagad" where Place_Crime="England";
Query OK, 1 row affected (0.02 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from Crime;
+-----------+----------------+---------------+--------------+-------------+-------------+
| CrimeType | CrimeDetails   | Suspects_Name | Victims_Name | DateOfCrime | Place_Crime |
+-----------+----------------+---------------+--------------+-------------+-------------+
| Robbery   | Money-Heist    | Mukesh        | Inamdar      | 2020-05-16  | Mumbai      |
| Theft     | Painting-Theft | Elizabeth     | MM Musium    | 2022-08-25  | Rayagad     |
| Homicide  | Full-Murder    | Suresh        | Irrappa      | 2020-05-16  | Mumbai      |
| Homicide  | Half-Murder    | Suresh        | Marappa      | 2019-05-28  | Bangalore   |
| Theft     | Money-Heist    | suman         | sardar       | 2018-05-28  | Karnataka   |
| Theft     | Money-Heist    | Zamin         | Simran       | 2019-05-28  | Mumbai      |
| Sharper   | Shrper,Thung   | Zuber         | Sitaram      | 2021-09-22  | Nagpur      |
| Homicide  | Killing        | Soman         | Aman         | 2022-09-22  | Mumbai      |
| Theft     | Money-Heist    | Soman         | Susu         | 2022-09-15  | Rayagad     |
+-----------+----------------+---------------+--------------+-------------+-------------+
9 rows in set (0.01 sec)

mysql> select * from criminal;
+-------------+---------------+-------------+------------------+-------------+------+--------+-----------------+--------------+-----------+----------------+--------------+
| Criminal_Id | Criminal_Name | Arrest_Date | Criminal_Address | Place_Crime | Age  | Gender | Occupation      | BirthMark    | CrimeType | CrimeDetails   | Crime_status |
+-------------+---------------+-------------+------------------+-------------+------+--------+-----------------+--------------+-----------+----------------+--------------+
|           1 | Ramesh        | 2021-05-15  | Delhi            | Mumbai      |   25 | Male   | Painter         | Face-Scratch | Robbery   | Money-Heist    | NULL         |
|           2 | Elizabeth     | 2022-08-25  | England          | Bangalore   |   24 | Female | Turist          | Face-SCARS   | Teft      | Painting-Theft | NULL         |
|           3 | Suresh        | 2020-09-12  | Karnataka        | Mumbai      |   54 | Male   | Don-Buisnessman | Tatto        | Homicide  | Full-Murder    | NULL         |
|           4 | Anthony       | 2020-02-01  | Bihar            | Thane       |   26 | Male   | Teacher         | DoubleFinger | Homicide  | Half           | NULL         |
|           5 | Akash         | 2021-05-13  | Sonpur           | Nagpur      |   32 | Male   | Farmer          | EyeDamage    | Theft     | Money          | NULL         |
|           6 | Gajanan       | 2015-06-18  | Jodhpur          | Mumbai      |   23 | Male   | Student         | Head_Scratch | Theft     | Money          | NULL         |
|           7 | Raghav        | 2018-05-18  | Nagpur           | Rayagad     |   33 | Male   | Carpenter       | Baldness     | Sharper   | Sharper,Thung  | NULL         |
+-------------+---------------+-------------+------------------+-------------+------+--------+-----------------+--------------+-----------+----------------+--------------+
7 rows in set (0.01 sec)

mysql> select CrimeType,Place_Crime from crime Inner Join Criminal ON Place_Crime;
ERROR 1052 (23000): Column 'CrimeType' in field list is ambiguous
mysql> select CrimeType,Place_Crime from crime Inner Join Criminal ON Place_Crime=mumbai;
ERROR 1052 (23000): Column 'CrimeType' in field list is ambiguous
mysql> update Criminal set Crime_status= 'Unsolved';
Query OK, 7 rows affected (0.02 sec)
Rows matched: 7  Changed: 7  Warnings: 0

mysql> select * from criminal;
+-------------+---------------+-------------+------------------+-------------+------+--------+-----------------+--------------+-----------+----------------+--------------+
| Criminal_Id | Criminal_Name | Arrest_Date | Criminal_Address | Place_Crime | Age  | Gender | Occupation      | BirthMark    | CrimeType | CrimeDetails   | Crime_status |
+-------------+---------------+-------------+------------------+-------------+------+--------+-----------------+--------------+-----------+----------------+--------------+
|           1 | Ramesh        | 2021-05-15  | Delhi            | Mumbai      |   25 | Male   | Painter         | Face-Scratch | Robbery   | Money-Heist    | Unsolved     |
|           2 | Elizabeth     | 2022-08-25  | England          | Bangalore   |   24 | Female | Turist          | Face-SCARS   | Teft      | Painting-Theft | Unsolved     |
|           3 | Suresh        | 2020-09-12  | Karnataka        | Mumbai      |   54 | Male   | Don-Buisnessman | Tatto        | Homicide  | Full-Murder    | Unsolved     |
|           4 | Anthony       | 2020-02-01  | Bihar            | Thane       |   26 | Male   | Teacher         | DoubleFinger | Homicide  | Half           | Unsolved     |
|           5 | Akash         | 2021-05-13  | Sonpur           | Nagpur      |   32 | Male   | Farmer          | EyeDamage    | Theft     | Money          | Unsolved     |
|           6 | Gajanan       | 2015-06-18  | Jodhpur          | Mumbai      |   23 | Male   | Student         | Head_Scratch | Theft     | Money          | Unsolved     |
|           7 | Raghav        | 2018-05-18  | Nagpur           | Rayagad     |   33 | Male   | Carpenter       | Baldness     | Sharper   | Sharper,Thung  | Unsolved     |
+-------------+---------------+-------------+------------------+-------------+------+--------+-----------------+--------------+-----------+----------------+--------------+
7 rows in set (0.01 sec)

mysql> alter table Crime add Crime_status varchar(15);
Query OK, 0 rows affected (0.10 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> update Crime set Crime_status = 'Solved' where Suspects_Name = 'Mukesh';
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from crime;
+-----------+----------------+---------------+--------------+-------------+-------------+--------------+
| CrimeType | CrimeDetails   | Suspects_Name | Victims_Name | DateOfCrime | Place_Crime | Crime_status |
+-----------+----------------+---------------+--------------+-------------+-------------+--------------+
| Robbery   | Money-Heist    | Mukesh        | Inamdar      | 2020-05-16  | Mumbai      | Solved       |
| Theft     | Painting-Theft | Elizabeth     | MM Musium    | 2022-08-25  | Rayagad     | NULL         |
| Homicide  | Full-Murder    | Suresh        | Irrappa      | 2020-05-16  | Mumbai      | NULL         |
| Homicide  | Half-Murder    | Suresh        | Marappa      | 2019-05-28  | Bangalore   | NULL         |
| Theft     | Money-Heist    | suman         | sardar       | 2018-05-28  | Karnataka   | NULL         |
| Theft     | Money-Heist    | Zamin         | Simran       | 2019-05-28  | Mumbai      | NULL         |
| Sharper   | Shrper,Thung   | Zuber         | Sitaram      | 2021-09-22  | Nagpur      | NULL         |
| Homicide  | Killing        | Soman         | Aman         | 2022-09-22  | Mumbai      | NULL         |
| Theft     | Money-Heist    | Soman         | Susu         | 2022-09-15  | Rayagad     | NULL         |
+-----------+----------------+---------------+--------------+-------------+-------------+--------------+
9 rows in set (0.01 sec)

mysql> update Crime set Crime_status = 'Unsolved' where Suspects_Name = 'Elizabeth';
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> update Crime set Crime_status = 'Unsolved' where Suspects_Name = 'Suresh';
Query OK, 2 rows affected (0.01 sec)
Rows matched: 2  Changed: 2  Warnings: 0

mysql> update Crime set Crime_status = 'Solved' where Suspects_Name = 'Soman';
Query OK, 2 rows affected (0.01 sec)
Rows matched: 2  Changed: 2  Warnings: 0

mysql> update Crime set Crime_status = 'Unsolved' where Suspects_Name = 'Zuber';
Query OK, 1 row affected (0.00 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> update Crime set Crime_status = 'Unsolved' where Suspects_Name = 'Zamin';
Query OK, 1 row affected (0.00 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from crime;
+-----------+----------------+---------------+--------------+-------------+-------------+--------------+
| CrimeType | CrimeDetails   | Suspects_Name | Victims_Name | DateOfCrime | Place_Crime | Crime_status |
+-----------+----------------+---------------+--------------+-------------+-------------+--------------+
| Robbery   | Money-Heist    | Mukesh        | Inamdar      | 2020-05-16  | Mumbai      | Solved       |
| Theft     | Painting-Theft | Elizabeth     | MM Musium    | 2022-08-25  | Rayagad     | Unsolved     |
| Homicide  | Full-Murder    | Suresh        | Irrappa      | 2020-05-16  | Mumbai      | Unsolved     |
| Homicide  | Half-Murder    | Suresh        | Marappa      | 2019-05-28  | Bangalore   | Unsolved     |
| Theft     | Money-Heist    | suman         | sardar       | 2018-05-28  | Karnataka   | NULL         |
| Theft     | Money-Heist    | Zamin         | Simran       | 2019-05-28  | Mumbai      | Unsolved     |
| Sharper   | Shrper,Thung   | Zuber         | Sitaram      | 2021-09-22  | Nagpur      | Unsolved     |
| Homicide  | Killing        | Soman         | Aman         | 2022-09-22  | Mumbai      | Solved       |
| Theft     | Money-Heist    | Soman         | Susu         | 2022-09-15  | Rayagad     | Solved       |
+-----------+----------------+---------------+--------------+-------------+-------------+--------------+
9 rows in set (0.00 sec)

mysql> update Crime set Crime_status = 'Solved' where Suspects_Name = 'suman';
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from crime;
+-----------+----------------+---------------+--------------+-------------+-------------+--------------+
| CrimeType | CrimeDetails   | Suspects_Name | Victims_Name | DateOfCrime | Place_Crime | Crime_status |
+-----------+----------------+---------------+--------------+-------------+-------------+--------------+
| Robbery   | Money-Heist    | Mukesh        | Inamdar      | 2020-05-16  | Mumbai      | Solved       |
| Theft     | Painting-Theft | Elizabeth     | MM Musium    | 2022-08-25  | Rayagad     | Unsolved     |
| Homicide  | Full-Murder    | Suresh        | Irrappa      | 2020-05-16  | Mumbai      | Unsolved     |
| Homicide  | Half-Murder    | Suresh        | Marappa      | 2019-05-28  | Bangalore   | Unsolved     |
| Theft     | Money-Heist    | suman         | sardar       | 2018-05-28  | Karnataka   | Solved       |
| Theft     | Money-Heist    | Zamin         | Simran       | 2019-05-28  | Mumbai      | Unsolved     |
| Sharper   | Shrper,Thung   | Zuber         | Sitaram      | 2021-09-22  | Nagpur      | Unsolved     |
| Homicide  | Killing        | Soman         | Aman         | 2022-09-22  | Mumbai      | Solved       |
| Theft     | Money-Heist    | Soman         | Susu         | 2022-09-15  | Rayagad     | Solved       |
+-----------+----------------+---------------+--------------+-------------+-------------+--------------+
9 rows in set (0.00 sec)

mysql> select * from Criminal where CrimeType=? OR Arrest_Date=?
    -> ;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '? OR Arrest_Date=?' at line 1
mysql> select * from Criminal where CrimeType='Homicide' OR Arrest_Date='2022-08-25';
+-------------+---------------+-------------+------------------+-------------+------+--------+-----------------+--------------+-----------+----------------+--------------+
| Criminal_Id | Criminal_Name | Arrest_Date | Criminal_Address | Place_Crime | Age  | Gender | Occupation      | BirthMark    | CrimeType | CrimeDetails   | Crime_status |
+-------------+---------------+-------------+------------------+-------------+------+--------+-----------------+--------------+-----------+----------------+--------------+
|           2 | Elizabeth     | 2022-08-25  | England          | Bangalore   |   24 | Female | Turist          | Face-SCARS   | Teft      | Painting-Theft | Unsolved     |
|           3 | Suresh        | 2020-09-12  | Karnataka        | Mumbai      |   54 | Male   | Don-Buisnessman | Tatto        | Homicide  | Full-Murder    | Unsolved     |
|           4 | Anthony       | 2020-02-01  | Bihar            | Thane       |   26 | Male   | Teacher         | DoubleFinger | Homicide  | Half           | Unsolved     |
+-------------+---------------+-------------+------------------+-------------+------+--------+-----------------+--------------+-----------+----------------+--------------+
3 rows in set (0.01 sec)

mysql> select * from Crime where Suspects_Name="Mukesh";
+-----------+--------------+---------------+--------------+-------------+-------------+--------------+
| CrimeType | CrimeDetails | Suspects_Name | Victims_Name | DateOfCrime | Place_Crime | Crime_status |
+-----------+--------------+---------------+--------------+-------------+-------------+--------------+
| Robbery   | Money-Heist  | Mukesh        | Inamdar      | 2020-05-16  | Mumbai      | Solved       |
+-----------+--------------+---------------+--------------+-------------+-------------+--------------+
1 row in set (0.00 sec)

mysql> SELECT Crime_status, COUNT(Criminal_Id) FROM Criminal GROUP BY Crime_status HAVING COUNT(Criminal_Id)>0;
+--------------+--------------------+
| Crime_status | COUNT(Criminal_Id) |
+--------------+--------------------+
| Unsolved     |                  7 |
+--------------+--------------------+
1 row in set (0.02 sec)

mysql> SELECT Crime_status, COUNT(Criminal_Id) FROM Criminal GROUP BY Crime_status HAVING COUNT(Criminal_Id);
+--------------+--------------------+
| Crime_status | COUNT(Criminal_Id) |
+--------------+--------------------+
| Unsolved     |                  7 |
+--------------+--------------------+
1 row in set (0.00 sec)

mysql> SELECT Crime_status, COUNT(Crime_status) FROM Crime GROUP BY Crime_status HAVING COUNT(Solved);
ERROR 1054 (42S22): Unknown column 'Solved' in 'having clause'
mysql> SELECT Crime_status, COUNT(Crime_status) FROM Crime GROUP BY Crime_status HAVING COUNT('Solved');
+--------------+---------------------+
| Crime_status | COUNT(Crime_status) |
+--------------+---------------------+
| Solved       |                   4 |
| Unsolved     |                   5 |
+--------------+---------------------+
2 rows in set (0.01 sec)

mysql> update Criminal set Crime_status = 'Solved' where Suspects_Name = 'Raghav';
ERROR 1054 (42S22): Unknown column 'Suspects_Name' in 'where clause'
mysql> update Criminal set Crime_status = 'Solved' where Criminal_Name = 'Raghav';
Query OK, 1 row affected (0.02 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from Criminal ;
+-------------+---------------+-------------+------------------+-------------+------+--------+-----------------+--------------+-----------+----------------+--------------+
| Criminal_Id | Criminal_Name | Arrest_Date | Criminal_Address | Place_Crime | Age  | Gender | Occupation      | BirthMark    | CrimeType | CrimeDetails   | Crime_status |
+-------------+---------------+-------------+------------------+-------------+------+--------+-----------------+--------------+-----------+----------------+--------------+
|           1 | Ramesh        | 2021-05-15  | Delhi            | Mumbai      |   25 | Male   | Painter         | Face-Scratch | Robbery   | Money-Heist    | Unsolved     |
|           2 | Elizabeth     | 2022-08-25  | England          | Bangalore   |   24 | Female | Turist          | Face-SCARS   | Teft      | Painting-Theft | Unsolved     |
|           3 | Suresh        | 2020-09-12  | Karnataka        | Mumbai      |   54 | Male   | Don-Buisnessman | Tatto        | Homicide  | Full-Murder    | Unsolved     |
|           4 | Anthony       | 2020-02-01  | Bihar            | Thane       |   26 | Male   | Teacher         | DoubleFinger | Homicide  | Half           | Unsolved     |
|           5 | Akash         | 2021-05-13  | Sonpur           | Nagpur      |   32 | Male   | Farmer          | EyeDamage    | Theft     | Money          | Unsolved     |
|           6 | Gajanan       | 2015-06-18  | Jodhpur          | Mumbai      |   23 | Male   | Student         | Head_Scratch | Theft     | Money          | Unsolved     |
|           7 | Raghav        | 2018-05-18  | Nagpur           | Rayagad     |   33 | Male   | Carpenter       | Baldness     | Sharper   | Sharper,Thung  | Solved       |
+-------------+---------------+-------------+------------------+-------------+------+--------+-----------------+--------------+-----------+----------------+--------------+
7 rows in set (0.01 sec)

mysql> update Criminal set Crime_status = 'Unsolved' where Criminal_Name = 'Raghav';
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from Criminal ;
+-------------+---------------+-------------+------------------+-------------+------+--------+-----------------+--------------+-----------+----------------+--------------+
| Criminal_Id | Criminal_Name | Arrest_Date | Criminal_Address | Place_Crime | Age  | Gender | Occupation      | BirthMark    | CrimeType | CrimeDetails   | Crime_status |
+-------------+---------------+-------------+------------------+-------------+------+--------+-----------------+--------------+-----------+----------------+--------------+
|           1 | Ramesh        | 2021-05-15  | Delhi            | Mumbai      |   25 | Male   | Painter         | Face-Scratch | Robbery   | Money-Heist    | Unsolved     |
|           2 | Elizabeth     | 2022-08-25  | England          | Bangalore   |   24 | Female | Turist          | Face-SCARS   | Teft      | Painting-Theft | Unsolved     |
|           3 | Suresh        | 2020-09-12  | Karnataka        | Mumbai      |   54 | Male   | Don-Buisnessman | Tatto        | Homicide  | Full-Murder    | Unsolved     |
|           4 | Anthony       | 2020-02-01  | Bihar            | Thane       |   26 | Male   | Teacher         | DoubleFinger | Homicide  | Half           | Unsolved     |
|           5 | Akash         | 2021-05-13  | Sonpur           | Nagpur      |   32 | Male   | Farmer          | EyeDamage    | Theft     | Money          | Unsolved     |
|           6 | Gajanan       | 2015-06-18  | Jodhpur          | Mumbai      |   23 | Male   | Student         | Head_Scratch | Theft     | Money          | Unsolved     |
|           7 | Raghav        | 2018-05-18  | Nagpur           | Rayagad     |   33 | Male   | Carpenter       | Baldness     | Sharper   | Sharper,Thung  | Unsolved     |
+-------------+---------------+-------------+------------------+-------------+------+--------+-----------------+--------------+-----------+----------------+--------------+
7 rows in set (0.00 sec)

mysql> select * from Crime;
+-----------+----------------+---------------+--------------+-------------+-------------+--------------+
| CrimeType | CrimeDetails   | Suspects_Name | Victims_Name | DateOfCrime | Place_Crime | Crime_status |
+-----------+----------------+---------------+--------------+-------------+-------------+--------------+
| Robbery   | Money-Heist    | Mukesh        | Inamdar      | 2020-05-16  | Mumbai      | Solved       |
| Theft     | Painting-Theft | Elizabeth     | MM Musium    | 2022-08-25  | Rayagad     | Unsolved     |
| Homicide  | Full-Murder    | Suresh        | Irrappa      | 2020-05-16  | Mumbai      | Unsolved     |
| Homicide  | Half-Murder    | Suresh        | Marappa      | 2019-05-28  | Bangalore   | Unsolved     |
| Theft     | Money-Heist    | suman         | sardar       | 2018-05-28  | Karnataka   | Solved       |
| Theft     | Money-Heist    | Zamin         | Simran       | 2019-05-28  | Mumbai      | Unsolved     |
| Sharper   | Shrper,Thung   | Zuber         | Sitaram      | 2021-09-22  | Nagpur      | Unsolved     |
| Homicide  | Killing        | Soman         | Aman         | 2022-09-22  | Mumbai      | Solved       |
| Theft     | Money-Heist    | Soman         | Susu         | 2022-09-15  | Rayagad     | Solved       |
+-----------+----------------+---------------+--------------+-------------+-------------+--------------+
9 rows in set (0.00 sec)

mysql> SELECT DateOfCrime, COUNT(Crime_status) FROM Crime GROUP BY Crime_status HAVING COUNT('Solved')AND DateOfCrime>='2022-08-31';
Empty set (0.00 sec)

mysql> SELECT DateOfCrime, COUNT(Crime_status) FROM Crime GROUP BY Crime_status HAVING COUNT('Solved')OR DateOfCrime>='2022-08-31';
+-------------+---------------------+
| DateOfCrime | COUNT(Crime_status) |
+-------------+---------------------+
| 2020-05-16  |                   4 |
| 2022-08-25  |                   5 |
+-------------+---------------------+
2 rows in set (0.01 sec)

mysql> SELECT DateOfCrime, COUNT(Crime_status) FROM Crime GROUP BY Crime_status HAVING COUNT('Solved')AND DateOfCrime>='2022-06-31';
+-------------+---------------------+
| DateOfCrime | COUNT(Crime_status) |
+-------------+---------------------+
| 2022-08-25  |                   5 |
+-------------+---------------------+
1 row in set (0.00 sec)

mysql> SELECT DateOfCrime, COUNT(Crime_status) FROM Crime GROUP BY Crime_status HAVING Crime_status('Solved')AND DateOfCrime>='2022-06-31';
ERROR 1305 (42000): FUNCTION crime_management_system.Crime_status does not exist
mysql> SELECT DateOfCrime, COUNT(Crime_status) FROM Crime GROUP BY Crime_status HAVING COUNT('Solved');
+-------------+---------------------+
| DateOfCrime | COUNT(Crime_status) |
+-------------+---------------------+
| 2020-05-16  |                   4 |
| 2022-08-25  |                   5 |
+-------------+---------------------+
2 rows in set (0.00 sec)

mysql> SELECT DateOfCrime, COUNT(Crime_status) FROM Crime GROUP BY Crime_status HAVING COUNT('unsolved');
+-------------+---------------------+
| DateOfCrime | COUNT(Crime_status) |
+-------------+---------------------+
| 2020-05-16  |                   4 |
| 2022-08-25  |                   5 |
+-------------+---------------------+
2 rows in set (0.00 sec)

mysql> SELECT DateOfCrime, COUNT(Crime_status) FROM Crime GROUP BY Crime_status HAVING COUNT();
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ')' at line 1
mysql> SELECT DateOfCrime, COUNT(Crime_status) FROM Crime GROUP BY Crime_status HAVING COUNT('2022-09-22');
+-------------+---------------------+
| DateOfCrime | COUNT(Crime_status) |
+-------------+---------------------+
| 2020-05-16  |                   4 |
| 2022-08-25  |                   5 |
+-------------+---------------------+
2 rows in set (0.00 sec)

mysql> SELECT DateOfCrime, COUNT(Crime_status) FROM Crime GROUP BY DateOfCrime HAVING COUNT('Solved');
+-------------+---------------------+
| DateOfCrime | COUNT(Crime_status) |
+-------------+---------------------+
| 2020-05-16  |                   2 |
| 2022-08-25  |                   1 |
| 2019-05-28  |                   2 |
| 2018-05-28  |                   1 |
| 2021-09-22  |                   1 |
| 2022-09-22  |                   1 |
| 2022-09-15  |                   1 |
+-------------+---------------------+
7 rows in set (0.00 sec)

mysql> SELECT DateOfCrime, COUNT(Crime_status) FROM Crime GROUP BY DateOfCrime HAVING DateOfCrime>='2022-08-31';
+-------------+---------------------+
| DateOfCrime | COUNT(Crime_status) |
+-------------+---------------------+
| 2022-09-22  |                   1 |
| 2022-09-15  |                   1 |
+-------------+---------------------+
2 rows in set (0.01 sec)

mysql> SELECT DateOfCrime, COUNT(Crime_status) FROM Crime GROUP BY DateOfCrime HAVING count(DateOfCrime>='2022-08-31');
+-------------+---------------------+
| DateOfCrime | COUNT(Crime_status) |
+-------------+---------------------+
| 2020-05-16  |                   2 |
| 2022-08-25  |                   1 |
| 2019-05-28  |                   2 |
| 2018-05-28  |                   1 |
| 2021-09-22  |                   1 |
| 2022-09-22  |                   1 |
| 2022-09-15  |                   1 |
+-------------+---------------------+
7 rows in set (0.00 sec)

mysql> SELECT DateOfCrime, COUNT(Crime_status)Total_Cases_In_Current_Month FROM Crime GROUP BY DateOfCrime HAVING DateOfCrime>='2022-08-31';
+-------------+------------------------------+
| DateOfCrime | Total_Cases_In_Current_Month |
+-------------+------------------------------+
| 2022-09-22  |                            1 |
| 2022-09-15  |                            1 |
+-------------+------------------------------+
2 rows in set (0.00 sec)

mysql> SELECT DateOfCrime, COUNT(Crime_status)Total_Cases_In_Current_Month FROM Crime GROUP BY DateOfCrime HAVING DateOfCrime>='2022-08-31';




mysql> create table PoliceOfficer(
    -> Username varchar(45),
    -> Password varchar(45)
    -> );
ERROR 1046 (3D000): No database selected
mysql> show databases;
+-------------------------+
| Database                |
+-------------------------+
| crime_management_system |
| information_schema      |
| mysql                   |
| performance_schema      |
| student_inforamtion     |
+-------------------------+
5 rows in set (0.08 sec)

mysql> use crime_management_system;
Database changed
mysql> create table PoliceOfficer(
    -> Username varchar(45),
    -> Password varchar(45)
    -> );
Query OK, 0 rows affected (0.13 sec)

mysql> desc policeofficer;
+----------+-------------+------+-----+---------+-------+
| Field    | Type        | Null | Key | Default | Extra |
+----------+-------------+------+-----+---------+-------+
| Username | varchar(45) | YES  |     | NULL    |       |
| Password | varchar(45) | YES  |     | NULL    |       |
+----------+-------------+------+-----+---------+-------+
2 rows in set (0.04 sec)

mysql> drop policeofficer;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'policeofficer' at line 1
mysql> drop table policeofficer;
Query OK, 0 rows affected (0.04 sec)

mysql> create table PoliceOfficer(
    ->
    -> Username varchar(45),
    -> Password varchar(45),
    -> StationId int,
    -> PoliceStation_Area varchar(45)
    -> );
Query OK, 0 rows affected (0.02 sec)

mysql> insert into PoliceOfficer values(Namdevpatilm@gamil.com,827515,1,'West Mumbai');
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '@gamil.com,827515,1,'West Mumbai')' at line 1
mysql> insert into PoliceOfficer values('Namdevpatilm@gamil.com',827515,1,'West Mumbai');
Query OK, 1 row affected (0.02 sec)

mysql> insert into PoliceOfficer values('Makndar@gamil.com',727515,2,'East Mumbai');
Query OK, 1 row affected (0.00 sec)

mysql> insert into PoliceOfficer values('Sardar@gamil.com',627515,2,'Central Mumbai');
Query OK, 1 row affected (0.01 sec)

mysql> insert into PoliceOfficer values('Gajaan@gamil.com',527515,3,'South Mumbai');
Query OK, 1 row affected (0.01 sec)

mysql> insert into PoliceOfficer values('Chaugule@gamil.com',427515,4,' Bangalore');
Query OK, 1 row affected (0.01 sec)

mysql> select * from policeofficer;
+------------------------+----------+-----------+--------------------+
| Username               | Password | StationId | PoliceStation_Area |
+------------------------+----------+-----------+--------------------+
| Namdevpatilm@gamil.com | 827515   |         1 | West Mumbai        |
| Makndar@gamil.com      | 727515   |         2 | East Mumbai        |
| Sardar@gamil.com       | 627515   |         2 | Central Mumbai     |
| Gajaan@gamil.com       | 527515   |         3 | South Mumbai       |
| Chaugule@gamil.com     | 427515   |         4 |  Bangalore         |
+------------------------+----------+-----------+--------------------+
5 rows in set (0.00 sec)

mysql> select * from Criminal;
+-------------+---------------+-------------+------------------+-------------+------+--------+-----------------+--------------+-----------+----------------+--------------+
| Criminal_Id | Criminal_Name | Arrest_Date | Criminal_Address | Place_Crime | Age  | Gender | Occupation      | BirthMark    | CrimeType | CrimeDetails   | Crime_status |
+-------------+---------------+-------------+------------------+-------------+------+--------+-----------------+--------------+-----------+----------------+--------------+
|           1 | Ramesh        | 2021-05-15  | Delhi            | Mumbai      |   25 | Male   | Painter         | Face-Scratch | Robbery   | Money-Heist    | Unsolved     |
|           2 | Elizabeth     | 2022-08-25  | England          | Bangalore   |   24 | Female | Turist          | Face-SCARS   | Teft      | Painting-Theft | Unsolved     |
|           3 | Suresh        | 2020-09-12  | Karnataka        | Mumbai      |   54 | Male   | Don-Buisnessman | Tatto        | Homicide  | Full-Murder    | Unsolved     |
|           4 | Anthony       | 2020-02-01  | Bihar            | Thane       |   26 | Male   | Teacher         | DoubleFinger | Homicide  | Half           | Unsolved     |
|           5 | Akash         | 2021-05-13  | Sonpur           | Nagpur      |   32 | Male   | Farmer          | EyeDamage    | Theft     | Money          | Unsolved     |
|           6 | Gajanan       | 2015-06-18  | Jodhpur          | Mumbai      |   23 | Male   | Student         | Head_Scratch | Theft     | Money          | Unsolved     |
|           7 | Raghav        | 2018-05-18  | Nagpur           | Rayagad     |   33 | Male   | Carpenter       | Baldness     | Sharper   | Sharper,Thung  | Unsolved     |
|           9 | Subhash       | 2022-08-26  | 2020-08-22       | Nagpur      |   29 | Male   | Painter         | Tatto        | Homicide  | Unsolved       | NULL         |
|          10 | Mahesh        | 2022-10-01  | Madavale         | Belgaum     |   31 | Male   | Chemist         | BlackColor   | Theft     | Unsolved       | NULL         |
+-------------+---------------+-------------+------------------+-------------+------+--------+-----------------+--------------+-----------+----------------+--------------+
9 rows in set (0.01 sec)

mysql> select * from Crime;
+-----------+----------------+---------------+--------------+-------------+-------------+--------------+
| CrimeType | CrimeDetails   | Suspects_Name | Victims_Name | DateOfCrime | Place_Crime | Crime_status |
+-----------+----------------+---------------+--------------+-------------+-------------+--------------+
| Robbery   | Money-Heist    | Mukesh        | Inamdar      | 2020-05-16  | Mumbai      | Solved       |
| Theft     | Painting-Theft | Elizabeth     | MM Musium    | 2022-08-25  | Rayagad     | Unsolved     |
| Homicide  | Full-Murder    | Suresh        | Irrappa      | 2020-05-16  | Mumbai      | Unsolved     |
| Homicide  | Half-Murder    | Suresh        | Marappa      | 2019-05-28  | Bangalore   | Unsolved     |
| Theft     | Money-Heist    | suman         | sardar       | 2018-05-28  | Karnataka   | Solved       |
| Theft     | Money-Heist    | Zamin         | Simran       | 2019-05-28  | Mumbai      | Unsolved     |
| Sharper   | Shrper,Thung   | Zuber         | Sitaram      | 2021-09-22  | Nagpur      | Unsolved     |
| Homicide  | Killing        | Soman         | Aman         | 2022-09-22  | Mumbai      | Solved       |
| Theft     | Money-Heist    | Soman         | Susu         | 2022-09-15  | Rayagad     | Solved       |
+-----------+----------------+---------------+--------------+-------------+-------------+--------------+
9 rows in set (0.01 sec)

mysql> select * from Policestation_Criminal;
+-----------+------------+
| StationId | CriminalId |
+-----------+------------+
|         1 |          1 |
|         3 |          3 |
|         3 |          1 |
|         2 |          2 |
|         4 |          3 |
|         2 |          2 |
|         3 |          3 |
+-----------+------------+
7 rows in set (0.01 sec)

mysql> select * from Policestation;
ERROR 1146 (42S02): Table 'crime_management_system.policestation' doesn't exist
mysql> select * from Police_Station;
+-----------+----------------------------+------------------------+
| StationId | PoliceStation_Name         | PoliceStation_Area     |
+-----------+----------------------------+------------------------+
|         1 | Andheri Police Station     | West Mumbai            |
|         2 | VV Puram Police Station    | East of Bangalore city |
|         3 | Azad Maidan Police Station | South Mumbai           |
|         4 | D B Marg Police Station    | West Mumbai            |
+-----------+----------------------------+------------------------+
4 rows in set (0.01 sec)

mysql> insert into policestation_Criminal values(1,10);
Query OK, 1 row affected (0.01 sec)

mysql> insert into policestation_Criminal values(1,7);
Query OK, 1 row affected (0.01 sec)

mysql> insert into policestation_Criminal values(1,9);
Query OK, 1 row affected (0.01 sec)

mysql> insert into policestation_Criminal values(2,4);
Query OK, 1 row affected (0.01 sec)

mysql> insert into policestation_Criminal values(2,5);
Query OK, 1 row affected (0.00 sec)

mysql> update Criminal set Crime_status = 'Unsolved' where Criminal_Name = 'Subhash';
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> update Criminal set Crime_status = 'Unsolved' where Criminal_Name = 'Mahesh';
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from Criminal;
+-------------+---------------+-------------+------------------+-------------+------+--------+-----------------+--------------+-----------+----------------+--------------+
| Criminal_Id | Criminal_Name | Arrest_Date | Criminal_Address | Place_Crime | Age  | Gender | Occupation      | BirthMark    | CrimeType | CrimeDetails   | Crime_status |
+-------------+---------------+-------------+------------------+-------------+------+--------+-----------------+--------------+-----------+----------------+--------------+
|           1 | Ramesh        | 2021-05-15  | Delhi            | Mumbai      |   25 | Male   | Painter         | Face-Scratch | Robbery   | Money-Heist    | Unsolved     |
|           2 | Elizabeth     | 2022-08-25  | England          | Bangalore   |   24 | Female | Turist          | Face-SCARS   | Teft      | Painting-Theft | Unsolved     |
|           3 | Suresh        | 2020-09-12  | Karnataka        | Mumbai      |   54 | Male   | Don-Buisnessman | Tatto        | Homicide  | Full-Murder    | Unsolved     |
|           4 | Anthony       | 2020-02-01  | Bihar            | Thane       |   26 | Male   | Teacher         | DoubleFinger | Homicide  | Half           | Unsolved     |
|           5 | Akash         | 2021-05-13  | Sonpur           | Nagpur      |   32 | Male   | Farmer          | EyeDamage    | Theft     | Money          | Unsolved     |
|           6 | Gajanan       | 2015-06-18  | Jodhpur          | Mumbai      |   23 | Male   | Student         | Head_Scratch | Theft     | Money          | Unsolved     |
|           7 | Raghav        | 2018-05-18  | Nagpur           | Rayagad     |   33 | Male   | Carpenter       | Baldness     | Sharper   | Sharper,Thung  | Unsolved     |
|           9 | Subhash       | 2022-08-26  | 2020-08-22       | Nagpur      |   29 | Male   | Painter         | Tatto        | Homicide  | Unsolved       | Unsolved     |
|          10 | Mahesh        | 2022-10-01  | Madavale         | Belgaum     |   31 | Male   | Chemist         | BlackColor   | Theft     | Unsolved       | Unsolved     |
+-------------+---------------+-------------+------------------+-------------+------+--------+-----------------+--------------+-----------+----------------+--------------+
9 rows in set (0.00 sec)

mysql>












 
 
 
 */
}
