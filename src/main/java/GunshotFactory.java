public class GunshotFactory extends AbstractExplosionFactory{

  @Override
  public Explosions getObject() {
    return new Gunshot();
  }
}
