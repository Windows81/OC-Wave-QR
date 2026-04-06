package kotlinx.coroutines.debug.internal;

import java.io.Serializable;
import java.lang.Thread;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineId;
import kotlinx.coroutines.CoroutineName;

@Metadata
public final class DebuggerInfo implements Serializable {

    /* renamed from: A  reason: collision with root package name */
    public final String f41561A;

    /* renamed from: B  reason: collision with root package name */
    public final String f41562B;
    public final String C;
    public final String D;
    public final String E;
    public final List F;
    public final long G;

    /* renamed from: z  reason: collision with root package name */
    public final Long f41563z;

    public DebuggerInfo(DebugCoroutineInfoImpl debugCoroutineInfoImpl, CoroutineContext coroutineContext) {
        Thread.State state;
        CoroutineId coroutineId = (CoroutineId) coroutineContext.d(CoroutineId.f41381B);
        String str = null;
        this.f41563z = coroutineId != null ? Long.valueOf(coroutineId.o0()) : null;
        ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) coroutineContext.d(ContinuationInterceptor.f40717v);
        this.f41561A = continuationInterceptor != null ? continuationInterceptor.toString() : null;
        CoroutineName coroutineName = (CoroutineName) coroutineContext.d(CoroutineName.f41383B);
        this.f41562B = coroutineName != null ? coroutineName.o0() : null;
        this.C = debugCoroutineInfoImpl.g();
        Thread thread = debugCoroutineInfoImpl.lastObservedThread;
        this.D = (thread == null || (state = thread.getState()) == null) ? null : state.toString();
        Thread thread2 = debugCoroutineInfoImpl.lastObservedThread;
        this.E = thread2 != null ? thread2.getName() : str;
        this.F = debugCoroutineInfoImpl.h();
        this.G = debugCoroutineInfoImpl.f41544b;
    }
}
