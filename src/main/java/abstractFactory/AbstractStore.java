package abstractFactory;

import java.util.ArrayList;

public abstract class AbstractStore {

  public abstract void makeStore();

  public abstract void addItem(AbstractItem item);

  public abstract void sellItem(AbstractItem item);
}
