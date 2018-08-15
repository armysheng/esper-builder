package me.youngfor.esper.epl;

import lombok.Builder;
import lombok.Singular;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author z672908
 */
@Builder
public class SelectClause extends Clause {
    @Singular("property")
    private List<Property> property = new ArrayList<>();

    @Override
    public String gen() {
        StringBuilder sb = new StringBuilder();
        List<String> propertyString = property.stream().map(Property::gen).collect(Collectors.toList());
        sb.append("select ");
        sb.append(String.join(", ", propertyString));
        return sb.toString();
    }
}
