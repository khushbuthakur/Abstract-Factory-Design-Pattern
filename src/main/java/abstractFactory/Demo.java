package abstractFactory;
import java.util.ArrayList;

public class Demo {

  public static void demo(){

    // single producer gives it all
    AbstractItemFactory breadFactory = ItemFactoryProducer.getFactoryInstance("BREAD");
    AbstractItemFactory iphoneFactory = ItemFactoryProducer.getFactoryInstance("IPHONE");
    AbstractItemFactory travelFactory = ItemFactoryProducer.getFactoryInstance("TRAVELTRIP");

    // factory for each
    AbstractItemFactory singletonIphoneFactory = IphoneSingletonFactory.getInstance();
    AbstractItemFactory singletonBreadFactory = BreadSingleFactory.getInstance();
    AbstractItemFactory singletonTravelTripFactory = TravelTripSingletonFactory.getInstance();

    ArrayList<AbstractItem> itemList = new ArrayList<>();

    // via single factory producer
    itemList.add(breadFactory.getItem());
    itemList.add(iphoneFactory.getItem());
    itemList.add(travelFactory.getItem());

    // via singleton factory of each item
    itemList.add(singletonIphoneFactory.getItem());
    itemList.add(singletonBreadFactory.getItem());
    itemList.add(singletonTravelTripFactory.getItem());

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

     Item bread1 = singletonBreadFactory.getItem();
     Item iphone1 = singletonIphoneFactory.getItem();
     Item travelTrip1 = singletonTravelTripFactory.getItem();

     amazon.addItem(bread1);
     amazon.addItem(iphone1);
     amazon.addItem(travelTrip1);

    System.out.println("Total items : " + amazon.getStoreItems().size());

    amazon.sellItem(iphone);

    System.out.println("Total items : " + amazon.getStoreItems().size());

    amazon.sellItem(bread1);

    System.out.println("Total items : " + amazon.getStoreItems().size());

    System.out.println("------------------------------------------------------------------------");

    for(AbstractItem i : itemList){
      i.greet();
    }
  }

}
