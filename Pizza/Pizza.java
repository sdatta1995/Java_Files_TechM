public abstract class Pizza {
    
    abstract float calPrice();
    
    public boolean Validate (int size, String type) {
        if ((size==6 || size==8 || size==12) && (type.equals("Regular") || type.equals("Medium") || type.equals("Large"))) {
            return true;
        }
        else {
            return false;
        }
    }
}