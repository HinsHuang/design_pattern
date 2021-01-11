package com.hins.command.remote;

public class HottubOnCommand implements Command {

    private Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }
    @Override
    public void execute() {
       hottub.on();
       hottub.heat();
       hottub.bubblesOn();
    }
}
