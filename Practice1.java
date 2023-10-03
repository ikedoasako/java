//「縦幅3 横幅5 長方形の面積は、15」と表示させる

//（1）変数aに3、変数bに5を入れる
//（2）変数aとbの掛け算の結果を変数cに入れる
//（3）最後に変数cを表示させる

public class Practice1 {
  public static void main(String[] args) {
    int a = 3;
    int b = 5;
    int c = a * b;

    System.out.println("縦幅a横幅bの長方形の面積は、" + c);
  }
}
/*
intは整数のデータ型。普通の大きさの整数を格納する
int a; 変数宣言（aという箱を用意する)
int a = 3; (aという箱を用意し、箱に数字の「3」を入れる)
cには計算結果を代入するためa * bの掛け算の式を書く
System.out.println(c); 箱の中身を表示させる
*/

/*
"縦幅" + "a"のように書いたらエラーが出た
一つずつ区切らなくても変数名が入っていれば表示される？
*/