package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.DelayKt;

@Metadata
public final class OnTimeoutKt {
    public static final void a(SelectBuilder selectBuilder, long j2, Function1 function1) {
        selectBuilder.b(new OnTimeout(j2).c(), function1);
    }

    public static final void b(SelectBuilder selectBuilder, long j2, Function1 function1) {
        a(selectBuilder, DelayKt.e(j2), function1);
    }
}
