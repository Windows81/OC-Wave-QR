package androidx.lifecycle.viewmodel.internal;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata
public final class CloseableCoroutineScope implements AutoCloseable, CoroutineScope {

    /* renamed from: z  reason: collision with root package name */
    public final CoroutineContext f22079z;

    public CloseableCoroutineScope(CoroutineContext coroutineContext) {
        Intrinsics.i(coroutineContext, "coroutineContext");
        this.f22079z = coroutineContext;
    }

    public void close() {
        JobKt__JobKt.e(getCoroutineContext(), (CancellationException) null, 1, (Object) null);
    }

    public CoroutineContext getCoroutineContext() {
        return this.f22079z;
    }
}
