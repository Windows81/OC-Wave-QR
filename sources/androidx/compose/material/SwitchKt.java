package androidx.compose.material;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class SwitchKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f8616a;

    /* renamed from: b  reason: collision with root package name */
    public static final float f8617b = Dp.m((float) 14);

    /* renamed from: c  reason: collision with root package name */
    public static final float f8618c;

    /* renamed from: d  reason: collision with root package name */
    public static final float f8619d = Dp.m((float) 24);

    /* renamed from: e  reason: collision with root package name */
    public static final float f8620e = Dp.m((float) 2);

    /* renamed from: f  reason: collision with root package name */
    public static final float f8621f;

    /* renamed from: g  reason: collision with root package name */
    public static final float f8622g;

    /* renamed from: h  reason: collision with root package name */
    public static final float f8623h;

    /* renamed from: i  reason: collision with root package name */
    public static final TweenSpec f8624i = new TweenSpec(100, 0, (Easing) null, 6, (DefaultConstructorMarker) null);

    /* renamed from: j  reason: collision with root package name */
    public static final float f8625j = Dp.m((float) 1);

    /* renamed from: k  reason: collision with root package name */
    public static final float f8626k = Dp.m((float) 6);

    /* renamed from: l  reason: collision with root package name */
    public static final float f8627l = Dp.m((float) 125);

    static {
        float m2 = Dp.m((float) 34);
        f8616a = m2;
        float m3 = Dp.m((float) 20);
        f8618c = m3;
        f8621f = m2;
        f8622g = m3;
        f8623h = Dp.m(m2 - m3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: androidx.compose.material.AnchoredDraggableState} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v19, resolved type: androidx.compose.material.SwitchKt$Switch$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v5, resolved type: androidx.compose.material.SwitchKt$Switch$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v6, resolved type: androidx.compose.material.AnchoredDraggableState} */
    /* JADX WARNING: type inference failed for: r13v3 */
    /* JADX WARNING: type inference failed for: r12v2 */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01c4, code lost:
        if (r13 == r11.a()) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x021d, code lost:
        if (r12 == r11.a()) goto L_0x021f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x03ac  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03ba  */
    /* JADX WARNING: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(boolean r36, kotlin.jvm.functions.Function1 r37, androidx.compose.ui.Modifier r38, boolean r39, androidx.compose.foundation.interaction.MutableInteractionSource r40, androidx.compose.material.SwitchColors r41, androidx.compose.runtime.Composer r42, int r43, int r44) {
        /*
            r7 = r36
            r8 = r37
            r9 = r43
            r0 = 25866825(0x18ab249, float:5.094902E-38)
            r1 = r42
            androidx.compose.runtime.Composer r6 = r1.q(r0)
            r1 = r44 & 1
            if (r1 == 0) goto L_0x0016
            r1 = r9 | 6
            goto L_0x0026
        L_0x0016:
            r1 = r9 & 6
            if (r1 != 0) goto L_0x0025
            boolean r1 = r6.d(r7)
            if (r1 == 0) goto L_0x0022
            r1 = 4
            goto L_0x0023
        L_0x0022:
            r1 = 2
        L_0x0023:
            r1 = r1 | r9
            goto L_0x0026
        L_0x0025:
            r1 = r9
        L_0x0026:
            r3 = r44 & 2
            if (r3 == 0) goto L_0x002d
            r1 = r1 | 48
            goto L_0x003d
        L_0x002d:
            r3 = r9 & 48
            if (r3 != 0) goto L_0x003d
            boolean r3 = r6.l(r8)
            if (r3 == 0) goto L_0x003a
            r3 = 32
            goto L_0x003c
        L_0x003a:
            r3 = 16
        L_0x003c:
            r1 = r1 | r3
        L_0x003d:
            r3 = r44 & 4
            if (r3 == 0) goto L_0x0046
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0043:
            r4 = r38
            goto L_0x0058
        L_0x0046:
            r4 = r9 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x0043
            r4 = r38
            boolean r10 = r6.W(r4)
            if (r10 == 0) goto L_0x0055
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0057
        L_0x0055:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0057:
            r1 = r1 | r10
        L_0x0058:
            r10 = r44 & 8
            if (r10 == 0) goto L_0x0061
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x005e:
            r11 = r39
            goto L_0x0073
        L_0x0061:
            r11 = r9 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x005e
            r11 = r39
            boolean r12 = r6.d(r11)
            if (r12 == 0) goto L_0x0070
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0072
        L_0x0070:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0072:
            r1 = r1 | r12
        L_0x0073:
            r12 = r44 & 16
            if (r12 == 0) goto L_0x007c
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0079:
            r13 = r40
            goto L_0x008e
        L_0x007c:
            r13 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x0079
            r13 = r40
            boolean r14 = r6.W(r13)
            if (r14 == 0) goto L_0x008b
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008d
        L_0x008b:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x008d:
            r1 = r1 | r14
        L_0x008e:
            r14 = 196608(0x30000, float:2.75506E-40)
            r14 = r14 & r9
            if (r14 != 0) goto L_0x00a8
            r14 = r44 & 32
            if (r14 != 0) goto L_0x00a2
            r14 = r41
            boolean r15 = r6.W(r14)
            if (r15 == 0) goto L_0x00a4
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a6
        L_0x00a2:
            r14 = r41
        L_0x00a4:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00a6:
            r1 = r1 | r15
            goto L_0x00aa
        L_0x00a8:
            r14 = r41
        L_0x00aa:
            r15 = 74899(0x12493, float:1.04956E-40)
            r15 = r15 & r1
            r2 = 74898(0x12492, float:1.04954E-40)
            r5 = 0
            r33 = 1
            if (r15 == r2) goto L_0x00b9
            r2 = r33
            goto L_0x00ba
        L_0x00b9:
            r2 = r5
        L_0x00ba:
            r15 = r1 & 1
            boolean r2 = r6.E(r2, r15)
            if (r2 == 0) goto L_0x03ac
            r6.p()
            r2 = r9 & 1
            r34 = -458753(0xfffffffffff8ffff, float:NaN)
            r15 = 0
            if (r2 == 0) goto L_0x00e8
            boolean r2 = r6.J()
            if (r2 == 0) goto L_0x00d4
            goto L_0x00e8
        L_0x00d4:
            r6.B()
            r2 = r44 & 32
            if (r2 == 0) goto L_0x00dd
            r1 = r1 & r34
        L_0x00dd:
            r10 = r1
            r18 = r11
            r19 = r13
            r20 = r14
            r3 = r15
            r15 = r4
            goto L_0x013a
        L_0x00e8:
            if (r3 == 0) goto L_0x00ed
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00ee
        L_0x00ed:
            r2 = r4
        L_0x00ee:
            if (r10 == 0) goto L_0x00f3
            r3 = r33
            goto L_0x00f4
        L_0x00f3:
            r3 = r11
        L_0x00f4:
            if (r12 == 0) goto L_0x00f8
            r4 = r15
            goto L_0x00f9
        L_0x00f8:
            r4 = r13
        L_0x00f9:
            r10 = r44 & 32
            if (r10 == 0) goto L_0x012f
            androidx.compose.material.SwitchDefaults r10 = androidx.compose.material.SwitchDefaults.f8615a
            r31 = 6
            r32 = 1023(0x3ff, float:1.434E-42)
            r11 = 0
            r13 = 0
            r16 = 0
            r38 = r3
            r3 = r15
            r15 = r16
            r16 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r30 = 0
            r29 = r6
            androidx.compose.material.SwitchColors r10 = r10.a(r11, r13, r15, r16, r18, r20, r21, r23, r25, r27, r29, r30, r31, r32)
            r1 = r1 & r34
            r18 = r38
            r15 = r2
            r19 = r4
            r20 = r10
            r10 = r1
            goto L_0x013a
        L_0x012f:
            r38 = r3
            r3 = r15
            r18 = r38
            r10 = r1
            r15 = r2
            r19 = r4
            r20 = r14
        L_0x013a:
            r6.U()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0149
            r1 = -1
            java.lang.String r2 = "androidx.compose.material.Switch (Switch.kt:100)"
            androidx.compose.runtime.ComposerKt.Y(r0, r10, r1, r2)
        L_0x0149:
            if (r19 != 0) goto L_0x016c
            r0 = -1604939679(0xffffffffa0569061, float:-1.8174276E-19)
            r6.X(r0)
            java.lang.Object r0 = r6.g()
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r0 != r1) goto L_0x0164
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = androidx.compose.foundation.interaction.InteractionSourceKt.a()
            r6.N(r0)
        L_0x0164:
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = (androidx.compose.foundation.interaction.MutableInteractionSource) r0
            r6.M()
            r16 = r0
            goto L_0x0177
        L_0x016c:
            r0 = 779511094(0x2e766536, float:5.6023818E-11)
            r6.X(r0)
            r6.M()
            r16 = r19
        L_0x0177:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r0 = r6.C(r0)
            androidx.compose.ui.unit.Density r0 = (androidx.compose.ui.unit.Density) r0
            float r1 = f8623h
            float r0 = r0.B1(r1)
            java.lang.Object r1 = r6.g()
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r11.a()
            if (r1 != r2) goto L_0x019e
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r12 = 2
            androidx.compose.runtime.MutableState r1 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.e(r1, r3, r12, r3)
            r6.N(r1)
            goto L_0x019f
        L_0x019e:
            r12 = 2
        L_0x019f:
            androidx.compose.runtime.MutableState r1 = (androidx.compose.runtime.MutableState) r1
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r2 = r6.C(r2)
            androidx.compose.ui.unit.Density r2 = (androidx.compose.ui.unit.Density) r2
            float r4 = f8627l
            float r2 = r2.B1(r4)
            boolean r4 = r6.h(r0)
            boolean r13 = r6.h(r2)
            r4 = r4 | r13
            java.lang.Object r13 = r6.g()
            if (r4 != 0) goto L_0x01c6
            java.lang.Object r4 = r11.a()
            if (r13 != r4) goto L_0x01ef
        L_0x01c6:
            androidx.compose.animation.core.TweenSpec r26 = f8624i
            androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1 r4 = new androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
            r13 = 0
            r4.<init>(r13, r0)
            androidx.compose.material.DraggableAnchors r23 = androidx.compose.material.AnchoredDraggableKt.a(r4)
            androidx.compose.material.AnchoredDraggableState r13 = new androidx.compose.material.AnchoredDraggableState
            java.lang.Boolean r22 = java.lang.Boolean.valueOf(r36)
            androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2 r24 = androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2.f8635z
            androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$3 r0 = new androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$3
            r0.<init>(r2)
            r28 = 32
            r29 = 0
            r27 = 0
            r21 = r13
            r25 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29)
            r6.N(r13)
        L_0x01ef:
            androidx.compose.material.AnchoredDraggableState r13 = (androidx.compose.material.AnchoredDraggableState) r13
            int r14 = r10 >> 3
            r0 = r14 & 14
            androidx.compose.runtime.State r0 = androidx.compose.runtime.SnapshotStateKt.p(r8, r6, r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r36)
            r4 = r10 & 14
            androidx.compose.runtime.State r2 = androidx.compose.runtime.SnapshotStateKt.p(r2, r6, r4)
            boolean r17 = r6.W(r13)
            boolean r21 = r6.W(r2)
            r17 = r17 | r21
            boolean r21 = r6.W(r0)
            r17 = r17 | r21
            java.lang.Object r12 = r6.g()
            if (r17 != 0) goto L_0x021f
            java.lang.Object r3 = r11.a()
            if (r12 != r3) goto L_0x0233
        L_0x021f:
            androidx.compose.material.SwitchKt$Switch$1$1 r12 = new androidx.compose.material.SwitchKt$Switch$1$1
            r26 = 0
            r21 = r12
            r22 = r13
            r23 = r2
            r24 = r0
            r25 = r1
            r21.<init>(r22, r23, r24, r25, r26)
            r6.N(r12)
        L_0x0233:
            kotlin.jvm.functions.Function2 r12 = (kotlin.jvm.functions.Function2) r12
            androidx.compose.runtime.EffectsKt.g(r13, r12, r6, r5)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r36)
            boolean r1 = b(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 4
            if (r4 != r2) goto L_0x024a
            r2 = r33
            goto L_0x024b
        L_0x024a:
            r2 = r5
        L_0x024b:
            boolean r3 = r6.W(r13)
            r2 = r2 | r3
            java.lang.Object r3 = r6.g()
            if (r2 != 0) goto L_0x025f
            java.lang.Object r2 = r11.a()
            if (r3 != r2) goto L_0x025d
            goto L_0x025f
        L_0x025d:
            r12 = 0
            goto L_0x0268
        L_0x025f:
            androidx.compose.material.SwitchKt$Switch$2$1 r3 = new androidx.compose.material.SwitchKt$Switch$2$1
            r12 = 0
            r3.<init>(r7, r13, r12)
            r6.N(r3)
        L_0x0268:
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            androidx.compose.runtime.EffectsKt.f(r0, r1, r3, r6, r4)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.m()
            java.lang.Object r0 = r6.C(r0)
            androidx.compose.ui.unit.LayoutDirection r1 = androidx.compose.ui.unit.LayoutDirection.Rtl
            if (r0 != r1) goto L_0x027c
            r25 = r33
            goto L_0x027e
        L_0x027c:
            r25 = r5
        L_0x027e:
            if (r8 == 0) goto L_0x029e
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.semantics.Role$Companion r1 = androidx.compose.ui.semantics.Role.f18040b
            int r1 = r1.g()
            r3 = 0
            androidx.compose.ui.semantics.Role r17 = androidx.compose.ui.semantics.Role.j(r1)
            r1 = r36
            r2 = r16
            r4 = r18
            r5 = r17
            r35 = r6
            r6 = r37
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.selection.ToggleableKt.a(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x02a2
        L_0x029e:
            r35 = r6
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
        L_0x02a2:
            if (r8 == 0) goto L_0x02ab
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.Modifier r1 = androidx.compose.material.InteractiveComponentSizeKt.c(r1)
            goto L_0x02ad
        L_0x02ab:
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
        L_0x02ad:
            androidx.compose.ui.Modifier r1 = r15.o0(r1)
            androidx.compose.ui.Modifier r21 = r1.o0(r0)
            androidx.compose.foundation.gestures.Orientation r23 = androidx.compose.foundation.gestures.Orientation.Horizontal
            if (r18 == 0) goto L_0x02be
            if (r8 == 0) goto L_0x02be
            r24 = r33
            goto L_0x02c0
        L_0x02be:
            r24 = 0
        L_0x02c0:
            r27 = 0
            r22 = r13
            r26 = r16
            androidx.compose.ui.Modifier r0 = androidx.compose.material.AnchoredDraggableKt.d(r21, r22, r23, r24, r25, r26, r27)
            androidx.compose.ui.Alignment$Companion r1 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r2 = r1.e()
            r3 = 2
            r4 = 0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.E(r0, r2, r4, r3, r12)
            float r2 = f8620e
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.PaddingKt.i(r0, r2)
            float r2 = f8621f
            float r3 = f8622g
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.p(r0, r2, r3)
            androidx.compose.ui.Alignment r1 = r1.o()
            androidx.compose.ui.layout.MeasurePolicy r1 = androidx.compose.foundation.layout.BoxKt.g(r1, r4)
            r2 = r35
            int r3 = androidx.compose.runtime.ComposablesKt.a(r2, r4)
            androidx.compose.runtime.CompositionLocalMap r4 = r2.I()
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.ComposedModifierKt.e(r2, r0)
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r6 = r5.a()
            androidx.compose.runtime.Applier r12 = r2.v()
            if (r12 != 0) goto L_0x0309
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0309:
            r2.s()
            boolean r12 = r2.n()
            if (r12 == 0) goto L_0x0316
            r2.y(r6)
            goto L_0x0319
        L_0x0316:
            r2.K()
        L_0x0319:
            androidx.compose.runtime.Composer r6 = androidx.compose.runtime.Updater.b(r2)
            kotlin.jvm.functions.Function2 r12 = r5.c()
            androidx.compose.runtime.Updater.g(r6, r1, r12)
            kotlin.jvm.functions.Function2 r1 = r5.e()
            androidx.compose.runtime.Updater.g(r6, r4, r1)
            kotlin.jvm.functions.Function2 r1 = r5.b()
            boolean r4 = r6.n()
            if (r4 != 0) goto L_0x0343
            java.lang.Object r4 = r6.g()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r12)
            if (r4 != 0) goto L_0x0351
        L_0x0343:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r6.N(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.A(r3, r1)
        L_0x0351:
            kotlin.jvm.functions.Function2 r1 = r5.d()
            androidx.compose.runtime.Updater.g(r6, r0, r1)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            java.lang.Object r1 = r13.x()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            boolean r3 = r2.W(r13)
            java.lang.Object r4 = r2.g()
            if (r3 != 0) goto L_0x0374
            java.lang.Object r3 = r11.a()
            if (r4 != r3) goto L_0x037c
        L_0x0374:
            androidx.compose.material.SwitchKt$Switch$3$1$1 r4 = new androidx.compose.material.SwitchKt$Switch$3$1$1
            r4.<init>(r13)
            r2.N(r4)
        L_0x037c:
            r3 = r4
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            r4 = r14 & 896(0x380, float:1.256E-42)
            r5 = 6
            r4 = r4 | r5
            int r5 = r10 >> 6
            r5 = r5 & 7168(0x1c00, float:1.0045E-41)
            r17 = r4 | r5
            r10 = r0
            r11 = r1
            r12 = r18
            r13 = r20
            r14 = r3
            r4 = r15
            r15 = r16
            r16 = r2
            f(r10, r11, r12, r13, r14, r15, r16, r17)
            r2.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x03a4
            androidx.compose.runtime.ComposerKt.X()
        L_0x03a4:
            r3 = r4
            r4 = r18
            r5 = r19
            r6 = r20
            goto L_0x03b4
        L_0x03ac:
            r2 = r6
            r2.B()
            r3 = r4
            r4 = r11
            r5 = r13
            r6 = r14
        L_0x03b4:
            androidx.compose.runtime.ScopeUpdateScope r10 = r2.x()
            if (r10 == 0) goto L_0x03cb
            androidx.compose.material.SwitchKt$Switch$4 r11 = new androidx.compose.material.SwitchKt$Switch$4
            r0 = r11
            r1 = r36
            r2 = r37
            r7 = r43
            r8 = r44
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.a(r11)
        L_0x03cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwitchKt.a(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.SwitchColors, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final boolean b(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    public static final void c(MutableState mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    public static final Function1 d(State state) {
        return (Function1) state.getValue();
    }

    public static final boolean e(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    public static final void f(BoxScope boxScope, boolean z2, boolean z3, SwitchColors switchColors, Function0 function0, InteractionSource interactionSource, Composer composer, int i2) {
        int i3;
        Composer composer2;
        int i4;
        Modifier.Companion companion;
        long j2;
        BoxScope boxScope2 = boxScope;
        boolean z4 = z2;
        boolean z5 = z3;
        SwitchColors switchColors2 = switchColors;
        Function0 function02 = function0;
        InteractionSource interactionSource2 = interactionSource;
        int i5 = i2;
        Composer q2 = composer.q(70908914);
        if ((i5 & 6) == 0) {
            i3 = (q2.W(boxScope2) ? 4 : 2) | i5;
        } else {
            i3 = i5;
        }
        if ((i5 & 48) == 0) {
            i3 |= q2.d(z4) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i3 |= q2.d(z5) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i3 |= q2.W(switchColors2) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i3 |= q2.l(function02) ? 16384 : 8192;
        }
        if ((196608 & i5) == 0) {
            i3 |= q2.W(interactionSource2) ? 131072 : 65536;
        }
        int i6 = i3;
        if (q2.E((74899 & i6) != 74898, i6 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(70908914, i6, -1, "androidx.compose.material.SwitchImpl (Switch.kt:220)");
            }
            Object g2 = q2.g();
            Composer.Companion companion2 = Composer.f14567a;
            if (g2 == companion2.a()) {
                g2 = SnapshotStateKt.f();
                q2.N(g2);
            }
            SnapshotStateList snapshotStateList = (SnapshotStateList) g2;
            boolean z6 = (458752 & i6) == 131072;
            Object g3 = q2.g();
            if (z6 || g3 == companion2.a()) {
                g3 = new SwitchKt$SwitchImpl$1$1(interactionSource2, snapshotStateList, (Continuation) null);
                q2.N(g3);
            }
            EffectsKt.g(interactionSource2, (Function2) g3, q2, (i6 >> 15) & 14);
            float f2 = !snapshotStateList.isEmpty() ? f8626k : f8625j;
            int i7 = ((i6 >> 6) & 14) | (i6 & 112) | ((i6 >> 3) & 896);
            State a2 = switchColors2.a(z5, z4, q2, i7);
            Modifier.Companion companion3 = Modifier.f15489d;
            Alignment.Companion companion4 = Alignment.f15444a;
            Modifier f3 = SizeKt.f(boxScope2.g(companion3, companion4.e()), 0.0f, 1, (Object) null);
            boolean W = q2.W(a2);
            Object g4 = q2.g();
            if (W || g4 == companion2.a()) {
                g4 = new SwitchKt$SwitchImpl$2$1(a2);
                q2.N(g4);
            }
            CanvasKt.b(f3, (Function1) g4, q2, 0);
            State b2 = switchColors2.b(z5, z4, q2, i7);
            ElevationOverlay elevationOverlay = (ElevationOverlay) q2.C(ElevationOverlayKt.d());
            float m2 = Dp.m(((Dp) q2.C(ElevationOverlayKt.c())).t() + f2);
            if (!Color.n(h(b2), MaterialTheme.f7937a.a(q2, 6).n()) || elevationOverlay == null) {
                companion = companion3;
                i4 = i6;
                q2.X(1478584670);
                q2.M();
                j2 = h(b2);
            } else {
                q2.X(1478495731);
                float f4 = m2;
                companion = companion3;
                i4 = i6;
                j2 = elevationOverlay.a(h(b2), f4, q2, 0);
                q2.M();
            }
            composer2 = q2;
            State a3 = SingleValueAnimationKt.a(j2, (AnimationSpec) null, (String) null, (Function1) null, q2, 0, 14);
            Modifier g5 = boxScope2.g(companion, companion4.h());
            boolean z7 = (i4 & 57344) == 16384;
            Object g6 = composer2.g();
            if (z7 || g6 == companion2.a()) {
                g6 = new SwitchKt$SwitchImpl$3$1(function02);
                composer2.N(g6);
            }
            SpacerKt.a(BackgroundKt.a(ShadowKt.b(SizeKt.o(IndicationKt.b(OffsetKt.a(g5, (Function1) g6), interactionSource2, RippleKt.f(false, f8619d, 0, 4, (Object) null)), f8618c), f2, RoundedCornerShapeKt.f(), false, 0, 0, 24, (Object) null), i(a3), RoundedCornerShapeKt.f()), composer2, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            composer2 = q2;
            composer2.B();
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new SwitchKt$SwitchImpl$4(boxScope, z2, z3, switchColors, function0, interactionSource, i2));
        }
    }

    public static final long g(State state) {
        return ((Color) state.getValue()).v();
    }

    public static final long h(State state) {
        return ((Color) state.getValue()).v();
    }

    public static final long i(State state) {
        return ((Color) state.getValue()).v();
    }

    public static final void q(DrawScope drawScope, long j2, float f2, float f3) {
        float f4 = f3 / ((float) 2);
        DrawScope.j2(drawScope, j2, androidx.compose.ui.geometry.OffsetKt.a(f4, Offset.n(drawScope.T1())), androidx.compose.ui.geometry.OffsetKt.a(f2 - f4, Offset.n(drawScope.T1())), f3, StrokeCap.f16130b.b(), (PathEffect) null, 0.0f, (ColorFilter) null, 0, 480, (Object) null);
    }

    public static final float r() {
        return f8617b;
    }

    public static final float s() {
        return f8616a;
    }
}
