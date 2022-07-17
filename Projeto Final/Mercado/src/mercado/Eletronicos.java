package mercado;

import java.util.ArrayList;
import java.util.List;

public class Eletronicos extends Produtos {
    String descricao;
    String voltagem;
    String garantia;
    String conteudo;

  public void setDescricao(String descricao){
		this.descricao = descricao;
	}

  public void setVoltagem(String voltagem){
		this.voltagem = voltagem;
	}

  public void setGarantia(String garantia){
		this.garantia = garantia;
	}

  public void setConteudo(String conteudo){
		this.conteudo = conteudo;
	}

 public Eletronicos(int id, String categoria, String codigo, String marca, String nome, String foto, double valor, int quantidadeEstoque, String descricao, String voltagem, String garantia, String conteudo)
    {
        setID(id);
        setCategoria(categoria);
        setCodigo(codigo);
        setMarca(marca);
        setNome(nome);
        setFoto(foto);
        setValor(valor);
        setQtdEstoque(quantidadeEstoque);
        setDescricao(descricao);
        setVoltagem(voltagem);
        setGarantia(garantia);
        setConteudo(conteudo);
    }

  public String getDescricao() {
		return this.descricao;
	}

  public String getVoltagem() {
		return this.voltagem;
	}

  public String getGarantia() {
		return this.garantia;
	}

  public String getConteudo() {
		return this.conteudo;
	}

  public static void main(String[] args) {
  
  }

}
