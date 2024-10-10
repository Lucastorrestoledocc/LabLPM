package Classes;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Viajante extends Usuario {
    private String documento;

    public Viajante(String nome, String cpf, String senha, String documento) {
        super(nome, cpf, senha);
        this.documento = documento;
    }



    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



   
    public String getDocumento() {
        return documento;
    }



    public void setDocumento(String documento) {
        this.documento = documento;
    }


    // Método para pesquisar voos
    public List<PassagemAerea> PesquisarVoo(Aeroporto origem, Aeroporto destino, Date data) {
        List<PassagemAerea> voosDisponiveis = new ArrayList<>();
        // Aqui você poderia simular a pesquisa de voos ou acessar um banco de dados
        return voosDisponiveis;
    }

    // Método para emitir bilhete
    public void EmitirBilhete() {
        System.out.println("Bilhete emitido com sucesso para o viajante " + nome );
    }
}
