package abstractFactory;

import abstractFactory.AbstractItemFactory;
import abstractFactory.TravelTripFactory;

public class TravelTripSingletonFactory {

  private static AbstractItemFactory instance;

  private TravelTripSingletonFactory(){

  };

  public static AbstractItemFactory getInstance(){
    if(instance == null){
      instance = new TravelTripFactory();
    }

    return instance;
  }
}
