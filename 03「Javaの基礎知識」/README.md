# Javaの基礎知識

- [クラス、メソッド、フィールド](#クラスメソッドフィールド)
  - [クラス](#クラス)
  - [メソッド](#メソッド)
  - [フィールド](#フィールド)

## クラス、メソッド、フィールド
Javaを使ったプログラミングを開始するうえでクラス、メソッド、フィールドがどういったものなのか簡単に学習。

### クラス
Javaなどのオブジェクト指向[^1]と呼ばれるプログラミング言語の基本となるもので、特定の目的を達成するのに必要なものを集めたもの。クラスの定義は下記の様に記述する。
```
修飾子 class クラス名 {
  // ここにメソッドやフィールドを定義
}
```
修飾子[^2]

例：電卓の様な機能を提供するクラス
```
class Dentaku {
  public static void main(String[] args) {
    Dentaku dentaku = new Dentaku();
    dentaku.plus(10, 5);
    dentaku.minus(9, 2);
  }

  // 足し算を行うメソッド
  void plus(int val1, int val2) {
    System.out.println(val1 + val2);
  }

  // 引き算を行うメソッド
  void minus(int val1, int val2) {
    System.out.println(val1 - val2);
  }
}
```

### メソッド
クラスの中で特定の処理を行うために必要なプログラムをまとめたもの。  
メソッドの定義は下記の様に記述する。
```
修飾子 class クラス名 {
  修飾子 戻り値のデータ型 メソッド名(仮引数の型 仮引数名) {
    // 処理を記述
  }

  // 戻り値が無いメソッド
  修飾子 void メソッド名(仮引数の型 仮引数名) {
    // 処理を記述
  }
}
```
仮引数[^3]

例：挨拶を行うロボットクラス
```
class GreetRobot {
  public static void main(String[] args) {
    GreetRobot greetRobot = new GreetRobot();
    greetRobot.greeting("Hello");
    greetRobot.greeting("Bye");
  }

  // 挨拶(引数の文字列)を表示するメソッド
  void greeting(String msg) {
    System.out.println(msg);
  }
}
```

### フィールド
クラスの中でデータの値を保管するために使用するもの。フィールドの定義は下記の様に記述する。
```
修飾子 class クラス名 {
  データ型 フィールド名;
}
```
例：前進と現在位置を表示する事が出来るロボットクラス
```
class MoveForwardRobot {
  // 現在位置を保管するためのフィールド
  int currentPosition = 0;

  public static void main(String[] arg) {
    MoveForwardRobot moveForwardRobot = new MoveForwardRobot();
    moveForwardRobot.report(); // 「Current Position = 0」が表示
    moveForwardRobot.moveForward();
    moveForwardRobot.report(); // 「Current Position = 1」が表示
  }

  // 現在位置を表示するメソッド
  void report() {
    System.out.println("Current Position = " + currentPosition);
  }

  // 前進するメソッド
  void moveForward() {
    currentPosition = currentPosition + 1;
  }
}
```


[^1]: 「ある役割を持ったモノ」ごとにクラスを分割し、モノとモノとの関係性を定義していく事でシステムを作り上げようとするシステム構成の考え方。
[^2]: アクセスの範囲を限定するもの。「public」「private」「protected」「修飾子無し」の4パターンがある。
[^3]: プログラム中で関数やメソッドを呼び出して実行する際、関数側で値を受け取るために宣言された変数。必要ない場合省略可。