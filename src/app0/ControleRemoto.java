package app0;
public class ControleRemoto implements Controlador
{
    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    private int i;
    // Métodos Especiais
    public ControleRemoto()
    {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    // Métodos Get e Set
    private int getVolume() 
    {
        return volume;
    }

    private void setVolume(int v) 
    {
        this.volume = v;
    }

    private boolean getLigado() 
    {
        return ligado;
    }

    private void setLigado(boolean l) 
    {
        this.ligado = l;
    }

    private boolean getTocando() 
    {
        return tocando;
    }

    private void setTocando(boolean t) 
    {
        this.tocando = t;
    }
    // Métodos Abstratos

    @Override
    public void ligar() 
    {
        this.setLigado(true);
    }

    @Override
    public void desligar() 
    {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() 
    {
        System.out.println("------MENU------");
        System.out.println("Está ligado?" + this.getLigado());
        System.out.println("Está tocando?"+ this.getTocando());
        System.out.println("Volume: " + this.getVolume());
        for(i = 0; i <= this.getVolume(); i+=10)
        {
            System.out.print("|");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu()
    {
        System.out.println("Fechando Menu ...");
    }

    @Override
    public void maisVolume() 
    {
        if(this.getLigado() == true)
        {
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() 
    {
        if(this.getLigado() == true)
        {
            this.setVolume(this.getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo() 
    {
        if(this.getLigado() == true && this.getVolume() > 0)
        {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() 
    {
        if(this.getLigado() == true && this.getVolume() == 0)
        {
            this.setVolume(50);
        }
    }

    @Override
    public void play() 
    {
        if(this.getLigado() == true && (this.getTocando() == false))
        {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() 
    {
        if(this.getLigado() == true && (this.getTocando() == true))
        {
            this.setTocando(false);
        }
    }
    
}
