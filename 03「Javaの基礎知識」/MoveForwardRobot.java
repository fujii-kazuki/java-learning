class MoveForwardRobot {
  // 現在位置を補完するためのフィールド
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