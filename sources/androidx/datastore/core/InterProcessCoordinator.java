package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

@Metadata
public interface InterProcessCoordinator {
    Object a(Continuation continuation);

    Object b(Function2 function2, Continuation continuation);

    Object c(Function1 function1, Continuation continuation);

    Flow d();

    Object e(Continuation continuation);
}
