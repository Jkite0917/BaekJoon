package 나도코딩.Chap_08;

import 나도코딩.Chap_07_클래스.BlackBox;
import 나도코딩.Chap_07_클래스.BlackBoxRefurbish;

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();

        b1.modelName = "까망이"; //public
//        b1.resolution = ""; // default
//        b1.price = 200000; // private
//          b1.color = "";   // protected
    }
}
