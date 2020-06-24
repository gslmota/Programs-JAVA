package app1;
import java.util.Random;
public class Luta 
{
     // Atributos
     private Lutador desafiado;
     private Lutador desafiante;
     private int rounds;
     private boolean aprovada;
     // Métodos Públicos
     public void marcarLuta(Lutador l1, Lutador l2)
     {
         if(l1.getCategoria() == l2.getCategoria() && l1 != l2)
         {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
         }
         else
         {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
         }
     }
     public void lutar()
     {
         if(this.aprovada = true)
         {
            System.out.println("####Desafiado####");
            this.desafiado.apresentar();
            System.out.println("####Desafiante####");
            this.desafiante.apresentar();
            // Criar um random para decidir quem vence a luta
            Random aleatorio = new Random ();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor)
            {
                case 0: // Empate
                System.out.println("Empatou!!!");
                this.desafiado.empatarluta();
                this.desafiante.empatarluta();
                break;
                case 1: // Desafiado Vence
                System.out.println("Vitoria do " + this.desafiado.getNome());
                this.desafiado.ganharluta();
                this.desafiante.perderluta();
                break;
                case 2: // Desafiante Vence
                System.out.println("Vitoria do " + this.desafiante.getNome());
                this.desafiante.ganharluta();
                this.desafiado.perderluta();
                break;
            }

         }
         else
         {
             System.out.println("A luta não pode acontecer!!");
         }
     }
     // Metódos Especiais
     public Lutador getDesafiado() {
         return desafiado;
     }

     public void setDesafiado(Lutador desafiado) {
         this.desafiado = desafiado;
     }

     public Lutador getDesafiante() {
         return desafiante;
     }

     public void setDesafiante(Lutador desafiante) {
         this.desafiante = desafiante;
     }

     public int getRounds() {
         return rounds;
     }

     public void setRounds(int rounds) {
         this.rounds = rounds;
     }

     public boolean getAprovada() {
         return aprovada;
     }

     public void setAprovada(boolean aprovada) {
         this.aprovada = aprovada;
     }
     
}