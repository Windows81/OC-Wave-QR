package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.Icons;
import androidx.compose.material3.tokens.OutlinedSegmentedButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
public final class SegmentedButtonDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final SegmentedButtonDefaults f10921a = new SegmentedButtonDefaults();

    /* renamed from: b  reason: collision with root package name */
    public static final float f10922b;

    /* renamed from: c  reason: collision with root package name */
    public static final float f10923c;

    /* renamed from: d  reason: collision with root package name */
    public static final PaddingValues f10924d = ButtonDefaults.f9301a.k();

    static {
        OutlinedSegmentedButtonTokens outlinedSegmentedButtonTokens = OutlinedSegmentedButtonTokens.f13771a;
        f10922b = outlinedSegmentedButtonTokens.c();
        f10923c = outlinedSegmentedButtonTokens.a();
    }

    public static final Unit d(SegmentedButtonDefaults segmentedButtonDefaults, int i2, Composer composer, int i3) {
        segmentedButtonDefaults.c(composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final Unit f(SegmentedButtonDefaults segmentedButtonDefaults, boolean z2, Function2 function2, Function2 function22, int i2, int i3, Composer composer, int i4) {
        segmentedButtonDefaults.e(z2, function2, function22, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public final void c(Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(-1273041460);
        if ((i2 & 6) == 0) {
            i3 = (q2.W(this) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (q2.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1273041460, i3, -1, "androidx.compose.material3.SegmentedButtonDefaults.ActiveIcon (SegmentedButton.kt:614)");
            }
            IconKt.e(Icons.Filled.f12257a.b(), (String) null, SizeKt.t(Modifier.f15489d, f10923c), 0, q2, 48, 8);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new K5(this, i2));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(boolean r17, kotlin.jvm.functions.Function2 r18, kotlin.jvm.functions.Function2 r19, androidx.compose.runtime.Composer r20, int r21, int r22) {
        /*
            r16 = this;
            r5 = r21
            r0 = -657462570(0xffffffffd8cfead6, float:-1.82886016E15)
            r1 = r20
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r22 & 1
            r3 = 2
            if (r2 == 0) goto L_0x0016
            r2 = r5 | 6
            r4 = r2
            r2 = r17
            goto L_0x002a
        L_0x0016:
            r2 = r5 & 6
            if (r2 != 0) goto L_0x0027
            r2 = r17
            boolean r4 = r1.d(r2)
            if (r4 == 0) goto L_0x0024
            r4 = 4
            goto L_0x0025
        L_0x0024:
            r4 = r3
        L_0x0025:
            r4 = r4 | r5
            goto L_0x002a
        L_0x0027:
            r2 = r17
            r4 = r5
        L_0x002a:
            r6 = r22 & 2
            if (r6 == 0) goto L_0x0033
            r4 = r4 | 48
        L_0x0030:
            r7 = r18
            goto L_0x0045
        L_0x0033:
            r7 = r5 & 48
            if (r7 != 0) goto L_0x0030
            r7 = r18
            boolean r8 = r1.l(r7)
            if (r8 == 0) goto L_0x0042
            r8 = 32
            goto L_0x0044
        L_0x0042:
            r8 = 16
        L_0x0044:
            r4 = r4 | r8
        L_0x0045:
            r8 = r22 & 4
            if (r8 == 0) goto L_0x004e
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004b:
            r9 = r19
            goto L_0x0060
        L_0x004e:
            r9 = r5 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x004b
            r9 = r19
            boolean r10 = r1.l(r9)
            if (r10 == 0) goto L_0x005d
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r10 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r4 = r4 | r10
        L_0x0060:
            r10 = r4 & 147(0x93, float:2.06E-43)
            r11 = 146(0x92, float:2.05E-43)
            if (r10 == r11) goto L_0x0068
            r10 = 1
            goto L_0x0069
        L_0x0068:
            r10 = 0
        L_0x0069:
            r11 = r4 & 1
            boolean r10 = r1.E(r10, r11)
            if (r10 == 0) goto L_0x011a
            if (r6 == 0) goto L_0x007b
            androidx.compose.material3.ComposableSingletons$SegmentedButtonKt r6 = androidx.compose.material3.ComposableSingletons$SegmentedButtonKt.f9582a
            kotlin.jvm.functions.Function2 r6 = r6.a()
            r15 = r6
            goto L_0x007c
        L_0x007b:
            r15 = r7
        L_0x007c:
            r6 = 0
            if (r8 == 0) goto L_0x0081
            r14 = r6
            goto L_0x0082
        L_0x0081:
            r14 = r9
        L_0x0082:
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x008e
            r7 = -1
            java.lang.String r8 = "androidx.compose.material3.SegmentedButtonDefaults.Icon (SegmentedButton.kt:635)"
            androidx.compose.runtime.ComposerKt.Y(r0, r4, r7, r8)
        L_0x008e:
            r0 = 54
            r7 = 6
            if (r14 != 0) goto L_0x00e1
            r8 = -1416314439(0xffffffffab94c1b9, float:-1.0569801E-12)
            r1.X(r8)
            androidx.compose.animation.ExitTransition$Companion r8 = androidx.compose.animation.ExitTransition.f2277a
            androidx.compose.animation.ExitTransition r9 = r8.a()
            androidx.compose.material3.tokens.MotionSchemeKeyTokens r8 = androidx.compose.material3.tokens.MotionSchemeKeyTokens.DefaultEffects
            androidx.compose.animation.core.FiniteAnimationSpec r8 = androidx.compose.material3.MotionSchemeKt.b(r8, r1, r7)
            r10 = 0
            androidx.compose.animation.EnterTransition r3 = androidx.compose.animation.EnterExitTransitionKt.o(r8, r10, r3, r6)
            r6 = 1065353216(0x3f800000, float:1.0)
            long r12 = androidx.compose.ui.graphics.TransformOriginKt.a(r10, r6)
            androidx.compose.material3.tokens.MotionSchemeKeyTokens r6 = androidx.compose.material3.tokens.MotionSchemeKeyTokens.FastSpatial
            androidx.compose.animation.core.FiniteAnimationSpec r6 = androidx.compose.material3.MotionSchemeKt.b(r6, r1, r7)
            androidx.compose.animation.EnterTransition r6 = androidx.compose.animation.EnterExitTransitionKt.r(r6, r10, r12)
            androidx.compose.animation.EnterTransition r8 = r3.c(r6)
            androidx.compose.material3.SegmentedButtonDefaults$Icon$1 r3 = new androidx.compose.material3.SegmentedButtonDefaults$Icon$1
            r3.<init>(r15)
            r6 = 2059591811(0x7ac2e083, float:5.059296E35)
            r7 = 1
            androidx.compose.runtime.internal.ComposableLambda r11 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r6, r7, r3, r1, r0)
            r0 = 196608(0x30000, float:2.75506E-40)
            r3 = r4 & 14
            r13 = r3 | r0
            r0 = 18
            r7 = 0
            r10 = 0
            r6 = r17
            r12 = r1
            r3 = r14
            r14 = r0
            androidx.compose.animation.AnimatedVisibilityKt.j(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1.M()
            goto L_0x010e
        L_0x00e1:
            r3 = r14
            r6 = -1415695803(0xffffffffab9e3245, float:-1.1240528E-12)
            r1.X(r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r17)
            androidx.compose.material3.tokens.MotionSchemeKeyTokens r8 = androidx.compose.material3.tokens.MotionSchemeKeyTokens.DefaultEffects
            androidx.compose.animation.core.FiniteAnimationSpec r8 = androidx.compose.material3.MotionSchemeKt.b(r8, r1, r7)
            androidx.compose.material3.SegmentedButtonDefaults$Icon$2 r7 = new androidx.compose.material3.SegmentedButtonDefaults$Icon$2
            r7.<init>(r15, r3)
            r9 = -1785818285(0xffffffff958e9353, float:-5.758578E-26)
            r10 = 1
            androidx.compose.runtime.internal.ComposableLambda r10 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r9, r10, r7, r1, r0)
            r0 = r4 & 14
            r12 = r0 | 24576(0x6000, float:3.4438E-41)
            r13 = 10
            r7 = 0
            r9 = 0
            r11 = r1
            androidx.compose.animation.CrossfadeKt.b(r6, r7, r8, r9, r10, r11, r12, r13)
            r1.M()
        L_0x010e:
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0117
            androidx.compose.runtime.ComposerKt.X()
        L_0x0117:
            r4 = r3
            r3 = r15
            goto L_0x011f
        L_0x011a:
            r1.B()
            r3 = r7
            r4 = r9
        L_0x011f:
            androidx.compose.runtime.ScopeUpdateScope r7 = r1.x()
            if (r7 == 0) goto L_0x0136
            androidx.compose.material3.L5 r8 = new androidx.compose.material3.L5
            r0 = r8
            r1 = r16
            r2 = r17
            r5 = r21
            r6 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0136:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SegmentedButtonDefaults.e(boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    public final float g() {
        return f10923c;
    }
}
