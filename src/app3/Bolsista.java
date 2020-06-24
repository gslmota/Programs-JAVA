package app3;

public class Bolsista extends Aluno
{
    private float bolsa;

    public void renovarBolsa ()
    {
        System.out.println("Bolsa Renovada com Sucesso");
    }
    
    public void pagarMensalidade ()
    {
        System.out.println(" " + this.getNome() + " é bolsista" + " Pagamento Facilitado");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
}