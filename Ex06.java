import javax.swing.JOptionPane;

public class Ex06 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para verificar se é bissexto: "));
        if (num%4 == 0 && num%100 != 0 || num%400 == 0) {
            JOptionPane.showMessageDialog(null,"O número é bissexto ");
        }else {
            JOptionPane.showMessageDialog(null,"O número não é bissexto ");
        }
    }
}
