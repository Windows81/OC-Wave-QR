package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.functions.Function1;

@Metadata
public final class ContinuationKt$Continuation$1 implements Continuation<Object> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f40719A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f40720z;

    public CoroutineContext f() {
        return this.f40720z;
    }

    public void q(Object obj) {
        this.f40719A.invoke(Result.a(obj));
    }
}
