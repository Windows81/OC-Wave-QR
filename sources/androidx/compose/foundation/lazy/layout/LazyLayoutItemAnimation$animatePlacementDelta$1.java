package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.FiniteAnimationSpec;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1", f = "LazyLayoutItemAnimation.kt", l = {141, 148}, m = "invokeSuspend")
public final class LazyLayoutItemAnimation$animatePlacementDelta$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Object D;
    public int E;
    public final /* synthetic */ LazyLayoutItemAnimation F;
    public final /* synthetic */ FiniteAnimationSpec G;
    public final /* synthetic */ long H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemAnimation$animatePlacementDelta$1(LazyLayoutItemAnimation lazyLayoutItemAnimation, FiniteAnimationSpec finiteAnimationSpec, long j2, Continuation continuation) {
        super(2, continuation);
        this.F = lazyLayoutItemAnimation;
        this.G = finiteAnimationSpec;
        this.H = j2;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((LazyLayoutItemAnimation$animatePlacementDelta$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new LazyLayoutItemAnimation$animatePlacementDelta$1(this.F, this.G, this.H, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a9 A[Catch:{ CancellationException -> 0x00b5 }, RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r11.E
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0023
            if (r1 == r3) goto L_0x001b
            if (r1 != r2) goto L_0x0013
            kotlin.ResultKt.b(r12)     // Catch:{ CancellationException -> 0x00b5 }
            goto L_0x00aa
        L_0x0013:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x001b:
            java.lang.Object r1 = r11.D
            androidx.compose.animation.core.FiniteAnimationSpec r1 = (androidx.compose.animation.core.FiniteAnimationSpec) r1
            kotlin.ResultKt.b(r12)     // Catch:{ CancellationException -> 0x00b5 }
            goto L_0x0067
        L_0x0023:
            kotlin.ResultKt.b(r12)
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r12 = r11.F     // Catch:{ CancellationException -> 0x00b5 }
            androidx.compose.animation.core.Animatable r12 = r12.f4816o     // Catch:{ CancellationException -> 0x00b5 }
            boolean r12 = r12.p()     // Catch:{ CancellationException -> 0x00b5 }
            if (r12 == 0) goto L_0x0041
            androidx.compose.animation.core.FiniteAnimationSpec r12 = r11.G     // Catch:{ CancellationException -> 0x00b5 }
            boolean r1 = r12 instanceof androidx.compose.animation.core.SpringSpec     // Catch:{ CancellationException -> 0x00b5 }
            if (r1 == 0) goto L_0x003b
            androidx.compose.animation.core.SpringSpec r12 = (androidx.compose.animation.core.SpringSpec) r12     // Catch:{ CancellationException -> 0x00b5 }
            goto L_0x003f
        L_0x003b:
            androidx.compose.animation.core.SpringSpec r12 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimationKt.f4827a     // Catch:{ CancellationException -> 0x00b5 }
        L_0x003f:
            r1 = r12
            goto L_0x0044
        L_0x0041:
            androidx.compose.animation.core.FiniteAnimationSpec r12 = r11.G     // Catch:{ CancellationException -> 0x00b5 }
            goto L_0x003f
        L_0x0044:
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r12 = r11.F     // Catch:{ CancellationException -> 0x00b5 }
            androidx.compose.animation.core.Animatable r12 = r12.f4816o     // Catch:{ CancellationException -> 0x00b5 }
            boolean r12 = r12.p()     // Catch:{ CancellationException -> 0x00b5 }
            if (r12 != 0) goto L_0x0070
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r12 = r11.F     // Catch:{ CancellationException -> 0x00b5 }
            androidx.compose.animation.core.Animatable r12 = r12.f4816o     // Catch:{ CancellationException -> 0x00b5 }
            long r4 = r11.H     // Catch:{ CancellationException -> 0x00b5 }
            androidx.compose.ui.unit.IntOffset r4 = androidx.compose.ui.unit.IntOffset.c(r4)     // Catch:{ CancellationException -> 0x00b5 }
            r11.D = r1     // Catch:{ CancellationException -> 0x00b5 }
            r11.E = r3     // Catch:{ CancellationException -> 0x00b5 }
            java.lang.Object r12 = r12.t(r4, r11)     // Catch:{ CancellationException -> 0x00b5 }
            if (r12 != r0) goto L_0x0067
            return r0
        L_0x0067:
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r12 = r11.F     // Catch:{ CancellationException -> 0x00b5 }
            kotlin.jvm.functions.Function0 r12 = r12.f4804c     // Catch:{ CancellationException -> 0x00b5 }
            r12.invoke()     // Catch:{ CancellationException -> 0x00b5 }
        L_0x0070:
            r5 = r1
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r12 = r11.F     // Catch:{ CancellationException -> 0x00b5 }
            androidx.compose.animation.core.Animatable r12 = r12.f4816o     // Catch:{ CancellationException -> 0x00b5 }
            java.lang.Object r12 = r12.m()     // Catch:{ CancellationException -> 0x00b5 }
            androidx.compose.ui.unit.IntOffset r12 = (androidx.compose.ui.unit.IntOffset) r12     // Catch:{ CancellationException -> 0x00b5 }
            long r3 = r12.r()     // Catch:{ CancellationException -> 0x00b5 }
            long r6 = r11.H     // Catch:{ CancellationException -> 0x00b5 }
            long r3 = androidx.compose.ui.unit.IntOffset.n(r3, r6)     // Catch:{ CancellationException -> 0x00b5 }
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r12 = r11.F     // Catch:{ CancellationException -> 0x00b5 }
            androidx.compose.animation.core.Animatable r12 = r12.f4816o     // Catch:{ CancellationException -> 0x00b5 }
            androidx.compose.ui.unit.IntOffset r1 = androidx.compose.ui.unit.IntOffset.c(r3)     // Catch:{ CancellationException -> 0x00b5 }
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1$1 r7 = new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1$1     // Catch:{ CancellationException -> 0x00b5 }
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r6 = r11.F     // Catch:{ CancellationException -> 0x00b5 }
            r7.<init>(r6, r3)     // Catch:{ CancellationException -> 0x00b5 }
            r3 = 0
            r11.D = r3     // Catch:{ CancellationException -> 0x00b5 }
            r11.E = r2     // Catch:{ CancellationException -> 0x00b5 }
            r6 = 0
            r9 = 4
            r10 = 0
            r3 = r12
            r4 = r1
            r8 = r11
            java.lang.Object r12 = androidx.compose.animation.core.Animatable.f(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ CancellationException -> 0x00b5 }
            if (r12 != r0) goto L_0x00aa
            return r0
        L_0x00aa:
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r12 = r11.F     // Catch:{ CancellationException -> 0x00b5 }
            r0 = 0
            r12.G(r0)     // Catch:{ CancellationException -> 0x00b5 }
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r12 = r11.F     // Catch:{ CancellationException -> 0x00b5 }
            r12.f4808g = r0     // Catch:{ CancellationException -> 0x00b5 }
        L_0x00b5:
            kotlin.Unit r12 = kotlin.Unit.f40552a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1.x(java.lang.Object):java.lang.Object");
    }
}
