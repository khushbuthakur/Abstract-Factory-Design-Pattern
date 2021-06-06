package abstractFactory;

public class Iphone extends Item{

  @Override
  public void greet() {
    super.greet();
    System.out.println("Hi also from Iphone");
  }
}
