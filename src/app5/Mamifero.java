package app5;
public class Mamifero extends Animal {
    // Atributos
    private String corDoPelo;
    // Métodos

    public String getCorDoPelo() 
    {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }

    @Override
    public void emitirSom() 
    {
        System.out.println("Som do mamífero");
    }
}