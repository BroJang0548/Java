package com.brojang.java.ex08._class.accessmodify2;

import com.brojang.java.ex08._class.accessmodify1.ProtectedClass;

public class PublicClass {

    // declare methods
    public void method1() {
        // Not Accessible by protected
        // protected package only accessible in the same package

        // ProtectedClass pc = new ProtectedClass();
        // pc.field1 = "insert data";
        // pc.method1();
    }
}
