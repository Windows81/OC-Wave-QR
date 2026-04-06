package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionErrorContextImpl;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class LaunchedEffectImpl implements RememberObserver, CoroutineExceptionHandler {

    /* renamed from: A  reason: collision with root package name */
    public final Function2 f14702A;

    /* renamed from: B  reason: collision with root package name */
    public final CoroutineScope f14703B;
    public Job C;

    /* renamed from: z  reason: collision with root package name */
    public final CoroutineContext f14704z;

    public LaunchedEffectImpl(CoroutineContext coroutineContext, Function2 function2) {
        this.f14704z = coroutineContext;
        this.f14702A = function2;
        this.f14703B = CoroutineScopeKt.a(coroutineContext.y(coroutineContext.d(CompositionErrorContextImpl.f15392A) != null ? this : EmptyCoroutineContext.f40721z));
    }

    public CoroutineContext.Element d(CoroutineContext.Key key) {
        return CoroutineExceptionHandler.DefaultImpls.b(this, key);
    }

    public void e() {
        Job job = this.C;
        if (job != null) {
            job.c(new LeftCompositionCancellationException());
        }
        this.C = null;
    }

    public void f() {
        Job job = this.C;
        if (job != null) {
            job.c(new LeftCompositionCancellationException());
        }
        this.C = null;
    }

    public CoroutineContext g(CoroutineContext.Key key) {
        return CoroutineExceptionHandler.DefaultImpls.c(this, key);
    }

    public CoroutineContext.Key getKey() {
        return CoroutineExceptionHandler.f41378w;
    }

    public void h() {
        Job job = this.C;
        if (job != null) {
            JobKt__JobKt.f(job, "Old job was still running!", (Throwable) null, 2, (Object) null);
        }
        this.C = BuildersKt__Builders_commonKt.d(this.f14703B, (CoroutineContext) null, (CoroutineStart) null, this.f14702A, 3, (Object) null);
    }

    public Object k(Object obj, Function2 function2) {
        return CoroutineExceptionHandler.DefaultImpls.a(this, obj, function2);
    }

    public void m0(CoroutineContext coroutineContext, Throwable th) {
        CompositionErrorContextImpl compositionErrorContextImpl = (CompositionErrorContextImpl) coroutineContext.d(CompositionErrorContextImpl.f15392A);
        if (compositionErrorContextImpl != null) {
            compositionErrorContextImpl.e(th, this);
        }
        CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) this.f14704z.d(CoroutineExceptionHandler.f41378w);
        if (coroutineExceptionHandler != null) {
            coroutineExceptionHandler.m0(coroutineContext, th);
            return;
        }
        throw th;
    }

    public CoroutineContext y(CoroutineContext coroutineContext) {
        return CoroutineExceptionHandler.DefaultImpls.d(this, coroutineContext);
    }
}
