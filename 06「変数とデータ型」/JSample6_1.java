class JSample6_1 {
  public static void main(String[] args) {
    final float TAX = 0.1F;

    float price = 800 * (1 + TAX);
    System.out.println("料金は" + price + "です。");

    float f = 10;     //OK（float型にint型の値を代入）
    double d = 1234L; //OK（double型にlong型の値を代入）

    System.out.println("f = " + f);
    System.out.println("d = " + d);
  }
}