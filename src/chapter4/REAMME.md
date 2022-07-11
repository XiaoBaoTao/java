# 集合基础

## 集合和数组的区别

+ 数组的容量是固定的，集合的容量是可变的；

`<>` 是泛型；<>里面只能是引用数据类型，比如Integer. 
```java
    public static void main(String[] args) {
        // 如果超过3个，会自动扩容
        int initSize = 3;
        ArrayList<Student> students = new ArrayList<>(initSize);
        Scanner sc = new Scanner(System.in);
        Random random = new Random(10);
        for (int i = 0; i < initSize; i++) {
            System.out.print("please input the name: ");
            String name = sc.next();
            int age = random.nextInt(100);
            students.add(new Student(name, age));
        }

        for (Student student : students) {
            System.out.println(student.toJson());
        }
    }
```

## 集合的常用成员方法 

+ `size()`:  容器大小
+ `add()`:   添加
+ `remove()`: 删除
+ `set()`: 修改元素 