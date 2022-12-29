package EntradaDados;
import javax.swing.JOptionPane;

public class Janela {
    public static void main(String[] args){
        /*Usando janela personalizada do java para coleta e impressão de informações */

        String nome = JOptionPane.showInputDialog("Qual o seu nome?");

        JOptionPane.showMessageDialog(null, nome);
        
    }
}