package abstractFactory;

public class TravelTripFactory extends AbstractItemFactory{

  @Override
  public Item getItem() {
    return new TravelTrip();
  }
}
