package WhatsJava.배열;

public class _01_usearray {
    public static void main(String[] args) {
        // 1. sum and average
        int sum =0;
        float average = 0f;

        int[] score = {100, 88, 100, 100, 90};

        for(int i=0; i<score.length; i++) {
            sum += score[i];
        }
        average = sum / (float)score.length;

        System.out.println("총점: " + sum + " 평균: " + average);
    }
}
