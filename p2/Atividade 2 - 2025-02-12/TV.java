public class TV extends Product{
    private int inches;

    public TV (String _name, String _brand, int inches, double _price ){

        super(_name, _brand, _price);
    }

    public int getInches(){

        return this.inches;
    }

}
