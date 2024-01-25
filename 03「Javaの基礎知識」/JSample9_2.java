// 完全修飾子を使用したLocalDateクラスの利用

class JSample9_2 {
  public static void main (String[] args) {
    // 完全修飾子でLocalDateクラスのnowメソッドを利用
    java.time.LocalDate ld = java.time.LocalDate.now();
    System.out.println(ld);
  }
}