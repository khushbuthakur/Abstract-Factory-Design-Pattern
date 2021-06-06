public class AbstractFactoryProducer {

  public static AbstractExplosionFactory getFactoryInstance(String name){
    AbstractExplosionFactory factory = null;

    if(name.equalsIgnoreCase("GUNSHOT")){
      factory = new GunshotFactory();
    }else if(name.equalsIgnoreCase("GRENADE")){
      factory = new GrenadeFactory();
    }else{
      factory = new ABombFactory();
    }

    return factory;
  }
}
