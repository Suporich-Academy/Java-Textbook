package access.other_package;

import access.Parent;

public class Child extends Parent {
    Child() {
        a = 0;
        b = 0;
//        c = 0; // error
//        d = 0; // error
    }
}
