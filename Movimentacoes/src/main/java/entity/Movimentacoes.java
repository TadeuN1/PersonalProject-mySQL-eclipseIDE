package entity;

public class Movimentacoes { 
	private int idmovimentacoes;
	private String descricao;
	private String valor;
	private String tipo;
	private String formapagamento;
	
	public Movimentacoes() {
		super();
	}
	
	
	public int getIdmovimentacoes() {
	  return idmovimentacoes;
	}
	
	public void setIdmovimentacoes(int idmovimentacoes) {
	  this.idmovimentacoes = idmovimentacoes;
	}
	
	public String getDescricao() {
	  return descricao;
	}
	
	public void setDescricao(String descricao) {
	  this.descricao = descricao;
	}
	
	public String getValor() {
	  return valor;
	}
	
	public void setValor(String valor) {
	  this.valor = valor;
	}
	
	public String getTipo() {
	  return tipo;
	}
	
	public void setTipo(String tipo) {
	  this.tipo = tipo;
	}
	
	public String getFormapagamento() {
	  return formapagamento;
	}
	
	public void setFormapagamento(String formapagamento) {
	  this.formapagamento = formapagamento;
	}
		
}

