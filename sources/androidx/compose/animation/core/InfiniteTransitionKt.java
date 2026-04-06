package androidx.compose.animation.core;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.internal.FloatCompanionObject;

@Metadata
public final class InfiniteTransitionKt {
    public static final State a(InfiniteTransition infiniteTransition, float f2, float f3, InfiniteRepeatableSpec infiniteRepeatableSpec, String str, Composer composer, int i2, int i3) {
        int i4 = i2;
        String str2 = (i3 & 8) != 0 ? "FloatAnimation" : str;
        if (ComposerKt.P()) {
            ComposerKt.Y(-644770905, i4, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:296)");
        }
        int i5 = i4 & 1022;
        int i6 = i4 << 3;
        State b2 = b(infiniteTransition, Float.valueOf(f2), Float.valueOf(f3), VectorConvertersKt.i(FloatCompanionObject.f40896a), infiniteRepeatableSpec, str2, composer, i5 | (57344 & i6) | (i6 & 458752), 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return b2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: androidx.compose.animation.core.InfiniteTransition$TransitionAnimationState} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: androidx.compose.animation.core.InfiniteTransition$TransitionAnimationState} */
    /* JADX WARNING: type inference failed for: r12v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.runtime.State b(androidx.compose.animation.core.InfiniteTransition r7, java.lang.Object r8, java.lang.Object r9, androidx.compose.animation.core.TwoWayConverter r10, androidx.compose.animation.core.InfiniteRepeatableSpec r11, java.lang.String r12, androidx.compose.runtime.Composer r13, int r14, int r15) {
        /*
            r15 = r15 & 16
            if (r15 == 0) goto L_0x0006
            java.lang.String r12 = "ValueAnimation"
        L_0x0006:
            r6 = r12
            boolean r12 = androidx.compose.runtime.ComposerKt.P()
            if (r12 == 0) goto L_0x0016
            r12 = -1
            java.lang.String r15 = "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:245)"
            r0 = -1062847727(0xffffffffc0a63b11, float:-5.1947103)
            androidx.compose.runtime.ComposerKt.Y(r0, r14, r12, r15)
        L_0x0016:
            java.lang.Object r12 = r13.g()
            androidx.compose.runtime.Composer$Companion r15 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r15.a()
            if (r12 != r0) goto L_0x0030
            androidx.compose.animation.core.InfiniteTransition$TransitionAnimationState r12 = new androidx.compose.animation.core.InfiniteTransition$TransitionAnimationState
            r0 = r12
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r2, r3, r4, r5, r6)
            r13.N(r12)
        L_0x0030:
            androidx.compose.animation.core.InfiniteTransition$TransitionAnimationState r12 = (androidx.compose.animation.core.InfiniteTransition.TransitionAnimationState) r12
            r10 = r14 & 112(0x70, float:1.57E-43)
            r10 = r10 ^ 48
            r0 = 32
            r1 = 1
            r2 = 0
            if (r10 <= r0) goto L_0x0042
            boolean r10 = r13.l(r8)
            if (r10 != 0) goto L_0x0046
        L_0x0042:
            r10 = r14 & 48
            if (r10 != r0) goto L_0x0048
        L_0x0046:
            r10 = r1
            goto L_0x0049
        L_0x0048:
            r10 = r2
        L_0x0049:
            r0 = r14 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r3 = 256(0x100, float:3.59E-43)
            if (r0 <= r3) goto L_0x0057
            boolean r0 = r13.l(r9)
            if (r0 != 0) goto L_0x005b
        L_0x0057:
            r0 = r14 & 384(0x180, float:5.38E-43)
            if (r0 != r3) goto L_0x005d
        L_0x005b:
            r0 = r1
            goto L_0x005e
        L_0x005d:
            r0 = r2
        L_0x005e:
            r10 = r10 | r0
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r14
            r0 = r0 ^ 24576(0x6000, float:3.4438E-41)
            r3 = 16384(0x4000, float:2.2959E-41)
            if (r0 <= r3) goto L_0x006f
            boolean r0 = r13.l(r11)
            if (r0 != 0) goto L_0x0075
        L_0x006f:
            r14 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r14 != r3) goto L_0x0074
            goto L_0x0075
        L_0x0074:
            r1 = r2
        L_0x0075:
            r10 = r10 | r1
            java.lang.Object r14 = r13.g()
            if (r10 != 0) goto L_0x0082
            java.lang.Object r10 = r15.a()
            if (r14 != r10) goto L_0x008a
        L_0x0082:
            androidx.compose.animation.core.InfiniteTransitionKt$animateValue$1$1 r14 = new androidx.compose.animation.core.InfiniteTransitionKt$animateValue$1$1
            r14.<init>(r8, r12, r9, r11)
            r13.N(r14)
        L_0x008a:
            kotlin.jvm.functions.Function0 r14 = (kotlin.jvm.functions.Function0) r14
            androidx.compose.runtime.EffectsKt.h(r14, r13, r2)
            boolean r8 = r13.l(r7)
            java.lang.Object r9 = r13.g()
            if (r8 != 0) goto L_0x009f
            java.lang.Object r8 = r15.a()
            if (r9 != r8) goto L_0x00a7
        L_0x009f:
            androidx.compose.animation.core.InfiniteTransitionKt$animateValue$2$1 r9 = new androidx.compose.animation.core.InfiniteTransitionKt$animateValue$2$1
            r9.<init>(r7, r12)
            r13.N(r9)
        L_0x00a7:
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            r7 = 6
            androidx.compose.runtime.EffectsKt.c(r12, r9, r13, r7)
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x00b6
            androidx.compose.runtime.ComposerKt.X()
        L_0x00b6:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.InfiniteTransitionKt.b(androidx.compose.animation.core.InfiniteTransition, java.lang.Object, java.lang.Object, androidx.compose.animation.core.TwoWayConverter, androidx.compose.animation.core.InfiniteRepeatableSpec, java.lang.String, androidx.compose.runtime.Composer, int, int):androidx.compose.runtime.State");
    }

    public static final InfiniteTransition c(String str, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            str = "InfiniteTransition";
        }
        if (ComposerKt.P()) {
            ComposerKt.Y(1013651573, i2, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:44)");
        }
        Object g2 = composer.g();
        if (g2 == Composer.f14567a.a()) {
            g2 = new InfiniteTransition(str);
            composer.N(g2);
        }
        InfiniteTransition infiniteTransition = (InfiniteTransition) g2;
        infiniteTransition.k(composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return infiniteTransition;
    }
}
