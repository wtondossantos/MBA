package entity;
import java.io.Serializable;
import java.util.List;

public class Cliente implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String nome,
		email;
	private List<Pedido> pedidos;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
	@Override
	public String toString(){
		return this.getNome();
	}
}
