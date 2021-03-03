1.使用top查看系统资源占用情况时，哪一列表示内存占用呢？VIRT虚拟内存用量</br>
答：RES物理内存用量、SHR共享内存用量、%MEM内存用量
2.如果知道一个文件名称，怎么查这个文件在linux下的哪个目录，如：要查找tnsnames.ora文件
Find /-name tnsnames.ora
3.执行sql脚本
#!/bin/sh
Mysql -uroot -p12345678 wxc_test</wxc/wxc.sql
Ls /wxc/data |while read line
do
Mysql -uroot -p12345678 wxc_test</wxc/data/$line
echo “导入文件$line 完成”
done
