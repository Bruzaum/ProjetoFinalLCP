public class Eletronicos extends Produtos {
    int id;
    String descricao;
    String voltagem;
    String garantia;
    String conteudo;

  /*
  void setID(int id) {
    this.id = id;
  }
  */

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

  /* 
  int getID() {
    return this.id;
  }
  */

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
    Eletronicos televisao = new Eletronicos();
    televisao.setID(21);
    televisao.setCategoria("Tv e Home Theater");
    televisao.setCodigo("1618074503");
    televisao.setMarca("Samsung");
    televisao.setNome("Smart TV LED 32'' Samsung Tizen HD 32T4300 2020 - WIFI, HDR para Brilho e Contraste com Plataforma Tizen 2 HDMI 1 USB - Preta");
    televisao.setFoto("x");
    televisao.setValor(1449.99);
    televisao.setQtdEstoque(2);
    televisao.setDescricao("Samsung SMART TV, Navegador (Web Browser), Espelhamento do Smartphone para TV, Acessibilidade - Guia de Voz (Inglês - EUA, Português - Brasil), Ampliar, Aumento de Contraste, Aprenda a mexer no Controle Remoto da TV (Inglês - EUA, Áudio de múltiplas saídas, Cores negativas, Preto e Branco, Aprenda a mexer no Menu (Inglês - EUA, Zoom de vídeo, Digital Clean View, Busca automática de canais, Desligamento Automático, Legenda, Connect Share (HDD), ConnectShare (USB 2.0), Idioma (Local - Brasil - Português), Compatível com HID USB, IPv6 Support, Sensor Ecológico, Selo Procel (A).");
    televisao.setVoltagem("110v");
    televisao.setGarantia("12 meses");
    televisao.setConteudo("1 TV, 2 pés, Controle remoto, Pilhas AAA 2x (opcional), manual do usuário, adaptador de antena, cabo de força");
    
    // Preciso ver como inserir um tipo Date ou podemos utilizar o tipo String msm

    Eletronicos liquidificador = new Eletronicos();
    liquidificador.setID(22);
    liquidificador.setCategoria("Eletrodomésticos");
    liquidificador.setCodigo("133884111");
    liquidificador.setMarca("Philco");
    liquidificador.setNome("Liquidificador Philco Plq1412p 3L 12 velocidades + Pulsar/Autolimpeza Preto 127V - 1200W");
    liquidificador.setFoto("x");
    liquidificador.setValor(169.99);
    liquidificador.setQtdEstoque(3);
    liquidificador.setDescricao("Produzido com materiais resistentes e duradouros, conta com 12 velocidades + pulsar/autolimpeza, função Ice que permite tritura gelo com maior facilidade e rapidez, faca de 6 lâminas ultra afiadas e resistentes, filtro, tampa com sobretampa e orifício, que permite adição de ingredientes durante o preparo. Copo de acrílico super-resistente com capacidade máxima até 3L, base antiderrapante e potência de 1200W que fornece excelente desempenho ao motor facilitando o preparo de receitas pesadas.");
    liquidificador.setVoltagem("220V");
    liquidificador.setGarantia("12 meses");
    liquidificador.setConteudo("Liquidificador, filtro, jarra, mini folders, manual de instrução e certificado de garantia");

    Eletronicos geladeira = new Eletronicos();
    geladeira.setID(23);
    geladeira.setCategoria("Eletrodomésticos");
    geladeira.setCodigo("111957454");
    geladeira.setMarca("Electrolux");
    geladeira.setNome("Geladeira/Refrigerador Electrolux DC35A Branca 260L Cycle Defrost - 220v");
    geladeira.setFoto("x");
    geladeira.setValor(1999.99);
    geladeira.setQtdEstoque(1);
    geladeira.setDescricao("Prático e moderno possui selo procel, ou seja, é mais econômico, colabora com o meio ambiente e com o seu bolso, o freezer possui a função Defrost que descongela automáticamente sem que seja necessário desliga-lo e fazer bagunça.");
    geladeira.setVoltagem("220v");
    geladeira.setGarantia("12 meses");
    geladeira.setConteudo("1 Refrigerador e Manual");

    Eletronicos ps5 = new Eletronicos();
    ps5.setID(24);
    ps5.setCategoria("Games");
    ps5.setCodigo("4822425358");
    ps5.setMarca("Sony");
    ps5.setNome("Console Playstation 5 + Controle Ps5 Dualsense 5 Branco");
    ps5.setFoto("x");
    ps5.setValor(4799.90);
    ps5.setQtdEstoque(1);
    ps5.setDescricao("Jogar não Tem Limites. Desfrute do carregamento extremamente rápido com o SSD de altíssima velocidade, uma imersão mais profunda com suporte a feedback tátil, gatilhos adaptáveis e áudio 3D, além de uma geração inédita de jogos incríveis para Console Playstation 5 - PS5.");
    ps5.setVoltagem("bivolt");
    ps5.setGarantia("12 meses");
    ps5.setConteudo("Console PlayStation5. Controle sem fio DualSense. 825GB SSD. Base. Cabo HDMI. Cabo de energia AC. Cabo USB. Materiais impressos. ASTRO’s PLAYROOM (jogo pré-instalado). O console pode precisar ser atualizado para a versão mais recente do software do sistema. Necessária conexão com a Internet.");

    Eletronicos microondas = new Eletronicos();
    microondas.setID(25);
    microondas.setCategoria("Eletrodomésticos");
    microondas.setCodigo("2117191066");
    microondas.setMarca("Panasonic");
    microondas.setNome("Micro-ondas Panasonic NN-ST27LWRUN 21 Litros Espelhado Branco – 220v");
    microondas.setFoto("x");
    microondas.setValor(534.30);
    microondas.setQtdEstoque(6);
    microondas.setDescricao(" ");
    microondas.setVoltagem("220v");
    microondas.setGarantia("12 meses");
    microondas.setConteudo("1 Micro-ondas, Manual de instruções e 1 Prato Giratório");
  }

}
