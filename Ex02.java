import javax.swing.JOptionPane;

public class Ex02 {
    public static void main(String[] args) {
        double a,b,c,delta;
        double x1,x2;

        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente a "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente b "));
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente c "));
        delta = (Math.pow(b, 2)) - (4*a*c);
        if (delta < 0) {
            JOptionPane.showMessageDialog(null,"Não há raízes");            
        }else if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / 2*a;
            x2 = (-b - Math.sqrt(delta)) / 2*a;
            JOptionPane.showMessageDialog(null,"As raízes são " + x1 + " e "+ x2);    
        }else {
            x1 = (-b + Math.sqrt(delta)) / 2*a;
            JOptionPane.showMessageDialog(null,"As raíz é " + x1);    
        }

    }
}
