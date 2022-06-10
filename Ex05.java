import javax.swing.JOptionPane;

public class Ex05 {
    public static void main(String[] args) {
        String[] meses = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 12: "));

        JOptionPane.showMessageDialog(null,"O mês da semana é " + meses[num -1]);
    }
}
