public class Usuario {

    int id;
    String nome;
    float orcamento;

    void setID(int id){
        this.id = id;
    }

    void setNome(String nome){
		this.nome = nome;
	}

    void setOrcamento(float orcamento) {
        this.orcamento = orcamento;
    }


    int getID() {
        return this.id;
    }

    String getNome() {
		return this.nome;
	}

    float getOrcamento(){
        return this.orcamento;
    }
    
}
