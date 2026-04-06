package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
public interface SelectBuilder<R> {

    @Metadata
    public static final class DefaultImpls {
    }

    void b(SelectClause0 selectClause0, Function1 function1);

    void g(SelectClause1 selectClause1, Function2 function2);
}
