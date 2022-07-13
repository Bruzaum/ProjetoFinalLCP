package mercado;

import java.util.ArrayList;
import java.util.List;

public class Eletronicos extends Produtos {
    String descricao;
    String voltagem;
    String garantia;
    String conteudo;

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

 public Eletronicos(int id, String categoria, String codigo, String marca, String nome, String foto, double valor, int quantidadeEstoque, String descricao, String voltagem, String garantia, String conteudo)
    {
        setID(id);
        setCategoria(categoria);
        setCodigo(codigo);
        setMarca(marca);
        setNome(nome);
        setFoto(foto);
        setValor(valor);
        setQtdEstoque(quantidadeEstoque);
        setDescricao(descricao);
        setVoltagem(voltagem);
        setGarantia(garantia);
        setConteudo(conteudo);
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

  public static void main(String[] args) {
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
