package abstractFactory;

public class Amazon extends Store{

  public Amazon() {
    super();
  }

  @Override
  public void makeStore() {
    super.makeStore();
    System.out.println("Hi also from amazon");
  }
}
