
/**
 * Main Program.
 */
public class Main {
  public static void main(String[] args) {
    Mellow mellow = new Mellow(new CanNotFly(), new CanQuack());
    mellow.performFly();
    mellow.performQuack();
  }
}
