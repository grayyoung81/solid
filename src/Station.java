public class Station  {
    public void reFuel(Vehicle v){
        v.setRemainingFuel(v.getMaxFuel()-v.getRemainingFuel());
    }
}
