package com.kreitek.editor.commands;

import com.kreitek.editor.Caretaker;
import com.kreitek.editor.Command;
import com.kreitek.editor.Memento;

import java.util.ArrayList;
import java.util.Collection;

public class CommandUndo implements Command {

    Memento memento;
    Caretaker caretaker = new Caretaker();

    public CommandUndo() {
    }

    @Override
    public void execute(ArrayList<String> documentLines) {
        memento = caretaker.pop();
        if(memento !=null) {
            documentLines.clear();
            documentLines.addAll((ArrayList<String>) memento.getEstado().get("Linea texto"));
        }
    }
}
