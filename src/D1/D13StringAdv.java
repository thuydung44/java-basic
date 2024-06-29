package D1;

public class D13StringAdv {
    public static void main(String[] args) {
        // Escape Sequence

        // Hello, "Thuy Dung"!!!
        // 쌍다옴표(") 내부에는 쌍따옴표(")를 넣지 못한다.
        // System.out.println("Hello, "Thuy Dunhg"!!! "); // 오류
        // 평범한 쌍따옴표가 아닌 표현하기 위해 '\'를 넣는다
        System.out.println("Hello,\"Thuy Dung\"!!!");
        char punctuation = '\'';
        System.out.println(punctuation);

        // 만약에 '\'를 문자열 내부에 쓰고 싶다면?
        System.out.println("\\");

        // 특수기호 넣기
        // 엔터(Enter) 키
        System.out.println("A와 B 사이에 엔터\n를 넣었다.");
        // 탭(Tab)키
        System.out.println("A와 B 사이 \t들어쓰기");
        System.out.println("name:\tThuy Dung");
        System.out.println("grade:\t10");

        // Carriage Return: 커서를 제일 앞으로 이동
        System.out.println("abc\rdef"); //def
        System.out.println("Carriage Return: \r줄의 앞으로 옮깁니다.");
        // Backspace: 지우기
        System.out.println("백스페이스: \b앞의 문자를 하나 지옵니다.");
        System.out.println("abc\bdef"); //abdef

        // String Formatting
        int dust = 10;
        String status = "좋음";
        // 변수에 저장된 값을 문자열에 펴현하고 싶다면?
        System.out.println("미세먼지 농도: dust (status)");
        // String.format 사용
        // 문자열을 템플릿처럼 사용하기
        String message = String.format("미세먼지 농도: %d, (%s)", dust, status);
        System.out.println(message);
        // %d: 정수, %s: 문자열
        System.out.println(String.format("미세먼지 농도: %d, (%s)", dust, status));
        // %c: 문자
         System.out.println(String.format("코드: %c",'B'));
         // %f: 실수
        System.out.println(String.format("오존: %f", 0.022));
        System.out.println(String.format("오존: %.4f", 0.022));

        // % 갯수 보다 값이 적으면 오류
        System.out.println(String.format("%d, %d, %d", 1, 2));
        System.out.println(String.format("%d, %d, %d, %d", 1, 2, 3, 4));
    }
}
