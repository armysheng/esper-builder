package me.youngfor.esper.epl;

import org.junit.Test;

public class EplGeneratorTest {

    @Test
    public void testRaw() {
        EplContext eplContext = new RawStatementEplContext("select * from Event where id = 0");
        System.out.println(EplGenerator.generate(eplContext));
    }

    @Test
    public void testSchema() {
        EplContext eplContext = SchemaEplContext
                .builder()
                .selectClause(SelectClause.builder()
                        .property(new Property("*"))
                        .property(new Property("volume * price as volPrice "))
                        .build())
                .build();
        System.out.println(SelectClause.builder()
                .property(new Property("*"))
                .property(new Property("volume * price as volPrice "))
                .build().gen());
    }
}