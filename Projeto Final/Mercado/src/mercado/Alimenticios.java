package mercado;

import java.util.ArrayList;
import java.util.List;

public class Alimenticios extends Produtos {
    String dataVencimento;
    String dataPreparacao;

    public void setVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
    
    public void setPreparacao(String dataPreparacao) {
        this.dataPreparacao = dataPreparacao;
    }

    public Alimenticios(int id, String categoria, String codigo, String marca, String nome, String foto, double valor, int quantidadeEstoque, String dataVencimento, String dataPreparacao)
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
        setPreparacao(dataPreparacao);
    }

    public String getVencimento() {
        return this.dataVencimento;
    }

    public String getPreparacao() {
        return this.dataPreparacao;
    }

    public static void main(String[] args) {
        List<Alimenticios> alimenticios = new ArrayList<Alimenticios>();
        
        Alimenticios arroz = new Alimenticios(11, "Alimentos Básicos", "247551939", "Camil", "Arroz Branco Camil 5kg Pacote", "/assets/arroz2.jpg", 32.39, 8, "13/07/2022", "15/08/2023");
        Alimenticios banana = new Alimenticios(12, "Fruta", "456950621", "Carrefour", "Banana Nanica", "/assets/banana.jpg", 4.05, 10, "13/07/2022", "18/07/2022");
        Alimenticios chocolate = new Alimenticios(13, "Doce", "4352954115", "Lacta", "Chocolate barra lacta diamante negro 90G", "/assets/chocolate.jpg", 7.49, 20, "13/07/2022", "15/08/2023");
        Alimenticios feijao = new Alimenticios(14, "Alimentos Básicos", "2568397645", "Kicaldo", "Feijao carioca 1KG kicaldo", "/assets/feijao.jpg", 12.29, 13, "13/07/2022", "15/08/2023");
        Alimenticios maca = new Alimenticios(15, "Fruta", "456621950", "Carrefour", "Maçã Gala", "/assets/maca.jpg", 4.79, 25, "13/07/2022", "15/08/2023");
        Alimenticios biscoito = new Alimenticios(16, "Doce", "4913278779", "Toddy", "Biscoito Toddy sabor baunilha tamanho 57g", "/assets/toddy.jpg", 3.99, 5, "13/07/2022", "15/08/2023");
        Alimenticios limao = new Alimenticios(17, "Fruta", "469505961", "Carrefour", "Limão Tahiti", "/assets/limao.jpg", 1.79, 30, "13/07/2022", "15/08/2023");

        alimenticios.add(arroz);
        alimenticios.add(banana);
        alimenticios.add(chocolate);
        alimenticios.add(feijao);
        alimenticios.add(maca);
        alimenticios.add(biscoito);
        alimenticios.add(limao);
    }

}
