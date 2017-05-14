package builder.test1;

public class ConcretBuilder implements Builder {

    private Product product = new Product(); 
    @Override
    public void builderPart1() {
        product.setPart1("Part1");
    }

    @Override
    public void builderPart2() {
        product.setPart2("Par2");
    }

    @Override
    public Product retrieveResult() {
        return product;
    }

}
