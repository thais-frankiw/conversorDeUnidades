package com.conversorUnidades.logica;
import com.conversorUnidades.constantes.UnidadeMedida;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ConversorUnidades {
    public double converterUnidade(UnidadeMedida tipo, double valor) {
        return tipo.getEquivalencia() * valor;
    }
}
