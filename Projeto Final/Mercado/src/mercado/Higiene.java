package mercado;

import java.util.ArrayList;
import java.util.List;


public class Higiene extends Produtos {
    String dataVencimento;
    String recomendacaoUso;


    public void setVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
    
    public void setRecomendacao(String recomendacaoUso) {
        this.recomendacaoUso = recomendacaoUso;
    }
    
    public Higiene(int id, String categoria, String codigo, String marca, String nome, String foto, double valor, int quantidadeEstoque, String dataVencimento, String recomendacaoUso)
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
        setRecomendacao(recomendacaoUso);
    }

    public String getVencimento() {
        return this.dataVencimento;
    }

    public String getRecomendacao() {
        return this.recomendacaoUso;
    }

    public static void main(String[] args) {
        List<Higiene> higiene = new ArrayList<Higiene>(); 
        
        Higiene desodorante = new Higiene(1, "Higiene Pessoal", "127837131", "Rexona", "Desodorante Antitranspirante Aerosol Rexona Men V8 150ml", "/assets/desodorante.jpg", 11.98, 10, "22/02/2024", "Aplicar aerosol na axila, com pelo menos 10cm de distância");
        Higiene shampoo = new Higiene(2, "Higiene Pessoal", "124569506", "Clear", "Shampoo Clear Anticaspa Men Limpeza Diária 2 em 1 200ml", "/assets/shampoo.jpg", 32.57, 3, "22/05/2023", "Limpeza Diária");
        Higiene papelHigienico = new Higiene(3, "Higiene Pessoal", "12825946", "Neve", "Papel higienico neve folha dupla com toque da seda pacote compacto com leve 12", "/assets/papelH.jpg", 25.6, 5, "25/12/2022", "Folha Dupla");
        Higiene cotonete = new Higiene(4, "Higiene Pessoal", "4829261421", "Johnson&Johnson", "Haste flexivel cotton line com 75 unidades caixa cotonete", "/assets/cotonete.jpg", 3.49, 10, "22/06/2022", "Aplicar a haste no ouvido com delicadeza");
        Higiene amaciante = new Higiene(5, "Limpeza", "122531192", "Downy", "Amaciante Concentrado Downy Lírios do Campo - 1L", "/assets/amaciante.jpg", 33.09, 12, "22/05/2023", "Aplicar 1 tampa por lavagem");
        Higiene detergente = new Higiene(6, "Limpeza", "9787812", "YPE", "Detergente Líquido YPÊ Neutro de 500ml", "/assets/detergente.jpg", 3.44, 30, "22/02/2024", " ");

        higiene.add(desodorante);
        higiene.add(shampoo);
        higiene.add(papelHigienico);
        higiene.add(cotonete);
        higiene.add(amaciante);
        higiene.add(detergente);
    }
}
