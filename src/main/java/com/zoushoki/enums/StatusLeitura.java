package com.zoushoki.enums;

public enum StatusLeitura {
    PRETENDO_LER(1),
    LENDO(2),
    COMPLETO(3),
    EM_ESPERA(4),
    ABANDONADO(5);

    private final int codigo;

    StatusLeitura(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public static StatusLeitura fromCodigo(int codigo) {
        for (StatusLeitura status : StatusLeitura.values()) {
            if (status.codigo == codigo) {
                return status;
            }
        }
        return PRETENDO_LER;
    }
}