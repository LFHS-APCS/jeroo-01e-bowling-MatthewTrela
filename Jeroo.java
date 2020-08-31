/**
 * Put your Jeroo methods in this class.
 * @author Steve Aronson
 */
public class Jeroo extends JerooBase {

    // Put your own methods here    
    public void setupBowling() {
  row1();
  row2();
  row3();
  row4();
}

public void dp4() {
  dp();
  dp();
  dp();
  dp();
}

public void dp3() {
  dp();
  dp();
  dp();
}

public void dp2() {
  dp();
  dp();
}

public void dp() {
  hop();
  turn(RIGHT);
  hop();
  plant();
  turn(LEFT);
}

public void relocate1() {
  hop();
  hop();
  turn(LEFT);
  turn(LEFT);
}

public void relocate2() {
  turn(RIGHT);
  hop();
  turn(RIGHT);
  hop();
}

public void row1() {
  dp4();
}

public void row2() {
  relocate1();
  dp3();
}

public void row3() {
  relocate2();
  dp2();
}

public void row4() {
  relocate1();
  dp();
}
    


    
    // Do NOT touch the code below here

    public Jeroo() {super();}

    public Jeroo(int flowers) {super(flowers); }

    public Jeroo(int y, int x) { super(y, x); }

    public Jeroo(int y, int x, CompassDirection direction) { super (y, x, direction);}

    public Jeroo(int y, int x, int flowers) { super (y, x, flowers);}

    public Jeroo(int y, int x, CompassDirection direction, int flowers) { super(y, x, direction, flowers);}

}
