package mercado;

import java.util.ArrayList;
import java.util.List;
import mercado.Alimenticios;
import mercado.Eletronicos;
import mercado.Higiene;
import mercado.Produtos;

public class Mercado {
    int id;
    String nome;
    String localizacao;
    int vendas;
    float faturamento;

    public void setID(int id){
        this.id = id;
    }

    public void setNome(String nome){
		this.nome = nome;
	}

    public void setLocalizacao(String localizacao){
		this.localizacao = localizacao;
	}

    public void setVendas(int vendas){
        this.vendas = vendas;
    }

    public void setFat(float faturamento){
        this.faturamento = faturamento;
    }

    public int getID() {
        return this.id;
    }
    
    public String getNome() {
		return this.nome;
	}

    public String getLocalizacao() {
		return this.localizacao;
	}

    public int getVendas() {
        return this.vendas;
    }

    public float getFat(){
        return this.faturamento;
    }
    
    public Mercado(int id, float faturamento, String local, String nome, int venda){
        setFat(faturamento);
        setID(id);
        setLocalizacao(local);
        setNome(nome);
        setVendas(venda);
    }
    
    public static void main(String[] args) {
               
    }

}