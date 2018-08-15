package me.youngfor.esper.epl;

import lombok.Builder;

@Builder
public class SchemaEplContext extends EplContext {
    private SelectClause selectClause;
    private FromClause fromClause;
    private WhereClause whereClause;

    @Override
    public String genEpl() {
        StringBuilder sb = new StringBuilder();
        sb.append(selectClause.gen());
        sb.append(fromClause.gen());
        if (whereClause != null) {
            sb.append(whereClause.gen());
        }
        return sb.toString();
    }
}
