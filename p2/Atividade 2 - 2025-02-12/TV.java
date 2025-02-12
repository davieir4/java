public class TV extends Product{
    private int inches;

    public TV (String _brand, double _price, int inches ){
        super(_brand, _price);
    }

    public int getInches(){
        return this.inches;
    }

}
