package kotlin.coroutines.intrinsics;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.jvm.functions.Function1;

@Metadata
public final class IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1 extends RestrictedContinuationImpl {

    /* renamed from: A  reason: collision with root package name */
    public int f40732A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f40733B;

    public Object x(Object obj) {
        int i2 = this.f40732A;
        if (i2 == 0) {
            this.f40732A = 1;
            ResultKt.b(obj);
            return this.f40733B.invoke(this);
        } else if (i2 == 1) {
            this.f40732A = 2;
            ResultKt.b(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed");
        }
    }
}
