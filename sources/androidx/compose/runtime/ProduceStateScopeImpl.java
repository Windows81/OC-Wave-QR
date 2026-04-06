package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata
final class ProduceStateScopeImpl<T> implements ProduceStateScope<T>, MutableState<T> {

    /* renamed from: A  reason: collision with root package name */
    public final CoroutineContext f14767A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MutableState f14768z;

    public ProduceStateScopeImpl(MutableState mutableState, CoroutineContext coroutineContext) {
        this.f14768z = mutableState;
        this.f14767A = coroutineContext;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object g(kotlin.jvm.functions.Function0 r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1 r0 = (androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1 r0 = new androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 == r3) goto L_0x002d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002d:
            java.lang.Object r5 = r0.C
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            kotlin.ResultKt.b(r6)     // Catch:{ all -> 0x0035 }
            goto L_0x005a
        L_0x0035:
            r6 = move-exception
            goto L_0x0060
        L_0x0037:
            kotlin.ResultKt.b(r6)
            r0.C = r5     // Catch:{ all -> 0x0035 }
            r0.F = r3     // Catch:{ all -> 0x0035 }
            kotlinx.coroutines.CancellableContinuationImpl r6 = new kotlinx.coroutines.CancellableContinuationImpl     // Catch:{ all -> 0x0035 }
            kotlin.coroutines.Continuation r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.c(r0)     // Catch:{ all -> 0x0035 }
            r6.<init>(r2, r3)     // Catch:{ all -> 0x0035 }
            r6.G()     // Catch:{ all -> 0x0035 }
            java.lang.Object r6 = r6.A()     // Catch:{ all -> 0x0035 }
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()     // Catch:{ all -> 0x0035 }
            if (r6 != r2) goto L_0x0057
            kotlin.coroutines.jvm.internal.DebugProbesKt.c(r0)     // Catch:{ all -> 0x0035 }
        L_0x0057:
            if (r6 != r1) goto L_0x005a
            return r1
        L_0x005a:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException     // Catch:{ all -> 0x0035 }
            r6.<init>()     // Catch:{ all -> 0x0035 }
            throw r6     // Catch:{ all -> 0x0035 }
        L_0x0060:
            r5.invoke()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ProduceStateScopeImpl.g(kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public CoroutineContext getCoroutineContext() {
        return this.f14767A;
    }

    public Object getValue() {
        return this.f14768z.getValue();
    }

    public void setValue(Object obj) {
        this.f14768z.setValue(obj);
    }
}
