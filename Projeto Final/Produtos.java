public class Produtos {
    int id;
    String categoria;
    String codigo;
    String nome;
    float valor;
    String marca;
    String foto;
    int quantidadeEstoque;

    void setID(int id){
        this.id = id;
    }

    void setCategoria(String categoria){
		this.categoria = categoria;
	}

    void setCodigo(String codigo){
		this.codigo = codigo;
	}

    void setNome(String nome){
		this.nome = nome;
	}

    void setValor(float valor) {
        this.valor = valor;
    }

    void setMarca(String marca){
        this.marca = marca;
    }
    
    void setFoto(String foto){
        this.foto = foto;
    }

    void setQtdEstoque(int quantidadeEstoque){
        this.quantidadeEstoque = quantidadeEstoque;
    }

    int getID() {
        return this.id;
    }

    String getCategoria() {
		return this.categoria;
	}

    String getCodigo() {
		return this.codigo;
	}
    
    String getNome() {
		return this.nome;
	}

    float getValor(){
        return this.valor;
    }

    String getMarca() {
		return this.marca;
	}
    
    String getFoto() {
		return this.foto;
	}

    int getQtdEstoque() {
        return this.quantidadeEstoque;
    }

    
}
