package abstractFactory;

public class ItemFactoryProducer {

  public static AbstractItemFactory getFactoryInstance(String name){
    AbstractItemFactory factory = null;

    if(name.equalsIgnoreCase("BREAD")){
      factory = new BreadFactory();
    }else if(name.equalsIgnoreCase("IPHONE")){
      factory = new IphoneFactory();
    }else if(name.equalsIgnoreCase("TRAVELTRIP")){
      factory = new TravelTripFactory();
    }

    return factory;
  }

}
