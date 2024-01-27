class JSample6_3 {
  public static void main (String[] args) {
    double d = 123.0;
    int i = (int)d;       //キャスト演算子による縮小変換（double→int）
    float f = (float)d;   //キャスト演算子による縮小変換（double→float）


    long l1 = 1234567890123456789L;
    int i1 = (int) l1;

    System.out.println("l1 = " + l1);
    System.out.println("i1 = " + i1);

    System.out.println("");   //改行

    float f2 = 123.45F;
    int i2 = (int) f2;

    System.out.println("f2 = " + f2);
    System.out.println("i2 = " + i2);
  }
}