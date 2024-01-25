class JSample4_1 {
  public static void main (String[] args) {
    // 改行
    // System.out.println("こんにちは。 ←エラー
    // お元気ですか。");
    System.out.println("こんにちは。\nお元気ですか。");

    // シングルクォーテーション
    // char c = '''; ←エラー
    char c = '\'';
    System.out.println(c);

    // ダブルクォーテーション
    // String str = "私の名前は"藤井"です"; ←エラー
    String str = "私の名前は\"藤井\"です";
    System.out.println(str);
  }
}