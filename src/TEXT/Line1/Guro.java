package TEXT.Line1;

public class Guro extends MoveStation {
    void Start() {
        CreateStation("구로", 6, 1);
    }

    void Move() {
        moveRight(7);
        moveLeft(5);
    }
}
