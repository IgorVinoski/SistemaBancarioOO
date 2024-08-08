package pessoa;

public abstract class Funcionario  extends Pessoa {
  public static final double PERCENTUAL_PADRAO_BONUS = 10;
  public static final int CARGA_HORARIA_PADRAO = 220;
    private  final double CEM = 100;
    protected String matricula;
    protected double cargaHoraria;

    public Funcionario(String nome, String cpf, String rg, String matricula ) {
        super(nome, cpf, rg);
        this.matricula=matricula;
        this.cargaHoraria = CARGA_HORARIA_PADRAO;
    }

    public double getSalarioComBonus() {
        return this.salario + (salario * PERCENTUAL_PADRAO_BONUS /CEM);
    }
    public double getSalarioComBonus(double percentualBonus) {
        return this.salario + (salario * percentualBonus /CEM);
    }
}