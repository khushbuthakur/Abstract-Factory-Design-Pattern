import java.util.ArrayList;

public class Demo {

  public static void demo(){
    AbstractExplosionFactory factory = AbstractFactoryProducer.getFactoryInstance("GRENADE");
    AbstractExplosionFactory factory1 = AbstractFactoryProducer.getFactoryInstance("GUNSHOT");
    AbstractExplosionFactory factory2 = AbstractFactoryProducer.getFactoryInstance("ABOMB");

    ArrayList<Explosions> explosionsList = new ArrayList<>();

    explosionsList.add(factory.getObject());
    explosionsList.add(factory1.getObject());
    explosionsList.add(factory2.getObject());
    explosionsList.add(factory.getObject());

    for(Explosions e : explosionsList){
      e.explode();
    }
  }
}
