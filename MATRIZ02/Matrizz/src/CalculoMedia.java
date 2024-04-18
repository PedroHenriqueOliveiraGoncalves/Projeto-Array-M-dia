import javax.swing.JOptionPane;


public class CalculoMedia {
    public static void main(String[] args) {

        // Declaração de variáveis

        double notas[][] = new double[10][4]; // Matriz para armazenar as notas dos alunos (10 alunos, 4 colunas: 3 notas e média)

        int linha, coluna; // Variáveis de controle para os loops

        double media; // Variável para calcular a média de cada aluno

        // Entrada de dados

        JOptionPane.showMessageDialog(null, "Inserindo os dados na matriz");
        for (linha = 0; linha < 10; linha++) {
            media = 0; // Reinicializa a média para cada aluno
            for (coluna = 0; coluna < 3; coluna++) {

                // Solicita ao usuário que insira a nota de cada aluno para cada disciplina
                String input = JOptionPane.showInputDialog("Digite a nota " + (coluna + 1) + " do aluno " + (linha + 1));

                // Converte a entrada do usuário em um valor double e armazena na matriz
                notas[linha][coluna] = Double.parseDouble(input);

                // Soma as notas para calcular a média do aluno
                media += notas[linha][coluna];
            }
            // Calcula e armazena a média do aluno na última coluna da matriz
            notas[linha][3] = media / 3;
        }

        // Saída de dados

        JOptionPane.showMessageDialog(null, "Mostrando as menções");
        // Loop para exibir as notas e médias dos alunos
        for (linha = 0; linha < 10; linha++) {
            String notasAluno = ""; // String para armazenar as notas do aluno

            // Loop para montar a string com as notas e a média do aluno
            for (coluna = 0; coluna < 3; coluna++) {

                // Adiciona cada nota à string notasAluno
                notasAluno += "Nota " + (coluna + 1) + ": " + notas[linha][coluna] + "\n";
            }
            // Adiciona a média à string notasAluno
            notasAluno += "Média: " + notas[linha][3];
            
            // Exibe as notas e a média do aluno em uma caixa de diálogo
            JOptionPane.showMessageDialog(null, "Aluno " + (linha + 1) + "\n" + notasAluno);
        }
    }
}
