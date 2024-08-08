
package pessoa;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author igor
 */
public class GerenteTest {
    

    @Test
    public void deveCalcularSalarioComBonusPadraoQuandoNaoForGerenteRegional(){
        //arrange
        Gerente joao = new Gerente("Joao Paulo de Oliveria", "1235", "1234", "1234", false);
        joao.setSalario(1000);
        double salarioComBonficacaoEsperado = 1100;

        // act

        double salarioCalculadoComBonus = joao.getSalarioComBonus();


        //assert
        Assertions.assertEquals(salarioComBonficacaoEsperado, salarioCalculadoComBonus, 0.01 );
    }

    @Test
    public void deveCalcularSalarioComBonusEspecificoQuandoForGerenteRegional(){

        Gerente joao = new Gerente("Joao Paulo de Oliveria", "1235", "1234", "1234", true);
        joao.setSalario(1000);
        double salarioComBonficacaoEsperado = 2000.2;

        // act

        double salarioCalculadoComBonus = joao.getSalarioComBonus();


        //assert
        Assertions.assertEquals(salarioComBonficacaoEsperado, salarioCalculadoComBonus, 0.1 );
    }
    
}
