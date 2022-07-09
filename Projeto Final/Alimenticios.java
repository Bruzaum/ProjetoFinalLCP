import java.sql.Date;

public class Alimenticios extends Produtos {
    int id;
    Date dataVencimento;
    Date dataPreparacao;

    void setID(int id) {
        this.id = id;
    }

    void setVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
    
    void setRecomendacao(Date dataPreparacao) {
        this.dataPreparacao = dataPreparacao;
    }

    int getID() {
        return this.id;
    }

    Date getVencimento() {
        return this.dataVencimento;
    }

    Date getRecomendacao() {
        return this.dataPreparacao;
    }
}
