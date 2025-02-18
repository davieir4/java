public class PessoaJuridica extends Pessoa{
    private final int numeroFuncionarios;

    public PessoaJuridica(String _nome, double _rendaAnual, int numeroFuncionarios){
        super(_nome, _rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }
    @Override
    public double getTax(){
        double imposto;

        if(this.numeroFuncionarios > 10){
            imposto = rendaAnual * 0.14;
            return imposto;
        }

        imposto = rendaAnual * 0.16;

        return imposto;
    }
}
