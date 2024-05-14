package 나도코딩.Chap_11;

public class _05_TryWithResources {
    public static void main(String[] args) {
        MyFileWrite writer1 = null;
        try {
            writer1 = new MyFileWrite();
            writer1.write("아이스크림이 먹고 싶어요");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                writer1.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("-----------");

        try(MyFileWrite writer2 = new MyFileWrite()) {  // 자동으로 close() 호출
            writer2.write("빵 먹고 싶어요");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class MyFileWrite implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("파일 닫음");
    }

    public void write(String line) {
        System.out.println("파일에 내용을 입력합니다.");
        System.out.println("내용: " + line);
    }
}
