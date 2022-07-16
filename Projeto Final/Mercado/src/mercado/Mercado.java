package mercado;

import java.util.ArrayList;
import java.util.List;
import mercado.Alimenticios;
import mercado.Eletronicos;
import mercado.Higiene;
import mercado.Produtos;

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
        
        List<Eletronicos> eletronicos = new ArrayList<Eletronicos>(); 
    
        Eletronicos televisao = new Eletronicos(21, "Tv e Home Theater", "1618074503", "Samsung", "Smart TV LED 32'", "/assets/tv.jpg", 1449.99, 2, "Samsung SMART TV, Navegador (Web Browser), Espelhamento do Smartphone para TV", "110v", "12 meses", "1 TV, 2 pés, Controle remoto, Pilhas AAA 2x (opcional), manual do usuário, adaptador de antena, cabo de força");
        Eletronicos liquidificador = new Eletronicos(22, "Eletrodomésticos", "133884111", "Philco", "Liquidificador Philco Plq1412p 3L", "/assets/liquidificador.jpg", 169.99, 3, "12 velocidades + pulsar/autolimpeza, função Ice que permite tritura gelo com maior facilidade e rapidez", "220v", "12 meses", "Liquidificador, filtro, jarra, mini folders, manual de instrução e certificado de garantia");
        Eletronicos geladeira = new Eletronicos(23, "Eletrodomésticos", "111957454", "Electrolux", "Geladeira/Refrigerador Electrolux DC35A Branca", "/assets/geladeira.jpg", 1999.99, 1, "Prático e moderno possui selo procel", "220v", "12 meses", "1 Refrigerador e Manual");
        Eletronicos ps5 = new Eletronicos(24, "Games", "4822425358", "Sony", "Console Playstation 5", "/assets/ps5.jpg", 4799.90, 0, "Jogar não Tem Limites", "bivolt", "12 meses", "Console PlayStation5. Controle sem fio DualSense. 825GB SSD. Base. Cabo HDMI. Cabo de energia AC. Cabo USB. Materiais impressos. ASTRO’s PLAYROOM (jogo pré-instalado).");
        Eletronicos microondas = new Eletronicos(25, "Eletrodomésticos", "2117191066", "Philco", "Micro-ondas Philco NN-ST27LWRUN", "/assets/microondas.jpg", 534.30, 6, "Micro-ondas", "220v", "12 meses", "1 Micro-ondas, Manual de instruções e 1 Prato Giratório");

        eletronicos.add(televisao);
        eletronicos.add(liquidificador);
        eletronicos.add(geladeira);
        eletronicos.add(ps5);
        eletronicos.add(microondas);
        
    }

}