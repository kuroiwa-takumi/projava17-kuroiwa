## 第5章 標準API

### p.80-82
- `java.time.LocalDateTime.now()`
  - パッケージ名まで含めたクラスのフルネームを「FQN」（Fully Qualified Name）や完全修飾名という

```shell
jshell> java.time.LocalDate.now()
$15 ==> 2023-09-14

jshell> java.time.LocalTime.now()
$16 ==> 11:49:16.081441

jshell> java.time.LocalDateTime.now()
$17 ==> 2023-09-14T11:49:44.930565

// importしてみる
jshell> import java.time.*

jshell> LocalDateTime.now()
$20 ==> 2023-09-14T11:51:26.061752

jshell> LocalDate.now()
$21 ==> 2023-09-14
```

### p.83-88 日付について色々
```shell
jshell> LocalDateTime.now().plusDays(3)
$22 ==> 2023-09-17T11:58:46.032110

jshell> today = LocalDateTime.now()
today ==> 2023-09-14T12:00:12.881576

jshell> today.plus
plus(          plusDays(      plusHours(     plusMinutes(   plusMonths(    plusNanos(     plusSeconds(   plusWeeks(     plusYears(     
jshell> today.plusDays(2)
$25 ==> 2023-09-16T12:00:12.881576

jshell> today.plusHours(2)
$26 ==> 2023-09-14T14:00:12.881576

// LocalDateクラスを使って明日の日付＆2週間後の日付を求める
jshell> var date = LocalDate.now()
date ==> 2023-09-14

jshell> date.plusDays(1)
$28 ==> 2023-09-15

jshell> date.plusWeeks(2)
$29 ==> 2023-09-28

jshell> LocalDate.of(2023,9,14)
$30 ==> 2023-09-14

jshell> LocalTime.of(13,24)
$31 ==> 13:24
```

#### 指定した日付時刻を扱う p.84-85
```shell
//Java17, 16のリリース日
jshell> var java17Date = LocalDate.of(2021,9,14)
java17Date ==> 2021-09-14

jshell> var java17Time = LocalTime.of(14,30)
java17Time ==> 14:30

jshell> var java17DateTime = LocalDateTime.of(java17Date, java17Time)
java17DateTime ==> 2021-09-14T14:30

jshell> var java16DateTime = LocalDateTime.of(2021,3,16,14,30)
java16DateTime ==> 2021-03-16T14:30
```

#### 日付時刻の整形 p.85-86
```shell
jshell> "%tm月".formatted(today)
$36 ==> "09月"

jshell> "%tH時%tM分".formatted(today, today)
$37 ==> "12時00分"

jshell> "%tH時<%tM分".formatted(today)
|  例外java.util.MissingFormatArgumentException: Format specifier '%tM'
|        at Formatter.format (Formatter.java:2688)
|        at Formatter.format (Formatter.java:2625)
|        at String.formatted (String.java:4203)
|        at (#38:1)

jshell> "%tH時%<tM分".formatted(today)
$39 ==> "12時00分"

jshell> "%tY年%<tm月%<td日".formatted(java17DateTime)
$42 ==> "2021年09月14日"

jshell> "%tY年%<tm月%<td日 %<tH時%<tM分".formatted(java16DateTime)
$44 ==> "2021年03月16日 14時30分"
```

