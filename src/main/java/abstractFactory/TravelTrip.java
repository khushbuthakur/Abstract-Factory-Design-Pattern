package abstractFactory;

public class TravelTrip extends Item{

  @Override
  public void greet() {
    super.greet();
    System.out.println("Hi also from Travel Trip");
  }
}
