package br.com.empresa.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.com.empresa.model.Retangulo;

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
		tela.getContentPane().add(labelAltura);
		
		JTextField textAltura = new JTextField();
		textAltura.setBounds(50, 10, 50, 30);
		tela.getContentPane().add(textAltura);
		
		//*construir um jlbabel para base
		JLabel labelBase = new JLabel();
		labelBase.setText("Base:");
		labelBase.setBounds(10, 50, 50, 30);
		tela.getContentPane().add(labelBase);
		JTextField textBase = new JTextField();
		textBase.setBounds(50,50,50,30);
		tela.getContentPane().add(textBase);
		
		//*calcular
		JButton btnCalcular = new JButton();
		btnCalcular.setText("Calcular");
		btnCalcular.setBounds(10,90,110,30);
		tela.getContentPane().add(btnCalcular);
		
		//*limpar
		JButton btnLimpar = new JButton();
		btnLimpar.setText("Limpar");
		btnLimpar.setBounds(10,130,110,30);
		tela.getContentPane().add(btnLimpar);
		
		//�rea 
		
		JLabel labelArea = new JLabel();
		labelArea.setText("Altura:");
		labelArea.setBounds(170, 10, 120, 30);
		tela.getContentPane().add(labelArea);
		
		JTextField textArea = new JTextField();
		textArea.setBounds(240, 10, 100, 30);
		tela.getContentPane().add(textArea);
		
		
		//*Perimetro
		JLabel labelPerimetro = new JLabel();
		labelPerimetro.setText ("Perimetro:");
		labelPerimetro.setBounds(170, 50, 120, 30);
		tela.getContentPane().add(labelPerimetro);
		
		JTextField textPerimetro = new JTextField();
		textPerimetro.setBounds(240, 50, 100, 30);
		tela.getContentPane().add(textPerimetro);
		
		
		tela.setVisible(true);
		
		

		//**
		btnCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
							
				Retangulo r1 = new Retangulo(); 
				r1.setAltura(Double.parseDouble(textAltura.getText()));
				r1.setBase(Double.parseDouble(textBase.getText())); 
				
				labelArea.setText("�rea:               " + String.valueOf(r1.calculaArea())); 
				labelPerimetro.setText("Per�metro:     " + String.valueOf(r1.calculaPerimetro())); 
				
				}
		});
		
	}

}
