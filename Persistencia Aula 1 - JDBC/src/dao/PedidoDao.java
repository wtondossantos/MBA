package dao;

import java.util.ArrayList;
import java.util.List;
import entity.Pedido;

public class PedidoDao extends Dao{
	public void incluirPedido(Pedido pedido) throws Exception{
		try{
			abrirConexao();
			
			String sql = "insert pedido (idcliente,data,descricao,valor) values(?,?,?,?)";
			stmt = cn.prepareStatement(sql);
			stmt.setInt(1, pedido.getIdCliente());
			stmt.setDate(2, new java.sql.Date(pedido.getData().getTime()));
			stmt.setString(3, pedido.getDescricao());
			stmt.setDouble(4, pedido.getValor());
			stmt.executeUpdate();//retorna o número de registros afetados
			
		}catch(Exception ex){
			throw ex;
		}finally{
			fecharConexao();
		}
	}
	public List<Pedido> buscarPedido(int id) throws Exception{
		List<Pedido> pedido = new ArrayList<Pedido>();
		
		try{
			String sql = "select * from cliente";
			stmt = cn.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next()){
				Pedido p = new Pedido();
				p.setId(rs.getInt("id"));
				p.setId(rs.getInt("idcliente"));
				p.setData(rs.getDate("data"));
				p.setDescricao(rs.getString("descricao"));
				p.setValor(rs.getDouble("valor"));
				pedido.add(p);
			}
			
		}catch(Exception ex){
			throw ex;
		}finally{
			fecharConexao();
		}
		return pedido;
	}

}
