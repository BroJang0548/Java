package com.brojang.java.SiatStudy;

public class Quiz0515 {
    public static void main(String[] args) {
//        for (int i = 0; i < 3; i++) {
//            System.out.println(i);
//        }
//        System.out.println();
//        System.out.println();
//
//        for (int i = 0; i < 6; i++) {
//            System.out.print(i);
//        }
//        System.out.println();
//        System.out.println();
//
//        for (int i = 1; i < 4; i++) {
//            System.out.print(i);
//        }
//        System.out.println();
//        System.out.println();
//
//        for (int i = 5; i < 8; i++) {
//            System.out.print(i);
//        }
//
//        System.out.println();
//        System.out.println();
//
//        for (int i = 3; i > 0; i--) {
//            System.out.print(i);
//        }
//        System.out.println();
//        System.out.println();
//
//        for (int i = 1; i < 6; i++) {
//            if (i % 2 == 0) {
//                continue;
//            }
//            System.out.print(i);
//        }
//
//        System.out.println();
//        System.out.println();
//        // 7
//        for (int i = 1; i <= 8; i = i * 2) {
//            System.out.print(i);
//        }
//
//        System.out.println();
//        System.out.println();
//        // 8
//        for (int i = 1; i <= 8; i = i * 2) {
//            System.out.print(i + "-");
//        }
//
//        System.out.println();
//        System.out.println();
//        // 9
//        for (int i = 1, j = 1; i <= 5; i++, j++) {
//            System.out.print(i);
//            System.out.print(j);
//        }
//
//        System.out.println();
//        System.out.println();
//
//        // 10
//        Random rand = new Random();
//        // if i is 10 then stop
//
//        for (int i = 5; i != 1; i = rand.nextInt(5) + 1) {
//            System.out.print(i);
//        }
//
//        System.out.println();
//        System.out.println();
//        //2-1
//        for (int i = 1; i <= 5; i++) {
//            System.out.print(i + ") ");
//        }
//
//        System.out.println();
//        System.out.println();
//        //2-2
//        for (int i = 1; i <= 5; i++) {
//            System.out.print(i + ", ");
//        }
//
//        System.out.println();
//        System.out.println();
//        //2-3
//        for (int i = 1; i <= 5; i++) {
//            System.out.print("(" + i + ") ");
//        }
//
//        System.out.println();
//        System.out.println();
//        //2-4
//        for (int i = 1; i <= 5; i++) {
//            System.out.print(i);
//            if (i != 5) {
//                System.out.print(", ");
//            }
//        }
//
//        System.out.println();
//        System.out.println();
//        //2-5
//        for (int i = 1; i <= 5; i++) {
//            System.out.print(i);
//            if (i != 5) {
//                System.out.print("|");
//            }
//        }
//
//        System.out.println();
//        System.out.println();
//        //2-6
//        for (int i = 1; i <= 10; i++) {
//            if (i % 2 != 0) continue;
//            System.out.print("(" + i + ") ");
//        }
//
//        System.out.println();
//        System.out.println();
//        //2-7
//        for (int i = 1; i <= 10; i++) {
//            if (i % 2 != 0) {
//                System.out.print("(" + i);
//            } else {
//                System.out.print(i + ") ");
//            }
//        }
//
//        System.out.println();
//        System.out.println();
//        //2-8
//        Scanner sc = new Scanner(System.in);
//        System.out.println("첫번째 수");
//        int a = sc.nextInt();
//        System.out.println("두번째 수");
//        int b = sc.nextInt();
//
//        System.out.println("두 수의 사이수는");
//        for (int i = a+1; i < b; i++) {
//            System.out.print(i);
//            if (i != b-1) {
//                System.out.print(", ");
//            }
//        }
//
//        System.out.println();
//        System.out.println();
//        //2-9
//        System.out.println("첫번째 수");
//        int c = sc.nextInt();
//
//        System.out.println(c+"의 약수");
//        for (int i = 1; i < c; i++) {
//            if(c%i==0){
//                System.out.print("("+i+")   ");
//            }
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("첫번째 수");
//        int a = sc.nextInt();
//        System.out.println("두번째 수");
//        int b = sc.nextInt();
//
//        System.out.println("구구단" + a + "단");
//        for (int i = 1; i <= b; i++) {
//            System.out.println(a + "x" + i + "=" + a * i);
//        }

        //3-1
//        int n = 5;
//        for(int i = 1; i <=n;i++) {
//            for(int j = 1; j <=n;j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //3-2
//        int n = 5;
//        for(int i = 1; i <=n;i++) {
//            for(int j = 1; j <=i;j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
        // 3-3
//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 6; j > i; j--) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }

        // 3-4
//        int n = 5;
//        for(int i = 1; i <=n;i++) {
//            for(int j=n-i;j>=1;j--){
//                System.out.print("   ");
//            }
//            for(int j = 1; j <=i;j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
        // 3-5
//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//            for(int j=1;j<i;j++){
//                System.out.print("   ");
//            }
//            for (int j = 6; j > i; j--) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }

        // 3-6
//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//            for (int j = n - i; j >= 1; j--) {
//                System.out.print("   ");
//            }
//            for (int k = 1; k <= 2 * i - 1; k++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }

        // 3-7
//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//        for (int i = 4; i > 0; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }

        // 3-8
//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//            for(int j = n-i;j>0;j--){
//                System.out.print("   ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//        for (int i = 4; i > 0; i--) {
//            for(int j = n-i;j>0;j--){
//                System.out.print("   ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }

        // 3-9
//        int n = 5;
//        int space = n - 1;
//        for (int i = 1; i <= n; i++) {
//            for (int j = space; j >= 1; j--) {
//                System.out.print("   ");
//            }
//            space--;
//            for (int k = 1; k <= 2 * i - 1; k++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//        space = 1;
//        for (int i = n - 1; i > 0; i--) {
//            for (int j = 0; j < space; j++) {
//                System.out.print("   ");
//            }
//            space++;
//            for (int k = 1; k <= 2 * i - 1; k++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
        // 3-10
//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//            for (int j = n - i; j >= 1; j--) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= 2 * i - 1; k++) {
//                if(k%2!=0){
//                System.out.print(" * ");
//                }
//            }
//            System.out.println();
//        }
        // 3-11
//        int n = 5;
//        for (int i = n; i > 0; i--) { // 5 4 3 2 1
//            for (int j = 0; j < 5 - i; j++) { // 0 1 2 3 4
//                System.out.print(" ");
//            }
//            for (int k = n - i; k < 5; k++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // 3-12
//        int n = 5;
//        for (int i = n; i > 0; i--) { // 5 4 3 2 1
//            for (int j = 0; j < 5 - i; j++) { // 0 1 2 3 4
//                System.out.print(" ");
//            }
//            for (int k = n - i; k < 5; k++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < n; i++) { // 1 2 3 4 5
//            for (int j = 4 - i; j > 0; j--) { // 4 3 2 1 0
//                System.out.print(" ");
//            }
//            for (int k = 0; k < i + 1; k++) { // 1 2 3 4 5
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        // 3-13
//        int n = 5;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = n - 1; j > i; j--) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < 2 * i + 1; k++) {
//                if (k == 0 || k == 2 * i || i == 4) { // 가장 왼쪽, 가장 오른쪽에 '*' 출력
//                    System.out.print("*");
//                } else { // 그 외에는 빈칸 출력
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        // 3-14
//        int n = 5;
//
//        for (int i = n; i > 0; i--) { // 5 4 3 2 1
//            for (int j = 0; j < 5 - i; j++) { // 0 1 2 3 4
//                System.out.print(" ");
//            }
//            for (int k = 2 * i - 1; k > 0; k--) {
//                if (k == 1 || k == 2 * i - 1 || i == n) {
//                    System.out.print("*");
//                } else { // 그 외에는 빈칸 출력
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        System.out.println("*********");
//        System.out.println(" *     *");
//        System.out.println("  *   *");
//        System.out.println("   * *");
//        System.out.println("    *");
        // 3-15
//        int n = 5;
//
//        // 위쪽 삼각형 출력
//
//        for (int i = 0; i < n; i++) {
//            for (int j = n - 1; j > i; j--) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < 2 * i + 1; k++) {
//                if (k == 0 || k == 2 * i) { // 가장 왼쪽, 가장 오른쪽에 '*' 출력
//                    System.out.print("*");
//                } else { // 그 외에는 빈칸 출력
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//
//        for (int i = n-1; i > 0; i--) { // 4 3 2 1
//            for (int j = 0; j < 5 - i; j++) { // 0 1 2 3 4
//                System.out.print(" ");
//            }
//            for (int k = 2 * i - 1; k > 0; k--) {
//                if (k == 1 || k == 2 * i - 1) {
//                    System.out.print("*");
//                } else { // 그 외에는 빈칸 출력
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//            // 위쪽 삼각형에 해당하는 부분
//            for (int j = n - i; j > 0; j--) {
//                System.out.print(" ");
//            }
//            System.out.print("*");
//
//            // 공백 출력
//            for (int j = 1; j < 2 * i - 1; j++) {
//                System.out.print(" ");
//            }
//
//            // 오른쪽 끝 별 출력
//            if (i == 1) {
//                System.out.println("");
//            } else {
//                System.out.println("*");
//            }
//        }
//        // 아래쪽 삼각형에 해당하는 부분
//        for (int i = n - 1; i > 0; i--) {
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            System.out.print("*");
//
//            // 공백 출력
//            for (int j = 1; j < 2 * i - 1; j++) {
//                System.out.print(" ");
//            }
//
//            // 오른쪽 끝 별 출력
//            if (i == 1) {
//                System.out.println("");
//            } else {
//                System.out.println("*");
//            }
//        }

        // 문제 4-1
//        int n = 5;
//        for(int i =1;i<=5;i++){
//            int num = 1;
//            for(int j =0;j<i;j++){
//                System.out.print(num + " ");
//                num++;
//            }
//            System.out.println();
//        }
        // 문제 4-2
        // 1 == 1 2 == 2 3== 4 4 == 7 5 == 11 // 1 2 3 4
        // 등차수열?
//        int n = 5;
//        int k = 1;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(k++ + " ");
//            }
//            System.out.println();
//        }

        // 문제 4-3
//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }
        // 문제 4-4
//        int n = 5;
//        for (int i = 5; i >= 1; i--) {
//            for (int j = n; j >= i; j--) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

        // 문제 4-5
//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//            for (int j = i; j > 0; j--) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

        // 문제 4-6
        int n = 5;
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= n; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 5 - i; k <= n; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

    }
}