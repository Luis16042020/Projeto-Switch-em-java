package projetoswich;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class ProjetoSwich {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mes;
        
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero entre 1 e 12"));
        
        switch (mes){
            case 1:
                JOptionPane.showMessageDialog(null,"O n�mero selecionado corresponde ao m�s de janeiro");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"O n�mero selecionado corresponde ao m�s de fevereiro");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"O n�mero selecionado corresponde ao m�s de mar�o");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"O n�mero selecionado corresponde ao m�s de abril");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"O n�mero selecionado corresponde ao m�s de maio");
                break;
            case 6:
                JOptionPane.showMessageDialog(null,"O n�mero selecionado corresponde ao m�s de junho");
                break;
            case 7:
                JOptionPane.showMessageDialog(null,"O n�mero selecionado corresponde ao m�s de julho");
                break;
            case 8:
                JOptionPane.showMessageDialog(null,"O n�mero selecionado corresponde ao m�s de agosto");
                break;
            case 9:
                JOptionPane.showMessageDialog(null,"O n�mero selecionado corresponde ao m�s de setembro");
                break;
            case 10:
                JOptionPane.showMessageDialog(null,"O n�mero selecionado corresponde ao m�s de outubro");
                break;
            case 11:
                JOptionPane.showMessageDialog(null,"O n�mero selecionado corresponde ao m�s de novembro");
                break;
            case 12:
                JOptionPane.showMessageDialog(null,"O n�mero selecionado corresponde ao m�s de dezembro");
                break;
            default:
                JOptionPane.showMessageDialog(null,"N�mero inv�lido");
                break;
        }
    }
    
}