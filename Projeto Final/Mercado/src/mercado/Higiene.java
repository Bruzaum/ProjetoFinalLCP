package mercado;

import java.util.ArrayList;
import java.util.List;


public class Higiene extends Produtos {
    String dataVencimento;
    String recomendacaoUso;


    public void setVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
    
    public void setRecomendacao(String recomendacaoUso) {
        this.recomendacaoUso = recomendacaoUso;
    }
    
    public Higiene(int id, String categoria, String codigo, String marca, String nome, String foto, double valor, int quantidadeEstoque, String dataVencimento, String recomendacaoUso)
    {
        setID(id);
        setCategoria(categoria);
        setCodigo(codigo);
        setMarca(marca);
        setNome(nome);
        setFoto(foto);
        setValor(valor);
        setQtdEstoque(quantidadeEstoque);
        setVencimento(dataVencimento);
        setRecomendacao(recomendacaoUso);
    }

    public String getVencimento() {
        return this.dataVencimento;
    }

    public String getRecomendacao() {
        return this.recomendacaoUso;
    }

    public static void main(String[] args) {
    
    }
}
