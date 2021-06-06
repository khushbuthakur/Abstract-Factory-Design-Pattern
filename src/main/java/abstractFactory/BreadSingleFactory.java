package abstractFactory;

import abstractFactory.AbstractItemFactory;
import abstractFactory.BreadFactory;

public class BreadSingleFactory {
    private static AbstractItemFactory instance;

    private BreadSingleFactory(){

    };

    public static AbstractItemFactory getInstance(){
      if(instance == null){
        instance = new BreadFactory();
      }
      return instance;
    }
}
