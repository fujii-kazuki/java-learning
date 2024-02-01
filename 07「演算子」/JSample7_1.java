class JSample7_1 {
  public static void main(String[] args) {
    // int型同士で除算を行う際の注意点
    int num1 = 10;
    int num2 = 4;

    System.out.println(num1 / num2);  //2（間違い）
    // 演算子の左辺か右辺どちらかをキャスト演算子でdouble型に変換して計算
    System.out.println(num1 / (double)num2);  //2.5（正しい）

    // ビット演算子
    int i1 = 85 & 15;
    int i2 = 85 | 15;
    int i3 = 85 ^ 15;
    int i4 = ~85;

    System.out.println("85 & 15 = " + i1);
    System.out.println("85 | 15 = " + i2);
    System.out.println("85 ^ 15 = " + i3);
    System.out.println("~85 = " + i4);
  }
}