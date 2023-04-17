package com.kreitek.editor.commands;

import com.kreitek.editor.Caretaker;
import com.kreitek.editor.Command;
import com.kreitek.editor.ConsoleEditor;
import com.kreitek.editor.Memento;

import java.util.ArrayList;

public class DeleteCommand implements Command {
    private final int lineNumber;
    Caretaker caretaker = new Caretaker();;
    Memento memento;

    public DeleteCommand(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    @Override
    public void execute(ArrayList<String> documentLines) {
        caretaker.push(ConsoleEditor.getState());
        documentLines.remove(lineNumber);
    }
}
