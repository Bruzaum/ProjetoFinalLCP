public class Mercado {
    int id;
    String nome;
    String localizacao;
    int vendas;
    float faturamento;

    void setID(int id){
        this.id = id;
    }

    void setNome(String nome){
		this.nome = nome;
	}

    void setLocalizacao(String localizacao){
		this.localizacao = localizacao;
	}

    void setVendas(int vendas){
        this.vendas = vendas;
    }

    void setFat(float faturamento){
        this.faturamento = faturamento;
    }

    int getID() {
        return this.id;
    }
    
    String getNome() {
		return this.nome;
	}

    String getLocalizacao() {
		return this.localizacao;
	}

    int getVendas() {
        return this.vendas;
    }

    float getFat(){
        return this.faturamento;
    }

}