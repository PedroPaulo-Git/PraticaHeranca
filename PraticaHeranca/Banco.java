package PraticaHeranca;
import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Funcionario> funcionarios;

    public Banco() {
        funcionarios = new ArrayList<>();
    }


    public void inserirFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }


    public Funcionario consultarFuncionario(String nome) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equals(nome)) {
                return funcionario;
            }
        }
        return null; 
    }

    
    public void alterarSalario(String nome, double novoSalario) {
        Funcionario funcionario = consultarFuncionario(nome);
        if (funcionario != null) {
            funcionario.setSalario(novoSalario);
        }
    }

 
    public void excluirFuncionario(String nome) {
        Funcionario funcionario = consultarFuncionario(nome);
        if (funcionario != null) {
            funcionarios.remove(funcionario);
        }
    }

 
    public void listarFuncionarios() {
        System.out.println("Lista de Funcionários encontrados :");
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome() + ", Salário: " + funcionario.getSalario());
        }
    }

    public static void main(String[] args) {
        Banco banco = new Banco();

        Gerente gerente = new Gerente();
        gerente.setNome("Gerente Principal");
        gerente.setSalario(5000.0);
        gerente.setLogin("gerente1");
        gerente.setSenha("senha123");

        Telefonista telefonista = new Telefonista();
        telefonista.setNome("Telefonista");
        telefonista.setSalario(2500.0);
        telefonista.setCodigoEstacao(101);

        Secretaria secretaria = new Secretaria();
        secretaria.setNome("Secretaria");
        secretaria.setSalario(3000.0);
        secretaria.setNumeroRamal(202);

        banco.inserirFuncionario(gerente);
        banco.inserirFuncionario(telefonista);
        banco.inserirFuncionario(secretaria);

        banco.listarFuncionarios();

   
        Funcionario consulta = banco.consultarFuncionario("Gerente Principal");
        if (consulta != null) {
            System.out.println("Funcionário encontrado: " + consulta.getNome());
        } else {
            System.out.println("Funcionário não encontrado.");
        }

     
        banco.alterarSalario("Telefonista", 2800.0);
        banco.listarFuncionarios();

   
        banco.excluirFuncionario("Secretaria");
        banco.listarFuncionarios();
    }
}
