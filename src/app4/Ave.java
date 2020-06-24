package app4;

public class Ave extends Animal 
{
    private String corDaPena;

    @Override
    public void alimentar () 
    {
        System.out.println("Comendo Frutas");
    }

    @Override
    public void emitirSom () 
    {
        System.out.println("Som de Ave");
    }

    @Override
    public void locomover () 
    {
        System.out.println("Voando");
    }

    public String getCorDaPena () 
    {
        return corDaPena;
    }

    public void setCorDaPena (String corDaPena) 
    {
        this.corDaPena = corDaPena;
    }
    
    public void fazerNinho ()
    {
        System.out.println("Construiu um ninho!");
    }
}