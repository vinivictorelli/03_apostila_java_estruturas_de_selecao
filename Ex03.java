import javax.swing.JOptionPane;

public class Ex03 {
    public static void main(String[] args) {
        double a,b,c,maior = 0;
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));

        if (a >= b) {
            maior = a;
        }else if (a < b) {
            maior = b;
        }
        if (maior < c) {
            maior = c;
        }
        JOptionPane.showMessageDialog(null,"O maior número digitado é "+ maior);
    }
}
