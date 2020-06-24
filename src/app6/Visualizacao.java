package app6;
public class Visualizacao 
{
    private Gafanhoto espectador;
    private Video filme;

    public void avaliar()
    {
        this.filme.setAvaliacao(5);
    }
    
    public void avaliar(int x)
    {
        this.filme.setAvaliacao(x);
    }
    public void avaliar(float y)
    {
        int t;
        if(y < 20)
        {
            t = 3;
        }
        else
        {
            if(y <= 50)
            {
                t = 5;
            }
            else
            {
                if(y <= 90)
                {
                    t = 8;
                }
                else
                {
                    t = 10;
                }
            }
        }
        this.filme.setAvaliacao(t);
    }
    public Visualizacao(Gafanhoto espectador, Video filme) 
    {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistindo(this.espectador.getTotAssistindo() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public Gafanhoto getEspectador() 
    {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) 
    {
        this.espectador = espectador;
    }

    public Video getFilme() 
    {
        return filme;
    }

    public void setFilme(Video filme) 
    {
        this.filme = filme;
    }

    @Override
    public String toString() 
    {
        return "Visualizacao [espectador=" + espectador + ", filme=" + filme + "]";
    }

    
}