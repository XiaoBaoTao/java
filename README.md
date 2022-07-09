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

获取数据类型

```java
public static String getType(Object o){
        return o.getClass().toString();
        }
```

### 1.3 运算符

#### 1.3.1 字符的加操作

1 + 'c' = int

#### 1.3.2 字符串的加操作

"zoe_" + "int" = "zoe_int"

**字符串可以通过+ 与任何类型数据相加**

如何遍历string

```java
        for(char ch:number.toCharArray()){
        System.out.println(ch);
        }
```

数值类型如何转换为字符串

```java
        String nb=String.valueOf(221412);
```

##### 逻辑运算符 

`|` or `&` or `^` or `!` 
`^`相同为True, 不同为False 

`||` or `&&` 

`&&` 短路运算符. 左边为false就不再执行了。

`||` 无论左边为啥，右边都会执行


### 1.4 条件控制语句

#### if else 

```text
if 
else
if
elif
elif
else
```

#### switch case 

```java 
public class SwitchExe {
    public static void main(String[] args) {
        System.out.println("please input a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch (number) {
            case 1 -> System.out.println("one");
            case 2 -> System.out.println("two");
            default -> System.out.println("default");
        }
    }
}
```

### 1.5 循环语句

三种方式：

```java
import java.util.ArrayList;
import java.util.Iterator;

public class Exe01 {
    public static void main(String[] args) {
        // # 1
        ArrayList<String> items = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            items.add(String.valueOf(i));
        }
        System.out.println("****2*****");
        // # 2
        for (String item : items) {
            System.out.println(item);
        }
        // # 3
        System.out.println("****3****");
        Iterator it = items.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }
}
```