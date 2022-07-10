import java.sql.Date;

public class Higiene extends Produtos {
    //int id;
    Date dataVencimento;
    String recomendacaoUso;

    /*
    void setID(int id) {
        this.id = id;
    }
    */

    void setVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
    
    void setRecomendacao(String recomendacaoUso) {
        this.recomendacaoUso = recomendacaoUso;
    }

    /*
    int getID() {
        return this.id;
    }
    */

    Date getVencimento() {
        return this.dataVencimento;
    }

    String getRecomendacao() {
        return this.recomendacaoUso;
    }

    public static void main(String[] args) {
        Higiene desodorante = new Higiene();
        desodorante.setID(1);
        desodorante.setCategoria("Higiene Pessoal");
        desodorante.setCodigo("127837131");
        desodorante.setMarca("Rexona");
        desodorante.setNome("Desodorante Antitranspirante Aerosol Rexona Men V8 150ml");
        desodorante.setFoto("x");
        desodorante.setValor(11.98);
        desodorante.setQtdEstoque(10);
        desodorante.setRecomendacao("Aplicar aerosol na axila, com pelo menos 10cm de distância");
        
        // Preciso ver como inserir um tipo Date ou podemos utilizar o tipo String msm
        //produtoHigiene.setVencimento(23/11/2023);

        Higiene shampoo = new Higiene();
        shampoo.setID(2);
        shampoo.setCategoria("Higiene Pessoal");
        shampoo.setCodigo("124569506");
        shampoo.setMarca("Clear");
        shampoo.setNome("Shampoo Clear Anticaspa Men Limpeza Diária 2 em 1 200ml");
        shampoo.setFoto("x");
        shampoo.setValor(32.57);
        shampoo.setQtdEstoque(3);
        shampoo.setRecomendacao("Limpeza Diária");

        Higiene papelHigienico = new Higiene();
        papelHigienico.setID(3);
        papelHigienico.setCategoria("Higiene Pessoal");
        papelHigienico.setCodigo("12825946");
        papelHigienico.setMarca("Neve");
        papelHigienico.setNome("Papel higienico neve folha dupla com toque da seda pacote compacto com leve 12 ");
        papelHigienico.setFoto("x");
        papelHigienico.setValor(25.60);
        papelHigienico.setQtdEstoque(5);
        papelHigienico.setRecomendacao("Folha Dupla");

        Higiene cotonete = new Higiene();
        cotonete.setID(4);
        cotonete.setCategoria("Higiene Pessoal");
        cotonete.setCodigo("4829261421");
        cotonete.setMarca("Cotton line");
        cotonete.setNome("Haste flexivel cotton line com 75 unidades caixa cotonete");
        cotonete.setFoto("x");
        cotonete.setValor(3.49);
        cotonete.setQtdEstoque(10);
        cotonete.setRecomendacao("Aplicar a haste no ouvido com delicadeza");
        
        Higiene amaciante = new Higiene();
        amaciante.setID(5);
        amaciante.setCategoria("Limpeza");
        amaciante.setCodigo("122531192");
        amaciante.setMarca("Downy");
        amaciante.setNome("Amaciante Concentrado Downy Lírios do Campo - 1L");
        amaciante.setFoto("x");
        amaciante.setValor(33.09);
        amaciante.setQtdEstoque(3);
        amaciante.setRecomendacao("Aplicar 1 tampa por lavagem");

        Higiene detergente = new Higiene();
        detergente.setID(6);
        detergente.setCategoria("9787812");
        detergente.setCodigo("12825946");
        detergente.setMarca("YP6E");
        detergente.setNome("Detergente Líquido YPÊ Neutro de 500ml");
        detergente.setFoto("x");
        detergente.setValor(3.44);
        detergente.setQtdEstoque(20);
        detergente.setRecomendacao(" ");
    }
}
