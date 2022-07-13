package mercado;

public class Produtos {
    int id;
    String categoria;
    String codigo;
    String nome;
    double valor;
    String marca;
    String foto;
    int quantidadeEstoque;

    public void setID(int id){
        this.id = id;
    }

    public void setCategoria(String categoria){
		this.categoria = categoria;
	}

    public void setCodigo(String codigo){
		this.codigo = codigo;
	}

    public void setNome(String nome){
		this.nome = nome;
	}

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public void setFoto(String foto){
        this.foto = foto;
    }

    public void setQtdEstoque(int quantidadeEstoque){
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getID() {
        return this.id;
    }

    public String getCategoria() {
		return this.categoria;
	}

    public String getCodigo() {
		return this.codigo;
	}
    
    public String getNome() {
		return this.nome;
	}

    public double getValor(){
        return this.valor;
    }

    public String getMarca() {
		return this.marca;
	}
    
    public String getFoto() {
		return this.foto;
	}

    public int getQtdEstoque() {
        return this.quantidadeEstoque;
    }

    
}
