// 挨拶を行うロボットクラス
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