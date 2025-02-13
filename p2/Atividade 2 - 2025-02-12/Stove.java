public class Stove extends Product{
    private int burners;
    public Stove(String _name, String _brand, int burners, double _price){
        super(_name, _brand, _price);
    }
    public int getBurners(){
        return this.burners;
    }
}
