package com.brojang.java.ex02.variable;

public class DefaultVar {
    /*
1차적으로 값의 종류

문자,숫자로 나눈다.

문자(char) : 문자 하나 저장(유니코드 포함)

→ 정수로 저장

→ 홑따옴표('')로 저장

byte : 이진 데이터 다루는 용도

short : C언어 호환 목적

→ default는 int(JVM의 operand stack이 4byte 단위로 저장하기 때문)

→ 그렇기에 작은 자료형을 사용해도 4byte인 int로 연산


실수 (float, double) : 실수 값 저장

float : 4Byte 32bit

double : 8Byte 64bit (double이 더 큰 숫자범위)

→ default가 double 타입이기 때문에 float는 `f`를 붙여야 한다.(그렇지 않을 시 컴파일 에러)

- 저장 방식

    실수 타입은 부동 소수점 수로 저장한다.

    ± M x 10^n 형태로 저장

    ex) 1.7 x 10^20


float : 5자리 (나누기 기준 7자리)

double : 14자리 (나누기 기준 16자리)

나머지 자리는 반올림

연산속도 향상이나 메모리를 절약하기 위해서는 float 사용,
큰 값의 범위나 더 높은 정밀도가 필요할 경우 double

논리(boolean) : true,false

→ 주로 조건식, 논리적인 계산에 사용

문자열 : String (별도의 길이가 존재하지 않음)

쌍따옴표로 초기화("")

그 외에 JDK 10에서 별도로 추가된 var가 존재한다.
var는 타입 추론 기능이다.
변수 타입을 명시하지 않아도 컴파일러가 자동으로 타입을 추론해준다.

단점 :
1. 변수 타입의 명시화가 안되어있어 가독성 하락
2. 초기화 필수 : 타입 추론이 되지 않기 때문에 반드시 초기화
3. null 초기화 불가 : 타입을 모르기 때문에 사용 불가
4. 람다식 사용 불가

*/

}
