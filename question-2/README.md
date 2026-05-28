public class Bottle{
  private int capacity;
    public Bottle(double capacity){
      this.capacity = capacity;
    }
    public int updateAmount(int used){
      int limit = 0.25 * capacity;
      int placeholder = capacity;
      if((placeholder - used) < limit){
        return capacity;
      }
      else{
        placeholder - used;
        return placeholder;
      }
    }
  }
      
      
  
