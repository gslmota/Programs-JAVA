// Projeto usando todos os conceito da programação orientada a objetos
// Gabriel Sávio 
package app6;
public class App6 
{
    public static void main(String[] args)
    {
        Video v[] = new Video[3];
        v[0] = new Video("Star Wars");
        v[1] = new Video("Station 19");
        v[2] = new Video("La casa de papel");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jorge", 21, "M", "Juba");
        g[1] = new Gafanhoto("Lucas", 24, "M", "Luca");

        Visualizacao s[] = new Visualizacao[3];
        s[0] = new Visualizacao(g[0], v[2]);
        s[0].avaliar();
        System.out.println(s[0].toString());
        s[1] = new Visualizacao(g[0],v[0]);
        s[0].avaliar(45.0f);
        System.out.println(s[1].toString());


       // TESTE
       // System.out.println(v[0].toString());
       // System.out.println(g[0].toString());

    }
}