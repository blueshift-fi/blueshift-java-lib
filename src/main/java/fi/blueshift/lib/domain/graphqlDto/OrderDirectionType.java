package fi.blueshift.lib.domain.graphqlDto;

import io.leangen.graphql.annotations.types.GraphQLType;
import org.springframework.data.domain.Sort;

@GraphQLType(name = "OrderDirection")
public enum OrderDirectionType {
    asc,
    desc;

    public Sort.Direction getDirection() {
        if (this == asc) {
            return Sort.Direction.ASC;
        }
        return Sort.Direction.DESC;
    }
}
