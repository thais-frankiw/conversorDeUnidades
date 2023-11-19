package com.conversorUnidades.ui;

public class ValorUsuarioInvalidoException extends IllegalArgumentException {
    public ValorUsuarioInvalidoException() {
        super();
    }

    /**
     * Constructs an {@code IllegalArgumentException} with the
     * specified detail message.
     *
     * @param   s   the detail message.
     */
    public ValorUsuarioInvalidoException(String s) {
        super(s);
    }
}
