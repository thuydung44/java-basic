package d2;

public class D23Comparision  {
    public static void main(String[] args) {
        // 비교 연산자

        // 두개의 값을 비교해서 참/ 거칫을 만드는 연산자 10 = 1 + 9
        int small1 = 10;
        int small2 = 10;
        int big = 21;
        // true
        System.out.println(small1 == small2);
        // false
        System.out.println(small1 == big);
        // 같지 않다
        System.out.println(small1 != small2); //false
        System.out.println(big != small1); // true
        // 초과
        System.out.println(big > small1);
        System.out.println( small2 < big);
        // 이상
        System.out.println(big >= small1);
        System.out.println(small1 >= small2);
        // 이하
        System.out.println(big <= small2);
        System.out.println(small1 <= small2);


        // 논리 연산자
        int temperature = 38;
        // 채온이 36도 미만 또는 38도 이싱인지?
        System.out.println(temperature< 36);
        System.out.println(temperature >= 38);
        // 또는 (or)
        System.out.println(temperature < 36 || temperature >= 38);
        // 채온이 36도 38도  사이에 있는지
        // 그리고



    }
}
