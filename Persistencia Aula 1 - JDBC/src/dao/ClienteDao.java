package dao;

import java.util.ArrayList;
import java.util.List;

import entity.Cliente;

public class ClienteDao extends Dao{
	public void incluirCliente(Cliente cliente) throws Exception{
		try{
			abrirConexao();
			
			String sql = "insert cliente (nome,email) values(?,?)";
			stmt = cn.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getEmail());
			stmt.executeUpdate();//retorna o número de registros afetados
			
		}catch(Exception ex){
			throw ex;
		}finally{
			fecharConexao();
		}
	}
	public Cliente buscarCliente(int id) throws Exception{
		Cliente cliente = null;
		
		try{
			abrirConexao();
			
			String sql = "select * from cliente where id = ?";
			stmt = cn.prepareStatement(sql);
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			
			if(rs.next()){
				cliente = new Cliente();
				cliente.setId(id);
				cliente.setNome(rs.getString("nome"));
				cliente.setEmail(rs.getString("email"));
			}
			
		}catch(Exception ex){
			throw ex;
		}finally{
			fecharConexao();
		}
		
		return cliente;
	}
	
	public List<Cliente> buscarCliente() throws Exception{
		List<Cliente> cliente = new ArrayList<Cliente>();
		
		try{
			String sql = "select * from cliente";
			stmt = cn.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next()){
				Cliente c = new Cliente();
				c.setId(rs.getInt("id"));
				c.setNome(rs.getString("nome"));
				c.setEmail(rs.getString("email"));
				cliente.add(c);
			}
			
		}catch(Exception ex){
			throw ex;
		}finally{
			fecharConexao();
		}
		return cliente;
	}
}
