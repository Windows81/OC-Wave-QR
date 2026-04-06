package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionErrorContextImpl;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

@Metadata
public final class RememberedCoroutineScope$special$$inlined$CoroutineExceptionHandler$1 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ CompositionErrorContextImpl f14837A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ RememberedCoroutineScope f14838B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RememberedCoroutineScope$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key key, CompositionErrorContextImpl compositionErrorContextImpl, RememberedCoroutineScope rememberedCoroutineScope) {
        super(key);
        this.f14837A = compositionErrorContextImpl;
        this.f14838B = rememberedCoroutineScope;
    }

    public void m0(CoroutineContext coroutineContext, Throwable th) {
        this.f14837A.e(th, this.f14838B);
        CoroutineContext a2 = this.f14838B.f14834A;
        CoroutineExceptionHandler.Key key = CoroutineExceptionHandler.f41378w;
        CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) a2.d(key);
        if (coroutineExceptionHandler != null) {
            coroutineExceptionHandler.m0(coroutineContext, th);
            return;
        }
        CoroutineExceptionHandler coroutineExceptionHandler2 = (CoroutineExceptionHandler) this.f14838B.f14836z.d(key);
        if (coroutineExceptionHandler2 != null) {
            coroutineExceptionHandler2.m0(coroutineContext, th);
            return;
        }
        throw th;
    }
}
