package tests.java;

import janala.Main;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: David
 * Date: 11/27/12
 * Time: 10:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class SerialTest {

    public static void main(String[] args) {
        new SerialTest();
    }

    public void test() {
        SerializeMe sm = new SerializeMe();
        int g = Main.readInt(0);
        Main.MakeSymbolic(g);
        if(g * g > 0) {
            sm.str = "baz";
            System.out.println(sm);
        }
    }
}

class SerializeMe implements Serializable {
    public static final long serialVersionUID;

    static {
        serialVersionUID = 5599587822477417669L;
    }

    public String str;
}
