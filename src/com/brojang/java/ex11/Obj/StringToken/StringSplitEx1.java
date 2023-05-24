package com.brojang.java.ex11.Obj.StringToken;

public class StringSplitEx1 {
    public static void main(String[] args) {

        // split
        /*
        * 정규식 사용하여 문자열 분할
        *
        * StringTokenizer에 비해 더 복잡한 패턴 처리 가능
        *
        * 문자열 배열을 반환(StringTokenizer는 1회에 1토큰 검색)
        * -> 원하는 값 조작 가능
        *
        * StringTokenizer : 단일 문자 구분자 대응
        * split : 여러 문자 구분자 처리 가능
        *
        * 유연성 향상(StringTokenizer보다 split 사용 권장)
        *
        *
        * */

        String text = "홍길동,John-김영미/브로쟝|Richard>김개똥";
        String[] names = text.split(",|-|/|>|\\|");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
