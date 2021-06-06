package abstractFactory;

public class Item extends AbstractItem{

  @Override
  public void greet() {
    System.out.println("Hi from Item");
  }

  @Override
  public String toString() {
    return Item.class.getName() + ".demo()....";
  }
}
