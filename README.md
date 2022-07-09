# java
## 1. Java语法基础

### 1.1 入门

+ 注释 
+ 关键字 

### 1.2 数据类型 

+ char 单引号 
+ int 
+ float 
+ boolean 
+ null
+ string 双引号

#### 1.2.1 变量 
Variables 
经常改变
username & password 
```Java
int age = 1;
```

#### 1.2.2 数据类型 

Java是强数据类型；

##### Primitive Type:

整数：
+ byte 
+ short   2 bytes
+ int 
+ long 

浮点型：

+ float 
+ double 

字符：

+ char 

布尔：

+ boolean 

##### Reference Type 

+ String 
+ function 
+ object 

#### 1.2.3  变量 

变量名不能重复定义.

变量在使用前必须赋值。

变量的范围只限于{}之内。 


#### 1.2.4 键盘录入

```java
        Scanner sc = new Scanner(System.in);
        System.out.println("please input your name: ");
        if (sc.hasNext()) {
            System.out.printf("You just inputted: %s", sc.next());
        }

```






