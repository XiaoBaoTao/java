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

