
import java.util.ArrayList;
import java.util.List;

public class Usuario {

    int id;
    String nome;
    double orcamento;
    String foto;

    void setID(int id){
        this.id = id;
    }

    void setNome(String nome){
	this.nome = nome;
    }

    void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }
    
    void setFoto(String foto) {
        this.foto = foto;
    }

    public Usuario(int id, String nome, double orcamento, String foto)
    {
        setID(id);
        setNome(nome);
        setOrcamento(orcamento);
        setFoto(foto);
    }

    int getID() {
        return this.id;
    }

    String getNome() {
	return this.nome;
    }

    double getOrcamento(){
        return this.orcamento;
    }
    
    String getFoto(){
        return this.foto;
    }
    
    public static void main(String[] args) {
        List<Usuario> usuarios = new ArrayList<Usuario>(); 
        
        Usuario usuario1 = new Usuario(1, "Homer", 1100.98, "/assets/homer.jpg");
        Usuario usuario2 = new Usuario(2, "Shrek", 150.98, "/assets/shrek.jpg");
        Usuario usuario3 = new Usuario(3, "Monica", 9800.00, "/assets/monica.jpg");

        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

    }
}
