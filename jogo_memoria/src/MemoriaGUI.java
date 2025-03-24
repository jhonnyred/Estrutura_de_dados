import javax.swing.*;
import java.awt.*;

public class MemoriaGUI extends JFrame{
    public MemoriaGUI(){
        setTitle("Jogo da Memória\n (Genius com mais botão)");
        setSize(1280, 720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());


        // Painel superior
        JPanel topPanel = new JPanel(new BorderLayout());

        // Painel esquerdo 
        JPanel lefPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JButton startButton = new JButton("Iniciar");
        // startButton.addActionListener(e -> startGame());
        lefPanel.add(startButton);


        // painel direito
        JPanel rightPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JLabel pontuacaoLabel = new JLabel("Pontuação: 0");
        JLabel rodadaLabel = new JLabel("Rodada: 1");
        JTextField nomeJogador = new JTextField(15);
        JComboBox dificuldadeCombo = new JComboBox<>(new String[] {"Facil", "Medio", "Dificil"});

        rightPanel.add(pontuacaoLabel);
        rightPanel.add(rodadaLabel);
        rightPanel.add(nomeJogador);
        rightPanel.add(dificuldadeCombo);

        // concatenando painéis
        topPanel.add(lefPanel, BorderLayout.WEST);
        topPanel.add(rightPanel, BorderLayout.EAST);

        add(topPanel, BorderLayout.NORTH);
        

        // Botõeses
        JPanel buttonPanel = new JPanel(new GridLayout(3, 3));
        JButton[] buttons = new JButton[9];
        for(int i=0; i<9; i++){
            buttons[i] = new JButton();
            buttons[i].setBackground(Color.GRAY);
            buttonPanel.add(buttons[i]);
            
        }
        add(buttonPanel, BorderLayout.CENTER);

        // Pontuação
        JPanel pointsPanel = new JPanel();
       pointsPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
       JTextArea listapontuacao = new JTextArea(10, 20);
       listapontuacao.setEditable(false);
       pointsPanel.add(new JScrollPane(listapontuacao));

       add(pointsPanel, BorderLayout.EAST);

    }
}