package be.technifutur.myFramework3.implementations;

import be.technifutur.myFrameworkCommon.interfaces.Application;
import be.technifutur.myFrameworkCommon.interfaces.MyService;

public class AppImpl extends MyService implements Application {
    boolean finish = true;

    @Override
    public void start() {
        System.out.println(getVue());
    }

    @Override
    public boolean isFinish() {
        return finish;
    }

    @Override
    public String newInput(String value) {
        return value;
    }

    @Override
    public String getVue() {
        return "My Application service";
    }

    @Override
    public String getName() {
        return "AppImpl";
    }
}
