package com.brojang.java.ex12.generic;

public class GenericBasic {

    /*
    * 클래스 내부에서 사용하는 데이터 타입을 외부에서 지정
    *
    * 타입의 경우 클래스만 가능하며, 데이터 타입을 바로 지정해두지 않고
    *
    * 동적으로 처리하기 위해 사용한다.
    *
    * 제네릭은 해당 클래스로 데이터가 들어올 때 타입이 정해진다.
    *
    * 하지만 의도하지 않은 데이터 타입이 들어올 수 있기 때문에 제네릭 설정 시
    *
    * 데이터 타입이 제한될 수 있다.
    *
    * Generic은 정의 한 뒤 사용할 때 생략이 가능
    *
    *     GenericTest1 gt1 = new GenericTest1(1234,"abcd");
    *     GenericTest1<Integer,String> gt2 = new GenericTest1<Integer,String>(1234,"abcd");
    *
    * 3가지 형태로 사용 가능
    * <?> : 제한 없음, 모든 타입 가능
    * <? extends T> : 상한 제한, T와 그 자손들만 가능
    * <? super T> : 하한 제한, T와 그 조상들만 가능
    */

}
