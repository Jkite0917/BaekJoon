package TEXT.Line1;

public class Juan extends MoveStation {
    void Start() {
        CreateStation("주안", 3, 1);
    }

    void Move() {
        moveRight(4);
        moveLeft(2);
    }
}