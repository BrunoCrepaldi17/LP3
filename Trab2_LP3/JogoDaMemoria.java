package Trab2_LP3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JogoDaMemoria extends JFrame {
    private List<Integer> numeros;
    private JButton[] botoes;
    private int primeiraEscolha = -1;
    private int segundaEscolha = -1;
    private int paresJogador1 = 0;
    private int paresJogador2 = 0;
    private boolean vezJogador1 = true;

    public JogoDaMemoria() {
        setTitle("Jogo da Memória");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLayout(new GridLayout(4, 4));

        numeros = new ArrayList<>();
        for (int i = 1; i <= 8; i++) {
            numeros.add(i);
            numeros.add(i);
        }
        Collections.shuffle(numeros);

        botoes = new JButton[16];
        for (int i = 0; i < 16; i++) {
            JButton button = new JButton();
            button.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 24));
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton source = (JButton) e.getSource();
                    int indice = -1;
                    for (int j = 0; j < 16; j++) {
                        if (source == botoes[j]) {
                            indice = j;
                            break;
                        }
                    }
                    if (indice != -1 && source.isEnabled()) {
                        if (primeiraEscolha == -1) {
                            primeiraEscolha = indice;
                            source.setText(Integer.toString(numeros.get(indice)));
                            source.setEnabled(false);
                        } else if (segundaEscolha == -1) {
                            segundaEscolha = indice;
                            source.setText(Integer.toString(numeros.get(indice)));
                            source.setEnabled(false);
                            verificarJogada();
                        }
                    }
                }
            });
            botoes[i] = button;
            add(button);
        }

        setVisible(true);
    }

    private void verificarJogada() {
        if (numeros.get(primeiraEscolha).equals(numeros.get(segundaEscolha))) {
            JOptionPane.showMessageDialog(null, "Acertou!");
            if (vezJogador1) {
                paresJogador1++;
            } else {
                paresJogador2++;
            }
            primeiraEscolha = -1;
            segundaEscolha = -1;
            verificarFimJogo();
        } else {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    try {
                        Thread.sleep(1000); // Espera 1 segundo antes de virar as cartas
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    botoes[primeiraEscolha].setText("");
                    botoes[primeiraEscolha].setEnabled(true);
                    botoes[segundaEscolha].setText("");
                    botoes[segundaEscolha].setEnabled(true);
                    primeiraEscolha = -1;
                    segundaEscolha = -1;
                    vezJogador1 = !vezJogador1;
                }
            });
        }
    }

    private void verificarFimJogo() {
        boolean fimJogo = true;
        for (int i = 0; i < 16; i++) {
            if (botoes[i].isEnabled()) {
                fimJogo = false;
                break;
            }
        }
        if (fimJogo) {
            String mensagem = "Jogo finalizado!\n";
            mensagem += "Pares encontrados pelo Jogador 1: " + paresJogador1 + "\n";
            mensagem += "Pares encontrados pelo Jogador 2: " + paresJogador2 + "\n";

            if (paresJogador1 > paresJogador2) {
                mensagem += "Jogador 1 venceu!";
            } else if (paresJogador1 < paresJogador2) {
                mensagem += "Jogador 2 venceu!";
            } else {
                mensagem += "Empate!";
            }

            JOptionPane.showMessageDialog(null, mensagem);
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new JogoDaMemoria();
            }
        });
    }
}
