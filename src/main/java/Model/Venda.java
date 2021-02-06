package Model;

import java.math.BigDecimal;

public class Venda {
	private Long pperacao;
	private Long cliente;
	private Integer quantidadeIngressos;
	private BigDecimal valorTotal;
	private String status;	

	public Venda(Long pperacao, Long cliente, Integer quantidadeIngressos, BigDecimal valorTotal) {
		super();
		this.pperacao = pperacao;
		this.cliente = cliente;
		this.quantidadeIngressos = quantidadeIngressos;
		this.valorTotal = valorTotal;		
	}
	
	public Venda() {
		
	}

	public Long getPperacao() {
		return pperacao;
	}
	
	public void setPperacao(Long pperacao) {
		this.pperacao = pperacao;
	}
	
	public Long getCliente() {
		return cliente;
	}
	
	public void setCliente(Long cliente) {
		this.cliente = cliente;
	}
	
	public Integer getQuantidadeIngressos() {
		return quantidadeIngressos;
	}
	
	public void setQuantidadeIngressos(Integer quantidadeIngressos) {
		this.quantidadeIngressos = quantidadeIngressos;
	}
	
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	 
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "venda [pperacao=" + pperacao + ", cliente=" + cliente + ", quantidadeIngressos=" + quantidadeIngressos
				+ ", valorTotal=" + valorTotal + ", status=" + status + "]";
	}
}
