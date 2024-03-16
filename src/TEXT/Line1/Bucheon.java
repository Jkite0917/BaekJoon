package TEXT.Line1;

public class Bucheon extends MoveStation {
    void Start() {
        CreateStation("부천", 5, 1);
    }

    void Move() {
        moveRight(6);
        moveLeft(4);
    }
}