package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Metadata
public final class LazyLayoutScrollScopeKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f4917a = Dp.m((float) 2500);

    /* renamed from: b  reason: collision with root package name */
    public static final float f4918b = Dp.m((float) 1500);

    /* renamed from: c  reason: collision with root package name */
    public static final float f4919c = Dp.m((float) 50);

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0163 A[Catch:{ ItemFoundInScroll -> 0x01c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0165 A[Catch:{ ItemFoundInScroll -> 0x01c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x016a A[Catch:{ ItemFoundInScroll -> 0x01c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x016d A[Catch:{ ItemFoundInScroll -> 0x01c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01b5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x024b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x024c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope r42, int r43, int r44, int r45, androidx.compose.ui.unit.Density r46, kotlin.coroutines.Continuation r47) {
        /*
            r1 = r43
            r0 = r46
            r2 = r47
            boolean r3 = r2 instanceof androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt$animateScrollToItem$1
            if (r3 == 0) goto L_0x0019
            r3 = r2
            androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt$animateScrollToItem$1 r3 = (androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt$animateScrollToItem$1) r3
            int r4 = r3.O
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.O = r4
            goto L_0x001e
        L_0x0019:
            androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt$animateScrollToItem$1 r3 = new androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt$animateScrollToItem$1
            r3.<init>(r2)
        L_0x001e:
            java.lang.Object r2 = r3.N
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r5 = r3.O
            r6 = 0
            r7 = 2
            r10 = 1
            if (r5 == 0) goto L_0x0083
            if (r5 == r10) goto L_0x0044
            if (r5 != r7) goto L_0x003c
            int r0 = r3.H
            int r1 = r3.G
            java.lang.Object r3 = r3.C
            androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope r3 = (androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope) r3
            kotlin.ResultKt.b(r2)
            goto L_0x024e
        L_0x003c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0044:
            int r0 = r3.J
            float r1 = r3.M
            float r5 = r3.L
            float r11 = r3.K
            int r12 = r3.I
            int r13 = r3.H
            int r14 = r3.G
            java.lang.Object r15 = r3.F
            kotlin.jvm.internal.Ref$IntRef r15 = (kotlin.jvm.internal.Ref.IntRef) r15
            java.lang.Object r7 = r3.E
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref.ObjectRef) r7
            java.lang.Object r8 = r3.D
            kotlin.jvm.internal.Ref$BooleanRef r8 = (kotlin.jvm.internal.Ref.BooleanRef) r8
            java.lang.Object r9 = r3.C
            androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope r9 = (androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope) r9
            kotlin.ResultKt.b(r2)     // Catch:{ ItemFoundInScroll -> 0x0078 }
            r2 = r14
            r40 = r9
            r9 = r0
            r0 = r12
            r12 = r8
            r8 = r5
            r5 = r1
            r1 = r40
            r41 = r7
            r7 = r3
            r3 = r13
            r13 = r11
            r11 = r41
            goto L_0x01b8
        L_0x0078:
            r0 = move-exception
            r2 = r9
            r1 = r14
            r7 = 0
            r40 = r13
            r13 = r3
            r3 = r40
            goto L_0x01f0
        L_0x0083:
            kotlin.ResultKt.b(r2)
            float r2 = (float) r1
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x008d
            r2 = r10
            goto L_0x008e
        L_0x008d:
            r2 = 0
        L_0x008e:
            if (r2 != 0) goto L_0x0095
            java.lang.String r2 = "Index should be non-negative"
            androidx.compose.foundation.internal.InlineClassHelperKt.a(r2)
        L_0x0095:
            float r2 = f4917a     // Catch:{ ItemFoundInScroll -> 0x01eb }
            float r2 = r0.B1(r2)     // Catch:{ ItemFoundInScroll -> 0x01eb }
            float r5 = f4918b     // Catch:{ ItemFoundInScroll -> 0x01eb }
            float r5 = r0.B1(r5)     // Catch:{ ItemFoundInScroll -> 0x01eb }
            float r7 = f4919c     // Catch:{ ItemFoundInScroll -> 0x01eb }
            float r0 = r0.B1(r7)     // Catch:{ ItemFoundInScroll -> 0x01eb }
            kotlin.jvm.internal.Ref$BooleanRef r7 = new kotlin.jvm.internal.Ref$BooleanRef     // Catch:{ ItemFoundInScroll -> 0x01eb }
            r7.<init>()     // Catch:{ ItemFoundInScroll -> 0x01eb }
            r7.f40901z = r10     // Catch:{ ItemFoundInScroll -> 0x01eb }
            kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch:{ ItemFoundInScroll -> 0x01eb }
            r8.<init>()     // Catch:{ ItemFoundInScroll -> 0x01eb }
            r24 = 30
            r25 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            androidx.compose.animation.core.AnimationState r9 = androidx.compose.animation.core.AnimationStateKt.c(r17, r18, r19, r21, r23, r24, r25)     // Catch:{ ItemFoundInScroll -> 0x01eb }
            r8.f40908z = r9     // Catch:{ ItemFoundInScroll -> 0x01eb }
            boolean r9 = d(r42, r43)     // Catch:{ ItemFoundInScroll -> 0x01eb }
            if (r9 != 0) goto L_0x01d5
            int r9 = r42.h()     // Catch:{ ItemFoundInScroll -> 0x01cd }
            if (r1 <= r9) goto L_0x00d5
            r9 = r10
            goto L_0x00d6
        L_0x00d5:
            r9 = 0
        L_0x00d6:
            kotlin.jvm.internal.Ref$IntRef r11 = new kotlin.jvm.internal.Ref$IntRef     // Catch:{ ItemFoundInScroll -> 0x01cd }
            r11.<init>()     // Catch:{ ItemFoundInScroll -> 0x01cd }
            r11.f40906z = r10     // Catch:{ ItemFoundInScroll -> 0x01cd }
            r13 = r2
            r12 = r7
            r15 = r11
            r2 = r1
            r7 = r3
            r11 = r8
            r1 = r42
            r3 = r44
            r8 = r5
            r5 = r0
            r0 = r45
        L_0x00eb:
            boolean r14 = r12.f40901z     // Catch:{ ItemFoundInScroll -> 0x01c9 }
            if (r14 == 0) goto L_0x0251
            int r14 = r1.b()     // Catch:{ ItemFoundInScroll -> 0x01c9 }
            if (r14 <= 0) goto L_0x0251
            r6 = 0
            r10 = 0
            r14 = 2
            int r17 = androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope.a(r1, r2, r6, r14, r10)     // Catch:{ ItemFoundInScroll -> 0x01c9 }
            int r6 = r17 + r3
            int r10 = java.lang.Math.abs(r6)     // Catch:{ ItemFoundInScroll -> 0x01c9 }
            float r10 = (float) r10
            int r10 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r10 >= 0) goto L_0x0121
            float r6 = (float) r6
            float r6 = java.lang.Math.abs(r6)     // Catch:{ ItemFoundInScroll -> 0x0117 }
            float r6 = java.lang.Math.max(r6, r5)     // Catch:{ ItemFoundInScroll -> 0x0117 }
            if (r9 == 0) goto L_0x0115
        L_0x0112:
            r20 = r6
            goto L_0x0128
        L_0x0115:
            float r6 = -r6
            goto L_0x0112
        L_0x0117:
            r0 = move-exception
            r13 = r7
            r7 = 0
            r40 = r2
            r2 = r1
            r1 = r40
            goto L_0x01f0
        L_0x0121:
            if (r9 == 0) goto L_0x0126
            r20 = r13
            goto L_0x0128
        L_0x0126:
            float r6 = -r13
            goto L_0x0112
        L_0x0128:
            java.lang.Object r6 = r11.f40908z     // Catch:{ ItemFoundInScroll -> 0x01c9 }
            r30 = r6
            androidx.compose.animation.core.AnimationState r30 = (androidx.compose.animation.core.AnimationState) r30     // Catch:{ ItemFoundInScroll -> 0x01c9 }
            r38 = 30
            r39 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r35 = 0
            r37 = 0
            androidx.compose.animation.core.AnimationState r6 = androidx.compose.animation.core.AnimationStateKt.g(r30, r31, r32, r33, r35, r37, r38, r39)     // Catch:{ ItemFoundInScroll -> 0x01c9 }
            r11.f40908z = r6     // Catch:{ ItemFoundInScroll -> 0x01c9 }
            kotlin.jvm.internal.Ref$FloatRef r21 = new kotlin.jvm.internal.Ref$FloatRef     // Catch:{ ItemFoundInScroll -> 0x01c9 }
            r21.<init>()     // Catch:{ ItemFoundInScroll -> 0x01c9 }
            java.lang.Object r6 = r11.f40908z     // Catch:{ ItemFoundInScroll -> 0x01c9 }
            androidx.compose.animation.core.AnimationState r6 = (androidx.compose.animation.core.AnimationState) r6     // Catch:{ ItemFoundInScroll -> 0x01c9 }
            java.lang.Float r10 = kotlin.coroutines.jvm.internal.Boxing.b(r20)     // Catch:{ ItemFoundInScroll -> 0x01c9 }
            java.lang.Object r14 = r11.f40908z     // Catch:{ ItemFoundInScroll -> 0x01c9 }
            androidx.compose.animation.core.AnimationState r14 = (androidx.compose.animation.core.AnimationState) r14     // Catch:{ ItemFoundInScroll -> 0x01c9 }
            java.lang.Object r14 = r14.m()     // Catch:{ ItemFoundInScroll -> 0x01c9 }
            java.lang.Number r14 = (java.lang.Number) r14     // Catch:{ ItemFoundInScroll -> 0x01c9 }
            float r14 = r14.floatValue()     // Catch:{ ItemFoundInScroll -> 0x01c9 }
            r17 = 0
            int r14 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r14 != 0) goto L_0x0165
            r14 = 0
            goto L_0x0166
        L_0x0165:
            r14 = 1
        L_0x0166:
            androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt$animateScrollToItem$4 r30 = new androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt$animateScrollToItem$4     // Catch:{ ItemFoundInScroll -> 0x01c9 }
            if (r9 == 0) goto L_0x016d
            r23 = 1
            goto L_0x016f
        L_0x016d:
            r23 = 0
        L_0x016f:
            r17 = r30
            r18 = r1
            r19 = r2
            r22 = r12
            r24 = r8
            r25 = r15
            r26 = r0
            r27 = r3
            r28 = r11
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ ItemFoundInScroll -> 0x01c9 }
            r7.C = r1     // Catch:{ ItemFoundInScroll -> 0x01c9 }
            r7.D = r12     // Catch:{ ItemFoundInScroll -> 0x01c9 }
            r7.E = r11     // Catch:{ ItemFoundInScroll -> 0x01c9 }
            r7.F = r15     // Catch:{ ItemFoundInScroll -> 0x01c9 }
            r7.G = r2     // Catch:{ ItemFoundInScroll -> 0x01c9 }
            r7.H = r3     // Catch:{ ItemFoundInScroll -> 0x01c9 }
            r7.I = r0     // Catch:{ ItemFoundInScroll -> 0x01c9 }
            r7.K = r13     // Catch:{ ItemFoundInScroll -> 0x01c9 }
            r7.L = r8     // Catch:{ ItemFoundInScroll -> 0x01c9 }
            r7.M = r5     // Catch:{ ItemFoundInScroll -> 0x01c9 }
            r7.J = r9     // Catch:{ ItemFoundInScroll -> 0x01c9 }
            r42 = r1
            r1 = 1
            r7.O = r1     // Catch:{ ItemFoundInScroll -> 0x01c2 }
            r19 = 0
            r23 = 2
            r24 = 0
            r17 = r6
            r18 = r10
            r20 = r14
            r21 = r30
            r22 = r7
            java.lang.Object r1 = androidx.compose.animation.core.SuspendAnimationKt.k(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ ItemFoundInScroll -> 0x01c2 }
            if (r1 != r4) goto L_0x01b6
            return r4
        L_0x01b6:
            r1 = r42
        L_0x01b8:
            int r6 = r15.f40906z     // Catch:{ ItemFoundInScroll -> 0x0117 }
            r10 = 1
            int r6 = r6 + r10
            r15.f40906z = r6     // Catch:{ ItemFoundInScroll -> 0x0117 }
            r6 = 0
            r10 = 1
            goto L_0x00eb
        L_0x01c2:
            r0 = move-exception
        L_0x01c3:
            r1 = r2
            r13 = r7
            r7 = 0
            r2 = r42
            goto L_0x01f0
        L_0x01c9:
            r0 = move-exception
            r42 = r1
            goto L_0x01c3
        L_0x01cd:
            r0 = move-exception
            r2 = r42
            r13 = r3
            r7 = 0
        L_0x01d2:
            r3 = r44
            goto L_0x01f0
        L_0x01d5:
            r2 = r42
            r5 = 2
            r6 = 0
            r7 = 0
            int r0 = androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope.a(r2, r1, r7, r5, r6)     // Catch:{ ItemFoundInScroll -> 0x01e8 }
            androidx.compose.foundation.lazy.layout.ItemFoundInScroll r5 = new androidx.compose.foundation.lazy.layout.ItemFoundInScroll     // Catch:{ ItemFoundInScroll -> 0x01e8 }
            java.lang.Object r6 = r8.f40908z     // Catch:{ ItemFoundInScroll -> 0x01e8 }
            androidx.compose.animation.core.AnimationState r6 = (androidx.compose.animation.core.AnimationState) r6     // Catch:{ ItemFoundInScroll -> 0x01e8 }
            r5.<init>(r0, r6)     // Catch:{ ItemFoundInScroll -> 0x01e8 }
            throw r5     // Catch:{ ItemFoundInScroll -> 0x01e8 }
        L_0x01e8:
            r0 = move-exception
        L_0x01e9:
            r13 = r3
            goto L_0x01d2
        L_0x01eb:
            r0 = move-exception
            r2 = r42
            r7 = 0
            goto L_0x01e9
        L_0x01f0:
            androidx.compose.animation.core.AnimationState r16 = r0.b()
            r24 = 30
            r25 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            androidx.compose.animation.core.AnimationState r8 = androidx.compose.animation.core.AnimationStateKt.g(r16, r17, r18, r19, r21, r23, r24, r25)
            int r0 = r0.a()
            int r0 = r0 + r3
            float r0 = (float) r0
            kotlin.jvm.internal.Ref$FloatRef r5 = new kotlin.jvm.internal.Ref$FloatRef
            r5.<init>()
            java.lang.Float r9 = kotlin.coroutines.jvm.internal.Boxing.b(r0)
            java.lang.Object r6 = r8.m()
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            r10 = 0
            int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x0228
            r6 = 1
            r29 = 1
            goto L_0x022b
        L_0x0228:
            r29 = r7
            r6 = 1
        L_0x022b:
            r11 = r29 ^ 1
            androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt$animateScrollToItem$6 r12 = new androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt$animateScrollToItem$6
            r12.<init>(r0, r5, r2)
            r13.C = r2
            r5 = 0
            r13.D = r5
            r13.E = r5
            r13.F = r5
            r13.G = r1
            r13.H = r3
            r5 = 2
            r13.O = r5
            r10 = 0
            r14 = 2
            r15 = 0
            java.lang.Object r0 = androidx.compose.animation.core.SuspendAnimationKt.k(r8, r9, r10, r11, r12, r13, r14, r15)
            if (r0 != r4) goto L_0x024c
            return r4
        L_0x024c:
            r0 = r3
            r3 = r2
        L_0x024e:
            r3.e(r1, r0)
        L_0x0251:
            kotlin.Unit r0 = kotlin.Unit.f40552a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt.b(androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope, int, int, int, androidx.compose.ui.unit.Density, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final boolean c(boolean z2, LazyLayoutScrollScope lazyLayoutScrollScope, int i2, int i3) {
        if (z2) {
            if (lazyLayoutScrollScope.h() <= i2 && (lazyLayoutScrollScope.h() != i2 || lazyLayoutScrollScope.f() <= i3)) {
                return false;
            }
        } else if (lazyLayoutScrollScope.h() >= i2 && (lazyLayoutScrollScope.h() != i2 || lazyLayoutScrollScope.f() >= i3)) {
            return false;
        }
        return true;
    }

    public static final boolean d(LazyLayoutScrollScope lazyLayoutScrollScope, int i2) {
        return i2 <= lazyLayoutScrollScope.c() && lazyLayoutScrollScope.h() <= i2;
    }
}
