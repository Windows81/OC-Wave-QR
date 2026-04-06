package androidx.lifecycle.viewmodel.internal;

import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

@Metadata
public final class CloseableCoroutineScopeKt {
    public static final CloseableCoroutineScope a() {
        CoroutineContext coroutineContext;
        try {
            coroutineContext = Dispatchers.c().H0();
        } catch (NotImplementedError unused) {
            coroutineContext = EmptyCoroutineContext.f40721z;
        } catch (IllegalStateException unused2) {
            coroutineContext = EmptyCoroutineContext.f40721z;
        }
        return new CloseableCoroutineScope(coroutineContext.y(SupervisorKt.b((Job) null, 1, (Object) null)));
    }
}
