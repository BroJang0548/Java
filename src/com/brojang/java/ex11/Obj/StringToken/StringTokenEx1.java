package com.brojang.java.ex11.Obj.StringToken;

import java.util.StringTokenizer;

public class StringTokenEx1 {
    public static void main(String[] args) {
        /**
         * String tokenizer
         * -> 구분자 문자 지정 후 문자열을 토큰 단위로 분리
         *
         * -> 구분자 문자들을 문자열 인자로 지정
         *
         * -> 구분자 기준으로 문자열에서 토큰 반환
         *
         * -> nextToken() 으로 메서드 호출
         *
         *
         */


        String text = "홍길동,John-김영미/브로쟝|Richard>김개똥";
        StringTokenizer tokenizer = new StringTokenizer(text, ",-/|>");
        while (tokenizer.hasMoreTokens()) {
            String name = tokenizer.nextToken();
            System.out.println(name);
        }
    }
}
