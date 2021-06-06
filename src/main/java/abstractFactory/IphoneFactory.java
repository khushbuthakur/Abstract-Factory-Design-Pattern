package abstractFactory;

public class IphoneFactory extends AbstractItemFactory{

  @Override
  public Item getItem() {
    return new Iphone();
  }
}
