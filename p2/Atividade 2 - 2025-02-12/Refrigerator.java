public class Refrigerator extends Product{
    private int size;
    public Refrigerator(String _name, String _brand, int size, double _price){

        super(_name, _brand, _price);
    }
    public int getSize(){
        return this.size;
    }
}
