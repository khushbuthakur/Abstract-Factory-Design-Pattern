package abstractFactory;

public class Bread extends Item{

  @Override
  public void greet() {
    super.greet();
    System.out.println("Hi also from Bread");
  }
}
