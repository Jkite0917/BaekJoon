package TEXT.Line1;

public class Bupyeong extends MoveStation {
    void Start() {
        CreateStation("부평", 4, 1);
    }

    void Move() {
        moveRight(5);
        moveLeft(3);
    }
}