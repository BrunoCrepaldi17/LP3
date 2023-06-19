/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
                    if (indice != -1) {
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
            primeiraEscolha = -1;
            segundaEscolha = -1;
            verificarFimJogo();
        } else {
            JOptionPane.showMessageDialog(null, "Errou!");
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    botoes[primeiraEscolha].setText("");
                    botoes[primeiraEscolha].setEnabled(true);
                    botoes[segundaEscolha].setText("");
                    botoes[segundaEscolha].setEnabled(true);
                    primeiraEscolha = -1;
                    segundaEscolha = -1;
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
            JOptionPane.showMessageDialog(null, "Parabéns, você venceu!");
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
