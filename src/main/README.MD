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
