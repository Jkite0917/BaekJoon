package WhatsJava.배열;

public class _02_usearray {
    public static void main(String[] args) {
        // 2. max and min
        int[] score = {79, 88, 91, 33, 100, 55, 95};

        int max = score[0];
        int min = score[0];

        for(int i=0; i<score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            } else if (score[i] < min) {
                min = score[i];
            }
        }
        System.out.println("max: "+max+" min: "+min);
    }
}
