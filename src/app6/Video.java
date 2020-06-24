package app6;
public class Video implements AcoesVideo 
{
    // Atributos
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    // Método Construtor
    public Video(String titulo) 
    {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.curtidas = 0;
        this.reproduzindo = false;
        this.views = 0;
    }
    // Métodos
    
    
    @Override
    public void like() 
    {
        this.curtidas ++;
    }

    @Override
    public void pause() 
    {
        this.reproduzindo = false;
    }

    @Override
    public void play() 
    {
        this.reproduzindo = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) 
    {
        this.titulo = titulo;
    }

    public int getAvaliacao() 
    {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) 
    {
        int nAvaliacao;
        nAvaliacao = (int) ((this.avaliacao + avaliacao) / this.views);
        this.avaliacao = nAvaliacao;
    }

    public int getViews() 
    {
        return views;
    }

    public void setViews(int views) 
    {
        this.views = views;
    }

    public int getCurtidas() 
    {
        return curtidas;
    }

    public void setCurtidas(int curtidas) 
    {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() 
    {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) 
    {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public String toString() {
        return "Video [avaliacao=" + avaliacao + ", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo
                + ", titulo=" + titulo + ", views=" + views + "]";
    }
}