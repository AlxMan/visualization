1.使用top查看系统资源占用情况时，哪一列表示内存占用呢？VIRT虚拟内存用量</br>
答：RES物理内存用量、SHR共享内存用量、%MEM内存用量</br>
2.如果知道一个文件名称，怎么查这个文件在linux下的哪个目录，如：要查找tnsnames.ora文件</br>
find /-name tnsnames.ora</br>
3.执行sql脚本</br>
#!/bin/sh</br>
mysql -uroot -p12345678 wxc_test</wxc/wxc.sql</br>
ls /wxc/data |while read line</br>
do</br>
mysql -uroot -p12345678 wxc_test</wxc/data/$line</br>
echo “导入文件$line 完成”</br>
done</br>
1、查询有课程大于80分又有课程低于60分的学生的学号</br>
select studentNo FROM student WHERE studentNo IN (SELECT studentNo FROM student_course WHERE grade>80 AND grade<60 );</br>
2、 查询各门课程去掉一个最高分和最低分后的平均成绩</br>
select avg(grade) from student_course     
  where grade   not   in (select  top 1 grade  from  student_course order  by  grade ASC)   
  and  grade  not in (select  top   1  grade  from  student_course order  by  grade  desc)</br>
1、编写一段sql，查找a、b表都有的userid</br>
SELECT userid  FROM a b WHERE a.userid=b.userid;</br>
2）编写一段sql，查找a中有b中没有的userid</br>
select distinct a.userid from  a where a.userid not in (select userid from b);</br>

1、编写一个 SQL 查询，查找 Person 表中所有重复的电子邮箱</br>
SELECT Email FROM Person GROUP BY Email HAVING COUNT(Email)>1;</br>
2、编写一个 SQL 查询，获取 Employee 表中第二高的薪水（Salary）
select max(Salary) as SecondHighestSalary from Employee where Salary<(select max(Salary) from Employee)
