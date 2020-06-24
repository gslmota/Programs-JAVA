package app4;

public class Peixe extends Animal 
{
    private String corDaEscama;

    public String getCorDaEscama() 
    {
        return corDaEscama;
    }

    public void setCorDaEscama(String corDaEscama) 
    {
        this.corDaEscama = corDaEscama;
    }

    @Override
    public void alimentar ()
    {
       System.out.println("Comendo Substâncias");
    }

    @Override
    public void emitirSom () 
    {
       System.out.println("Peixe não emite som");
    }

    @Override
    public void locomover () 
    {
       System.out.println("Nadando");
    }
    
    public void soltarBolha ()
    {
        System.out.println("Soltou uma bolha");
    }
}