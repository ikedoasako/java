//変数にデータを入れる
public class test3 {
  public static void main(String[] args) {
    String test3 = "Hello world"; /*イコール（＝）は右と左の内容が同じという意味ではなく、右の内容を左に代入している*/
    //Stringはデータが文字列であることを宣言している、頭文字は大文字
    //このようなデータの種類を「データ型」と呼ぶ
    //データ型の宣言は、その変数を最初に使うとき必ず必要になる
    /*test3という変数にHello worldを入れる*/
    System.out.println(test3);
    //printlnに変数名を入れると、変数test3にHello worldという文字列が入っているため
    //printlnで変数test3を表示させると、その中身が表示される

//整数データを扱う変数の宣言
    int number = 100;/*intは変数numberが「整数データだと宣言」している*/
    //この場合intの頭文字は小文字にする
    //変数numberに100という整数データを代入
    System.out.println(number);
    //文字列の変数と同じように、変数名でデータを操作できる
  }
}