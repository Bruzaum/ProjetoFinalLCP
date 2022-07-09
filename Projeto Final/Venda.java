import java.util.List;

public class Venda {
    int id;
    String nomeUsuario;
    List codigoProdutos;
    List quantidadeComprada;

    void setID(int id) {
        this.id = id;
    }

    void setNomeUsu(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    void setCodigoProdutos(List codigoProdutos) {
        this.codigoProdutos = codigoProdutos;
    }

    void setQtdComprada(List quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

    int getID() {
        return this.id;
    }

    String getNomeUsu() {
        return this.nomeUsuario;
    }

    List getCodigoProdutos() {
        return this.codigoProdutos;
    }

    List getQtdComprada() {
        return this.quantidadeComprada;
    }
}
