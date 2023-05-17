package com.brojang.java.ex08._class.accessmodify1;

public class DeclareProtected {

    // declare methods
    public void mehthod1() {

        // Avaliable access equals package
        ProtectedClass pc = new ProtectedClass();
        pc.field1 = "insert data";
        pc.method1();
    }
}
