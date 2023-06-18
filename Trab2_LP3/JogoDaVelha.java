
package Trab2_LP3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JogoDaVelha extends JFrame {
    private JButton[] botoes;
    private boolean jogador1Vez = true; // Flag para controlar a vez dos jogadores
    private int[] tabuleiro; // Representação do tabuleiro do jogo
    private int vitoriasJogador1 = 0;
    private int vitoriasJogador2 = 0;
    private int empates = 0;
    private JLabel labelVitoriasJogador1;
    private JLabel labelVitoriasJogador2;
    private JLabel labelEmpates;

    public JogoDaVelha() {
        setTitle("Jogo da Velha");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 450);
        setLayout(new GridLayout(4, 3));

        tabuleiro = new int[9];
        botoes = new JButton[9];

        for (int i = 0; i < 9; i++) {
            JButton button = new JButton();
            button.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 48));
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton source = (JButton) e.getSource();

                    int indice = -1;
                    for (int j = 0; j < 9; j++) {
                        if (source == botoes[j]) {
                            indice = j;
                            break;
                        }
                    }

                    if (tabuleiro[indice] == 0) {
                        if (jogador1Vez) {
                            source.setText("X");
                            tabuleiro[indice] = 1;
                        } else {
                            source.setText("O");
                            tabuleiro[indice] = 2;
                        }

                        jogador1Vez = !jogador1Vez;

                        verificarVitoria();
                    }
                }
            });

            botoes[i] = button;
            add(button);
        }

        labelVitoriasJogador1 = new JLabel("Vitórias Jogador 1 (X): 0");
        add(labelVitoriasJogador1);
        labelVitoriasJogador2 = new JLabel("Vitórias Jogador 2 (O): 0");
        add(labelVitoriasJogador2);
        labelEmpates = new JLabel("Empates: 0");
        add(labelEmpates);

        setVisible(true);
    }

    private void verificarVitoria() {
        int[][] combinacoesVitoria = {
                {0, 1, 2}, {3, 4, 5}, {6, 7, 8}, // linhas
                {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, // colunas
                {0, 4, 8}, {2, 4, 6} // diagonais
        };

        for (int[] combinacao : combinacoesVitoria) {
            int posicao1 = combinacao[0];
            int posicao2 = combinacao[1];
            int posicao3 = combinacao[2];

            if (tabuleiro[posicao1] != 0 &&
                    tabuleiro[posicao1] == tabuleiro[posicao2] &&
                    tabuleiro[posicao1] == tabuleiro[posicao3]) {
                String vencedor = (tabuleiro[posicao1] == 1) ? "Jogador 1 (X)" : "Jogador 2 (O)";
                JOptionPane.showMessageDialog(null, vencedor + " venceu o jogo!");

                if (tabuleiro[posicao1] == 1) {
                    vitoriasJogador1++;
                    labelVitoriasJogador1.setText("Vitórias Jogador 1: " + vitoriasJogador1);
                } else {
                    vitoriasJogador2++;
                    labelVitoriasJogador2.setText("Vitórias Jogador 2: " + vitoriasJogador2);
                }

                reiniciarJogo();
                return;
            }
        }

        boolean tabuleiroCompleto = true;
        for (int i = 0; i < 9; i++) {
            if (tabuleiro[i] == 0) {
                tabuleiroCompleto = false;
                break;
            }
        }

        if (tabuleiroCompleto) {
            JOptionPane.showMessageDialog(null, "Empate!");
            empates++;
            labelEmpates.setText("Empates: " + empates);
            reiniciarJogo();
        }
    }

    private void reiniciarJogo() {
        for (int i = 0; i < 9; i++) {
            botoes[i].setText("");
            tabuleiro[i] = 0;
        }

        jogador1Vez = true;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new JogoDaVelha();
            }
        });
    }
}
