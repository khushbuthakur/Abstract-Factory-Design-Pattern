package abstractFactory;

import abstractFactory.AbstractItemFactory;
import abstractFactory.IphoneFactory;

public class IphoneSingletonFactory {

  private static AbstractItemFactory instance;

  private IphoneSingletonFactory(){

  };

  public static AbstractItemFactory getInstance(){
    if(instance == null){
      instance = new IphoneFactory();
    }

    return instance;
  }
}
