package coil;

import coil.util.Logger;
import coil.util.Logs;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

@Metadata
public final class RealImageLoader$special$$inlined$CoroutineExceptionHandler$1 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ RealImageLoader f23270A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RealImageLoader$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key key, RealImageLoader realImageLoader) {
        super(key);
        this.f23270A = realImageLoader;
    }

    public void m0(CoroutineContext coroutineContext, Throwable th) {
        Logger i2 = this.f23270A.i();
        if (i2 != null) {
            Logs.a(i2, "RealImageLoader", th);
        }
    }
}
