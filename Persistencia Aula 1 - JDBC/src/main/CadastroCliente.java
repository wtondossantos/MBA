package main;

import javax.swing.JOptionPane;

import dao.ClienteDao;
import entity.Cliente;

public class CadastroCliente {

	public static void main(String[] args) {
		
		ClienteDao clienteDao = new ClienteDao();
		Cliente cliente = new Cliente();
		
		String nome = JOptionPane.showInputDialog("Digite um nome:");
		String email = JOptionPane.showInputDialog("Digite um e-mail:");
		
		cliente.setNome(nome);
		cliente.setEmail(email);
		
		try {
			clienteDao.incluirCliente(cliente);
			JOptionPane.showMessageDialog(null, "Cliente Inserido com sucesso!");
			
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}
	}

}
