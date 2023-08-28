class CallStackTest2 {
    public static void main(String[] args) {
        printOnOff("main(Stringp[] args",1);
        firstMethod();
        printOnOff("main(Stringp[] args",2);
    }
    static void firstMethod(){
        printOnOff("firstMethod()",1);
        secondMethod();
        printOnOff("firstMethod()",2);
    }
    static void secondMethod(){
        printOnOff("secondMethod()",1);
        printOnOff("secondMethod()",2);
    }

    static void printOnOff(String a,int b){
        if (b == 1)
            System.out.println(a+"이 시작되었음.");
        else if(b == 2)
            System.out.println(a+"이 끝났음.");
        else return;
    }
}

