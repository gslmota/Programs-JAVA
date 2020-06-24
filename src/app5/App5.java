package app5;
public class App5 
{
    public static void main(String[] args)
    {
        Mamifero m = new Mamifero();
        m.emitirSom();
        Lobo l = new Lobo();
        l.emitirSom();
        // Acontece abaixo o conceito de polimorfismo de sobrcarga
        Cachorro c = new Cachorro();
        c.reagir("Olá");
        c.reagir("Teimoso");
        c.reagir(11, 45);
        c.reagir(21, 00);
        c.reagir(true);
        c.reagir(5, 12.4f);
    }
}