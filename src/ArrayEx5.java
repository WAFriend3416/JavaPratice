import javax.swing.*;

public class ArrayEx5 {
    public static void main(String[] args) {
        int sum = 0;
        float averge = 0f;

        int[] score = {100,88,100,100,90};

        for (int i=0;i<score.length;i++){
            sum += score[i];
        }
        averge = sum / (float)score.length;

        System.out.println("sum: "+sum+" averge: "+averge);
    }
}
