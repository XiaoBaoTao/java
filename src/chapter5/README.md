# 面向对象进阶

## 1.分类和static

### 1.分类思想

+ Student: 标准学生类，用于存储学生信息
+ StudentDao： Data Access Object , 用户访问存储数据的数组或者集合
+ StudentService： 用户处理业务逻辑，比如判断id是否存在
+ StudentController： 和用户打交道， 用户接受用户请求，采集用户信息，打印数据到数据台

Controller ->  Service --> Dao --> Object

客服接待 ->     业务员 ->     库管 ->货

```shell
# 修改服务器时区
timedatectl set-timezone "Asia/Shanghai"
```

### 2. 分包思想

不同功能的类文件，可以放在不用的包下面进行管理。

```java
package com.zhixing.test;
```


### 3. package注意事项

+ 说明当前类在这个包里；
+ package必须放在最上面
+ 同一个package里面不需要导包，可以直接使用类
+ 不同Package里面需要导包
+ 同一个包里面，只能有唯一的类名
+ 当两个包里的类名相同时，只能其中一个使用全类名导包；


### 4. 需求说明

学生管理
+ 添加学生信息，存储到一个数组， id, name, age, birthday
+ 删除，删除一个数组, 如果id不存在，则重新录入
+ 修改学生，判断是否存在，如果不存在，则重新录入
+ 查询学生，将所有学生信息输出到控制台
老师管理 
+ 

`domain`: 封装学生信息 -->数据库映射  model 
`dao`: 访问存储数据，用于增删改查  -->负责与数据库打交道  view 
`service`: 业务的逻辑处理 -->负责处理业务逻辑  view
`controller`: 与用户打交道 -->负责接受请求 controller
`entry`: 程序入口


### 5. static关键字 

+ static修饰的成员变量，在可以被类和对象共享； 比如创建多个类，然后对static 变量进行修改，所有对象的内容都会被修改；


### 6. 增删改查



用户:

+ `StudentController`: 与用户打交道，类似客服接待, 要处理逻辑传给`StudentService` 
+ `StudentService`: 处理业务逻辑，如果需要访问数据库，调用`StudentDao`
+ `StudentDao`: 访问数据库，执行增删改查



用户请求过来。首先转到controller,  如果需要处理业务逻辑，调用service处理，处理逻辑的时候，如果需要操作数据库，调用Dao. 

在domain处创建objects. 


### 7. convert list of object to json 

Use GSON library for that. Here is the sample code
```java
List<String> foo = new ArrayList<String>();
foo.add("A");
foo.add("B");
foo.add("C");

String json = new Gson().toJson(foo );
```

Here is the maven dependency for Gson
```xml
<dependencies>
    <!--  Gson: Java to Json conversion -->
    <dependency>
        <groupId>com.google.code.gson</groupId>
        <artifactId>gson</artifactId>
        <version>2.2.2</version>
        <scope>compile</scope>
    </dependency>
</dependencies>
```


### 7.继承

当对象之间是`is a` 的时候，就可以用继承 
单继承
可多层继承

可以使用
+ `super.name` 访问**父类**变量 

+ `this.name`访问`当前类`变量

### 8.方法重写
```java
    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
```

### 9. 权限修饰符 

+ `public`: 所有都可以访问
+ `default`: 包(家族内)可以访问
+ `protected`: 儿子或者外孙(有基因)可以访问
+ `private`: 只能自己类访问


