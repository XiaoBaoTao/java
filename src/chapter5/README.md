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