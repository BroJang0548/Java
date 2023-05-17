package com.brojang.java.ex08._class.accessmodify2;

import com.brojang.java.ex08._class.accessmodify1.ProtectedClass;

public class DeclarePublic extends PublicClass{

    // declare public constructor
    public DeclarePublic(){

        // called by public constructor
        super();
    }

    // declare public method
    public void method1(){

        // modify publicClass field value
//        this.field1 = "insert public field value";

        // called by public method
        this.method1();
    }

    // declare public method
    public void method2(){
        // Not Accessible to the Protected package
//        ProtectedClass pc = new ProtectedClass();
//        pc.field1 = "insert protected field value";
//        pc.method1();
    }

}
