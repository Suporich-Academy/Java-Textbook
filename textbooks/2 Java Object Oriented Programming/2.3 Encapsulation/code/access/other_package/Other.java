package access.other_package;

import access.Parent;

public class Other {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.a = 0;
//        parent.b = 0; // error
//        parent.c = 0; // error
//        parent.d = 0; // error
    }
}
