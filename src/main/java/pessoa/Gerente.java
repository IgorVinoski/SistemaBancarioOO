package pessoa;

public class Gerente extends Funcionario{
    public static final double PERCENTUAL_PADRAO_BONUS_GERENTE_REGIONAL= 20;

    private boolean gerenteRegional;

    public Gerente(String nome, String cpf, String rg, String matricula) {
        super(nome, cpf, rg, matricula);
    }
    public Gerente(String nome, String cpf, String rg, String matricula, boolean isGerenteRegional) {
        super(nome, cpf, rg, matricula);
        this.gerenteRegional=isGerenteRegional;
    }
    
    @Override
    public double getSalarioComBonus(){

        if(isGerenteRegional()){
            return this.salario + (this.salario + PERCENTUAL_PADRAO_BONUS_GERENTE_REGIONAL /100);
        }
        return super.getSalarioComBonus();

    }
    public boolean isGerenteRegional() {
        return gerenteRegional;
    }

    public void setGerenteRegional(boolean gerenteRegional) {
        this.gerenteRegional = gerenteRegional;
    }
}