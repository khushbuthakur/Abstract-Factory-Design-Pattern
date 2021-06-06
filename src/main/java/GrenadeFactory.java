public class GrenadeFactory extends AbstractExplosionFactory{

  @Override
  public Explosions getObject() {
    return new Grenade();
  }
}
