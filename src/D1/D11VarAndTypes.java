package D1;

public class D11VarAndTypes {
    public static void main(String[] args) {
        // 변수를 선언하고
        int a = 2;
        int b = 3;

        // 사용한다.
        System.out.println(a+b);
        System.out.println(a);
        System.out.println(b);

        String line = "Hello Variables!";
        System.out.println(line);

        // 어떤 데이터를 담을지를 잘 정해주어야 한다.
         int thousand = 1000;
         // 다르면 오류가 발생
         // int ten = "10"; // 오류

        //변수를 먼저 만들고
        int date;
        // 값은 나중에 할당할 수 있 지만, 할당 전에 사용 불가
        // System.out.println(date); // 오류
        date = 10;
        System.out.println(date);
        // 이미 겂이 할당되어도 새로운 값을 넣을 수 있다.
        date = 20;
        System.out.println(date);

        // 한 줄에 두개 이상의 변수를 만들 수 있다.
        int moth = 6, day = 20;
        System.out.println(moth);
        System.out.println(day);

        // 문법적 변수 이름 규칙
        // 숫자로 사작할 수 없다
        /* 오류
        int 1st = 10;
        int 2nd = 20;*/

        // '_' 또는 '$' 외의 특수 문자 사용 할 수 없다.
        int max_int = 10;
        int min$int = 20;
        /* 오류
        int sum# = 30;
        */

        // Java가 내부적으로 사용하는 단어는 사용할 수 없다.
        /* 오류
        int int = 10;
        int class = 20;
        int void = 100;
        */

        // Naming Convention: camelClass
        // 두 단어 이상일 때 다음 단어의 첫글자를 다문자로
        int lunchPrice = 100;
        int dinerPrice = 200;

        // 정수 자류형
        int integer = 10;
        long bigInteger = 1000000000;
        // 잘 안씀
        short smallInteger = 10000;
        byte reallySmall = 127;

        // long에 큰 데이터를 넣을 때, L를 붙여줘야 큰 숫자가 된다.
        long longInt = 10000000000000L;

        // 실수 자류형
        // long에 L처럼 float는 F를 붙여줘야 한다.
        float floatPoint = 2.718281F;
        System.out.println(floatPoint);
        // 대부분의 상황에서 double을 쓴다.
        double doublePoint = 3.1415926535955555555;
        //유효숫자가 많아지면 반올림 된다.
        System.out.println(doublePoint);

        // 불린(boolean) 자류형
        boolean success = true;
        boolean fail = false;

        // 문자(char) 자료형
        char alphabet;
        alphabet = 'd';
        System.out.println(alphabet);
        alphabet = 'c';
        System.out.println(alphabet);
        // 특수 상황 제외, 두글자 이상 사용 불가
        // char alphabet = 'ab';
        // 글자 1
        char digit = '1';

        // 문자열(String) 자료형
        // 기술적으로는 char의 나열
        String word = "Hello";
        String world = "Hello World";
        String sentence = "this is a String variable";

        // 문자와 문자열의 차이
        // String letter = 'a'; //오류
        String letter = "a";
        // char charLetter = "a"; // 오류
        char charLetter = 'a';




    }
}
