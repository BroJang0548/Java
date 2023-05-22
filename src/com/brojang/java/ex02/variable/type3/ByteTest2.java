package com.brojang.java.ex02.variable.type3;

public class ByteTest2 {
    public static void main(String[] args) {
        byte value1 = 126;
        int value2 = 126;

        // 여기서 생기는 의문점
        // byte 범위 -128 ~ 127
        // 연산을 할 경우 자동 형변환이 진행된다고 했음
        // 결론적으로 value1의 결과가 byte가 아닌 int여야 하는 것이 아닌가?
        // 결론 : byte + int는 맞음 -> 그래서 결과가 int 타입으로 형변환 -> 결과를 다시 byte 타입으로 형변환
        for(int i = 0; i<5;i++){
            value1++;
            value2++;
            System.out.println("value1 : "+value1); // 오버플로우
            System.out.println("value2 : "+value2);
        }
    }
}
