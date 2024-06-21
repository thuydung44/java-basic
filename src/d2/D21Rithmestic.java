package d2;

public class D21Rithmestic {
    public static void main(String[] args) {
        // 연산의 순서는 *, / 먼저
        int result = 3 + 2 * 3;
        System.out.println(result);
        // 괄호가 있으면 괄호 내부 먼저
        result = (3 + 2) * 3;
        System.out.println(result);
        // %는 *, / 와 같은 순서로 진행
        result = (10 + 5 % 3) / 3 + 2 * 3;
        System.out.println(result);
        // 정수 나누기 정수의 결과는 정수
        System.out.println(21 / 10);
        int notDividedInt = 21 / 10;
        System.out.println(notDividedInt);  // 2

        double notDividedDouble = 21 / 10;
        System.out.println(notDividedDouble);  // 2.0

        // int intResult = 10.1 + 2;  // 오류
        // 묵시적 형변환 (implicit)
        byte aByte = 1;
        short aShort = aByte;
        int aInt = aShort;
        long aLong = aInt;
        float aFloat = aLong;
        double aDouble = aFloat;

        // 명시적 형변한 (explicit)
        double doubleVar = 10.24;
        int castDouble = (int) doubleVar;
        System.out.println(castDouble);

        // 데이터 손실이 가능하다.
        int dataLost = (int) 4294829749L;
        System.out.println(dataLost);

        // 정수끼리 나누어서 실수를 구하고 싶다면
        // 먼저 숫자 중 하나를 실수로 바꿔주자.
        double doubleDivide = (double) 21 / 10;
        System.out.println(doubleDivide);  // 2.1

        //
        char aChar = 65;
        System.out.println(aChar + 10);
        System.out.println((char) (aChar +10));


                // 문자열 덧셈(?)이 아니라
                // String Concatenation
                String hello = "Hello, ";
        String world = "World!!!";
        String helloWorld = hello + world;
        System.out.println(helloWorld);
        helloWorld = "Hello," + " " + "World!!!";
        System.out.println(helloWorld);

        // 다른 자료형과 함께라면?
        int date = 21;
        System.out.println("Today is " + date + ".");

        //증감 연산자
        int count = 0;
        count++;
        // count = count + 1;
        System.out.println(count);
        count--;
        // count = count - 1;
        System.out.println(count);
        count = 10;
        // 앞에 붙으면 먼저 올리고 값을 사용한다.
        ++count;
        // 뒤에 붙으면 사용하고 값을 올린다.
        count++;
        System.out.println(++count);
        System.out.println(count++);
        System.out.println(count);

        // '=' 는 활용하기
        int addTo = 1;
        addTo += 10;
        System.out.println(addTo); //11
        addTo -= 10;
        addTo *= 10;
        addTo /= 10;
        addTo %= 10;
        System.out.println(addTo);

        int base = 2;
        // base = base * base;
        base *= base;
        System.out.println(base);




    }

}
