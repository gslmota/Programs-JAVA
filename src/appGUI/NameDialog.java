package appGUI;
import javax.swing.JOptionPane;
public class NameDialog
{
    public static void main (String[] args)
    {
        // pede para o usuário inserir seu nome 
        String name = JOptionPane.showInputDialog("What is your name?");
        // cria a mensagem
        String message = String.format("Welcome, %s, to Java Programming!", name);
        // exibe a mensagem para cumprimentar o usuário pelo nome
        JOptionPane.showMessageDialog(null, message);
    }
}