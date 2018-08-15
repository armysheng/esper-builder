package me.youngfor.esper.epl;

public class FromClause extends Clause {
    private String eventName;
    private FilterCondition filterCondition;

    @Override
    public String gen() {
        StringBuilder sb = new StringBuilder();
        sb.append("from ");
        sb.append(eventName);
        if (filterCondition != null) {
            sb.append("( ");
            sb.append(filterCondition.gen());
            sb.append(") ");
        }
        return sb.toString();
    }
}
