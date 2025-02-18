public class PessoaFisica extends Pessoa {
    private final double saudeGastos;

    public PessoaFisica(String _nome, double _rendaAnual, double saudeGastos){
        super(_nome, _rendaAnual);
        this.saudeGastos = saudeGastos;
    }
    public double getSaudeGastos() {
        return saudeGastos;
    }

    @Override
    public double getTax(){
        double imposto;
        if(this.rendaAnual < 20000.00){

            imposto = this.rendaAnual*0.15 - (saudeGastos/2);

            return imposto;
        }

        imposto = this.rendaAnual * 0.25 - (saudeGastos/2);

        return imposto;
    }
}
