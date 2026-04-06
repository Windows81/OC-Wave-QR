package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.compose.animation.core.MutatorMutex$mutateWith$2", f = "InternalMutatorMutex.kt", l = {176, 163}, m = "invokeSuspend")
final class MutatorMutex$mutateWith$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<Object>, Object> {
    public Object D;
    public Object E;
    public Object F;
    public Object G;
    public int H;
    public /* synthetic */ Object I;
    public final /* synthetic */ MutatePriority J;
    public final /* synthetic */ MutatorMutex K;
    public final /* synthetic */ Function2 L;
    public final /* synthetic */ Object M;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MutatorMutex$mutateWith$2(MutatePriority mutatePriority, MutatorMutex mutatorMutex, Function2 function2, Object obj, Continuation continuation) {
        super(2, continuation);
        this.J = mutatePriority;
        this.K = mutatorMutex;
        this.L = function2;
        this.M = obj;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((MutatorMutex$mutateWith$2) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        MutatorMutex$mutateWith$2 mutatorMutex$mutateWith$2 = new MutatorMutex$mutateWith$2(this.J, this.K, this.L, this.M, continuation);
        mutatorMutex$mutateWith$2.I = obj;
        return mutatorMutex$mutateWith$2;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:27:0x00b1=Splitter:B:27:0x00b1, B:20:0x009e=Splitter:B:20:0x009e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r9.H
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0042
            if (r1 == r3) goto L_0x002b
            if (r1 != r2) goto L_0x0023
            java.lang.Object r0 = r9.E
            androidx.compose.animation.core.MutatorMutex r0 = (androidx.compose.animation.core.MutatorMutex) r0
            java.lang.Object r1 = r9.D
            kotlinx.coroutines.sync.Mutex r1 = (kotlinx.coroutines.sync.Mutex) r1
            java.lang.Object r2 = r9.I
            androidx.compose.animation.core.MutatorMutex$Mutator r2 = (androidx.compose.animation.core.MutatorMutex.Mutator) r2
            kotlin.ResultKt.b(r10)     // Catch:{ all -> 0x0020 }
            goto L_0x009e
        L_0x0020:
            r10 = move-exception
            goto L_0x00b1
        L_0x0023:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x002b:
            java.lang.Object r1 = r9.G
            androidx.compose.animation.core.MutatorMutex r1 = (androidx.compose.animation.core.MutatorMutex) r1
            java.lang.Object r3 = r9.F
            java.lang.Object r5 = r9.E
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            java.lang.Object r6 = r9.D
            kotlinx.coroutines.sync.Mutex r6 = (kotlinx.coroutines.sync.Mutex) r6
            java.lang.Object r7 = r9.I
            androidx.compose.animation.core.MutatorMutex$Mutator r7 = (androidx.compose.animation.core.MutatorMutex.Mutator) r7
            kotlin.ResultKt.b(r10)
            r10 = r6
            goto L_0x0087
        L_0x0042:
            kotlin.ResultKt.b(r10)
            java.lang.Object r10 = r9.I
            kotlinx.coroutines.CoroutineScope r10 = (kotlinx.coroutines.CoroutineScope) r10
            androidx.compose.animation.core.MutatorMutex$Mutator r1 = new androidx.compose.animation.core.MutatorMutex$Mutator
            androidx.compose.animation.core.MutatePriority r5 = r9.J
            kotlin.coroutines.CoroutineContext r10 = r10.getCoroutineContext()
            kotlinx.coroutines.Job$Key r6 = kotlinx.coroutines.Job.f41415x
            kotlin.coroutines.CoroutineContext$Element r10 = r10.d(r6)
            kotlin.jvm.internal.Intrinsics.f(r10)
            kotlinx.coroutines.Job r10 = (kotlinx.coroutines.Job) r10
            r1.<init>(r5, r10)
            androidx.compose.animation.core.MutatorMutex r10 = r9.K
            r10.f(r1)
            androidx.compose.animation.core.MutatorMutex r10 = r9.K
            kotlinx.coroutines.sync.Mutex r10 = r10.f2627b
            kotlin.jvm.functions.Function2 r5 = r9.L
            java.lang.Object r6 = r9.M
            androidx.compose.animation.core.MutatorMutex r7 = r9.K
            r9.I = r1
            r9.D = r10
            r9.E = r5
            r9.F = r6
            r9.G = r7
            r9.H = r3
            java.lang.Object r3 = r10.d(r4, r9)
            if (r3 != r0) goto L_0x0083
            return r0
        L_0x0083:
            r3 = r6
            r8 = r7
            r7 = r1
            r1 = r8
        L_0x0087:
            r9.I = r7     // Catch:{ all -> 0x00ab }
            r9.D = r10     // Catch:{ all -> 0x00ab }
            r9.E = r1     // Catch:{ all -> 0x00ab }
            r9.F = r4     // Catch:{ all -> 0x00ab }
            r9.G = r4     // Catch:{ all -> 0x00ab }
            r9.H = r2     // Catch:{ all -> 0x00ab }
            java.lang.Object r2 = r5.m(r3, r9)     // Catch:{ all -> 0x00ab }
            if (r2 != r0) goto L_0x009a
            return r0
        L_0x009a:
            r0 = r1
            r1 = r10
            r10 = r2
            r2 = r7
        L_0x009e:
            java.util.concurrent.atomic.AtomicReference r0 = r0.f2626a     // Catch:{ all -> 0x00a9 }
            androidx.compose.animation.core.h.a(r0, r2, r4)     // Catch:{ all -> 0x00a9 }
            r1.e(r4)
            return r10
        L_0x00a9:
            r10 = move-exception
            goto L_0x00b9
        L_0x00ab:
            r0 = move-exception
            r2 = r7
            r8 = r1
            r1 = r10
            r10 = r0
            r0 = r8
        L_0x00b1:
            java.util.concurrent.atomic.AtomicReference r0 = r0.f2626a     // Catch:{ all -> 0x00a9 }
            androidx.compose.animation.core.h.a(r0, r2, r4)     // Catch:{ all -> 0x00a9 }
            throw r10     // Catch:{ all -> 0x00a9 }
        L_0x00b9:
            r1.e(r4)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.MutatorMutex$mutateWith$2.x(java.lang.Object):java.lang.Object");
    }
}
