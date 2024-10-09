package Classes;
import java.util.Scanner;

public class Funcionario{
    private String nome;
    private String cpf;
    private String email;

    public Funcionario(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }package Classes;

import java.util.Scanner;

public class Funcionario {
    private String nome;
    private String sobrenome;
    private String cargo;

    // Construtor
    public Funcionario(String nome, String sobrenome, String cargo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cargo = cargo;
    }

    // Getters e Setters
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    // Método estático para cadastrar funcionário
    public static Funcionario cadastrarFuncionario() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o sobrenome do funcionário: ");
        String sobrenome = scanner.nextLine();
        System.out.print("Digite o cargo do funcionário: ");
        String cargo = scanner.nextLine();

        return new Funcionario(nome, sobrenome, cargo);
    }

    @Override
    public String toString() {
        return "Funcionário: " + nome + " " + sobrenome + " - Cargo: " + cargo;
    }
}


    public void setNome(String nome) {
        this.nome = nome;
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

    public static Funcionario CadastrarFuncionario() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o CPF do funcionário: ");
        String cpf = scanner.nextLine();

        System.out.print("Digite o e-mail do funcionário: ");
        String email = scanner.nextLine();

        if (nome.isEmpty() || cpf.isEmpty() || email.isEmpty()) {
            System.out.println("Todos os campos são obrigatórios.");
            return null;
        }

        Funcionario funcionario = new Funcionario(nome, cpf, email);
        System.out.println("Funcionário cadastrado com sucesso!");
        return funcionario;
    }

    public boolean Login(String senha) {
        return senha.equals("senha123");
    }
    
    
}