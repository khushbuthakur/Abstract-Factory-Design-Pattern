package abstractFactory;

import java.util.ArrayList;

public class Store extends AbstractStore{

  private ArrayList<AbstractItem> storeItems;

  public Store() {
    storeItems = new ArrayList<>();
  }

  @Override
  public void makeStore() {
    System.out.println("Hi from store");
  }

  @Override
  public void addItem(AbstractItem item) {
    System.out.println("Adding item " + item.getClass().getName());
    storeItems.add(item);
  }

  @Override
  public void sellItem(AbstractItem item) {
    System.out.println("removing item " + item.getClass().getName());
    storeItems.remove(item);
  }

  public ArrayList<AbstractItem> getStoreItems() {
    return storeItems;
  }

}
