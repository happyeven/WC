# WC 项目要求
wc.exe 是一个常见的工具，它能统计文本文件的字符数、单词数和行数。这个项目要求写一个命令行程序，模仿已有wc.exe 的功能，并加以扩充，给出某程序设计语言源文件的字符数、单词数和行数。
实现一个统计程序，它能正确统计程序文件中的字符数、单词数、行数，以及还具备其他扩展功能，并能够快速地处理多个文件。

* 具体功能要求：

程序处理用户需求的模式为：

```
wc.exe [parameter] [file_name]
```
 
基本功能列表：

```
wc.exe -c file.c     //返回文件 file.c 的字符数
wc.exe -w file.c    //返回文件 file.c 的词的数目  
wc.exe -l file.c      //返回文件 file.c 的行数
```
