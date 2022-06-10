import java.lang.reflect.Array;

import javax.swing.JOptionPane;

public class Ex04 {
    public static void main(String[] args) {
        String[] dias = {"Domingo","Segunda","Terça","Quarta","Quinta","Sexta","Sabado"};
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero de 1 a 7: "));

        JOptionPane.showMessageDialog(null,"O dia da semana é " + dias[num -1]);
    }
}
