package WhatsJava.배열;

public class _04_usearray {
    public static void main(String[] args) {
        // 4. 오름차순 정렬
        int[] numArr = new int[10];

        for (int i=0; i< numArr.length; i++)
            System.out.print(numArr[i] = (int) (Math.random()*10));
        System.out.println();

        for (int i=0; i< numArr.length-1; i++) {
            boolean changed = false;

            for(int j=0; j< numArr.length-1-i; j++) {
                if(numArr[j] > numArr[j+1]) {
                    int tmp = numArr[j];
                    numArr[j] = numArr[j+1];
                    numArr[j+1] = tmp;
                    changed = true;
                }
            }

            if (!changed) break;

            for(int k=0; k< numArr.length; k++)
                System.out.print(numArr[k]);
            System.out.println();
        }
    }           // array[i]++  => 배열 i번째 값을 1 증가시킨다.
}
