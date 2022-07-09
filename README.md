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

### 1.6 Random类

```java
public class RandomExe {
    public static void main(String[] args) {
        System.out.println("this is the test random class!");
        Random random = new Random();
        int number = random.nextInt(10); // produce 0-9 numbers , 10 is the bound 
        System.out.println(number);
    }
}
```

### 1.7 Idea的常规设置和快捷键

idea的项目结构

```text
└── src    --project 
    └── chapter1  -- module
        ├── chapter1.iml
        └── src
            ├── ForceConvert.java
            ├── ForceConvertExample.java
            ├── Hello.java
            ├── exe01  -- package 
            │   ├── Exe01.java  -- class 
            │   ├── Exe02.java
            │   └── Exe03.java
            ├── exe02
            │   ├── Exe01.java
            │   ├── Exe02.java
            │   ├── LogicOperator.java
            │   ├── NumberSplit.java
            │   ├── StringExe.java
            │   └── TernaryOperator.java
            ├── exe03
            │   ├── Exe01.java
            │   ├── Exe02.java
            │   └── SwitchExe.java
            ├── exe04
            │   ├── Exe01.java
            │   └── Exe02.java
            └── exe05
                └── RandomExe.java
```

project -> module -> package -> class

操作步骤：

1. 创建一个project
2. 创建一个module
3. 创建package
4. 创建class
5. 编译代码
6. 运行代码

##### idea常用的快捷键

`psvm`: 快速生成 main 方法
`sout`: 快速生成print
`ctrl + cmd + l`: 格式化代码
`alt + enter`: 代码修正提示
`ctrl +x`: 剪切一行

##### 删除module

点击module, 右键，选择remove module

### 1.8 数组

数组是一组包含数据类型`相同`的容器。

#### 1.8.1 数组的初始化

+ 静态初始化

`
int[] numbers = {123,34,34,45};
`

+ 动态初始化

`
int[] numbers = new int[5];
`

```java
public class ArrayExe {
    public static void main(String[] args) {
        System.out.println("Hello?");
        int[] items = {12, 23, 434};
        String[] names = {"zoe", "Pi", "Zh"};
        for (int item : items) {
            System.out.println(item);
        }
        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.toString(names));

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}

```
求和或求最大值
```java
        int maxValue = Arrays.stream(items).max().getAsInt();
        int sumValue = Arrays.stream(items).sum();
```


### 1.9 方法

方法的目的是复用

传入参数，返回值；
```java
    public static String concat(int a, int b) {
        return String.valueOf(a) + String.valueOf(b);
    }
```


#### 方法重载

方法名相同，但是参数不同，比如个数，或者类型不同






















