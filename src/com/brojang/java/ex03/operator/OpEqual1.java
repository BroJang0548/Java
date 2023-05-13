package com.brojang.java.ex03.operator;

public class OpEqual1 {
    public static void main(String[] args) {
        int i = 1;
        double d = 1.0;
        System.out.println(i == d);

        double d2 = 0.1;
        float f2 = 0.1f;
        System.out.println(d2 == f2); // false
        System.out.println((float)d2 == f2); // true
        System.out.println(d2 == (double)f2); // false // 타입은 double이지만 값 자체는 float의 데이터가 넘어온 상태
        // 작은 타입에서 큰타입으로 변환이 된 것이기 때문에 데이터의 손실이나 변환은 없다
        System.out.println(d2);
        System.out.println((float)d2);
        System.out.println(f2);
        // 둘이 0.1로 출력되는게 같은거 아니냐?! 할수도 있지만 출력 형식의 문제
        // double과 float 값을 비교할 때는 == 연산자를 사용하지 않고,
        // 위와 같이 오차 범위 내에 있는지를 비교하는 방식을 사용하는 것이 좋다.
        // float : 32 bit, double : 64 bit
        System.out.printf("d2 : %.10f\n",d2); //d2 : 0.1000000000
        System.out.printf("f2 : %.10f\n",f2); //f2 : 0.1000000015

        // 이렇게 하면 다른 값이 나오는걸 확인할 수 있다.
        // 소수점 6자리 비교
        if (Math.abs(d2 - f2) < 1e-6) {
            System.out.println("거의 같은 값");
            System.out.println(Math.abs(d2 - f2));
            // d2와 f2가 거의 같은 값이다.
        }else{
            System.out.println("다른 값");
            System.out.println(Math.abs(d2 - f2));
        }

    }
}
