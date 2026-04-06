package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class EnterExitTransitionKt {

    /* renamed from: a  reason: collision with root package name */
    public static final TwoWayConverter f2214a = VectorConvertersKt.a(EnterExitTransitionKt$TransformOriginVectorConverter$1.f2218z, EnterExitTransitionKt$TransformOriginVectorConverter$2.f2219z);

    /* renamed from: b  reason: collision with root package name */
    public static final SpringSpec f2215b = AnimationSpecKt.l(0.0f, 400.0f, (Object) null, 5, (Object) null);

    /* renamed from: c  reason: collision with root package name */
    public static final SpringSpec f2216c = AnimationSpecKt.l(0.0f, 400.0f, IntOffset.c(VisibilityThresholdsKt.e(IntOffset.f19160b)), 1, (Object) null);

    /* renamed from: d  reason: collision with root package name */
    public static final SpringSpec f2217d = AnimationSpecKt.l(0.0f, 400.0f, IntSize.b(VisibilityThresholdsKt.f(IntSize.f19170b)), 1, (Object) null);

    public static final EnterTransition A(FiniteAnimationSpec finiteAnimationSpec, Function1 function1) {
        return z(finiteAnimationSpec, new EnterExitTransitionKt$slideInVertically$2(function1));
    }

    public static /* synthetic */ EnterTransition B(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.l(0.0f, 400.0f, IntOffset.c(VisibilityThresholdsKt.e(IntOffset.f19160b)), 1, (Object) null);
        }
        if ((i2 & 2) != 0) {
            function1 = EnterExitTransitionKt$slideInVertically$1.f2253z;
        }
        return A(finiteAnimationSpec, function1);
    }

    public static final ExitTransition C(FiniteAnimationSpec finiteAnimationSpec, Function1 function1) {
        return new ExitTransitionImpl(new TransitionData((Fade) null, new Slide(function1, finiteAnimationSpec), (ChangeSize) null, (Scale) null, false, (Map) null, 61, (DefaultConstructorMarker) null));
    }

    public static final ExitTransition D(FiniteAnimationSpec finiteAnimationSpec, Function1 function1) {
        return C(finiteAnimationSpec, new EnterExitTransitionKt$slideOutVertically$2(function1));
    }

    public static /* synthetic */ ExitTransition E(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.l(0.0f, 400.0f, IntOffset.c(VisibilityThresholdsKt.e(IntOffset.f19160b)), 1, (Object) null);
        }
        if ((i2 & 2) != 0) {
            function1 = EnterExitTransitionKt$slideOutVertically$1.f2257z;
        }
        return D(finiteAnimationSpec, function1);
    }

    public static final Alignment F(Alignment.Horizontal horizontal) {
        Alignment.Companion companion = Alignment.f15444a;
        return Intrinsics.d(horizontal, companion.k()) ? companion.h() : Intrinsics.d(horizontal, companion.j()) ? companion.f() : companion.e();
    }

    public static final Alignment G(Alignment.Vertical vertical) {
        Alignment.Companion companion = Alignment.f15444a;
        return Intrinsics.d(vertical, companion.l()) ? companion.m() : Intrinsics.d(vertical, companion.a()) ? companion.b() : companion.e();
    }

    public static final EnterTransition H(Transition transition, EnterTransition enterTransition, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(21614502, i2, -1, "androidx.compose.animation.trackActiveEnter (EnterExitTransition.kt:908)");
        }
        boolean z2 = (((i2 & 14) ^ 6) > 4 && composer.W(transition)) || (i2 & 6) == 4;
        Object g2 = composer.g();
        if (z2 || g2 == Composer.f14567a.a()) {
            g2 = SnapshotStateKt__SnapshotStateKt.e(enterTransition, (SnapshotMutationPolicy) null, 2, (Object) null);
            composer.N(g2);
        }
        MutableState mutableState = (MutableState) g2;
        if (transition.i() == transition.q() && transition.i() == EnterExitState.Visible) {
            if (transition.v()) {
                J(mutableState, enterTransition);
            } else {
                J(mutableState, EnterTransition.f2274a.a());
            }
        } else if (transition.q() == EnterExitState.Visible) {
            J(mutableState, I(mutableState).c(enterTransition));
        }
        EnterTransition I = I(mutableState);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return I;
    }

    public static final EnterTransition I(MutableState mutableState) {
        return (EnterTransition) mutableState.getValue();
    }

    public static final void J(MutableState mutableState, EnterTransition enterTransition) {
        mutableState.setValue(enterTransition);
    }

    public static final ExitTransition K(Transition transition, ExitTransition exitTransition, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-1363864804, i2, -1, "androidx.compose.animation.trackActiveExit (EnterExitTransition.kt:928)");
        }
        boolean z2 = (((i2 & 14) ^ 6) > 4 && composer.W(transition)) || (i2 & 6) == 4;
        Object g2 = composer.g();
        if (z2 || g2 == Composer.f14567a.a()) {
            g2 = SnapshotStateKt__SnapshotStateKt.e(exitTransition, (SnapshotMutationPolicy) null, 2, (Object) null);
            composer.N(g2);
        }
        MutableState mutableState = (MutableState) g2;
        if (transition.i() == transition.q() && transition.i() == EnterExitState.Visible) {
            if (transition.v()) {
                M(mutableState, exitTransition);
            } else {
                M(mutableState, ExitTransition.f2277a.a());
            }
        } else if (transition.q() != EnterExitState.Visible) {
            M(mutableState, L(mutableState).c(exitTransition));
        }
        ExitTransition L = L(mutableState);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return L;
    }

    public static final ExitTransition L(MutableState mutableState) {
        return (ExitTransition) mutableState.getValue();
    }

    public static final void M(MutableState mutableState, ExitTransition exitTransition) {
        mutableState.setValue(exitTransition);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: androidx.compose.animation.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: androidx.compose.animation.b} */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0119, code lost:
        if (r7.W(r21) == false) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0134, code lost:
        if (r7.W(r22) == false) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0153, code lost:
        if (r7.W(r20) == false) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0170, code lost:
        if (r4 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x0172;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x018b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.animation.GraphicsLayerBlockForEnterExit e(androidx.compose.animation.core.Transition r20, androidx.compose.animation.EnterTransition r21, androidx.compose.animation.ExitTransition r22, java.lang.String r23, androidx.compose.runtime.Composer r24, int r25) {
        /*
            r0 = r23
            r7 = r24
            r8 = r25
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0015
            r1 = -1
            java.lang.String r2 = "androidx.compose.animation.createGraphicsLayerBlock (EnterExitTransition.kt:956)"
            r3 = 642253525(0x264802d5, float:6.9392777E-16)
            androidx.compose.runtime.ComposerKt.Y(r3, r8, r1, r2)
        L_0x0015:
            androidx.compose.animation.TransitionData r1 = r21.b()
            androidx.compose.animation.Fade r1 = r1.c()
            r9 = 1
            r10 = 0
            if (r1 != 0) goto L_0x002e
            androidx.compose.animation.TransitionData r1 = r22.b()
            androidx.compose.animation.Fade r1 = r1.c()
            if (r1 == 0) goto L_0x002c
            goto L_0x002e
        L_0x002c:
            r1 = r10
            goto L_0x002f
        L_0x002e:
            r1 = r9
        L_0x002f:
            androidx.compose.animation.TransitionData r2 = r21.b()
            androidx.compose.animation.Scale r2 = r2.e()
            if (r2 != 0) goto L_0x0046
            androidx.compose.animation.TransitionData r2 = r22.b()
            androidx.compose.animation.Scale r2 = r2.e()
            if (r2 == 0) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            r11 = r10
            goto L_0x0047
        L_0x0046:
            r11 = r9
        L_0x0047:
            r12 = 0
            if (r1 == 0) goto L_0x008b
            r1 = -675026101(0xffffffffd7c3eb4b, float:-4.30830686E14)
            r7.X(r1)
            kotlin.jvm.internal.FloatCompanionObject r1 = kotlin.jvm.internal.FloatCompanionObject.f40896a
            androidx.compose.animation.core.TwoWayConverter r2 = androidx.compose.animation.core.VectorConvertersKt.i(r1)
            java.lang.Object r1 = r24.g()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r1 != r3) goto L_0x0076
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r3 = " alpha"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r7.N(r1)
        L_0x0076:
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            r1 = r8 & 14
            r5 = r1 | 384(0x180, float:5.38E-43)
            r6 = 0
            r1 = r20
            r4 = r24
            androidx.compose.animation.core.Transition$DeferredAnimation r1 = androidx.compose.animation.core.TransitionKt.e(r1, r2, r3, r4, r5, r6)
            r24.M()
            r14 = r1
            goto L_0x0095
        L_0x008b:
            r1 = -674857617(0xffffffffd7c67d6f, float:-4.36484071E14)
            r7.X(r1)
            r24.M()
            r14 = r12
        L_0x0095:
            if (r11 == 0) goto L_0x00d7
            r1 = -674790005(0xffffffffd7c7858b, float:-4.38752753E14)
            r7.X(r1)
            kotlin.jvm.internal.FloatCompanionObject r1 = kotlin.jvm.internal.FloatCompanionObject.f40896a
            androidx.compose.animation.core.TwoWayConverter r1 = androidx.compose.animation.core.VectorConvertersKt.i(r1)
            java.lang.Object r2 = r24.g()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r2 != r3) goto L_0x00c3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = " scale"
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            r7.N(r2)
        L_0x00c3:
            java.lang.String r2 = (java.lang.String) r2
            r0 = r8 & 14
            r4 = r0 | 384(0x180, float:5.38E-43)
            r5 = 0
            r0 = r20
            r3 = r24
            androidx.compose.animation.core.Transition$DeferredAnimation r0 = androidx.compose.animation.core.TransitionKt.e(r0, r1, r2, r3, r4, r5)
            r24.M()
            r15 = r0
            goto L_0x00e1
        L_0x00d7:
            r0 = -674621521(0xffffffffd7ca17af, float:-4.44406138E14)
            r7.X(r0)
            r24.M()
            r15 = r12
        L_0x00e1:
            if (r11 == 0) goto L_0x00fe
            r0 = -674543896(0xffffffffd7cb46e8, float:-4.47010801E14)
            r7.X(r0)
            androidx.compose.animation.core.TwoWayConverter r1 = f2214a
            r0 = r8 & 14
            r4 = r0 | 384(0x180, float:5.38E-43)
            r5 = 0
            java.lang.String r2 = "TransformOriginInterruptionHandling"
            r0 = r20
            r3 = r24
            androidx.compose.animation.core.Transition$DeferredAnimation r12 = androidx.compose.animation.core.TransitionKt.e(r0, r1, r2, r3, r4, r5)
            r24.M()
            goto L_0x0107
        L_0x00fe:
            r0 = -674372529(0xffffffffd7cde44f, float:-4.52760923E14)
            r7.X(r0)
            r24.M()
        L_0x0107:
            boolean r0 = r7.l(r14)
            r1 = r8 & 112(0x70, float:1.57E-43)
            r1 = r1 ^ 48
            r2 = 32
            if (r1 <= r2) goto L_0x011c
            r1 = r21
            boolean r3 = r7.W(r1)
            if (r3 != 0) goto L_0x0122
            goto L_0x011e
        L_0x011c:
            r1 = r21
        L_0x011e:
            r3 = r8 & 48
            if (r3 != r2) goto L_0x0124
        L_0x0122:
            r2 = r9
            goto L_0x0125
        L_0x0124:
            r2 = r10
        L_0x0125:
            r0 = r0 | r2
            r2 = r8 & 896(0x380, float:1.256E-42)
            r2 = r2 ^ 384(0x180, float:5.38E-43)
            r3 = 256(0x100, float:3.59E-43)
            if (r2 <= r3) goto L_0x0137
            r2 = r22
            boolean r4 = r7.W(r2)
            if (r4 != 0) goto L_0x013d
            goto L_0x0139
        L_0x0137:
            r2 = r22
        L_0x0139:
            r4 = r8 & 384(0x180, float:5.38E-43)
            if (r4 != r3) goto L_0x013f
        L_0x013d:
            r3 = r9
            goto L_0x0140
        L_0x013f:
            r3 = r10
        L_0x0140:
            r0 = r0 | r3
            boolean r3 = r7.l(r15)
            r0 = r0 | r3
            r3 = r8 & 14
            r3 = r3 ^ 6
            r4 = 4
            if (r3 <= r4) goto L_0x0156
            r3 = r20
            boolean r5 = r7.W(r3)
            if (r5 != 0) goto L_0x015e
            goto L_0x0158
        L_0x0156:
            r3 = r20
        L_0x0158:
            r5 = r8 & 6
            if (r5 != r4) goto L_0x015d
            goto L_0x015e
        L_0x015d:
            r9 = r10
        L_0x015e:
            r0 = r0 | r9
            boolean r4 = r7.l(r12)
            r0 = r0 | r4
            java.lang.Object r4 = r24.g()
            if (r0 != 0) goto L_0x0172
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r4 != r0) goto L_0x0183
        L_0x0172:
            androidx.compose.animation.b r4 = new androidx.compose.animation.b
            r13 = r4
            r16 = r20
            r17 = r21
            r18 = r22
            r19 = r12
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r7.N(r4)
        L_0x0183:
            androidx.compose.animation.GraphicsLayerBlockForEnterExit r4 = (androidx.compose.animation.GraphicsLayerBlockForEnterExit) r4
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x018e
            androidx.compose.runtime.ComposerKt.X()
        L_0x018e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionKt.e(androidx.compose.animation.core.Transition, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, androidx.compose.runtime.Composer, int):androidx.compose.animation.GraphicsLayerBlockForEnterExit");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.jvm.functions.Function1 f(androidx.compose.animation.core.Transition.DeferredAnimation r3, androidx.compose.animation.core.Transition.DeferredAnimation r4, androidx.compose.animation.core.Transition r5, androidx.compose.animation.EnterTransition r6, androidx.compose.animation.ExitTransition r7, androidx.compose.animation.core.Transition.DeferredAnimation r8) {
        /*
            r0 = 0
            if (r3 == 0) goto L_0x0012
            androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$1 r1 = new androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$1
            r1.<init>(r6, r7)
            androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$2 r2 = new androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$2
            r2.<init>(r6, r7)
            androidx.compose.runtime.State r3 = r3.a(r1, r2)
            goto L_0x0013
        L_0x0012:
            r3 = r0
        L_0x0013:
            if (r4 == 0) goto L_0x0024
            androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$1 r1 = new androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$1
            r1.<init>(r6, r7)
            androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$2 r2 = new androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$2
            r2.<init>(r6, r7)
            androidx.compose.runtime.State r4 = r4.a(r1, r2)
            goto L_0x0025
        L_0x0024:
            r4 = r0
        L_0x0025:
            java.lang.Object r5 = r5.i()
            androidx.compose.animation.EnterExitState r1 = androidx.compose.animation.EnterExitState.PreEnter
            if (r5 != r1) goto L_0x004d
            androidx.compose.animation.TransitionData r5 = r6.b()
            androidx.compose.animation.Scale r5 = r5.e()
            if (r5 == 0) goto L_0x0040
        L_0x0037:
            long r1 = r5.c()
            androidx.compose.ui.graphics.TransformOrigin r5 = androidx.compose.ui.graphics.TransformOrigin.b(r1)
            goto L_0x006b
        L_0x0040:
            androidx.compose.animation.TransitionData r5 = r7.b()
            androidx.compose.animation.Scale r5 = r5.e()
            if (r5 == 0) goto L_0x004b
            goto L_0x0037
        L_0x004b:
            r5 = r0
            goto L_0x006b
        L_0x004d:
            androidx.compose.animation.TransitionData r5 = r7.b()
            androidx.compose.animation.Scale r5 = r5.e()
            if (r5 == 0) goto L_0x0060
        L_0x0057:
            long r1 = r5.c()
            androidx.compose.ui.graphics.TransformOrigin r5 = androidx.compose.ui.graphics.TransformOrigin.b(r1)
            goto L_0x006b
        L_0x0060:
            androidx.compose.animation.TransitionData r5 = r6.b()
            androidx.compose.animation.Scale r5 = r5.e()
            if (r5 == 0) goto L_0x004b
            goto L_0x0057
        L_0x006b:
            if (r8 == 0) goto L_0x0078
            androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1 r0 = androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1.f2233z
            androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2 r1 = new androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2
            r1.<init>(r5, r6, r7)
            androidx.compose.runtime.State r0 = r8.a(r0, r1)
        L_0x0078:
            androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$block$1 r5 = new androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$block$1
            r5.<init>(r3, r4, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionKt.f(androidx.compose.animation.core.Transition$DeferredAnimation, androidx.compose.animation.core.Transition$DeferredAnimation, androidx.compose.animation.core.Transition, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, androidx.compose.animation.core.Transition$DeferredAnimation):kotlin.jvm.functions.Function1");
    }

    public static final Modifier g(Transition transition, EnterTransition enterTransition, ExitTransition exitTransition, Function0 function0, String str, Composer composer, int i2, int i3) {
        Transition.DeferredAnimation deferredAnimation;
        Transition.DeferredAnimation deferredAnimation2;
        ChangeSize a2;
        Transition transition2 = transition;
        String str2 = str;
        Composer composer2 = composer;
        int i4 = i2;
        EnterExitTransitionKt$createModifier$1 enterExitTransitionKt$createModifier$1 = (i3 & 4) != 0 ? EnterExitTransitionKt$createModifier$1.f2238z : function0;
        if (ComposerKt.P()) {
            ComposerKt.Y(28261782, i4, -1, "androidx.compose.animation.createModifier (EnterExitTransition.kt:860)");
        }
        int i5 = i4 & 14;
        EnterTransition H = H(transition2, enterTransition, composer2, i4 & 126);
        int i6 = i4 >> 3;
        ExitTransition K = K(transition2, exitTransition, composer2, (i6 & 112) | i5);
        boolean z2 = true;
        boolean z3 = (H.b().f() == null && K.b().f() == null) ? false : true;
        boolean z4 = (H.b().a() == null && K.b().a() == null) ? false : true;
        Transition.DeferredAnimation deferredAnimation3 = null;
        if (z3) {
            composer2.X(-821159459);
            TwoWayConverter g2 = VectorConvertersKt.g(IntOffset.f19160b);
            Object g3 = composer.g();
            if (g3 == Composer.f14567a.a()) {
                g3 = str2 + " slide";
                composer2.N(g3);
            }
            Transition.DeferredAnimation e2 = TransitionKt.e(transition, g2, (String) g3, composer, i5 | 384, 0);
            composer.M();
            deferredAnimation = e2;
        } else {
            composer2.X(-821053656);
            composer.M();
            deferredAnimation = null;
        }
        if (z4) {
            composer2.X(-820961865);
            TwoWayConverter h2 = VectorConvertersKt.h(IntSize.f19170b);
            Object g4 = composer.g();
            if (g4 == Composer.f14567a.a()) {
                g4 = str2 + " shrink/expand";
                composer2.N(g4);
            }
            Transition.DeferredAnimation e3 = TransitionKt.e(transition, h2, (String) g4, composer, i5 | 384, 0);
            composer.M();
            deferredAnimation2 = e3;
        } else {
            composer2.X(-820851041);
            composer.M();
            deferredAnimation2 = null;
        }
        if (z4) {
            composer2.X(-820777446);
            TwoWayConverter g5 = VectorConvertersKt.g(IntOffset.f19160b);
            Object g6 = composer.g();
            if (g6 == Composer.f14567a.a()) {
                g6 = str2 + " InterruptionHandlingOffset";
                composer2.N(g6);
            }
            Transition.DeferredAnimation e4 = TransitionKt.e(transition, g5, (String) g6, composer, i5 | 384, 0);
            composer.M();
            deferredAnimation3 = e4;
        } else {
            composer2.X(-820608001);
            composer.M();
        }
        ChangeSize a3 = H.b().a();
        boolean z5 = (a3 != null && !a3.c()) || ((a2 = K.b().a()) != null && !a2.c()) || !z4;
        GraphicsLayerBlockForEnterExit e5 = e(transition, H, K, str, composer, i5 | (i6 & 7168));
        Modifier.Companion companion = Modifier.f15489d;
        boolean d2 = composer2.d(z5);
        if ((((i4 & 7168) ^ 3072) <= 2048 || !composer2.W(enterExitTransitionKt$createModifier$1)) && (i4 & 3072) != 2048) {
            z2 = false;
        }
        boolean z6 = d2 | z2;
        Object g7 = composer.g();
        if (z6 || g7 == Composer.f14567a.a()) {
            g7 = new EnterExitTransitionKt$createModifier$2$1(z5, enterExitTransitionKt$createModifier$1);
            composer2.N(g7);
        }
        Modifier o0 = GraphicsLayerModifierKt.a(companion, (Function1) g7).o0(new EnterExitTransitionElement(transition, deferredAnimation2, deferredAnimation3, deferredAnimation, H, K, enterExitTransitionKt$createModifier$1, e5));
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return o0;
    }

    public static final EnterTransition h(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z2, Function1 function1) {
        return j(finiteAnimationSpec, F(horizontal), z2, new EnterExitTransitionKt$expandHorizontally$2(function1));
    }

    public static /* synthetic */ EnterTransition i(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z2, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.l(0.0f, 400.0f, IntSize.b(VisibilityThresholdsKt.f(IntSize.f19170b)), 1, (Object) null);
        }
        if ((i2 & 2) != 0) {
            horizontal = Alignment.f15444a.j();
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        if ((i2 & 8) != 0) {
            function1 = EnterExitTransitionKt$expandHorizontally$1.f2241z;
        }
        return h(finiteAnimationSpec, horizontal, z2, function1);
    }

    public static final EnterTransition j(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z2, Function1 function1) {
        return new EnterTransitionImpl(new TransitionData((Fade) null, (Slide) null, new ChangeSize(alignment, function1, finiteAnimationSpec, z2), (Scale) null, false, (Map) null, 59, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ EnterTransition k(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z2, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.l(0.0f, 400.0f, IntSize.b(VisibilityThresholdsKt.f(IntSize.f19170b)), 1, (Object) null);
        }
        if ((i2 & 2) != 0) {
            alignment = Alignment.f15444a.c();
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        if ((i2 & 8) != 0) {
            function1 = EnterExitTransitionKt$expandIn$1.f2243z;
        }
        return j(finiteAnimationSpec, alignment, z2, function1);
    }

    public static final EnterTransition l(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z2, Function1 function1) {
        return j(finiteAnimationSpec, G(vertical), z2, new EnterExitTransitionKt$expandVertically$2(function1));
    }

    public static /* synthetic */ EnterTransition m(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z2, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.l(0.0f, 400.0f, IntSize.b(VisibilityThresholdsKt.f(IntSize.f19170b)), 1, (Object) null);
        }
        if ((i2 & 2) != 0) {
            vertical = Alignment.f15444a.a();
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        if ((i2 & 8) != 0) {
            function1 = EnterExitTransitionKt$expandVertically$1.f2244z;
        }
        return l(finiteAnimationSpec, vertical, z2, function1);
    }

    public static final EnterTransition n(FiniteAnimationSpec finiteAnimationSpec, float f2) {
        return new EnterTransitionImpl(new TransitionData(new Fade(f2, finiteAnimationSpec), (Slide) null, (ChangeSize) null, (Scale) null, false, (Map) null, 62, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ EnterTransition o(FiniteAnimationSpec finiteAnimationSpec, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.l(0.0f, 400.0f, (Object) null, 5, (Object) null);
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        return n(finiteAnimationSpec, f2);
    }

    public static final ExitTransition p(FiniteAnimationSpec finiteAnimationSpec, float f2) {
        return new ExitTransitionImpl(new TransitionData(new Fade(f2, finiteAnimationSpec), (Slide) null, (ChangeSize) null, (Scale) null, false, (Map) null, 62, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ ExitTransition q(FiniteAnimationSpec finiteAnimationSpec, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.l(0.0f, 400.0f, (Object) null, 5, (Object) null);
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        return p(finiteAnimationSpec, f2);
    }

    public static final EnterTransition r(FiniteAnimationSpec finiteAnimationSpec, float f2, long j2) {
        return new EnterTransitionImpl(new TransitionData((Fade) null, (Slide) null, (ChangeSize) null, new Scale(f2, j2, finiteAnimationSpec, (DefaultConstructorMarker) null), false, (Map) null, 55, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ EnterTransition s(FiniteAnimationSpec finiteAnimationSpec, float f2, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.l(0.0f, 400.0f, (Object) null, 5, (Object) null);
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            j2 = TransformOrigin.f16150b.a();
        }
        return r(finiteAnimationSpec, f2, j2);
    }

    public static final ExitTransition t(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z2, Function1 function1) {
        return v(finiteAnimationSpec, F(horizontal), z2, new EnterExitTransitionKt$shrinkHorizontally$2(function1));
    }

    public static /* synthetic */ ExitTransition u(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z2, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.l(0.0f, 400.0f, IntSize.b(VisibilityThresholdsKt.f(IntSize.f19170b)), 1, (Object) null);
        }
        if ((i2 & 2) != 0) {
            horizontal = Alignment.f15444a.j();
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        if ((i2 & 8) != 0) {
            function1 = EnterExitTransitionKt$shrinkHorizontally$1.f2246z;
        }
        return t(finiteAnimationSpec, horizontal, z2, function1);
    }

    public static final ExitTransition v(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z2, Function1 function1) {
        return new ExitTransitionImpl(new TransitionData((Fade) null, (Slide) null, new ChangeSize(alignment, function1, finiteAnimationSpec, z2), (Scale) null, false, (Map) null, 59, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ ExitTransition w(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z2, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.l(0.0f, 400.0f, IntSize.b(VisibilityThresholdsKt.f(IntSize.f19170b)), 1, (Object) null);
        }
        if ((i2 & 2) != 0) {
            alignment = Alignment.f15444a.c();
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        if ((i2 & 8) != 0) {
            function1 = EnterExitTransitionKt$shrinkOut$1.f2248z;
        }
        return v(finiteAnimationSpec, alignment, z2, function1);
    }

    public static final ExitTransition x(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z2, Function1 function1) {
        return v(finiteAnimationSpec, G(vertical), z2, new EnterExitTransitionKt$shrinkVertically$2(function1));
    }

    public static /* synthetic */ ExitTransition y(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z2, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.l(0.0f, 400.0f, IntSize.b(VisibilityThresholdsKt.f(IntSize.f19170b)), 1, (Object) null);
        }
        if ((i2 & 2) != 0) {
            vertical = Alignment.f15444a.a();
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        if ((i2 & 8) != 0) {
            function1 = EnterExitTransitionKt$shrinkVertically$1.f2249z;
        }
        return x(finiteAnimationSpec, vertical, z2, function1);
    }

    public static final EnterTransition z(FiniteAnimationSpec finiteAnimationSpec, Function1 function1) {
        return new EnterTransitionImpl(new TransitionData((Fade) null, new Slide(function1, finiteAnimationSpec), (ChangeSize) null, (Scale) null, false, (Map) null, 61, (DefaultConstructorMarker) null));
    }
}
