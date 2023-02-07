package com.uml;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instanciando os objetos
		Pessoa usuario = new Pessoa(92211);
		
		//Declarando variaveis
		String valorAltura;
		String valorPeso;
		
			Object[]opcoes = {"Consulta dados", "Consulta IMC", "Sair" };
			Object opcao;
			
			Object[]continuar = {"Continuar", "Sair"};
			Object desejaContinuar;
			
			usuario.setNome(JOptionPane.showInputDialog("Informe seu nome: "));
			usuario.setEmail(JOptionPane.showInputDialog("Infome seu email: "));
			usuario.setProfissao(JOptionPane.showInputDialog("Informe sua profissão: "));
			
			opcao = JOptionPane.showInputDialog(null, "O que deseja fazer?" , null,     JOptionPane.INFORMATION_MESSAGE, null, opcoes,opcoes[0]);
			
	if(opcao == "Consulta dados")

	{ 	
		do {
			
			JOptionPane.showMessageDialog(null, "Nome do cliente: " + usuario.getNome() + "\nID do cliente: " + usuario.getIdPessoa() + "\nEmail: " + usuario.getEmail() + "\nProfissão: " + usuario.getProfissao());
			
			desejaContinuar = JOptionPane.showInputDialog(null, "Continuar? ","Continuar" , JOptionPane.INFORMATION_MESSAGE, null, continuar, continuar[0]);
		
		}while(desejaContinuar == "Continuar" );
		
		opcao = JOptionPane.showInputDialog(null, "O que deseja fazer?" , null,     JOptionPane.INFORMATION_MESSAGE, null, opcoes,opcoes[0]);

		}if(opcao == "Consulta IMC"){
		
		do {
			
			valorAltura = JOptionPane.showInputDialog("Informe altura (em metros): ");
			valorPeso = JOptionPane.showInputDialog("Informe o peso (em Kg): ");
			
			valorAltura = valorAltura.replace(",",".");
			valorPeso = valorPeso.replace(",", ".");
			
			JOptionPane.showMessageDialog(null, "IMC: " + String.format("%.2f", usuario.calcularImc(Double.parseDouble(valorPeso), Double.parseDouble(valorAltura))) + ".\n" + usuario.exibirDiagnostico());
			
		desejaContinuar = JOptionPane.showInputDialog(null, "Continuar? ","Continuar" , JOptionPane.INFORMATION_MESSAGE, null, continuar, continuar[0]);
		
		}while(desejaContinuar == "Continuar");{
		
		opcao = JOptionPane.showInputDialog(null, "O que deseja fazer?" , null,     JOptionPane.INFORMATION_MESSAGE, null, opcoes,opcoes[0]);
		 	}
	 
		}else
		JOptionPane.showMessageDialog(null, "Obrigado por utilizar esse programa.");
		
   }
}	