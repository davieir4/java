public class Refrigerator extends Product{
    private int size;
    public Refrigerator(String _brand, double _price, int size){
        super(_brand, _price);
    }
    public int getSize(){
        return this.size;
    }
}
