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

### 重要：基本系と参照型
- Javaにおける型
  - 参照系はクラスのインスタンスを指す
  - 参照系はメソッドを持つ
  - 基本系は値そのものを指す

## データ型の分類

| 型        | 基本型 | 参照型 |
|------------|-------|-------|
| int        | ○     | -     |
| double     | ○     | -     |
| char       | ○     | -     |
| boolean    | ○     | -     |
| String     | -     | ○     |
| List       | -     | ○     |
| Map        | -     | ○     |
| 自作クラス  | ×     | ○     |


### p.74
```shell
takumi.kuroiwa@ projava17-kuroiwa % jshell
|  JShellへようこそ -- バージョン17.0.6
|  概要については、次を入力してください: /help intro

jshell> int c = 5
c ==> 5

jshell> String u = "UFO"
u ==> "UFO"

jshell> int w = "watch"
|  エラー:
|  不適合な型: java.lang.Stringをintに変換できません:
|  int w = "watch";
|          ^-----^

jshell> String w = "watch"
w ==> "watch"

jshell> w
w ==> "watch"

jshell> int d = 12
d ==> 12

jshell> String e = 12
|  エラー:
|  不適合な型: intをjava.lang.Stringに変換できません:
|  String e = 12;
|             ^^
```

### 整数と実数の変換
```shell
jshell> int i = 234
i ==> 234

jshell> double d = i
d ==> 234.0

jshell> int j = d
|  エラー:
|  不適合な型: 精度が失われる可能性があるdoubleからintへの変換
|  int j = d;
|          ^

jshell> int j = (int) d
j ==> 234
```

### 文字列を数値に変換
```shell
jshell> int a = Integer.parseInt("3")
a ==> 3

jshell> double d = Double.parseDouble("3.14")
d ==> 3.14

jshell> java.text.NumberFormat.getInstance().parse("12,345")
$11 ==> 12345
```

### 数値を文字列に変換
```shell
jshell> String s = String.valueOf("123")
s ==> "123"

jshell> String sc = "%,d".formatted(12345)
sc ==> "12,345"
```


