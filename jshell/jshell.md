# JShell実行コマンド
## 第3章 値と演算

### p.47
```shell
takumi.kuroiwa@ projava17-kuroiwa % jshell
|  JShellへようこそ -- バージョン17.0.6
|  概要については、次を入力してください: /help intro

jshell> 7+2
$1 ==> 9

jshell> 7-2
$2 ==> 5

jshell> 7*2
$3 ==> 14

jshell> 7/2
$4 ==> 3

jshell> 7%2
$5 ==> 1
```

### p.49
```shell
jshell> 7.0/2
$6 ==> 3.5
```

### p.55-63
```shell
jshell> "test".toUpperCase()
$7 ==> "TEST"

jshell> "test".length()
$8 ==> 4

jshell> "test".repeat(4)
$9 ==> "testtesttesttest"

jshell> "test".replace("t","")
$10 ==> "es"

jshell> "test".replace("es","alen")
$11 ==> "talent"

jshell> "test".substring(1)
$12 ==> "est"

jshell> "test".substring(1,"test".length())
$13 ==> "est"

// formatted: %s 書式指定子
jshell> "%sand%s".formatted("a","b")
$14 ==> "aandb"

jshell> "%s and %s".formatted("a","b")
$15 ==> "a and b"

jshell> "%s and %s".formatted("Tom","bob")
$16 ==> "Tom and bob"
```

## 第4章 変数と型

### p.47
```shell
takumi.kuroiwa@ projava17-kuroiwa % jshell
|  JShellへようこそ -- バージョン17.0.6
|  概要については、次を入力してください: /help intro

jshell> 7+2
$1 ==> 9

jshell> 7-2
$2 ==> 5

jshell> 7*2
$3 ==> 14

jshell> 7/2
$4 ==> 3

jshell> 7%2
$5 ==> 1
```
