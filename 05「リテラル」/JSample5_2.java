class JSample5_2 {
  public static void main (String[] args) {
    // 10進数で記述された506
    System.out.println(506);
    // 2進数で記述された506
    System.out.println(0b111111010);
    // 8進数で記述された506
    System.out.println(0772);
    // 16進数で記述された506
    System.out.println(0x1fa);

    int i1 = 1;
    int i2 = 2;
    System.out.println(i1 + i2); //3が出力される

    double d1 = 3.14;
    double d2 = 3.14;
    System.out.println(d1 + d2); //6.28が出力される

    // System.out.println(2200000000); // int型のためエラー
    System.out.println(2200000000L); // long型なのでOK

    float num;
    // num = 7.8;  //エラー
    num = 7.8F;    //OK

    System.out.println(10 > 7); //true
    System.out.println(5 == 4); //false
  }
}