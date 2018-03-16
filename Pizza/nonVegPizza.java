public class nonVegPizza extends Pizza {
    String type;
    int size;
    
   public nonVegPizza (int size, String type) {
       boolean result = Validate (size, type);
       try {
       if (result = false) { 
           throw new invalidPizzaException ("Please enter correct pizza details:");
       }
       else {
           this.type = type;
           this.size = size;
       }}
       catch(invalidPizzaException e) {
           System.out.println(e);
       }
   }
    float tempPrice;
    float calPrice () {
     if (type.equals("Regular")) {
        tempPrice = (100*size)+50;
     }
     else if (type.equals("Medium")) {
         tempPrice = (100*size) +150;
     }
     else {
        tempPrice = (100*size) +200;
     }
     return tempPrice;
    }
}