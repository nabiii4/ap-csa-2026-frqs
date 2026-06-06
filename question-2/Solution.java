
public class Bottle{
  private double capacity;
  private double amoun;
    public Bottle(double capacity){
      this.capacity = capacity;
      amoun = capacity;
    }
    public double updateAmount(double used){
      double limit = 0.25 * capacity;
      //int placeholder = capacity;
      amoun -= used;
      if((amoun) < limit){
        amoun= capacity;
    }
    return amoun;
      
      //else{
        //placeholder - used;
        //return placeholder;
      //}
  }
}
      
      
  
