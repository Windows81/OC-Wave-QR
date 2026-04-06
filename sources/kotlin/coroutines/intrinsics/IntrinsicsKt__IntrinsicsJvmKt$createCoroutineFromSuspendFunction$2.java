package kotlin.coroutines.intrinsics;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;

@Metadata
public final class IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2 extends ContinuationImpl {
    public int C;
    public final /* synthetic */ Function1 D;

    public Object x(Object obj) {
        int i2 = this.C;
        if (i2 == 0) {
            this.C = 1;
            ResultKt.b(obj);
            return this.D.invoke(this);
        } else if (i2 == 1) {
            this.C = 2;
            ResultKt.b(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed");
        }
    }
}
