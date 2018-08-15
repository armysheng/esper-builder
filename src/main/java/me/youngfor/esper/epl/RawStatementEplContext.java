package me.youngfor.esper.epl;

public class RawStatementEplContext extends EplContext {
    private String epl;

    public RawStatementEplContext(String epl) {
        this.epl = epl;
    }

    @Override
    public String genEpl() {
        return epl;
    }
}
