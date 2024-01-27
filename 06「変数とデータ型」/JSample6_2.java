class JSample6_2 {
  public static void main (String[] args) {
    int i1 = 123456789;
    float f1 = i1;    //int→floatに拡大変換

    System.out.println("i1 = " + i1);
    System.out.println("f1 = " + f1);

    System.out.println("");   //改行

    long l2 = 1234567890123456789L;
    float f2 = l2;    //long→floatに拡大変換
    double d2 = l2;   //long→doubleに拡大変換

    System.out.println("l2 = " + l2);
    System.out.println("f2 = " + f2);
    System.out.println("d2 = " + d2);
  }
}