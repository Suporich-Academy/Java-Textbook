public class LinkedList {
    private int val;
    private boolean isHead;
    private LinkedList next;

    /**
     * 長さ 0 の新しい連結リストを作成する
     */
    public LinkedList() {
        this.val = 0;
        this.isHead = true;
        this.next = null;
    }

    private LinkedList(int val) {
        this.val = val;
        this.isHead = false;
        this.next = null;
    }

    /**
     * 指定された位置に新しいノードを挿入する。
     * @param index どの位置に挿入する
     * @param val 新しいノードのデータ値
     */
    public void add(int index, int val) {
        if (index == 0) {
            LinkedList tmp = this.next;
            this.next = new LinkedList(val);
            this.next.next = tmp;
        } else {
            this.next.add(index - 1, val);
        }
    }

    /**
     * 指定されたノードを削除する
     * @param index どのノードを削除する
     */
    public void remove(int index) {
        if (index == 0) {
            this.next = this.next.next;
        } else {
            this.next.remove(index - 1);
        }
    }

    /**
     * 指定されたノードの値を取得する
     * @param index ノードのインデックス
     * @return 対応する値
     */
    public int get(int index) {
        if (index == 0) {
            return this.next.val;
        } else {
            return this.next.get(index - 1);
        }
    }


    @Override
    public String toString() {
        return isHead ?
                "Linked List {" + next + "}":
                "(" + val + ") -> " + next;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(0, 2);
        list.add(1, 7);
        list.add(0, 4);
        System.out.println(list); // => Linked List {(4) -> (2) -> (7) -> null}
        System.out.println(list.get(0)); // => 4
        list.remove(1);
        System.out.println(list); // => Linked List {(4) -> (7) -> null}
    }
}
