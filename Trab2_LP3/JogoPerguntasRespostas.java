
package Trab2_LP3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JogoPerguntasRespostas extends JFrame {
    private JLabel perguntaLabel;
    private JRadioButton[] alternativas;
    private JButton proximaButton;
    private int perguntaAtual = 0;
    private int acertos = 0;
    private String[] perguntas = {
        "Qual é a capital da França?",
        "Qual é a cor do céu em um dia ensolarado?",
        "Quantos dias tem um ano bissexto?",
        "Quem pintou a Mona Lisa?",
        "Qual é o maior planeta do sistema solar?"
    };
    private String[] respostasCorretas = {
        "C",
        "B",
        "D",
        "A",
        "D"
    };
    private String[][] alternativasPerguntas = {
        {"A) Londres", "B) Roma", "C) Paris", "D) Berlim"},
        {"A) Amarelo", "B) Azul", "C) Verde", "D) Vermelho"},
        {"A) 364", "B) 365", "C) 367", "D) 366"},
        {"A) Leonardo da Vinci", "B) Pablo Picasso", "C) Vincent van Gogh", "D) Michelangelo"},
        {"A) Terra", "B) Saturno", "C) Marte", "D) Júpiter"}
    };

    public JogoPerguntasRespostas() {
        setTitle("Jogo de Perguntas e Respostas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BorderLayout());

        perguntaLabel = new JLabel(perguntas[perguntaAtual]);
        perguntaLabel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
        add(perguntaLabel, BorderLayout.NORTH);

        JPanel alternativasPanel = new JPanel();
        alternativasPanel.setLayout(new GridLayout(4, 1));

        alternativas = new JRadioButton[4];
        ButtonGroup group = new ButtonGroup();
        for (int i = 0; i < 4; i++) {
            JRadioButton radioButton = new JRadioButton(alternativasPerguntas[perguntaAtual][i]);
            alternativas[i] = radioButton;
            group.add(radioButton);
            alternativasPanel.add(radioButton);
        }
        add(alternativasPanel, BorderLayout.CENTER);

        proximaButton = new JButton("Próxima");
        proximaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verificarResposta();
                proximaPergunta();
            }
        });
        add(proximaButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void verificarResposta() {
        for (int i = 0; i < 4; i++) {
            if (alternativas[i].isSelected() && respostasCorretas[perguntaAtual].equals(getAlternativaCorrespondente(i))) {
                acertos++;
            }
        }
    }

    private void proximaPergunta() {
        perguntaAtual++;
        if (perguntaAtual < perguntas.length) {
            perguntaLabel.setText(perguntas[perguntaAtual]);
            for (int i = 0; i < 4; i++) {
                alternativas[i].setText(alternativasPerguntas[perguntaAtual][i]);
                alternativas[i].setSelected(false);
            }
        } else {
            exibirResultado();
        }
    }

    private String getAlternativaCorrespondente(int indice) {
        switch (indice) {
            case 0:
                return "A";
            case 1:
                return "B";
            case 2:
                return "C";
            case 3:
                return "D";
            default:
                return "";
        }
    }

    private void exibirResultado() {
        String mensagem = "Jogo finalizado!\n";
        mensagem += "Número de acertos: " + acertos + "/" + perguntas.length + "\n";
        for (int i = 0; i < perguntas.length; i++) {
            mensagem += "Pergunta " + (i + 1) + ": Resposta correta - " + respostasCorretas[i] + "\n";
        }
        JOptionPane.showMessageDialog(this, mensagem);
        System.exit(0);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new JogoPerguntasRespostas();
            }
        });
    }
}
