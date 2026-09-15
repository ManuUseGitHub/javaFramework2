package be.technifutur.myFramework3.implementations;

import be.technifutur.myFrameworkCommon.interfaces.MyService;
import be.technifutur.myFrameworkCommon.interfaces.OutputFramework;

public class OutputImpl extends MyService implements OutputFramework {
    @Override
    public void print(String value) {
        System.out.print(value);
    }

    @Override
    public String getName() {
        return "OutputImpl";
    }
}
