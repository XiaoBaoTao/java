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

Variables 经常改变 username & password

```Java
int age=1;
```

#### 1.2.2 数据类型

Java是强数据类型；

##### Primitive Type:

整数：

+ byte
+ short 2 bytes
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

#### 1.2.3 变量

变量名不能重复定义.

变量在使用前必须赋值。

变量的范围只限于{}之内。

#### 1.2.4 键盘录入

```java
        Scanner sc=new Scanner(System.in);
        System.out.println("please input your name: ");
        if(sc.hasNext()){
        System.out.printf("You just inputted: %s",sc.next());
        }

```

#### 1.2.5 标识符

+ 数字，字母，下划线。
+ 区分大小写
+ 不能用关键字

#### 1.2.6 类型转换

##### 隐式转换

1. 取值范围小的数据，可以直接赋值给取值范围大的数据，类型会自动转换； 比如10 赋值给float, 就会变成10.0

```java
        int a=10;
        double b=a; // b等于10.0
```

2. 如果范围小的数据和范围大的数据做运算，得到的结果数据类型是范围大的数据类型；

3. byte, short, char 运算的结果，都会是int 


##### 强制转换

将范围大的数据类型，强制转换为范围小的数据类型；

强制转换语法 `(int) a `
```java
public class ForceConvert {
    public static void main(String[] args) {
        float a = 12.57f;
        int b = (int) a;
        System.out.println(b);
        System.out.println(a);
    }
}
```
强制转换可能会损失精度；

