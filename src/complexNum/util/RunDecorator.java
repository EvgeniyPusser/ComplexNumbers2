package complexNum.util;

import complexNum.impl.Calculator;

public class RunDecorator {
    public static void main(String[] args) {
        View view = new View(new Calculator());
        view.run();
    }
}
