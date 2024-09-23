import java.util.ArrayList;
import java.util.List;


import LabLPM.Funcionario;


public class cadastroFuncionario {  
    private List<Funcionario> funcionarios = new ArrayList<>();  

   
    public void cadastrarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    
    public Funcionario buscarFuncionarioPorCpf(String cpf) {
        for (Funcionario f : funcionarios) {
       
            if (f.getCpf().equals(cpf)) {
                return f;
            }
        }
        return null;  
    }

    // Corrigi o nome do método e a impressão da lista de funcionários
    public void listarFuncionarios() {
        for (Funcionario f : funcionarios) {
            System.out.println("Nome: " + f.getNome() + " | CPF: " + f.getCpf() + " | Email: " + f.getEmail());
        }
    }
}
