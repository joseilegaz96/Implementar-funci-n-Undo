package com.kreitek.editor;

import java.util.Map;

public class Memento {
    private Map<String,Object> estado;

    public Memento(Map<String, Object> estado) {
        this.estado = estado;
    }

    public Map<String,Object> getEstado(){
        return estado;
    }
}
