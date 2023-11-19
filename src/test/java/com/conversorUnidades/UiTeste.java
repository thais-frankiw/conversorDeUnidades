package com.conversorUnidades;

import com.conversorUnidades.constantes.UnidadeMedida;
import com.conversorUnidades.ui.Ui;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UiTeste {
    @Test
    @DisplayName("Valida se a opção 1 selecionada retorna INCHES_CM")
    void testaOpcaoValida1() {
        assertEquals(UnidadeMedida.INCHES_CM, Ui.obterTipoDesejado(1));
    }

    @Test
    @DisplayName("Valida se a opção 2 selecionada retorna FEET_METER")
    void testaOpcaoValida2() {
        assertEquals(UnidadeMedida.FEET_METER, Ui.obterTipoDesejado(2));
    }

    @Test
    @DisplayName("Valida se a opção 3 selecionada retorna POUNDS_KG")
    void testaOpcaoValida3(){
        assertEquals(UnidadeMedida.POUNDS_KG, Ui.obterTipoDesejado(3));
    }

    @Test
    @DisplayName("Valida se a opção 4 selecionada retorna CM_INCHES")
    void testaOpcaoValida4(){
        assertEquals(UnidadeMedida.CM_INCHES, Ui.obterTipoDesejado(4));
    }

    @Test
    @DisplayName("Valida se a opção 5 selecionada retorna METER_FEET")
    void testaopcaoValida5(){
        assertEquals(UnidadeMedida.METER_FEET, Ui.obterTipoDesejado(5));
    }

    @Test
    @DisplayName("Valida se a opção 6 selecionada retorna KG_POUNDS")
    void testaOpcaoValida6(){
        assertEquals(UnidadeMedida.KG_POUNDS, Ui.obterTipoDesejado(6));
    }


    @Test
    @DisplayName("Dispara exceção caso usuário digite opção inválida.")
    void testaOpcaoInvalida() {
        assertThrows(IllegalArgumentException.class, () -> Ui.obterTipoDesejado(7));
    }
}
