class Tv{
    String color;
    boolean power;
    int channel;

    void power() {power = !power;}
    void channelDown() {--channel;}
    void channelUp() {++channel;}
}

public class TvTest {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1의 채널값은 "+ t1.channel +" 입니다ㅣ.");
        System.out.println("t2의 채널값은 "+ t2.channel +" 입니다ㅣ.");

        t1.channel = 7;
        System.out.println("t1의 채널값을 7로 변경했습니다.");

        System.out.println("t1의 채널값은 "+ t1.channel +" 입니다ㅣ.");
        System.out.println("t2의 채널값은 "+ t2.channel +" 입니다ㅣ.");
        /*Tv t;
        t = new Tv();
        t.channel = 7;
        t.channelDown();
        System.out.println("현재 채널은 "+t.channel+" 입니다.");*/

    }
}
