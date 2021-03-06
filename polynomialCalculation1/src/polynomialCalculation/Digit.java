package polynomialCalculation;

public class Digit extends Data {

  private Integer d;

  public Digit(final int d) {
    this.d = new Integer(d);
  }

  public int getContent() {
    return d.intValue();
  }

  public void set(final int d) {
    this.d = new Integer(d);
  }

  @Override
  public char[] get() {
    return d.toString().toCharArray();
  }

}
