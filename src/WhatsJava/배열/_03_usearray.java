package WhatsJava.배열;

public class _03_usearray {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for(int i=0; i<numArr.length; i++) {
            numArr[i] = i;
            System.out.print(numArr[i]);
        }
        System.out.println();

        for(int i=0; i<10; i++) {
            int n = (int) (Math.random()*10);
            int tmp = numArr[i];
            numArr[i] = numArr[n];
            numArr[n] = tmp;
        }

        for (int tmp : numArr) {
            System.out.print(tmp);
        }

        // 배열 내 순서를 섞고 싶다면
        // 인덱스 번호를 랜덤값으로 만드는 방법을 이용해보자. (출력은 Arrays.toString())
    }
}
