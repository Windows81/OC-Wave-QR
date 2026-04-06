package androidx.compose.material;

import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.Strings;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.util.MathHelpersKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

@Metadata
public final class SliderKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f8339a = Dp.m((float) 10);

    /* renamed from: b  reason: collision with root package name */
    public static final float f8340b = Dp.m((float) 24);

    /* renamed from: c  reason: collision with root package name */
    public static final float f8341c = Dp.m((float) 1);

    /* renamed from: d  reason: collision with root package name */
    public static final float f8342d = Dp.m((float) 6);

    /* renamed from: e  reason: collision with root package name */
    public static final float f8343e = Dp.m((float) 4);

    /* renamed from: f  reason: collision with root package name */
    public static final float f8344f;

    /* renamed from: g  reason: collision with root package name */
    public static final float f8345g;

    /* renamed from: h  reason: collision with root package name */
    public static final Modifier f8346h;

    /* renamed from: i  reason: collision with root package name */
    public static final TweenSpec f8347i = new TweenSpec(100, 0, (Easing) null, 6, (DefaultConstructorMarker) null);

    static {
        float m2 = Dp.m((float) 48);
        f8344f = m2;
        float m3 = Dp.m((float) 144);
        f8345g = m3;
        f8346h = SizeKt.k(SizeKt.A(Modifier.f15489d, m3, 0.0f, 2, (Object) null), 0.0f, m2, 1, (Object) null);
    }

    public static final Modifier A(Modifier modifier, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, State state, State state2, boolean z2, boolean z3, float f2, ClosedFloatingPointRange closedFloatingPointRange, State state3, State state4) {
        if (!z2) {
            return modifier;
        }
        Modifier modifier2 = modifier;
        return modifier.o0(new SuspendPointerInputElement((Object) null, (Object) null, new Object[]{mutableInteractionSource, mutableInteractionSource2, Float.valueOf(f2), Boolean.valueOf(z3), closedFloatingPointRange}, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0(new SliderKt$rangeSliderPressDragModifier$1(mutableInteractionSource, mutableInteractionSource2, state, state2, state4, z3, f2, state3, (Continuation) null)), 3, (DefaultConstructorMarker) null));
    }

    public static final float B(float f2, float f3, float f4, float f5, float f6) {
        return MathHelpersKt.b(f5, f6, y(f2, f3, f4));
    }

    public static final ClosedFloatingPointRange C(float f2, float f3, ClosedFloatingPointRange closedFloatingPointRange, float f4, float f5) {
        return RangesKt.b(B(f2, f3, ((Number) closedFloatingPointRange.e()).floatValue(), f4, f5), B(f2, f3, ((Number) closedFloatingPointRange.m()).floatValue(), f4, f5));
    }

    public static final Modifier D(Modifier modifier, boolean z2, int i2, ClosedFloatingPointRange closedFloatingPointRange, float f2, boolean z3, State state, State state2) {
        if (i2 >= 0) {
            Modifier modifier2 = modifier;
            return KeyInputModifierKt.a(modifier, new SliderKt$slideOnKeyEvents$2(z2, closedFloatingPointRange, i2, state, f2, z3, state2));
        }
        throw new IllegalArgumentException("steps should be >= 0");
    }

    public static final Modifier E(Modifier modifier, float f2, boolean z2, Function1 function1, Function0 function0, ClosedFloatingPointRange closedFloatingPointRange, int i2) {
        return ProgressSemanticsKt.b(SemanticsModifierKt.d(modifier, false, new SliderKt$sliderSemantics$1(z2, closedFloatingPointRange, i2, RangesKt.n(f2, ((Number) closedFloatingPointRange.e()).floatValue(), ((Number) closedFloatingPointRange.m()).floatValue()), function1, function0), 1, (Object) null), f2, closedFloatingPointRange, i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: androidx.compose.material.SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: androidx.compose.material.SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1} */
    /* JADX WARNING: type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.ui.Modifier F(androidx.compose.ui.Modifier r11, androidx.compose.foundation.gestures.DraggableState r12, androidx.compose.foundation.interaction.MutableInteractionSource r13, float r14, boolean r15, androidx.compose.runtime.State r16, androidx.compose.runtime.State r17, androidx.compose.runtime.MutableState r18, boolean r19) {
        /*
            boolean r0 = androidx.compose.ui.platform.InspectableValueKt.b()
            if (r0 == 0) goto L_0x0019
            androidx.compose.material.SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1 r0 = new androidx.compose.material.SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1
            r1 = r0
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x001d
        L_0x0019:
            kotlin.jvm.functions.Function1 r0 = androidx.compose.ui.platform.InspectableValueKt.a()
        L_0x001d:
            androidx.compose.material.SliderKt$sliderTapModifier$2 r10 = new androidx.compose.material.SliderKt$sliderTapModifier$2
            r1 = r10
            r2 = r19
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r18
            r8 = r16
            r9 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = r11
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.ComposedModifierKt.b(r11, r0, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.F(androidx.compose.ui.Modifier, androidx.compose.foundation.gestures.DraggableState, androidx.compose.foundation.interaction.MutableInteractionSource, float, boolean, androidx.compose.runtime.State, androidx.compose.runtime.State, androidx.compose.runtime.MutableState, boolean):androidx.compose.ui.Modifier");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Number} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final float G(float r7, java.util.List r8, float r9, float r10) {
        /*
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0008
            r8 = 0
            goto L_0x0046
        L_0x0008:
            r0 = 0
            java.lang.Object r0 = r8.get(r0)
            r1 = r0
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r1 = androidx.compose.ui.util.MathHelpersKt.b(r9, r10, r1)
            float r1 = r1 - r7
            float r1 = java.lang.Math.abs(r1)
            int r2 = kotlin.collections.CollectionsKt.o(r8)
            r3 = 1
            if (r3 > r2) goto L_0x0045
        L_0x0024:
            java.lang.Object r4 = r8.get(r3)
            r5 = r4
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            float r5 = androidx.compose.ui.util.MathHelpersKt.b(r9, r10, r5)
            float r5 = r5 - r7
            float r5 = java.lang.Math.abs(r5)
            int r6 = java.lang.Float.compare(r1, r5)
            if (r6 <= 0) goto L_0x0040
            r0 = r4
            r1 = r5
        L_0x0040:
            if (r3 == r2) goto L_0x0045
            int r3 = r3 + 1
            goto L_0x0024
        L_0x0045:
            r8 = r0
        L_0x0046:
            java.lang.Float r8 = (java.lang.Float) r8
            if (r8 == 0) goto L_0x0052
            float r7 = r8.floatValue()
            float r7 = androidx.compose.ui.util.MathHelpersKt.b(r9, r10, r7)
        L_0x0052:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.G(float, java.util.List, float, float):float");
    }

    public static final List H(int i2) {
        if (i2 == 0) {
            return CollectionsKt.m();
        }
        int i3 = i2 + 2;
        ArrayList arrayList = new ArrayList(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            arrayList.add(Float.valueOf(((float) i4) / ((float) (i2 + 1))));
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: androidx.compose.material.SliderKt$CorrectValueSideEffect$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: androidx.compose.material.SliderKt$CorrectValueSideEffect$1$1} */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(kotlin.jvm.functions.Function1 r17, kotlin.ranges.ClosedFloatingPointRange r18, kotlin.ranges.ClosedFloatingPointRange r19, androidx.compose.runtime.MutableState r20, float r21, androidx.compose.runtime.Composer r22, int r23) {
        /*
            r6 = r23
            r0 = -743965752(0xffffffffd3a7fbc8, float:-1.44296745E12)
            r1 = r22
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r6 & 6
            r3 = 4
            if (r2 != 0) goto L_0x001d
            r2 = r17
            boolean r4 = r1.l(r2)
            if (r4 == 0) goto L_0x001a
            r4 = r3
            goto L_0x001b
        L_0x001a:
            r4 = 2
        L_0x001b:
            r4 = r4 | r6
            goto L_0x0020
        L_0x001d:
            r2 = r17
            r4 = r6
        L_0x0020:
            r5 = r6 & 48
            r7 = 32
            if (r5 != 0) goto L_0x0034
            r5 = r18
            boolean r8 = r1.W(r5)
            if (r8 == 0) goto L_0x0030
            r8 = r7
            goto L_0x0032
        L_0x0030:
            r8 = 16
        L_0x0032:
            r4 = r4 | r8
            goto L_0x0036
        L_0x0034:
            r5 = r18
        L_0x0036:
            r8 = r6 & 384(0x180, float:5.38E-43)
            r13 = r19
            if (r8 != 0) goto L_0x0048
            boolean r8 = r1.W(r13)
            if (r8 == 0) goto L_0x0045
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0047
        L_0x0045:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0047:
            r4 = r4 | r8
        L_0x0048:
            r8 = r6 & 3072(0xc00, float:4.305E-42)
            r10 = 2048(0x800, float:2.87E-42)
            r14 = r20
            if (r8 != 0) goto L_0x005b
            boolean r8 = r1.W(r14)
            if (r8 == 0) goto L_0x0058
            r8 = r10
            goto L_0x005a
        L_0x0058:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x005a:
            r4 = r4 | r8
        L_0x005b:
            r8 = r6 & 24576(0x6000, float:3.4438E-41)
            r11 = 16384(0x4000, float:2.2959E-41)
            r15 = r21
            if (r8 != 0) goto L_0x006e
            boolean r8 = r1.h(r15)
            if (r8 == 0) goto L_0x006b
            r8 = r11
            goto L_0x006d
        L_0x006b:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x006d:
            r4 = r4 | r8
        L_0x006e:
            r8 = r4 & 9363(0x2493, float:1.312E-41)
            r12 = 9362(0x2492, float:1.3119E-41)
            r9 = 0
            r16 = 1
            if (r8 == r12) goto L_0x007a
            r8 = r16
            goto L_0x007b
        L_0x007a:
            r8 = r9
        L_0x007b:
            r12 = r4 & 1
            boolean r8 = r1.E(r8, r12)
            if (r8 == 0) goto L_0x00f3
            boolean r8 = androidx.compose.runtime.ComposerKt.P()
            if (r8 == 0) goto L_0x008f
            r8 = -1
            java.lang.String r12 = "androidx.compose.material.CorrectValueSideEffect (Slider.kt:929)"
            androidx.compose.runtime.ComposerKt.Y(r0, r4, r8, r12)
        L_0x008f:
            r0 = r4 & 112(0x70, float:1.57E-43)
            if (r0 != r7) goto L_0x0096
            r0 = r16
            goto L_0x0097
        L_0x0096:
            r0 = r9
        L_0x0097:
            r7 = r4 & 14
            if (r7 != r3) goto L_0x009e
            r3 = r16
            goto L_0x009f
        L_0x009e:
            r3 = r9
        L_0x009f:
            r0 = r0 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r4
            if (r3 != r11) goto L_0x00a9
            r3 = r16
            goto L_0x00aa
        L_0x00a9:
            r3 = r9
        L_0x00aa:
            r0 = r0 | r3
            r3 = r4 & 7168(0x1c00, float:1.0045E-41)
            if (r3 != r10) goto L_0x00b2
            r3 = r16
            goto L_0x00b3
        L_0x00b2:
            r3 = r9
        L_0x00b3:
            r0 = r0 | r3
            r3 = r4 & 896(0x380, float:1.256E-42)
            r4 = 256(0x100, float:3.59E-43)
            if (r3 != r4) goto L_0x00bb
            goto L_0x00bd
        L_0x00bb:
            r16 = r9
        L_0x00bd:
            r0 = r0 | r16
            java.lang.Object r3 = r1.g()
            if (r0 != 0) goto L_0x00d0
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r3 != r0) goto L_0x00ce
            goto L_0x00d0
        L_0x00ce:
            r0 = r9
            goto L_0x00e4
        L_0x00d0:
            androidx.compose.material.SliderKt$CorrectValueSideEffect$1$1 r3 = new androidx.compose.material.SliderKt$CorrectValueSideEffect$1$1
            r7 = r3
            r8 = r18
            r0 = r9
            r9 = r17
            r10 = r21
            r11 = r20
            r12 = r19
            r7.<init>(r8, r9, r10, r11, r12)
            r1.N(r3)
        L_0x00e4:
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            androidx.compose.runtime.EffectsKt.h(r3, r1, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00f6
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x00f6
        L_0x00f3:
            r1.B()
        L_0x00f6:
            androidx.compose.runtime.ScopeUpdateScope r7 = r1.x()
            if (r7 == 0) goto L_0x0111
            androidx.compose.material.SliderKt$CorrectValueSideEffect$2 r8 = new androidx.compose.material.SliderKt$CorrectValueSideEffect$2
            r0 = r8
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0111:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.a(kotlin.jvm.functions.Function1, kotlin.ranges.ClosedFloatingPointRange, kotlin.ranges.ClosedFloatingPointRange, androidx.compose.runtime.MutableState, float, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: androidx.compose.ui.Modifier$Companion} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0108  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(kotlin.ranges.ClosedFloatingPointRange r39, kotlin.jvm.functions.Function1 r40, androidx.compose.ui.Modifier r41, boolean r42, kotlin.ranges.ClosedFloatingPointRange r43, int r44, kotlin.jvm.functions.Function0 r45, androidx.compose.material.SliderColors r46, androidx.compose.runtime.Composer r47, int r48, int r49) {
        /*
            r2 = r40
            r9 = r48
            r10 = r49
            r0 = -1556183027(0xffffffffa33e880d, float:-1.03287305E-17)
            r1 = r47
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r3 = r10 & 1
            if (r3 == 0) goto L_0x0019
            r3 = r9 | 6
            r6 = r3
            r3 = r39
            goto L_0x002d
        L_0x0019:
            r3 = r9 & 6
            if (r3 != 0) goto L_0x002a
            r3 = r39
            boolean r6 = r1.W(r3)
            if (r6 == 0) goto L_0x0027
            r6 = 4
            goto L_0x0028
        L_0x0027:
            r6 = 2
        L_0x0028:
            r6 = r6 | r9
            goto L_0x002d
        L_0x002a:
            r3 = r39
            r6 = r9
        L_0x002d:
            r7 = r10 & 2
            if (r7 == 0) goto L_0x0034
            r6 = r6 | 48
            goto L_0x0044
        L_0x0034:
            r7 = r9 & 48
            if (r7 != 0) goto L_0x0044
            boolean r7 = r1.l(r2)
            if (r7 == 0) goto L_0x0041
            r7 = 32
            goto L_0x0043
        L_0x0041:
            r7 = 16
        L_0x0043:
            r6 = r6 | r7
        L_0x0044:
            r7 = r10 & 4
            if (r7 == 0) goto L_0x004d
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r8 = r41
            goto L_0x005f
        L_0x004d:
            r8 = r9 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x004a
            r8 = r41
            boolean r11 = r1.W(r8)
            if (r11 == 0) goto L_0x005c
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r11 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r6 = r6 | r11
        L_0x005f:
            r11 = r10 & 8
            if (r11 == 0) goto L_0x0068
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r12 = r42
            goto L_0x007a
        L_0x0068:
            r12 = r9 & 3072(0xc00, float:4.305E-42)
            if (r12 != 0) goto L_0x0065
            r12 = r42
            boolean r13 = r1.d(r12)
            if (r13 == 0) goto L_0x0077
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r6 = r6 | r13
        L_0x007a:
            r13 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x0093
            r13 = r10 & 16
            if (r13 != 0) goto L_0x008d
            r13 = r43
            boolean r14 = r1.W(r13)
            if (r14 == 0) goto L_0x008f
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0091
        L_0x008d:
            r13 = r43
        L_0x008f:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0091:
            r6 = r6 | r14
            goto L_0x0095
        L_0x0093:
            r13 = r43
        L_0x0095:
            r14 = r10 & 32
            r16 = 196608(0x30000, float:2.75506E-40)
            if (r14 == 0) goto L_0x00a0
            r6 = r6 | r16
            r15 = r44
            goto L_0x00b3
        L_0x00a0:
            r16 = r9 & r16
            r15 = r44
            if (r16 != 0) goto L_0x00b3
            boolean r16 = r1.i(r15)
            if (r16 == 0) goto L_0x00af
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b1
        L_0x00af:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b1:
            r6 = r6 | r16
        L_0x00b3:
            r16 = r10 & 64
            r17 = 1572864(0x180000, float:2.204052E-39)
            if (r16 == 0) goto L_0x00be
            r6 = r6 | r17
            r4 = r45
            goto L_0x00d1
        L_0x00be:
            r17 = r9 & r17
            r4 = r45
            if (r17 != 0) goto L_0x00d1
            boolean r17 = r1.l(r4)
            if (r17 == 0) goto L_0x00cd
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cf
        L_0x00cd:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00cf:
            r6 = r6 | r17
        L_0x00d1:
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            r17 = r9 & r17
            if (r17 != 0) goto L_0x00ed
            r5 = r10 & 128(0x80, float:1.794E-43)
            if (r5 != 0) goto L_0x00e6
            r5 = r46
            boolean r17 = r1.W(r5)
            if (r17 == 0) goto L_0x00e8
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ea
        L_0x00e6:
            r5 = r46
        L_0x00e8:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ea:
            r6 = r6 | r17
            goto L_0x00ef
        L_0x00ed:
            r5 = r46
        L_0x00ef:
            r17 = 4793491(0x492493, float:6.717112E-39)
            r0 = r6 & r17
            r3 = 4793490(0x492492, float:6.71711E-39)
            r36 = 0
            r15 = 1
            if (r0 == r3) goto L_0x00fe
            r0 = r15
            goto L_0x0100
        L_0x00fe:
            r0 = r36
        L_0x0100:
            r3 = r6 & 1
            boolean r0 = r1.E(r0, r3)
            if (r0 == 0) goto L_0x0269
            r1.p()
            r0 = r9 & 1
            r3 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r17 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0135
            boolean r0 = r1.J()
            if (r0 == 0) goto L_0x011c
            goto L_0x0135
        L_0x011c:
            r1.B()
            r0 = r10 & 16
            if (r0 == 0) goto L_0x0125
            r6 = r6 & r17
        L_0x0125:
            r0 = r10 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x012a
            r6 = r6 & r3
        L_0x012a:
            r37 = r44
            r11 = r6
            r0 = r12
            r7 = r13
            r3 = 131072(0x20000, float:1.83671E-40)
            r6 = r5
            r5 = r15
            goto L_0x018e
        L_0x0135:
            if (r7 == 0) goto L_0x013a
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            r8 = r0
        L_0x013a:
            if (r11 == 0) goto L_0x013e
            r0 = r15
            goto L_0x013f
        L_0x013e:
            r0 = r12
        L_0x013f:
            r7 = r10 & 16
            if (r7 == 0) goto L_0x014d
            r7 = 0
            r11 = 1065353216(0x3f800000, float:1.0)
            kotlin.ranges.ClosedFloatingPointRange r7 = kotlin.ranges.RangesKt.b(r7, r11)
            r6 = r6 & r17
            goto L_0x014e
        L_0x014d:
            r7 = r13
        L_0x014e:
            if (r14 == 0) goto L_0x0153
            r37 = r36
            goto L_0x0155
        L_0x0153:
            r37 = r44
        L_0x0155:
            if (r16 == 0) goto L_0x0158
            r4 = 0
        L_0x0158:
            r11 = r10 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x0188
            androidx.compose.material.SliderDefaults r11 = androidx.compose.material.SliderDefaults.f8333a
            r34 = 6
            r35 = 1023(0x3ff, float:1.434E-42)
            r12 = 0
            r16 = 0
            r5 = r15
            r14 = r16
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r28 = 0
            r30 = 0
            r33 = 0
            r32 = r1
            androidx.compose.material.SliderColors r11 = r11.a(r12, r14, r16, r18, r20, r22, r24, r26, r28, r30, r32, r33, r34, r35)
            r6 = r6 & r3
            r3 = 131072(0x20000, float:1.83671E-40)
            r38 = r11
            r11 = r6
            r6 = r38
            goto L_0x018e
        L_0x0188:
            r5 = r15
            r3 = 131072(0x20000, float:1.83671E-40)
            r11 = r6
            r6 = r46
        L_0x018e:
            r1.U()
            boolean r12 = androidx.compose.runtime.ComposerKt.P()
            if (r12 == 0) goto L_0x01a0
            r12 = -1
            java.lang.String r13 = "androidx.compose.material.RangeSlider (Slider.kt:406)"
            r14 = -1556183027(0xffffffffa33e880d, float:-1.03287305E-17)
            androidx.compose.runtime.ComposerKt.Y(r14, r11, r12, r13)
        L_0x01a0:
            java.lang.Object r12 = r1.g()
            androidx.compose.runtime.Composer$Companion r13 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r14 = r13.a()
            if (r12 != r14) goto L_0x01b3
            androidx.compose.foundation.interaction.MutableInteractionSource r12 = androidx.compose.foundation.interaction.InteractionSourceKt.a()
            r1.N(r12)
        L_0x01b3:
            r17 = r12
            androidx.compose.foundation.interaction.MutableInteractionSource r17 = (androidx.compose.foundation.interaction.MutableInteractionSource) r17
            java.lang.Object r12 = r1.g()
            java.lang.Object r14 = r13.a()
            if (r12 != r14) goto L_0x01c8
            androidx.compose.foundation.interaction.MutableInteractionSource r12 = androidx.compose.foundation.interaction.InteractionSourceKt.a()
            r1.N(r12)
        L_0x01c8:
            r18 = r12
            androidx.compose.foundation.interaction.MutableInteractionSource r18 = (androidx.compose.foundation.interaction.MutableInteractionSource) r18
            if (r37 < 0) goto L_0x0261
            int r12 = r11 >> 3
            r12 = r12 & 14
            androidx.compose.runtime.State r16 = androidx.compose.runtime.SnapshotStateKt.p(r2, r1, r12)
            r12 = 458752(0x70000, float:6.42848E-40)
            r11 = r11 & r12
            if (r11 != r3) goto L_0x01dd
            r36 = r5
        L_0x01dd:
            java.lang.Object r3 = r1.g()
            if (r36 != 0) goto L_0x01e9
            java.lang.Object r11 = r13.a()
            if (r3 != r11) goto L_0x01f0
        L_0x01e9:
            java.util.List r3 = H(r37)
            r1.N(r3)
        L_0x01f0:
            r14 = r3
            java.util.List r14 = (java.util.List) r14
            androidx.compose.ui.Modifier r3 = androidx.compose.material.InteractiveComponentSizeKt.c(r8)
            float r11 = f8339a
            r12 = 4
            float r12 = (float) r12
            float r12 = r12 * r11
            float r12 = androidx.compose.ui.unit.Dp.m(r12)
            r13 = 2
            float r13 = (float) r13
            float r11 = r11 * r13
            float r11 = androidx.compose.ui.unit.Dp.m(r11)
            r13 = 12
            r15 = 0
            r19 = 0
            r20 = 0
            r41 = r3
            r42 = r12
            r43 = r11
            r44 = r19
            r45 = r20
            r46 = r13
            r47 = r15
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.r(r41, r42, r43, r44, r45, r46, r47)
            androidx.compose.material.SliderKt$RangeSlider$2 r15 = new androidx.compose.material.SliderKt$RangeSlider$2
            r11 = r15
            r12 = r7
            r13 = r39
            r2 = r15
            r15 = r4
            r19 = r0
            r20 = r37
            r21 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r11 = 54
            r12 = 652589923(0x26e5bb63, float:1.5940858E-15)
            androidx.compose.runtime.internal.ComposableLambda r2 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r12, r5, r2, r1, r11)
            r5 = 3072(0xc00, float:4.305E-42)
            r11 = 6
            r12 = 0
            r13 = 0
            r41 = r3
            r42 = r12
            r43 = r13
            r44 = r2
            r45 = r1
            r46 = r5
            r47 = r11
            androidx.compose.foundation.layout.BoxWithConstraintsKt.a(r41, r42, r43, r44, r45, r46, r47)
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0259
            androidx.compose.runtime.ComposerKt.X()
        L_0x0259:
            r5 = r7
            r3 = r8
            r7 = r4
            r8 = r6
            r6 = r37
            r4 = r0
            goto L_0x0274
        L_0x0261:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "steps should be >= 0"
            r0.<init>(r1)
            throw r0
        L_0x0269:
            r1.B()
            r6 = r44
            r7 = r4
            r3 = r8
            r4 = r12
            r5 = r13
            r8 = r46
        L_0x0274:
            androidx.compose.runtime.ScopeUpdateScope r11 = r1.x()
            if (r11 == 0) goto L_0x028b
            androidx.compose.material.SliderKt$RangeSlider$3 r12 = new androidx.compose.material.SliderKt$RangeSlider$3
            r0 = r12
            r1 = r39
            r2 = r40
            r9 = r48
            r10 = r49
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.a(r12)
        L_0x028b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.b(kotlin.ranges.ClosedFloatingPointRange, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, kotlin.ranges.ClosedFloatingPointRange, int, kotlin.jvm.functions.Function0, androidx.compose.material.SliderColors, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void c(boolean z2, float f2, float f3, List list, SliderColors sliderColors, float f4, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, Modifier modifier, Modifier modifier2, Modifier modifier3, Composer composer, int i2, int i3) {
        int i4;
        int i5;
        Composer composer2;
        float f5 = f2;
        float f6 = f3;
        float f7 = f4;
        MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
        MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
        Modifier modifier4 = modifier;
        Modifier modifier5 = modifier2;
        Modifier modifier6 = modifier3;
        int i6 = i2;
        Composer q2 = composer.q(-278895713);
        boolean z3 = z2;
        if ((i6 & 6) == 0) {
            i4 = (q2.d(z3) ? 4 : 2) | i6;
        } else {
            i4 = i6;
        }
        if ((i6 & 48) == 0) {
            i4 |= q2.h(f5) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i4 |= q2.h(f6) ? 256 : 128;
        }
        if ((i6 & 3072) == 0) {
            i4 |= q2.l(list) ? 2048 : 1024;
        } else {
            List list2 = list;
        }
        if ((i6 & 24576) == 0) {
            i4 |= q2.W(sliderColors) ? 16384 : 8192;
        } else {
            SliderColors sliderColors2 = sliderColors;
        }
        if ((i6 & 196608) == 0) {
            i4 |= q2.h(f7) ? 131072 : 65536;
        }
        if ((i6 & 1572864) == 0) {
            i4 |= q2.W(mutableInteractionSource3) ? 1048576 : 524288;
        }
        if ((i6 & 12582912) == 0) {
            i4 |= q2.W(mutableInteractionSource4) ? 8388608 : 4194304;
        }
        if ((i6 & 100663296) == 0) {
            i4 |= q2.W(modifier4) ? 67108864 : 33554432;
        }
        if ((i6 & 805306368) == 0) {
            i4 |= q2.W(modifier5) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (q2.W(modifier6) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if (q2.E(((i4 & 306783379) == 306783378 && (i5 & 3) == 2) ? false : true, i4 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-278895713, i4, i5, "androidx.compose.material.RangeSliderImpl (Slider.kt:726)");
            }
            Strings.Companion companion = Strings.f8507b;
            String a2 = Strings_androidKt.a(companion.g(), q2, 6);
            String a3 = Strings_androidKt.a(companion.f(), q2, 6);
            Modifier o0 = modifier4.o0(f8346h);
            Alignment.Companion companion2 = Alignment.f15444a;
            String str = a2;
            MeasurePolicy g2 = BoxKt.g(companion2.o(), false);
            int a4 = ComposablesKt.a(q2, 0);
            String str2 = a3;
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, o0);
            ComposeUiNode.Companion companion3 = ComposeUiNode.f17222h;
            Function0 a5 = companion3.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a5);
            } else {
                q2.K();
            }
            Composer b2 = Updater.b(q2);
            Updater.g(b2, g2, companion3.c());
            Updater.g(b2, I, companion3.e());
            Function2 b3 = companion3.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a4))) {
                b2.N(Integer.valueOf(a4));
                b2.A(Integer.valueOf(a4), b3);
            }
            Updater.g(b2, e2, companion3.d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
            Density density = (Density) q2.C(CompositionLocalsKt.g());
            float B1 = density.B1(f8343e);
            float f8 = f8339a;
            float B12 = density.B1(f8);
            float E = density.E(f7);
            float m2 = Dp.m(f8 * ((float) 2));
            float m3 = Dp.m(E * f5);
            float m4 = Dp.m(E * f6);
            Modifier.Companion companion4 = Modifier.f15489d;
            int i7 = i4 >> 9;
            int i8 = i4 << 6;
            int i9 = i4;
            int i10 = i7;
            String str3 = str2;
            String str4 = str;
            Modifier.Companion companion5 = companion4;
            Composer composer3 = q2;
            BoxScopeInstance boxScopeInstance2 = boxScopeInstance;
            Modifier modifier7 = modifier5;
            g(SizeKt.f(boxScopeInstance.g(companion4, companion2.h()), 0.0f, 1, (Object) null), sliderColors, z2, f2, f3, list, B12, B1, composer3, (i8 & 896) | (i7 & 112) | (i8 & 7168) | (i8 & 57344) | (i8 & 458752));
            composer2 = composer3;
            boolean W = composer2.W(str4);
            Object g3 = composer2.g();
            if (W || g3 == Composer.f14567a.a()) {
                g3 = new SliderKt$RangeSliderImpl$1$2$1(str4);
                composer2.N(g3);
            }
            int i11 = i9 & 57344;
            int i12 = (i9 << 15) & 458752;
            f(boxScopeInstance2, FocusableKt.a(SemanticsModifierKt.c(companion5, true, (Function1) g3), true, mutableInteractionSource3).o0(modifier7), m3, mutableInteractionSource, sliderColors, z2, m2, composer2, (i10 & 7168) | 1572870 | i11 | i12);
            boolean W2 = composer2.W(str3);
            Object g4 = composer2.g();
            if (W2 || g4 == Composer.f14567a.a()) {
                g4 = new SliderKt$RangeSliderImpl$1$3$1(str3);
                composer2.N(g4);
            }
            f(boxScopeInstance2, FocusableKt.a(SemanticsModifierKt.c(companion5, true, (Function1) g4), true, mutableInteractionSource2).o0(modifier3), m4, mutableInteractionSource2, sliderColors, z2, m2, composer2, ((i9 >> 12) & 7168) | 1572870 | i11 | i12);
            composer2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            composer2 = q2;
            MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
            Modifier modifier8 = modifier6;
            composer2.B();
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            SliderKt$RangeSliderImpl$2 sliderKt$RangeSliderImpl$2 = r0;
            SliderKt$RangeSliderImpl$2 sliderKt$RangeSliderImpl$22 = new SliderKt$RangeSliderImpl$2(z2, f2, f3, list, sliderColors, f4, mutableInteractionSource, mutableInteractionSource2, modifier, modifier2, modifier3, i2, i3);
            x2.a(sliderKt$RangeSliderImpl$2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: androidx.compose.ui.Modifier$Companion} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x011a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(float r40, kotlin.jvm.functions.Function1 r41, androidx.compose.ui.Modifier r42, boolean r43, kotlin.ranges.ClosedFloatingPointRange r44, int r45, kotlin.jvm.functions.Function0 r46, androidx.compose.foundation.interaction.MutableInteractionSource r47, androidx.compose.material.SliderColors r48, androidx.compose.runtime.Composer r49, int r50, int r51) {
        /*
            r2 = r41
            r10 = r50
            r11 = r51
            r0 = -1962335196(0xffffffff8b092424, float:-2.641243E-32)
            r1 = r49
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r3 = r11 & 1
            if (r3 == 0) goto L_0x0019
            r3 = r10 | 6
            r5 = r3
            r3 = r40
            goto L_0x002d
        L_0x0019:
            r3 = r10 & 6
            if (r3 != 0) goto L_0x002a
            r3 = r40
            boolean r5 = r1.h(r3)
            if (r5 == 0) goto L_0x0027
            r5 = 4
            goto L_0x0028
        L_0x0027:
            r5 = 2
        L_0x0028:
            r5 = r5 | r10
            goto L_0x002d
        L_0x002a:
            r3 = r40
            r5 = r10
        L_0x002d:
            r6 = r11 & 2
            if (r6 == 0) goto L_0x0034
            r5 = r5 | 48
            goto L_0x0044
        L_0x0034:
            r6 = r10 & 48
            if (r6 != 0) goto L_0x0044
            boolean r6 = r1.l(r2)
            if (r6 == 0) goto L_0x0041
            r6 = 32
            goto L_0x0043
        L_0x0041:
            r6 = 16
        L_0x0043:
            r5 = r5 | r6
        L_0x0044:
            r6 = r11 & 4
            if (r6 == 0) goto L_0x004d
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r7 = r42
            goto L_0x005f
        L_0x004d:
            r7 = r10 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x004a
            r7 = r42
            boolean r8 = r1.W(r7)
            if (r8 == 0) goto L_0x005c
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r5 = r5 | r8
        L_0x005f:
            r8 = r11 & 8
            if (r8 == 0) goto L_0x0068
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r9 = r43
            goto L_0x007a
        L_0x0068:
            r9 = r10 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0065
            r9 = r43
            boolean r12 = r1.d(r9)
            if (r12 == 0) goto L_0x0077
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r5 = r5 | r12
        L_0x007a:
            r12 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0093
            r12 = r11 & 16
            if (r12 != 0) goto L_0x008d
            r12 = r44
            boolean r13 = r1.W(r12)
            if (r13 == 0) goto L_0x008f
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0091
        L_0x008d:
            r12 = r44
        L_0x008f:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0091:
            r5 = r5 | r13
            goto L_0x0095
        L_0x0093:
            r12 = r44
        L_0x0095:
            r13 = r11 & 32
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r13 == 0) goto L_0x009f
            r5 = r5 | r14
        L_0x009c:
            r14 = r45
            goto L_0x00b1
        L_0x009f:
            r14 = r14 & r10
            if (r14 != 0) goto L_0x009c
            r14 = r45
            boolean r16 = r1.i(r14)
            if (r16 == 0) goto L_0x00ad
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00af
        L_0x00ad:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00af:
            r5 = r5 | r16
        L_0x00b1:
            r16 = r11 & 64
            r17 = 1572864(0x180000, float:2.204052E-39)
            if (r16 == 0) goto L_0x00bc
            r5 = r5 | r17
            r15 = r46
            goto L_0x00cf
        L_0x00bc:
            r17 = r10 & r17
            r15 = r46
            if (r17 != 0) goto L_0x00cf
            boolean r17 = r1.l(r15)
            if (r17 == 0) goto L_0x00cb
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cd
        L_0x00cb:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00cd:
            r5 = r5 | r17
        L_0x00cf:
            r4 = r11 & 128(0x80, float:1.794E-43)
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            if (r4 == 0) goto L_0x00da
            r5 = r5 | r17
            r0 = r47
            goto L_0x00ed
        L_0x00da:
            r17 = r10 & r17
            r0 = r47
            if (r17 != 0) goto L_0x00ed
            boolean r17 = r1.W(r0)
            if (r17 == 0) goto L_0x00e9
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00eb
        L_0x00e9:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00eb:
            r5 = r5 | r17
        L_0x00ed:
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            r17 = r10 & r17
            if (r17 != 0) goto L_0x0109
            r0 = r11 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x0102
            r0 = r48
            boolean r17 = r1.W(r0)
            if (r17 == 0) goto L_0x0104
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0106
        L_0x0102:
            r0 = r48
        L_0x0104:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0106:
            r5 = r5 | r17
            goto L_0x010b
        L_0x0109:
            r0 = r48
        L_0x010b:
            r17 = 38347923(0x2492493, float:1.4777644E-37)
            r0 = r5 & r17
            r3 = 38347922(0x2492492, float:1.4777643E-37)
            r37 = 0
            r15 = 1
            if (r0 == r3) goto L_0x011a
            r0 = r15
            goto L_0x011c
        L_0x011a:
            r0 = r37
        L_0x011c:
            r3 = r5 & 1
            boolean r0 = r1.E(r0, r3)
            if (r0 == 0) goto L_0x02dc
            r1.p()
            r0 = r10 & 1
            r3 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r17 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0153
            boolean r0 = r1.J()
            if (r0 == 0) goto L_0x0138
            goto L_0x0153
        L_0x0138:
            r1.B()
            r0 = r11 & 16
            if (r0 == 0) goto L_0x0141
            r5 = r5 & r17
        L_0x0141:
            r0 = r11 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0146
            r5 = r5 & r3
        L_0x0146:
            r3 = r46
            r8 = r47
            r0 = r12
            r6 = r14
            r4 = 131072(0x20000, float:1.83671E-40)
            r12 = r5
        L_0x014f:
            r5 = r48
            goto L_0x01b6
        L_0x0153:
            if (r6 == 0) goto L_0x0158
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            r7 = r0
        L_0x0158:
            if (r8 == 0) goto L_0x015b
            r9 = r15
        L_0x015b:
            r0 = r11 & 16
            if (r0 == 0) goto L_0x0169
            r0 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            kotlin.ranges.ClosedFloatingPointRange r0 = kotlin.ranges.RangesKt.b(r0, r6)
            r5 = r5 & r17
            goto L_0x016a
        L_0x0169:
            r0 = r12
        L_0x016a:
            if (r13 == 0) goto L_0x016f
            r6 = r37
            goto L_0x0170
        L_0x016f:
            r6 = r14
        L_0x0170:
            r8 = 0
            if (r16 == 0) goto L_0x0176
            r38 = r8
            goto L_0x0178
        L_0x0176:
            r38 = r46
        L_0x0178:
            if (r4 == 0) goto L_0x017b
            goto L_0x017d
        L_0x017b:
            r8 = r47
        L_0x017d:
            r4 = r11 & 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x01b0
            androidx.compose.material.SliderDefaults r12 = androidx.compose.material.SliderDefaults.f8333a
            r35 = 6
            r36 = 1023(0x3ff, float:1.434E-42)
            r13 = 0
            r16 = 0
            r4 = 131072(0x20000, float:1.83671E-40)
            r15 = r16
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r34 = 0
            r33 = r1
            androidx.compose.material.SliderColors r12 = r12.a(r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r34, r35, r36)
            r5 = r5 & r3
            r3 = r38
            r39 = r12
            r12 = r5
            r5 = r39
            goto L_0x01b6
        L_0x01b0:
            r4 = 131072(0x20000, float:1.83671E-40)
            r12 = r5
            r3 = r38
            goto L_0x014f
        L_0x01b6:
            r1.U()
            boolean r13 = androidx.compose.runtime.ComposerKt.P()
            if (r13 == 0) goto L_0x01c8
            r13 = -1
            java.lang.String r14 = "androidx.compose.material.Slider (Slider.kt:165)"
            r15 = -1962335196(0xffffffff8b092424, float:-2.641243E-32)
            androidx.compose.runtime.ComposerKt.Y(r15, r12, r13, r14)
        L_0x01c8:
            if (r8 != 0) goto L_0x01ea
            r13 = 246381876(0xeaf7d34, float:4.3261397E-30)
            r1.X(r13)
            java.lang.Object r13 = r1.g()
            androidx.compose.runtime.Composer$Companion r14 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r14 = r14.a()
            if (r13 != r14) goto L_0x01e3
            androidx.compose.foundation.interaction.MutableInteractionSource r13 = androidx.compose.foundation.interaction.InteractionSourceKt.a()
            r1.N(r13)
        L_0x01e3:
            androidx.compose.foundation.interaction.MutableInteractionSource r13 = (androidx.compose.foundation.interaction.MutableInteractionSource) r13
            r1.M()
            r15 = r13
            goto L_0x01f4
        L_0x01ea:
            r13 = -407694845(0xffffffffe7b31203, float:-1.6912717E24)
            r1.X(r13)
            r1.M()
            r15 = r8
        L_0x01f4:
            if (r6 < 0) goto L_0x02d4
            int r13 = r12 >> 3
            r13 = r13 & 14
            androidx.compose.runtime.State r20 = androidx.compose.runtime.SnapshotStateKt.p(r2, r1, r13)
            int r13 = r12 >> 18
            r13 = r13 & 14
            androidx.compose.runtime.State r13 = androidx.compose.runtime.SnapshotStateKt.p(r3, r1, r13)
            r14 = 458752(0x70000, float:6.42848E-40)
            r12 = r12 & r14
            if (r12 != r4) goto L_0x020d
            r4 = 1
            goto L_0x020f
        L_0x020d:
            r4 = r37
        L_0x020f:
            java.lang.Object r12 = r1.g()
            if (r4 != 0) goto L_0x021d
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r12 != r4) goto L_0x0224
        L_0x021d:
            java.util.List r12 = H(r6)
            r1.N(r12)
        L_0x0224:
            r4 = r12
            java.util.List r4 = (java.util.List) r4
            androidx.compose.ui.Modifier r12 = androidx.compose.material.InteractiveComponentSizeKt.c(r7)
            float r14 = f8339a
            r2 = 2
            float r2 = (float) r2
            float r16 = r14 * r2
            float r16 = androidx.compose.ui.unit.Dp.m(r16)
            float r14 = r14 * r2
            float r2 = androidx.compose.ui.unit.Dp.m(r14)
            r14 = 12
            r17 = 0
            r18 = 0
            r19 = 0
            r42 = r12
            r43 = r16
            r44 = r2
            r45 = r18
            r46 = r19
            r47 = r14
            r48 = r17
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.r(r42, r43, r44, r45, r46, r47, r48)
            r42 = r2
            r43 = r40
            r44 = r9
            r45 = r41
            r46 = r3
            r47 = r0
            r48 = r6
            androidx.compose.ui.Modifier r2 = E(r42, r43, r44, r45, r46, r47, r48)
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.FocusableKt.a(r2, r9, r15)
            androidx.compose.runtime.ProvidableCompositionLocal r12 = androidx.compose.ui.platform.CompositionLocalsKt.m()
            java.lang.Object r12 = r1.C(r12)
            androidx.compose.ui.unit.LayoutDirection r14 = androidx.compose.ui.unit.LayoutDirection.Rtl
            if (r12 != r14) goto L_0x0278
            r37 = 1
        L_0x0278:
            r42 = r2
            r43 = r9
            r44 = r6
            r45 = r0
            r46 = r40
            r47 = r37
            r48 = r20
            r49 = r13
            androidx.compose.ui.Modifier r2 = D(r42, r43, r44, r45, r46, r47, r48, r49)
            androidx.compose.material.SliderKt$Slider$2 r14 = new androidx.compose.material.SliderKt$Slider$2
            r12 = r14
            r13 = r0
            r49 = r0
            r0 = r14
            r14 = r40
            r17 = r15
            r15 = r4
            r16 = r3
            r18 = r9
            r19 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            r4 = 54
            r12 = 2085116814(0x7c485b8e, float:4.1612653E36)
            r13 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r12, r13, r0, r1, r4)
            r4 = 3072(0xc00, float:4.305E-42)
            r12 = 6
            r13 = 0
            r14 = 0
            r42 = r2
            r43 = r13
            r44 = r14
            r45 = r0
            r46 = r1
            r47 = r4
            r48 = r12
            androidx.compose.foundation.layout.BoxWithConstraintsKt.a(r42, r43, r44, r45, r46, r47, r48)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x02ca
            androidx.compose.runtime.ComposerKt.X()
        L_0x02ca:
            r4 = r9
            r9 = r5
            r5 = r49
            r39 = r7
            r7 = r3
            r3 = r39
            goto L_0x02e9
        L_0x02d4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "steps should be >= 0"
            r0.<init>(r1)
            throw r0
        L_0x02dc:
            r1.B()
            r8 = r47
            r3 = r7
            r4 = r9
            r5 = r12
            r6 = r14
            r7 = r46
            r9 = r48
        L_0x02e9:
            androidx.compose.runtime.ScopeUpdateScope r12 = r1.x()
            if (r12 == 0) goto L_0x0300
            androidx.compose.material.SliderKt$Slider$3 r13 = new androidx.compose.material.SliderKt$Slider$3
            r0 = r13
            r1 = r40
            r2 = r41
            r10 = r50
            r11 = r51
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x0300:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.d(float, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, kotlin.ranges.ClosedFloatingPointRange, int, kotlin.jvm.functions.Function0, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.SliderColors, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void e(boolean z2, float f2, List list, SliderColors sliderColors, float f3, MutableInteractionSource mutableInteractionSource, Modifier modifier, Composer composer, int i2) {
        int i3;
        float f4 = f2;
        float f5 = f3;
        Modifier modifier2 = modifier;
        int i4 = i2;
        Composer q2 = composer.q(1679682785);
        boolean z3 = z2;
        if ((i4 & 6) == 0) {
            i3 = (q2.d(z3) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.h(f4) ? 32 : 16;
        }
        List list2 = list;
        if ((i4 & 384) == 0) {
            i3 |= q2.l(list2) ? 256 : 128;
        }
        SliderColors sliderColors2 = sliderColors;
        if ((i4 & 3072) == 0) {
            i3 |= q2.W(sliderColors2) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i3 |= q2.h(f5) ? 16384 : 8192;
        }
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        if ((196608 & i4) == 0) {
            i3 |= q2.W(mutableInteractionSource2) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i3 |= q2.W(modifier2) ? 1048576 : 524288;
        }
        int i5 = i3;
        if (q2.E((599187 & i5) != 599186, i5 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1679682785, i5, -1, "androidx.compose.material.SliderImpl (Slider.kt:685)");
            }
            Modifier o0 = modifier2.o0(f8346h);
            MeasurePolicy g2 = BoxKt.g(Alignment.f15444a.o(), false);
            int a2 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, o0);
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Function0 a3 = companion.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a3);
            } else {
                q2.K();
            }
            Composer b2 = Updater.b(q2);
            Updater.g(b2, g2, companion.c());
            Updater.g(b2, I, companion.e());
            Function2 b3 = companion.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a2))) {
                b2.N(Integer.valueOf(a2));
                b2.A(Integer.valueOf(a2), b3);
            }
            Updater.g(b2, e2, companion.d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
            Density density = (Density) q2.C(CompositionLocalsKt.g());
            float B1 = density.B1(f8343e);
            float f6 = f8339a;
            float B12 = density.B1(f6);
            float E = density.E(f5);
            float m2 = Dp.m(f6 * ((float) 2));
            float m3 = Dp.m(E * f4);
            Modifier.Companion companion2 = Modifier.f15489d;
            int i6 = i5 >> 6;
            int i7 = i5 << 9;
            int i8 = i5;
            Composer composer2 = q2;
            g(SizeKt.f(companion2, 0.0f, 1, (Object) null), sliderColors, z2, 0.0f, f2, list, B12, B1, composer2, (i6 & 112) | 3078 | ((i5 << 6) & 896) | (i7 & 57344) | (i7 & 458752));
            f(boxScopeInstance, companion2, m3, mutableInteractionSource, sliderColors, z2, m2, composer2, (i6 & 7168) | 1572918 | ((i8 << 3) & 57344) | ((i8 << 15) & 458752));
            q2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new SliderKt$SliderImpl$2(z2, f2, list, sliderColors, f3, mutableInteractionSource, modifier, i2));
        }
    }

    public static final void f(BoxScope boxScope, Modifier modifier, float f2, MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, boolean z2, float f3, Composer composer, int i2) {
        int i3;
        BoxScope boxScope2 = boxScope;
        Modifier modifier2 = modifier;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        SliderColors sliderColors2 = sliderColors;
        boolean z3 = z2;
        float f4 = f3;
        int i4 = i2;
        Composer q2 = composer.q(428907178);
        if ((i4 & 6) == 0) {
            i3 = (q2.W(boxScope2) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.W(modifier2) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i3 |= q2.h(f2) ? 256 : 128;
        } else {
            float f5 = f2;
        }
        if ((i4 & 3072) == 0) {
            i3 |= q2.W(mutableInteractionSource2) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i3 |= q2.W(sliderColors2) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i3 |= q2.d(z3) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i3 |= q2.h(f4) ? 1048576 : 524288;
        }
        if (q2.E((599187 & i3) != 599186, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(428907178, i3, -1, "androidx.compose.material.SliderThumb (Slider.kt:789)");
            }
            Modifier m2 = PaddingKt.m(Modifier.f15489d, f2, 0.0f, 0.0f, 0.0f, 14, (Object) null);
            Alignment.Companion companion = Alignment.f15444a;
            Modifier g2 = boxScope2.g(m2, companion.h());
            MeasurePolicy g3 = BoxKt.g(companion.o(), false);
            int a2 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, g2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.f17222h;
            Function0 a3 = companion2.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a3);
            } else {
                q2.K();
            }
            Composer b2 = Updater.b(q2);
            Updater.g(b2, g3, companion2.c());
            Updater.g(b2, I, companion2.e());
            Function2 b3 = companion2.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a2))) {
                b2.N(Integer.valueOf(a2));
                b2.A(Integer.valueOf(a2), b3);
            }
            Updater.g(b2, e2, companion2.d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
            Object g4 = q2.g();
            Composer.Companion companion3 = Composer.f14567a;
            if (g4 == companion3.a()) {
                g4 = SnapshotStateKt.f();
                q2.N(g4);
            }
            SnapshotStateList snapshotStateList = (SnapshotStateList) g4;
            boolean z4 = (i3 & 7168) == 2048;
            Object g5 = q2.g();
            if (z4 || g5 == companion3.a()) {
                g5 = new SliderKt$SliderThumb$1$1$1(mutableInteractionSource2, snapshotStateList, (Continuation) null);
                q2.N(g5);
            }
            int i5 = i3 >> 9;
            EffectsKt.g(mutableInteractionSource2, (Function2) g5, q2, i5 & 14);
            float f6 = !snapshotStateList.isEmpty() ? f8342d : f8341c;
            Modifier b4 = HoverableKt.b(IndicationKt.b(SizeKt.v(modifier2, f4, f4), mutableInteractionSource2, RippleKt.f(false, f8340b, 0, 4, (Object) null)), mutableInteractionSource2, false, 2, (Object) null);
            if (!z3) {
                f6 = Dp.m((float) 0);
            }
            SpacerKt.a(BackgroundKt.a(ShadowKt.b(b4, f6, RoundedCornerShapeKt.f(), false, 0, 0, 24, (Object) null), ((Color) sliderColors2.b(z3, q2, (i5 & 112) | ((i3 >> 15) & 14)).getValue()).v(), RoundedCornerShapeKt.f()), q2, 0);
            q2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new SliderKt$SliderThumb$2(boxScope, modifier, f2, mutableInteractionSource, sliderColors, z2, f3, i2));
        }
    }

    public static final void g(Modifier modifier, SliderColors sliderColors, boolean z2, float f2, float f3, List list, float f4, float f5, Composer composer, int i2) {
        int i3;
        Composer composer2;
        int i4;
        Modifier modifier2 = modifier;
        SliderColors sliderColors2 = sliderColors;
        boolean z3 = z2;
        List list2 = list;
        int i5 = i2;
        Composer q2 = composer.q(1833126050);
        if ((i5 & 6) == 0) {
            i3 = (q2.W(modifier2) ? 4 : 2) | i5;
        } else {
            i3 = i5;
        }
        if ((i5 & 48) == 0) {
            i3 |= q2.W(sliderColors2) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i3 |= q2.d(z3) ? 256 : 128;
        }
        float f6 = f2;
        if ((i5 & 3072) == 0) {
            i3 |= q2.h(f6) ? 2048 : 1024;
        }
        float f7 = f3;
        if ((i5 & 24576) == 0) {
            i3 |= q2.h(f7) ? 16384 : 8192;
        }
        if ((196608 & i5) == 0) {
            i3 |= q2.l(list2) ? 131072 : 65536;
        }
        float f8 = f4;
        if ((1572864 & i5) == 0) {
            i3 |= q2.h(f8) ? 1048576 : 524288;
        }
        if ((12582912 & i5) == 0) {
            i3 |= q2.h(f5) ? 8388608 : 4194304;
        } else {
            float f9 = f5;
        }
        if (q2.E((i3 & 4793491) != 4793490, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1833126050, i3, -1, "androidx.compose.material.Track (Slider.kt:835)");
            }
            int i6 = ((i3 >> 6) & 14) | 48 | ((i3 << 3) & 896);
            State a2 = sliderColors2.a(z3, false, q2, i6);
            State a3 = sliderColors2.a(z3, true, q2, i6);
            State c2 = sliderColors2.c(z3, false, q2, i6);
            State c3 = sliderColors2.c(z3, true, q2, i6);
            boolean W = ((29360128 & i3) == 8388608) | ((i3 & 3670016) == 1048576) | q2.W(a2) | ((57344 & i3) == 16384) | ((i3 & 7168) == 2048) | q2.W(a3) | q2.l(list2) | q2.W(c2) | q2.W(c3);
            Object g2 = q2.g();
            if (W || g2 == Composer.f14567a.a()) {
                i4 = i3;
                composer2 = q2;
                SliderKt$Track$1$1 sliderKt$Track$1$1 = new SliderKt$Track$1$1(f4, a2, f5, f3, f2, a3, list, c2, c3);
                composer2.N(sliderKt$Track$1$1);
                g2 = sliderKt$Track$1$1;
            } else {
                i4 = i3;
                composer2 = q2;
            }
            CanvasKt.b(modifier2, (Function1) g2, composer2, i4 & 14);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            composer2 = q2;
            composer2.B();
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new SliderKt$Track$2(modifier, sliderColors, z2, f2, f3, list, f4, f5, i2));
        }
    }

    public static final Object w(DraggableState draggableState, float f2, float f3, float f4, Continuation continuation) {
        Object c2 = DraggableState.c(draggableState, (MutatePriority) null, new SliderKt$animateToTarget$2(f2, f3, f4, (Continuation) null), continuation, 1, (Object) null);
        return c2 == IntrinsicsKt.f() ? c2 : Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0064 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object x(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, long r9, int r11, kotlin.coroutines.Continuation r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.material.SliderKt$awaitSlop$1
            if (r0 == 0) goto L_0x0014
            r0 = r12
            androidx.compose.material.SliderKt$awaitSlop$1 r0 = (androidx.compose.material.SliderKt$awaitSlop$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.E = r1
        L_0x0012:
            r6 = r0
            goto L_0x001a
        L_0x0014:
            androidx.compose.material.SliderKt$awaitSlop$1 r0 = new androidx.compose.material.SliderKt$awaitSlop$1
            r0.<init>(r12)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r12 = r6.D
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r6.E
            r2 = 1
            if (r1 == 0) goto L_0x0037
            if (r1 != r2) goto L_0x002f
            java.lang.Object r8 = r6.C
            kotlin.jvm.internal.Ref$FloatRef r8 = (kotlin.jvm.internal.Ref.FloatRef) r8
            kotlin.ResultKt.b(r12)
            goto L_0x0055
        L_0x002f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0037:
            kotlin.ResultKt.b(r12)
            kotlin.jvm.internal.Ref$FloatRef r12 = new kotlin.jvm.internal.Ref$FloatRef
            r12.<init>()
            androidx.compose.material.SliderKt$awaitSlop$postPointerSlop$1 r5 = new androidx.compose.material.SliderKt$awaitSlop$postPointerSlop$1
            r5.<init>(r12)
            r6.C = r12
            r6.E = r2
            r1 = r8
            r2 = r9
            r4 = r11
            java.lang.Object r8 = androidx.compose.material.DragGestureDetectorCopyKt.a(r1, r2, r4, r5, r6)
            if (r8 != r0) goto L_0x0052
            return r0
        L_0x0052:
            r7 = r12
            r12 = r8
            r8 = r7
        L_0x0055:
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12
            if (r12 == 0) goto L_0x0064
            float r8 = r8.f40905z
            java.lang.Float r8 = kotlin.coroutines.jvm.internal.Boxing.b(r8)
            kotlin.Pair r8 = kotlin.TuplesKt.a(r12, r8)
            goto L_0x0065
        L_0x0064:
            r8 = 0
        L_0x0065:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.x(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final float y(float f2, float f3, float f4) {
        float f5 = f3 - f2;
        float f6 = 0.0f;
        float f7 = f5 == 0.0f ? 0.0f : (f4 - f2) / f5;
        if (f7 >= 0.0f) {
            f6 = f7;
        }
        if (f6 > 1.0f) {
            return 1.0f;
        }
        return f6;
    }

    public static final float z() {
        return f8339a;
    }
}
