package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

@Metadata
public final class CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f41380A;

    public void m0(CoroutineContext coroutineContext, Throwable th) {
        this.f41380A.m(coroutineContext, th);
    }
}
