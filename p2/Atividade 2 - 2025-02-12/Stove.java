public class Stove extends Product{
    private int burners;
    public Stove(String _brand, double _price, int burners){
        super(_brand, _price);
    }
    public int getBurners(){
        return this.burners;
    }
}
