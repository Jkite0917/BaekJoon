package TEXT.Line1;

public class Jemulpo extends MoveStation {
    void Start() {
        CreateStation("제물포", 2, 1);
    }

    void Move() {
        moveRight(3);
        moveLeft(1);
    }
}