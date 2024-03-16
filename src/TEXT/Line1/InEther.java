package TEXT.Line1;

public class InEther extends MoveStation {
    void Start() {
        CreateStation("인 에테르", 1, 1);
    }

    void Move() {
        moveRight(2);
        moveLeft(0);
    }
}