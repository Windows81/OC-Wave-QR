package androidx.compose.animation.core;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;

@Metadata
public final class AnimateAsStateKt {

    /* renamed from: a  reason: collision with root package name */
    public static final SpringSpec f2445a = AnimationSpecKt.l(0.0f, 0.0f, (Object) null, 7, (Object) null);

    /* renamed from: b  reason: collision with root package name */
    public static final SpringSpec f2446b = AnimationSpecKt.l(0.0f, 0.0f, Dp.j(VisibilityThresholdsKt.a(Dp.f19144A)), 3, (Object) null);

    /* renamed from: c  reason: collision with root package name */
    public static final SpringSpec f2447c = AnimationSpecKt.l(0.0f, 0.0f, Size.c(VisibilityThresholdsKt.d(Size.f15876b)), 3, (Object) null);

    /* renamed from: d  reason: collision with root package name */
    public static final SpringSpec f2448d = AnimationSpecKt.l(0.0f, 0.0f, Offset.d(VisibilityThresholdsKt.c(Offset.f15855b)), 3, (Object) null);

    /* renamed from: e  reason: collision with root package name */
    public static final SpringSpec f2449e = AnimationSpecKt.l(0.0f, 0.0f, VisibilityThresholdsKt.g(Rect.f15860e), 3, (Object) null);

    /* renamed from: f  reason: collision with root package name */
    public static final SpringSpec f2450f = AnimationSpecKt.l(0.0f, 0.0f, Integer.valueOf(VisibilityThresholdsKt.b(IntCompanionObject.f40897a)), 3, (Object) null);

    /* renamed from: g  reason: collision with root package name */
    public static final SpringSpec f2451g = AnimationSpecKt.l(0.0f, 0.0f, IntOffset.c(VisibilityThresholdsKt.e(IntOffset.f19160b)), 3, (Object) null);

    /* renamed from: h  reason: collision with root package name */
    public static final SpringSpec f2452h = AnimationSpecKt.l(0.0f, 0.0f, IntSize.b(VisibilityThresholdsKt.f(IntSize.f19170b)), 3, (Object) null);

    public static final State c(float f2, AnimationSpec animationSpec, String str, Function1 function1, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = f2446b;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            str = "DpAnimation";
        }
        String str2 = str;
        if ((i3 & 8) != 0) {
            function1 = null;
        }
        Function1 function12 = function1;
        if (ComposerKt.P()) {
            ComposerKt.Y(-1407150062, i2, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:111)");
        }
        int i4 = i2 << 6;
        Composer composer2 = composer;
        State e2 = e(Dp.j(f2), VectorConvertersKt.e(Dp.f19144A), animationSpec2, (Object) null, str2, function12, composer2, (i2 & 14) | ((i2 << 3) & 896) | (57344 & i4) | (i4 & 458752), 8);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return e2;
    }

    public static final State d(float f2, AnimationSpec animationSpec, float f3, String str, Function1 function1, Composer composer, int i2, int i3) {
        AnimationSpec animationSpec2;
        Composer composer2 = composer;
        int i4 = i2;
        AnimationSpec animationSpec3 = (i3 & 2) != 0 ? f2445a : animationSpec;
        float f4 = (i3 & 4) != 0 ? 0.01f : f3;
        String str2 = (i3 & 8) != 0 ? "FloatAnimation" : str;
        Function1 function12 = (i3 & 16) != 0 ? null : function1;
        if (ComposerKt.P()) {
            ComposerKt.Y(668842840, i4, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:67)");
        }
        if (animationSpec3 == f2445a) {
            composer2.X(1125558999);
            boolean z2 = (((i4 & 896) ^ 384) > 256 && composer2.h(f4)) || (i4 & 384) == 256;
            Object g2 = composer.g();
            if (z2 || g2 == Composer.f14567a.a()) {
                g2 = AnimationSpecKt.l(0.0f, 0.0f, Float.valueOf(f4), 3, (Object) null);
                composer2.N(g2);
            }
            animationSpec2 = (SpringSpec) g2;
            composer.M();
        } else {
            composer2.X(1125668925);
            composer.M();
            animationSpec2 = animationSpec3;
        }
        Float valueOf = Float.valueOf(f2);
        TwoWayConverter i5 = VectorConvertersKt.i(FloatCompanionObject.f40896a);
        Float valueOf2 = Float.valueOf(f4);
        int i6 = i4 & 14;
        int i7 = i4 << 3;
        State e2 = e(valueOf, i5, animationSpec2, valueOf2, str2, function12, composer, i6 | (i7 & 7168) | (57344 & i7) | (i7 & 458752), 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return e2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1} */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0104, code lost:
        if (r2 == r10.a()) goto L_0x0106;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.runtime.State e(java.lang.Object r14, androidx.compose.animation.core.TwoWayConverter r15, androidx.compose.animation.core.AnimationSpec r16, java.lang.Object r17, java.lang.String r18, kotlin.jvm.functions.Function1 r19, androidx.compose.runtime.Composer r20, int r21, int r22) {
        /*
            r0 = r14
            r1 = r20
            r2 = r21
            r3 = r22 & 4
            r4 = 0
            if (r3 == 0) goto L_0x0022
            java.lang.Object r3 = r20.g()
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r3 != r5) goto L_0x001f
            r3 = 7
            r5 = 0
            androidx.compose.animation.core.SpringSpec r3 = androidx.compose.animation.core.AnimationSpecKt.l(r5, r5, r4, r3, r4)
            r1.N(r3)
        L_0x001f:
            androidx.compose.animation.core.SpringSpec r3 = (androidx.compose.animation.core.SpringSpec) r3
            goto L_0x0024
        L_0x0022:
            r3 = r16
        L_0x0024:
            r5 = r22 & 8
            if (r5 == 0) goto L_0x002a
            r5 = r4
            goto L_0x002c
        L_0x002a:
            r5 = r17
        L_0x002c:
            r6 = r22 & 16
            if (r6 == 0) goto L_0x0033
            java.lang.String r6 = "ValueAnimation"
            goto L_0x0035
        L_0x0033:
            r6 = r18
        L_0x0035:
            r7 = r22 & 32
            if (r7 == 0) goto L_0x003b
            r7 = r4
            goto L_0x003d
        L_0x003b:
            r7 = r19
        L_0x003d:
            boolean r8 = androidx.compose.runtime.ComposerKt.P()
            r9 = -1
            if (r8 == 0) goto L_0x004c
            r8 = -1994373980(0xffffffff892044a4, float:-1.9291574E-33)
            java.lang.String r10 = "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:395)"
            androidx.compose.runtime.ComposerKt.Y(r8, r2, r9, r10)
        L_0x004c:
            java.lang.Object r8 = r20.g()
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r11 = r10.a()
            if (r8 != r11) goto L_0x0060
            r8 = 2
            androidx.compose.runtime.MutableState r8 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.e(r4, r4, r8, r4)
            r1.N(r8)
        L_0x0060:
            androidx.compose.runtime.MutableState r8 = (androidx.compose.runtime.MutableState) r8
            java.lang.Object r11 = r20.g()
            java.lang.Object r12 = r10.a()
            if (r11 != r12) goto L_0x0075
            androidx.compose.animation.core.Animatable r11 = new androidx.compose.animation.core.Animatable
            r12 = r15
            r11.<init>(r14, r15, r5, r6)
            r1.N(r11)
        L_0x0075:
            androidx.compose.animation.core.Animatable r11 = (androidx.compose.animation.core.Animatable) r11
            int r6 = r2 >> 15
            r6 = r6 & 14
            androidx.compose.runtime.State r6 = androidx.compose.runtime.SnapshotStateKt.p(r7, r1, r6)
            if (r5 == 0) goto L_0x009e
            boolean r7 = r3 instanceof androidx.compose.animation.core.SpringSpec
            if (r7 == 0) goto L_0x009e
            r7 = r3
            androidx.compose.animation.core.SpringSpec r7 = (androidx.compose.animation.core.SpringSpec) r7
            java.lang.Object r12 = r7.h()
            boolean r12 = kotlin.jvm.internal.Intrinsics.d(r12, r5)
            if (r12 != 0) goto L_0x009e
            float r3 = r7.f()
            float r7 = r7.g()
            androidx.compose.animation.core.SpringSpec r3 = androidx.compose.animation.core.AnimationSpecKt.k(r3, r7, r5)
        L_0x009e:
            r5 = 0
            androidx.compose.runtime.State r3 = androidx.compose.runtime.SnapshotStateKt.p(r3, r1, r5)
            java.lang.Object r7 = r20.g()
            java.lang.Object r12 = r10.a()
            r13 = 6
            if (r7 != r12) goto L_0x00b5
            kotlinx.coroutines.channels.Channel r7 = kotlinx.coroutines.channels.ChannelKt.b(r9, r4, r4, r13, r4)
            r1.N(r7)
        L_0x00b5:
            kotlinx.coroutines.channels.Channel r7 = (kotlinx.coroutines.channels.Channel) r7
            boolean r4 = r1.l(r7)
            r9 = r2 & 14
            r9 = r9 ^ r13
            r12 = 4
            if (r9 <= r12) goto L_0x00c7
            boolean r9 = r1.l(r14)
            if (r9 != 0) goto L_0x00ca
        L_0x00c7:
            r2 = r2 & r13
            if (r2 != r12) goto L_0x00cc
        L_0x00ca:
            r2 = 1
            goto L_0x00cd
        L_0x00cc:
            r2 = r5
        L_0x00cd:
            r2 = r2 | r4
            java.lang.Object r4 = r20.g()
            if (r2 != 0) goto L_0x00da
            java.lang.Object r2 = r10.a()
            if (r4 != r2) goto L_0x00e2
        L_0x00da:
            androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$2$1 r4 = new androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$2$1
            r4.<init>(r7, r14)
            r1.N(r4)
        L_0x00e2:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            androidx.compose.runtime.EffectsKt.h(r4, r1, r5)
            boolean r0 = r1.l(r7)
            boolean r2 = r1.l(r11)
            r0 = r0 | r2
            boolean r2 = r1.W(r3)
            r0 = r0 | r2
            boolean r2 = r1.W(r6)
            r0 = r0 | r2
            java.lang.Object r2 = r20.g()
            if (r0 != 0) goto L_0x0106
            java.lang.Object r0 = r10.a()
            if (r2 != r0) goto L_0x0119
        L_0x0106:
            androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1 r2 = new androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1
            r0 = 0
            r14 = r2
            r15 = r7
            r16 = r11
            r17 = r3
            r18 = r6
            r19 = r0
            r14.<init>(r15, r16, r17, r18, r19)
            r1.N(r2)
        L_0x0119:
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            androidx.compose.runtime.EffectsKt.g(r7, r2, r1, r5)
            java.lang.Object r0 = r8.getValue()
            androidx.compose.runtime.State r0 = (androidx.compose.runtime.State) r0
            if (r0 != 0) goto L_0x012a
            androidx.compose.runtime.State r0 = r11.g()
        L_0x012a:
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0133
            androidx.compose.runtime.ComposerKt.X()
        L_0x0133:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.AnimateAsStateKt.e(java.lang.Object, androidx.compose.animation.core.TwoWayConverter, androidx.compose.animation.core.AnimationSpec, java.lang.Object, java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):androidx.compose.runtime.State");
    }

    public static final Function1 f(State state) {
        return (Function1) state.getValue();
    }

    public static final AnimationSpec g(State state) {
        return (AnimationSpec) state.getValue();
    }
}
