package Classes;
import java.util.Scanner;

public class Funcionario {
    private String nome;
    private String sobrenome;
    private String cpf;
    private String email;
    private String cargo;

    // Construtor!
    public Funcionario(String nome, String sobrenome, String cpf, String email, String cargo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.email = email;
        this.cargo = cargo;
    }

    // Getters e Setters!
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public static Funcionario CadastrarFuncionario() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o sobrenome do funcionário: ");
        String sobrenome = scanner.nextLine();
        System.out.print("Digite o CPF do funcionário: ");
        String cpf = scanner.nextLine();
        System.out.print("Digite o e-mail do funcionário: ");
        String email = scanner.nextLine();
        System.out.print("Digite o cargo do funcionário: ");
        String cargo = scanner.nextLine();

        if (nome.isEmpty() || sobrenome.isEmpty() || cpf.isEmpty() || email.isEmpty() || cargo.isEmpty()) {
            System.out.println("Todos os campos são obrigatórios.");
            return null;
        }

        Funcionario funcionario = new Funcionario(nome, sobrenome, cpf, email, cargo);
        System.out.println("Funcionário cadastrado com sucesso!");
        return funcionario;
    }

    public boolean login(String senha) {
        return senha.equals("senha123");
    }

    @Override
    public String toString() {
        return "Funcionário: " + nome + " " + sobrenome + " - CPF: " + cpf + " - Email: " + email + " - Cargo: " + cargo;
    }
}
