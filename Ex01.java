import javax.swing.JOptionPane;

public class Ex01 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        if (num > 0) {
            JOptionPane.showMessageDialog(null,"Positivo");
        }else if (num < 0) {
            JOptionPane.showMessageDialog(null,"Negativo");
        }else {
            JOptionPane.showMessageDialog(null,"Neutro");
        }
    }    
}