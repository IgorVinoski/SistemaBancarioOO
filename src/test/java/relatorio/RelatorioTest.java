/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package relatorio;


import org.junit.jupiter.api.Test;
import pessoa.Gerente;

/**
 *
 * @author igor
 */
public class RelatorioTest {
    
    @Test
    public  void teste(){
        //arrange
        Gerente joao = new Gerente("Joao Paulo de Oliveria", "1235", "1234", "1234");
        joao.setSalario(1000);

        Relatorio relatorio = new Relatorio();
        relatorio.imprimirDados(joao);

        // act


    }
    
}
