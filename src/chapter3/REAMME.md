# API 

## String类 

### String构造方法

```java
char[] name1 = {'z', 'o', 'e'};
String name = new String(name1)
```
+ 使用双引号创建，系统会检查在常量池中是否存在，存在的话就不创建。
+ 构造方法创建字符串的时候，每次都会创建一个内存空间，新的地址值; 

```java
"zoe" != new String("zoe");
```
==的时候，原始类型 比较的是值，引用类型，比较的是地址值；

** 字符串的比较 ** 
`s1.equals(z2)`
`equalsIgnorecase()`