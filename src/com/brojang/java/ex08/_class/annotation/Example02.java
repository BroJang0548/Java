package com.brojang.java.ex08._class.annotation;

import java.lang.reflect.Method;

public class Example02 {
    public Example02() {
        // Service 클래스부터 메서드 정보 읽어옴
        Method[] declarations = Service.class.getDeclaredMethods();

        // Method 정보 읽어옴
        for (Method m : declarations) {
            // 읽어온 메서드의 Annotation이 PrintAnnotation인지
            if (m.isAnnotationPresent(PrintAnnotation.class)) {
                // printAnnotation 정보 얻기
                PrintAnnotation printAnnotation = m.getAnnotation(PrintAnnotation.class);

                System.out.println(m.getName());

                System.out.println(printAnnotation.value());

                for (int i = 0; i < printAnnotation.number(); i++) {
                    System.out.print(printAnnotation.value());
                }
                System.out.println();

                try {
                    // instance data
                    m.invoke(new Service());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println();
            }
        }
    }
}
