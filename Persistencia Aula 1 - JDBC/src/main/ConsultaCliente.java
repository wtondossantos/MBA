package main;

import javax.swing.JOptionPane;

import dao.ClienteDao;
import entity.Cliente;

public class ConsultaCliente {

	public static void main(String[] args) {
		ClienteDao clienteDao = new ClienteDao();
		Cliente cliente = new Cliente();
		
		try {
			String id = JOptionPane.showInputDialog("Digite o id do cliente para busca-lo.");
			
			cliente = clienteDao.buscarCliente(new Integer(id)); 
			String retorno = "Nome: " + cliente.getNome() + ", Email: " + cliente.getEmail();
			
			JOptionPane.showMessageDialog(null, retorno);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
