public class CharToCode {
    public static void main(String[] args) {
        char ch = 'A'; // char ch = 65;
        int code = (int)ch;

        System.out.printf("%c=%d(%#x)%n",ch,code,code);

        char hch = '가'; // char hch = 0xAC00;
        System.out.printf("%c=%d(%#x)%n",hch,(int)hch,(int)hch);
    }
}
