import java.sql.Date;

public class Higiene extends Produtos {
    int id;
    Date dataVencimento;
    String recomendacaoUso;

    void setID(int id) {
        this.id = id;
    }

    void setVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
    
    void setRecomendacao(String recomendacaoUso) {
        this.recomendacaoUso = recomendacaoUso;
    }

    int getID() {
        return this.id;
    }

    Date getVencimento() {
        return this.dataVencimento;
    }

    String getRecomendacao() {
        return this.recomendacaoUso;
    }
}
