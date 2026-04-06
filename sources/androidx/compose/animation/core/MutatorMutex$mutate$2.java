package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.compose.animation.core.MutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {176, 124}, m = "invokeSuspend")
public final class MutatorMutex$mutate$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<Object>, Object> {
    public Object D;
    public Object E;
    public Object F;
    public int G;
    public /* synthetic */ Object H;
    public final /* synthetic */ MutatePriority I;
    public final /* synthetic */ MutatorMutex J;
    public final /* synthetic */ Function1 K;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MutatorMutex$mutate$2(MutatePriority mutatePriority, MutatorMutex mutatorMutex, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.I = mutatePriority;
        this.J = mutatorMutex;
        this.K = function1;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((MutatorMutex$mutate$2) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        MutatorMutex$mutate$2 mutatorMutex$mutate$2 = new MutatorMutex$mutate$2(this.I, this.J, this.K, continuation);
        mutatorMutex$mutate$2.H = obj;
        return mutatorMutex$mutate$2;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:20:0x0096=Splitter:B:20:0x0096, B:27:0x00a9=Splitter:B:27:0x00a9} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r8.G
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0040
            if (r1 == r3) goto L_0x002b
            if (r1 != r2) goto L_0x0023
            java.lang.Object r0 = r8.E
            androidx.compose.animation.core.MutatorMutex r0 = (androidx.compose.animation.core.MutatorMutex) r0
            java.lang.Object r1 = r8.D
            kotlinx.coroutines.sync.Mutex r1 = (kotlinx.coroutines.sync.Mutex) r1
            java.lang.Object r2 = r8.H
            androidx.compose.animation.core.MutatorMutex$Mutator r2 = (androidx.compose.animation.core.MutatorMutex.Mutator) r2
            kotlin.ResultKt.b(r9)     // Catch:{ all -> 0x0020 }
            goto L_0x0096
        L_0x0020:
            r9 = move-exception
            goto L_0x00a9
        L_0x0023:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x002b:
            java.lang.Object r1 = r8.F
            androidx.compose.animation.core.MutatorMutex r1 = (androidx.compose.animation.core.MutatorMutex) r1
            java.lang.Object r3 = r8.E
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            java.lang.Object r5 = r8.D
            kotlinx.coroutines.sync.Mutex r5 = (kotlinx.coroutines.sync.Mutex) r5
            java.lang.Object r6 = r8.H
            androidx.compose.animation.core.MutatorMutex$Mutator r6 = (androidx.compose.animation.core.MutatorMutex.Mutator) r6
            kotlin.ResultKt.b(r9)
            r9 = r5
            goto L_0x0081
        L_0x0040:
            kotlin.ResultKt.b(r9)
            java.lang.Object r9 = r8.H
            kotlinx.coroutines.CoroutineScope r9 = (kotlinx.coroutines.CoroutineScope) r9
            androidx.compose.animation.core.MutatorMutex$Mutator r1 = new androidx.compose.animation.core.MutatorMutex$Mutator
            androidx.compose.animation.core.MutatePriority r5 = r8.I
            kotlin.coroutines.CoroutineContext r9 = r9.getCoroutineContext()
            kotlinx.coroutines.Job$Key r6 = kotlinx.coroutines.Job.f41415x
            kotlin.coroutines.CoroutineContext$Element r9 = r9.d(r6)
            kotlin.jvm.internal.Intrinsics.f(r9)
            kotlinx.coroutines.Job r9 = (kotlinx.coroutines.Job) r9
            r1.<init>(r5, r9)
            androidx.compose.animation.core.MutatorMutex r9 = r8.J
            r9.f(r1)
            androidx.compose.animation.core.MutatorMutex r9 = r8.J
            kotlinx.coroutines.sync.Mutex r9 = r9.f2627b
            kotlin.jvm.functions.Function1 r5 = r8.K
            androidx.compose.animation.core.MutatorMutex r6 = r8.J
            r8.H = r1
            r8.D = r9
            r8.E = r5
            r8.F = r6
            r8.G = r3
            java.lang.Object r3 = r9.d(r4, r8)
            if (r3 != r0) goto L_0x007d
            return r0
        L_0x007d:
            r3 = r5
            r7 = r6
            r6 = r1
            r1 = r7
        L_0x0081:
            r8.H = r6     // Catch:{ all -> 0x00a3 }
            r8.D = r9     // Catch:{ all -> 0x00a3 }
            r8.E = r1     // Catch:{ all -> 0x00a3 }
            r8.F = r4     // Catch:{ all -> 0x00a3 }
            r8.G = r2     // Catch:{ all -> 0x00a3 }
            java.lang.Object r2 = r3.invoke(r8)     // Catch:{ all -> 0x00a3 }
            if (r2 != r0) goto L_0x0092
            return r0
        L_0x0092:
            r0 = r1
            r1 = r9
            r9 = r2
            r2 = r6
        L_0x0096:
            java.util.concurrent.atomic.AtomicReference r0 = r0.f2626a     // Catch:{ all -> 0x00a1 }
            androidx.compose.animation.core.h.a(r0, r2, r4)     // Catch:{ all -> 0x00a1 }
            r1.e(r4)
            return r9
        L_0x00a1:
            r9 = move-exception
            goto L_0x00b1
        L_0x00a3:
            r0 = move-exception
            r2 = r6
            r7 = r1
            r1 = r9
            r9 = r0
            r0 = r7
        L_0x00a9:
            java.util.concurrent.atomic.AtomicReference r0 = r0.f2626a     // Catch:{ all -> 0x00a1 }
            androidx.compose.animation.core.h.a(r0, r2, r4)     // Catch:{ all -> 0x00a1 }
            throw r9     // Catch:{ all -> 0x00a1 }
        L_0x00b1:
            r1.e(r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.MutatorMutex$mutate$2.x(java.lang.Object):java.lang.Object");
    }
}
