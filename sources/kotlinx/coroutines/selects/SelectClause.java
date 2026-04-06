package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.jvm.functions.Function3;

@Metadata
public interface SelectClause {
    Function3 a();

    Object b();

    Function3 c();

    Function3 d();
}
