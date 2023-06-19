package Trab2_LP3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JogoDaForca extends JFrame {
    private String palavraSecreta = "java"; // Palavra secreta de 5 letras
    private int tentativas = 6; // Número de tentativas
    
    private char[] palavraAdivinhada;
    private JLabel palavraLabel;
    private JLabel tentativasLabel;
    
    public JogoDaForca() {
        setTitle("Jogo da Forca");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new BorderLayout());
        
        palavraAdivinhada = new char[palavraSecreta.length()];
        for (int i = 0; i < palavraAdivinhada.length; i++) {
            palavraAdivinhada[i] = '_'; // Inicializa a palavra adivinhada com underline
        }
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));
        
        palavraLabel = new JLabel();
        tentativasLabel = new JLabel();
        JButton button = new JButton("Adivinhar");
        
        panel.add(palavraLabel);
        panel.add(tentativasLabel);
        panel.add(button);
        
        add(panel, BorderLayout.CENTER);
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char letra = JOptionPane.showInputDialog(null, "Digite uma letra:").charAt(0);
                
                boolean letraAdivinhada = false;
                
                for (int i = 0; i < palavraSecreta.length(); i++) {
                    if (palavraSecreta.charAt(i) == letra) {
                        palavraAdivinhada[i] = letra;
                        letraAdivinhada = true;
                    }
                }
                
                if (!letraAdivinhada) {
                    tentativas--;
                    JOptionPane.showMessageDialog(null, "Letra incorreta!");
                }
                
                atualizarInterface();
                
                if (tentativas == 0) {
                    jogoAcabou("Você perdeu! A palavra era: " + palavraSecreta);
                }
                
                if (String.valueOf(palavraAdivinhada).equals(palavraSecreta)) {
                    jogoAcabou("Parabéns! Você acertou a palavra: " + palavraSecreta);
                }
            }
        });
        
        atualizarInterface();
        
        setVisible(true);
    }
    
    private void atualizarInterface() {
        palavraLabel.setText("Palavra: " + String.valueOf(palavraAdivinhada));
        tentativasLabel.setText("Tentativas restantes: " + tentativas);
    }
    
    private void jogoAcabou(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
        dispose();
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new JogoDaForca();
            }
        });
    }
    
}
