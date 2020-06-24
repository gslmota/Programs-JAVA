// Conceito de Polimorfismo
package app4;
public class App4
{
    public static void main(String[] args)
    {
        Mamifero m = new Mamifero ();
        Reptil r = new Reptil ();
        Ave a = new Ave ();
        Peixe p = new Peixe ();
        Canguru c = new Canguru ();
        Cachorro d = new Cachorro ();
        Arara b = new Arara ();
        GoldFish gf = new GoldFish ();
        Cobra s = new Cobra ();
        Tartaruga t = new Tartaruga ();

        // Testando
        m.setPeso(54.5f);
        m.setCorDoPelo("Marrom");
        m.alimentar ();
        m.locomover ();
        m.emitirSom ();

        r.alimentar ();
        r.locomover ();
        r.emitirSom ();

        a.alimentar ();
        a.locomover ();
        a.emitirSom ();

        p.alimentar ();
        p.locomover ();
        p.emitirSom ();
        // Conceito de Polimorfismo se aplica no método abaixo
        // Na classe Arara, Tartaruga, Canguru, ocorreu uma mudança na forma de locomover
        // Ocorreu então uma sobreposição do método locomover

        b.locomover ();
        gf.locomover ();
        s.locomover ();
        c.locomover ();
        d.locomover ();
        t.locomover ();

    }
}