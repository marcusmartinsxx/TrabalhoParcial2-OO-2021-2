package frames;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class RegisterFrame1 extends JFrame implements ActionListener {

	Container container = getContentPane(); // janela de pessoa
	JLabel nameLabel = new JLabel("Nome");  // estruturar
	JTextField nameText = new JTextField();
	JLabel cpfLabel = new JLabel("CPF");
	JTextField cpfText = new JTextField();
	JLabel rgLabel = new JLabel("RG");
	JTextField rgText = new JTextField();
	JLabel telefoneLabel = new JLabel("Telefone");
	JTextField telefoneText = new JTextField();
	JLabel enderecoLabel = new JLabel("Endereco");
	JTextField enderecoText = new JTextField();
	
	JButton nextButton = new JButton("Proximo");
	JButton backButton = new JButton("Anterior");
	
	RegisterFrame1() {
		setLayoutManager();
		setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
	}
	
	public void setLayoutManager() {
        container.setLayout(null);
    }
	
	public void setLocationAndSize() {
		
	}
	
	public void addComponentsToContainer() {
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
	public void addActionEvent() {
		
	}
	
	public static void main(String[] args) {
		RegisterFrame1 registerFrame1 = new RegisterFrame1(); 
		registerFrame1.setTitle("Cadastro"); 
		registerFrame1.setVisible(false); 
		registerFrame1.setSize(800, 350); 
		registerFrame1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); 
		registerFrame1.setResizable(false);
	}

}
