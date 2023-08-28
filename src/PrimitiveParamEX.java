class Data {int x; }

public class PrimitiveParamEX {
    public static void main(String[] args) {
        Data d = new Data();
        d.x =10;
        System.out.println("main() : x="+d.x);

        change(d.x);
        System.out.println("After change(d.x)");
        System.out.println("main() : x="+d.x);

        changeR(d);
        System.out.println("After changeR(d)");
        System.out.println("main() : x="+d.x);

    }
    static void changeR(Data d){
        d.x = 1000;
        System.out.println("change() : x="+d.x);
    }
    static void change(int x){
        x = 1000;
        System.out.println("change() : x="+x);
    }
}
