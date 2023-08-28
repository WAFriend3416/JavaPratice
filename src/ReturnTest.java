public class ReturnTest {
    public static void main(String[] args) {
        ReturnTest r = new ReturnTest();

        int result = r.add(3,5);
        System.out.println(result);

        int[]  result2 = {0};
        r.add(3,5,result2);
        System.out.println(result2[0]);
    }

    private int add(int i, int i1) {
        return i+i1;
    }

    void add(int a,int b,int[] result){
        result[0] = a+b;
    }
}
