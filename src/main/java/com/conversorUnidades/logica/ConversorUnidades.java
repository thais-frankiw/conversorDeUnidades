package com.conversorUnidades.logica;
import com.conversorUnidades.constantes.UnidadeMedida;
import com.conversorUnidades.ui.Ui;
import com.conversorUnidades.ui.ValorUsuarioInvalidoException;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@NoArgsConstructor
public class ConversorUnidades {
    private static final Logger logger = LoggerFactory.getLogger(ConversorUnidades.class);
    public double converterUnidade(UnidadeMedida tipo, double valor) {
        if (valor <= 0) {
            throw new ValorUsuarioInvalidoException("O valor não pode ser zero ou negativo.");
        }
        double convertido = tipo.getEquivalencia() * valor;
        logger.info("Valor convertido: " + convertido);
        return convertido;
    }
}
