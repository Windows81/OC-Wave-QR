package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public interface ImeEditCommandScope {
    boolean beginBatchEdit();

    long c(long j2);

    void e(Function1 function1);

    boolean endBatchEdit();

    long g(long j2);
}
