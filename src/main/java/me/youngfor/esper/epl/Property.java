package me.youngfor.esper.epl;

public class Property implements Generable {
    private String name;
    private DataType dataType;

    Property(String name) {
        this.name = name;
    }

    @Override
    public String gen() {
        return name;
    }
}
