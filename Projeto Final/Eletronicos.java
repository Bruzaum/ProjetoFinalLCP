public class Eletronicos extends Produtos {
    int id;
    String descricao;
    String voltagem;
    String garantia;
    String conteudo;

    void setID(int id){
        this.id = id;
    }

    void setDescricao(String descricao){
		this.descricao = descricao;
	}

    void setVoltagem(String voltagem){
		this.voltagem = voltagem;
	}

    void setGarantia(String garantia){
		this.garantia = garantia;
	}

    void setConteudo(String conteudo){
		this.conteudo = conteudo;
	}

    int getID() {
        return this.id;
    }

    String getDescricao() {
		return this.descricao;
	}

    String getVoltagem() {
		return this.voltagem;
	}

    String getGarantia() {
		return this.garantia;
	}

    String getConteudo() {
		return this.conteudo;
	}
}
