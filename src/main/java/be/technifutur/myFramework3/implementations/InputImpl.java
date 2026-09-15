package be.technifutur.myFramework3.implementations;

import java.util.Scanner;
import be.technifutur.myFrameworkCommon.interfaces.InputFramework;
import be.technifutur.myFrameworkCommon.interfaces.MyService;

public class InputImpl extends MyService implements InputFramework {
    @Override
    public String newInput() {
        return new Scanner(System.in).nextLine();
    }

    @Override
    public String getName() {
        return "InputImpl";
    }
}
