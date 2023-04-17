package com.kreitek.editor.commands;

import com.kreitek.editor.Caretaker;
import com.kreitek.editor.Command;
import com.kreitek.editor.ConsoleEditor;

import java.util.ArrayList;

public class UpdateCommand implements Command {
    private final String text;
    private final int lineNumber;
    Caretaker caretaker = new Caretaker();;

    public UpdateCommand(String text, int lineNumber) {
        this.text = text;
        this.lineNumber = lineNumber;
    }

    @Override
    public void execute(ArrayList<String> documentLines) {
        caretaker.push(ConsoleEditor.getState());
        if (documentLines.size() > lineNumber)
            documentLines.set(lineNumber, text);
        else
            documentLines.add(text);
    }
}
