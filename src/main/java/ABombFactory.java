public class ABombFactory extends AbstractExplosionFactory{

  @Override
  public Explosions getObject() {
    return new ABomb();
  }
}
