// import宣言によるLocalDateクラスの利用

import java.time.LocalDate; //import宣言

class JSample9_1 {
  public static void main (String[] args) {
    // 単純名でLocalDateクラスのnowメソッドを利用
    LocalDate ld = LocalDate.now();
    System.out.println(ld);
  }
}