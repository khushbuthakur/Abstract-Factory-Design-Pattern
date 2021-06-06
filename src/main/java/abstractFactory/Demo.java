package abstractFactory;
import java.util.ArrayList;

public class Demo {

  public static void demo(){

    AbstractItemFactory breadFactory = ItemFactoryProducer.getFactoryInstance("BREAD");
    AbstractItemFactory iphoneFactory = ItemFactoryProducer.getFactoryInstance("IPHONE");
    AbstractItemFactory travelFactory = ItemFactoryProducer.getFactoryInstance("TRAVELTRIP");

    ArrayList<AbstractItem> itemList = new ArrayList<>();

    itemList.add(breadFactory.getItem());
    itemList.add(iphoneFactory.getItem());
    itemList.add(travelFactory.getItem());

    System.out.println("------------------------------------------------------------------------");
    Amazon amazon = new Amazon();

    Item bread = breadFactory.getItem();
    Item iphone = iphoneFactory.getItem();
    Item travelTrip = travelFactory.getItem();

     amazon.addItem(bread);
     amazon.addItem(iphone);
      amazon.addItem(iphone);
      amazon.addItem(iphone);
     amazon.addItem(travelTrip);

    System.out.println("Total items : " + amazon.getStoreItems().size());

    amazon.sellItem(iphone);

    System.out.println("Total items : " + amazon.getStoreItems().size());

    System.out.println("------------------------------------------------------------------------");

    for(AbstractItem i : itemList){
      i.greet();
    }
  }

}
