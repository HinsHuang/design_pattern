package com.hins.command.remote;

public class LivingroomLightOnCommand implements Command {

    private Light light;

    public LivingroomLightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
