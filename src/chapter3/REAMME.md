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

### 字符串的遍历

```java
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("please input a string: ");
        String input = sc.next();
        // #1 loop the string
        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
        }
        // #2 loop the string
        System.out.println("#2*************");
        for (char ch: input.toCharArray()) {
            System.out.println(ch);
        }
    }
```

### 统计字符个数 
```java
    public static void main(String[] args) throws JsonProcessingException {
        Scanner sc = new Scanner(System.in);
        System.out.printf("please input a string: ");
        String str = sc.next();
        Map<Character, Integer> wordCount = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (!wordCount.containsKey(ch)) {
                wordCount.put(ch, 1);
            } else {
                wordCount.put(ch, wordCount.get(ch) + 1);
            }
        }
        String json = new ObjectMapper().writeValueAsString(wordCount);
        System.out.println(json);
    }
```
将map转换为json;
`String json = new ObjectMapper().writeValueAsString(wordCount);`


### 字符串替换

`str.replace("a", "b")`

### 字符串切割

`String[] strs = str.split("a");`

```java
    public static void main(String[] args) {
        String name = "zoe";
        String sex = "male";
        System.out.println(String.join("-", name, sex));
        System.out.println(name.concat(sex));
    }
```
