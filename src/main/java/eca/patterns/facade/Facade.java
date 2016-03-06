package eca.patterns.facade;

/**
 * Provides a simplified interface and knows how to deal with all dependency.
 */
public class Facade {

    private ComplexLoader loader;
    private ComplexParser parser;
    private ComplexTaskGenerator taskGenerator;

    public Facade() {
        this.loader = new ComplexLoader();
        this.parser = new ComplexParser();
        this.taskGenerator = new ComplexTaskGenerator();
    }

    public void doOperation() {
        loader.load();
        parser.parse();
        taskGenerator.generate();
    }
}
