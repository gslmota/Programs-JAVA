package app4;

public class Mamifero extends Animal
{
    private String corDoPelo;
    
    @Override
    public void locomover () 
    {
        System.out.println("Correndo!");
    }

    @Override
    public void alimentar () 
    {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom () 
    {
        System.out.println("Som do mamífero!");
    }

    public String getCorDoPelo () 
    {
        return corDoPelo;
    }

    public void setCorDoPelo (String corDoPelo) 
    {
        this.corDoPelo = corDoPelo;
    }

    @Override
    public String toString() {
        return "Mamifero [corDoPelo=" + corDoPelo + "]";
    }
    
}