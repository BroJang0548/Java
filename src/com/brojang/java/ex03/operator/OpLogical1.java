package com.brojang.java.ex03.operator;

public class OpLogical1 {
    public static void main(String[] args) {
        int i1 = 0;
        int i2 = 10;
        int i3 = 0;

        System.out.println((i1 != 0) && ((i3 = i2 ) > 20));
        System.out.println(i3);
        //＆를 사용한 논리 연산자는 좌측의 값이 false이더라도 우측의 조건식을 수행한다.
        // 따라서 i3에는 i2의 값인 10이 저장된다.
        System.out.println((i1 != 0) & ((i3 = i2 ) > 20));
        System.out.println(i3);

    }

}
