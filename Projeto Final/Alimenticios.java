import java.sql.Date;

public class Alimenticios extends Produtos {
    int id;
    Date dataVencimento;
    Date dataPreparacao;

    /*
    void setID(int id) {
        this.id = id;
    }
     */

    void setVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
    
    void setPreparacao(Date dataPreparacao) {
        this.dataPreparacao = dataPreparacao;
    }

    /* 
    int getID() {
        return this.id;
    }
    */

    Date getVencimento() {
        return this.dataVencimento;
    }

    Date getPreparacao() {
        return this.dataPreparacao;
    }

    public static void main(String[] args) {
        Alimenticios arroz = new Alimenticios();
        arroz.setID(11);
        arroz.setCategoria("Alimentos Básicos");
        arroz.setCodigo("247551939");
        arroz.setMarca("Divina Mesa");
        arroz.setNome("Arroz Branco Divina Mesa 5kg Pacote");
        arroz.setFoto("x");
        arroz.setValor(32.39);
        arroz.setQtdEstoque(8);
        
        // Preciso ver como inserir um tipo Date ou podemos utilizar o tipo String msm

        Alimenticios banana = new Alimenticios();
        banana.setID(12);
        banana.setCategoria("Fruta");
        banana.setCodigo("456950621");
        banana.setMarca("Carrefour");
        banana.setNome("Banana Nanica");
        banana.setFoto("x");
        banana.setValor(4.05);
        banana.setQtdEstoque(10);

        Alimenticios chocolate = new Alimenticios();
        chocolate.setID(13);
        chocolate.setCategoria("Doce");
        chocolate.setCodigo("4352954115");
        chocolate.setMarca("Lacta");
        chocolate.setNome("Chocolate barra lacta diamante negro 90G");
        chocolate.setFoto("x");
        chocolate.setValor(7.49);
        chocolate.setQtdEstoque(20);

        Alimenticios feijao = new Alimenticios();
        feijao.setID(14);
        feijao.setCategoria("Alimentos Básicos");
        feijao.setCodigo("2568397645");
        feijao.setMarca("Kicaldo");
        feijao.setNome("Feijao carioca 1KG kicaldo");
        feijao.setFoto("x");
        feijao.setValor(12.29);
        feijao.setQtdEstoque(13);
        
        Alimenticios maca = new Alimenticios();
        maca.setID(15);
        maca.setCategoria("Fruta");
        maca.setCodigo("456621950");
        maca.setMarca("Carrefour");
        maca.setNome("Maçã Gala");
        maca.setFoto("x");
        maca.setValor(4.79);
        maca.setQtdEstoque(25);

        Alimenticios biscoito = new Alimenticios();
        biscoito.setID(16);
        biscoito.setCategoria("Doce");
        biscoito.setCodigo("4913278779");
        biscoito.setMarca("Toddy");
        biscoito.setNome("Biscoito Toddy sabor baunilha tamanho 57g");
        biscoito.setFoto("x");
        biscoito.setValor(3.99);
        biscoito.setQtdEstoque(5);

        Alimenticios limao = new Alimenticios();
        limao.setID(17);
        limao.setCategoria("Fruta");
        limao.setCodigo("469505961");
        limao.setMarca("Carrefour");
        limao.setNome("Limão Tahiti");
        limao.setFoto("x");
        limao.setValor(1.79);
        limao.setQtdEstoque(30);
    }

}
