public class StringEx {
    public static void main(String[] args) {
        String name = "Ja" + "va";
        String str = name + 8.0;

        // 덧셈 연산자를 사용할때 두 변수가 모두 숫자일 경우만 덧셈을 수행
        // 만약 둘중 하나가 String 타입이면 다른 변수도 String 타입으로 변환하여 두 문자열을 결합함
        // 덧셈 연산자는 왼쪽에서 오른쪽으로 연산을 수행, 순서에 따라 값이 달라질 수 있음
        System.out.println(name);
        System.out.println(str);
        System.out.println(7+" ");
        System.out.println(" "+7);
        System.out.println(7+"");
        System.out.println(""+7);
        System.out.println("" + "");
        System.out.println(7 + 7 + ""); // 14
        System.out.println("" + 7 + 7); // 77


    }
}
