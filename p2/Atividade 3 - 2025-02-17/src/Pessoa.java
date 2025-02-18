public abstract class Pessoa {
    protected final String nome;
    protected final double rendaAnual;

    public Pessoa(String nome, double rendaAnual){
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public String getNome(){

        return this.nome;
    }
    public double getRendaAnual(){

        return this.rendaAnual;
    }
    public abstract double getTax();

}

