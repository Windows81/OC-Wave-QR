package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3", f = "MouseWheelScrollable.kt", l = {253, 266, 283}, m = "invokeSuspend")
public final class MouseWheelScrollingLogic$dispatchMouseWheelScroll$3 extends SuspendLambda implements Function2<NestedScrollScope, Continuation<? super Unit>, Object> {
    public Object D;
    public Object E;
    public int F;
    public int G;
    public /* synthetic */ Object H;
    public final /* synthetic */ Ref.FloatRef I;
    public final /* synthetic */ Ref.ObjectRef J;
    public final /* synthetic */ Ref.ObjectRef K;
    public final /* synthetic */ float L;
    public final /* synthetic */ MouseWheelScrollingLogic M;
    public final /* synthetic */ float N;
    public final /* synthetic */ ScrollingLogic O;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$dispatchMouseWheelScroll$3(Ref.FloatRef floatRef, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, float f2, MouseWheelScrollingLogic mouseWheelScrollingLogic, float f3, ScrollingLogic scrollingLogic, Continuation continuation) {
        super(2, continuation);
        this.I = floatRef;
        this.J = objectRef;
        this.K = objectRef2;
        this.L = f2;
        this.M = mouseWheelScrollingLogic;
        this.N = f3;
        this.O = scrollingLogic;
    }

    /* renamed from: A */
    public final Object m(NestedScrollScope nestedScrollScope, Continuation continuation) {
        return ((MouseWheelScrollingLogic$dispatchMouseWheelScroll$3) s(nestedScrollScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        MouseWheelScrollingLogic$dispatchMouseWheelScroll$3 mouseWheelScrollingLogic$dispatchMouseWheelScroll$3 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$3(this.I, this.J, this.K, this.L, this.M, this.N, this.O, continuation);
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.H = obj;
        return mouseWheelScrollingLogic$dispatchMouseWheelScroll$3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0185  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r26) {
        /*
            r25 = this;
            r8 = r25
            java.lang.Object r9 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r0 = r8.G
            r10 = 3
            r11 = 2
            r12 = 1
            if (r0 == 0) goto L_0x0057
            if (r0 == r12) goto L_0x0041
            if (r0 == r11) goto L_0x0030
            if (r0 != r10) goto L_0x0028
            java.lang.Object r0 = r8.E
            kotlin.jvm.internal.Ref$BooleanRef r0 = (kotlin.jvm.internal.Ref.BooleanRef) r0
            java.lang.Object r1 = r8.D
            kotlin.jvm.internal.Ref$BooleanRef r1 = (kotlin.jvm.internal.Ref.BooleanRef) r1
            java.lang.Object r2 = r8.H
            androidx.compose.foundation.gestures.NestedScrollScope r2 = (androidx.compose.foundation.gestures.NestedScrollScope) r2
            kotlin.ResultKt.b(r26)
            r13 = r0
            r14 = r2
            r0 = r26
            goto L_0x0155
        L_0x0028:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0030:
            int r0 = r8.F
            java.lang.Object r1 = r8.D
            kotlin.jvm.internal.Ref$BooleanRef r1 = (kotlin.jvm.internal.Ref.BooleanRef) r1
            java.lang.Object r2 = r8.H
            androidx.compose.foundation.gestures.NestedScrollScope r2 = (androidx.compose.foundation.gestures.NestedScrollScope) r2
            kotlin.ResultKt.b(r26)
            r13 = r1
            r14 = r2
            goto L_0x012b
        L_0x0041:
            java.lang.Object r0 = r8.E
            kotlin.jvm.internal.Ref$BooleanRef r0 = (kotlin.jvm.internal.Ref.BooleanRef) r0
            java.lang.Object r1 = r8.D
            kotlin.jvm.internal.Ref$BooleanRef r1 = (kotlin.jvm.internal.Ref.BooleanRef) r1
            java.lang.Object r2 = r8.H
            androidx.compose.foundation.gestures.NestedScrollScope r2 = (androidx.compose.foundation.gestures.NestedScrollScope) r2
            kotlin.ResultKt.b(r26)
            r13 = r0
            r14 = r2
            r11 = r12
            r0 = r26
            goto L_0x0186
        L_0x0057:
            kotlin.ResultKt.b(r26)
            java.lang.Object r0 = r8.H
            androidx.compose.foundation.gestures.NestedScrollScope r0 = (androidx.compose.foundation.gestures.NestedScrollScope) r0
            kotlin.jvm.internal.Ref$BooleanRef r1 = new kotlin.jvm.internal.Ref$BooleanRef
            r1.<init>()
            r1.f40901z = r12
            r14 = r0
            r13 = r1
        L_0x0067:
            boolean r0 = r13.f40901z
            if (r0 == 0) goto L_0x0193
            r0 = 0
            r13.f40901z = r0
            kotlin.jvm.internal.Ref$FloatRef r0 = r8.I
            float r0 = r0.f40905z
            kotlin.jvm.internal.Ref$ObjectRef r1 = r8.J
            java.lang.Object r1 = r1.f40908z
            androidx.compose.animation.core.AnimationState r1 = (androidx.compose.animation.core.AnimationState) r1
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r0 = r0 - r1
            kotlin.jvm.internal.Ref$ObjectRef r1 = r8.K
            java.lang.Object r1 = r1.f40908z
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$MouseWheelScrollDelta r1 = (androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta) r1
            boolean r1 = r1.c()
            if (r1 != 0) goto L_0x0162
            float r1 = java.lang.Math.abs(r0)
            float r2 = r8.L
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x009b
            goto L_0x0162
        L_0x009b:
            float r0 = java.lang.Math.signum(r0)
            float r1 = r8.L
            float r0 = r0 * r1
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic r1 = r8.M
            float unused = r1.q(r14, r0)
            kotlin.jvm.internal.Ref$ObjectRef r1 = r8.J
            java.lang.Object r2 = r1.f40908z
            r15 = r2
            androidx.compose.animation.core.AnimationState r15 = (androidx.compose.animation.core.AnimationState) r15
            androidx.compose.animation.core.AnimationState r2 = (androidx.compose.animation.core.AnimationState) r2
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r16 = r2 + r0
            r23 = 30
            r24 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            androidx.compose.animation.core.AnimationState r0 = androidx.compose.animation.core.AnimationStateKt.g(r15, r16, r17, r18, r20, r22, r23, r24)
            r1.f40908z = r0
            kotlin.jvm.internal.Ref$FloatRef r0 = r8.I
            float r0 = r0.f40905z
            kotlin.jvm.internal.Ref$ObjectRef r1 = r8.J
            java.lang.Object r1 = r1.f40908z
            androidx.compose.animation.core.AnimationState r1 = (androidx.compose.animation.core.AnimationState) r1
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            float r1 = r8.N
            float r0 = r0 / r1
            int r0 = kotlin.math.MathKt.d(r0)
            r1 = 100
            int r15 = kotlin.ranges.RangesKt.j(r0, r1)
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic r0 = r8.M
            kotlin.jvm.internal.Ref$ObjectRef r1 = r8.J
            java.lang.Object r1 = r1.f40908z
            r16 = r1
            androidx.compose.animation.core.AnimationState r16 = (androidx.compose.animation.core.AnimationState) r16
            kotlin.jvm.internal.Ref$FloatRef r5 = r8.I
            float r1 = r5.f40905z
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3$1 r17 = new androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3$1
            kotlin.jvm.internal.Ref$ObjectRef r4 = r8.K
            androidx.compose.foundation.gestures.ScrollingLogic r6 = r8.O
            r2 = r17
            r3 = r0
            r7 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            r8.H = r14
            r8.D = r13
            r2 = 0
            r8.E = r2
            r8.F = r15
            r8.G = r11
            r3 = r1
            r1 = r14
            r2 = r16
            r4 = r15
            r5 = r17
            r6 = r25
            java.lang.Object r0 = r0.m(r1, r2, r3, r4, r5, r6)
            if (r0 != r9) goto L_0x012a
            return r9
        L_0x012a:
            r0 = r15
        L_0x012b:
            boolean r1 = r13.f40901z
            if (r1 != 0) goto L_0x0067
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic r1 = r8.M
            kotlin.jvm.internal.Ref$ObjectRef r2 = r8.K
            kotlin.jvm.internal.Ref$FloatRef r3 = r8.I
            androidx.compose.foundation.gestures.ScrollingLogic r4 = r8.O
            kotlin.jvm.internal.Ref$ObjectRef r5 = r8.J
            r6 = 50
            long r11 = (long) r0
            long r6 = r6 - r11
            r8.H = r14
            r8.D = r13
            r8.E = r13
            r8.G = r10
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r7 = r25
            java.lang.Object r0 = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.s(r0, r1, r2, r3, r4, r5, r7)
            if (r0 != r9) goto L_0x0154
            return r9
        L_0x0154:
            r1 = r13
        L_0x0155:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r13.f40901z = r0
            r13 = r1
            r11 = 2
            r12 = 1
            goto L_0x0067
        L_0x0162:
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic r1 = r8.M
            float unused = r1.q(r14, r0)
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic r0 = r8.M
            kotlin.jvm.internal.Ref$ObjectRef r1 = r8.K
            kotlin.jvm.internal.Ref$FloatRef r2 = r8.I
            androidx.compose.foundation.gestures.ScrollingLogic r3 = r8.O
            kotlin.jvm.internal.Ref$ObjectRef r4 = r8.J
            r8.H = r14
            r8.D = r13
            r8.E = r13
            r11 = 1
            r8.G = r11
            r5 = 50
            r7 = r25
            java.lang.Object r0 = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.s(r0, r1, r2, r3, r4, r5, r7)
            if (r0 != r9) goto L_0x0185
            return r9
        L_0x0185:
            r1 = r13
        L_0x0186:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r13.f40901z = r0
            r13 = r1
            r12 = r11
            r11 = 2
            goto L_0x0067
        L_0x0193:
            kotlin.Unit r0 = kotlin.Unit.f40552a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3.x(java.lang.Object):java.lang.Object");
    }
}
