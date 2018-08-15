package me.youngfor.esper.epl.condition;

import me.youngfor.esper.epl.FilterCondition;
import me.youngfor.esper.epl.Property;

public class AtomFilterCondition extends FilterCondition {
    private Boolean isExclude;
    private Property left;
    private Property right;

    @Override
    public String gen() {
        return null;
    }
}
