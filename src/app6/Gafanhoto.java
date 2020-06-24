package app6;
public class Gafanhoto extends Pessoa 
{
    // Atributos
    private String login;
    private int totAssistindo;
    // Métodos
    
    public Gafanhoto(String nome, int idade, String sexo, String login) 
    {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistindo = 0;
    }

    public void viuMaisUm()
    {

    }

    public String getLogin() 
    {
        return login;
    }

    public void setLogin(String login) 
    {
        this.login = login;
    }

    public int getTotAssistindo() 
    {
        return totAssistindo;
    }

    public void setTotAssistindo(int totAssistindo) 
    {
        this.totAssistindo = totAssistindo;
    }

    @Override
    public String toString() 
    {
        return "Gafanhoto [" + super.toString() + "login=" + login + ", totAssistindo=" + totAssistindo + "]";
    }
    
}