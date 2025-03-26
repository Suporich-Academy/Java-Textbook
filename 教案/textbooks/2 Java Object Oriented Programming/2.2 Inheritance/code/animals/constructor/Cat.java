package animals.constructor;

// Animal のところのコンストラクタをアンコメントすると、エラーが発生する。Java は Cat のデフォルトコンストラクタを生成しようとするが、その親クラス Animal にはパラメータなしのコンストラクタが存在しないから。
public class Cat extends Animal {
    void meow() {
        System.out.println("meow~");
    }
}
