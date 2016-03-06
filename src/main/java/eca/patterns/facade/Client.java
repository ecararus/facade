package eca.patterns.facade;

/**
 * The client of decorator.
 */
public class Client {

    public void operation() {
        Facade facade = new Facade();
        facade.doOperation();
    }

}
