package br.com.empresa.gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameRetangulo {
	
	public void  criarTela() {
		
		//** CONSTRUIR TELA
		JFrame tela = new JFrame();
		tela.setTitle("Calculos com Ret�ngulo");
		tela.setSize(600, 400);
		tela.setDefaultCloseOperation(3);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		
		//**construir um JLbabel
		JLabel labelAltura = new JLabel();
		labelAltura.setText("Altura:");
		labelAltura.setBounds(10, 10, 60, 30);
		
		
		JTextField textAltura = new JTextField();
		textAltura.setBounds(50, 10, 50, 30);
		
		tela.getContentPane().add(labelAltura);
		tela.getContentPane().add(textAltura);
		
		
		
		
		
		tela.setVisible(true);
		
	}

}