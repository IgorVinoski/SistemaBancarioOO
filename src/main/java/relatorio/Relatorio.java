package relatorio;

import pessoa.Funcionario;

public class Relatorio {
    public void imprimirDados(Funcionario funcionario) {
        System.out.println("Nome:" + funcionario.getNome() + " | Salário: " + funcionario.getSalario() + " | Salário com bonificação " + funcionario.getSalarioComBonus());
    }
}