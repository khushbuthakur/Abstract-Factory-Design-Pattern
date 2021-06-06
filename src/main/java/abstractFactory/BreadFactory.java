package abstractFactory;

public class BreadFactory extends AbstractItemFactory{

  @Override
  public Item getItem() {
    return new Bread();
  }
}
