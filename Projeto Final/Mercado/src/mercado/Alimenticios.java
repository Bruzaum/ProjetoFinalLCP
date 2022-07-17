package mercado;

import java.util.ArrayList;
import java.util.List;

public class Alimenticios extends Produtos {
    String dataVencimento;
    String dataPreparacao;

    public void setVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
    
    public void setPreparacao(String dataPreparacao) {
        this.dataPreparacao = dataPreparacao;
    }

    public Alimenticios(int id, String categoria, String codigo, String marca, String nome, String foto, double valor, int quantidadeEstoque, String dataVencimento, String dataPreparacao)
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
        setPreparacao(dataPreparacao);
    }

    public String getVencimento() {
        return this.dataVencimento;
    }

    public String getPreparacao() {
        return this.dataPreparacao;
    }

    public static void main(String[] args) {
        
    }

}
