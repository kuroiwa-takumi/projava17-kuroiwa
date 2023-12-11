## 第7章 条件分岐（p.124-142）

```shell
jshell> "test".contains("es")
$45 ==> true

jshell> "test".contains("a")
$46 ==> false

jshell> "test".contains("st")
$47 ==> true

jshell> today.compareTo(date1)
$50 ==> 1

jshell> today.isBefore(date1)
$51 ==> false

jshell> today.isAfter(date1)
$52 ==> true
```

### p.127-128 オブジェクトの比較
- オブジェクトの示す値が等しいかどうかを比較するには、`equals`メソッドを使います。

p.128 練習問題
```shell
jshell> var str = "Hello";
str ==> "Hello"

jshell> str.toUpperCase().equals("HELLO")
$2 ==> true

jshell> str.toUpperCase().equals("HELLO1")
$3 ==> false

jshell> import java.time.*;
jshell> var java17 = LocalDate.of(2019, 9, 19);
java17 ==> 2019-09-19
jshell> java17.plusDays(10);
$8 ==> 2019-09-29
```
