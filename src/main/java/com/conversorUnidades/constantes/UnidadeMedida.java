package com.conversorUnidades.constantes;

public enum UnidadeMedida {
        INCHES_CM(2.54),
        FEET_METER(0.3048),
        POUNDS_KG(0.45359237),
        CM_INCHES(0.393700787),
        METER_FEET(3.280839895),
        KG_POUNDS(2.20462262185);

        private final double equivalencia;

        UnidadeMedida(final double equivalencia) {
            this.equivalencia = equivalencia;
        }

        public double getEquivalencia() {
            return this.equivalencia;
        }

}
