package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.ClosedFloatingPointRange;

@Metadata
public final class SliderKt$RangeSlider$2 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ClosedFloatingPointRange f8357A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ List f8358B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ State D;
    public final /* synthetic */ MutableInteractionSource E;
    public final /* synthetic */ MutableInteractionSource F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ int H;
    public final /* synthetic */ SliderColors I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ClosedFloatingPointRange f8359z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSlider$2(ClosedFloatingPointRange closedFloatingPointRange, ClosedFloatingPointRange closedFloatingPointRange2, List list, Function0 function0, State state, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, boolean z2, int i2, SliderColors sliderColors) {
        super(3);
        this.f8359z = closedFloatingPointRange;
        this.f8357A = closedFloatingPointRange2;
        this.f8358B = list;
        this.C = function0;
        this.D = state;
        this.E = mutableInteractionSource;
        this.F = mutableInteractionSource2;
        this.G = z2;
        this.H = i2;
        this.I = sliderColors;
    }

    public static final float f(ClosedFloatingPointRange closedFloatingPointRange, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, float f2) {
        return SliderKt.B(((Number) closedFloatingPointRange.e()).floatValue(), ((Number) closedFloatingPointRange.m()).floatValue(), f2, floatRef.f40905z, floatRef2.f40905z);
    }

    public static final ClosedFloatingPointRange g(Ref.FloatRef floatRef, Ref.FloatRef floatRef2, ClosedFloatingPointRange closedFloatingPointRange, ClosedFloatingPointRange closedFloatingPointRange2) {
        return SliderKt.C(floatRef.f40905z, floatRef2.f40905z, closedFloatingPointRange2, ((Number) closedFloatingPointRange.e()).floatValue(), ((Number) closedFloatingPointRange.m()).floatValue());
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        e((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: androidx.compose.material.SliderKt$RangeSlider$2$onDrag$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v3, resolved type: androidx.compose.material.SliderKt$RangeSlider$2$onDrag$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v4, resolved type: androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1} */
    /* JADX WARNING: type inference failed for: r7v3 */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01c1, code lost:
        if (r7 == r30.a()) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0217, code lost:
        if (r6 == r30.a()) goto L_0x0219;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(androidx.compose.foundation.layout.BoxWithConstraintsScope r32, androidx.compose.runtime.Composer r33, int r34) {
        /*
            r31 = this;
            r0 = r31
            r12 = r33
            r1 = r34 & 6
            if (r1 != 0) goto L_0x0016
            r1 = r32
            boolean r2 = r12.W(r1)
            if (r2 == 0) goto L_0x0012
            r2 = 4
            goto L_0x0013
        L_0x0012:
            r2 = 2
        L_0x0013:
            r2 = r34 | r2
            goto L_0x001a
        L_0x0016:
            r1 = r32
            r2 = r34
        L_0x001a:
            r3 = r2 & 19
            r4 = 18
            r5 = 1
            r8 = 0
            if (r3 == r4) goto L_0x0024
            r3 = r5
            goto L_0x0025
        L_0x0024:
            r3 = r8
        L_0x0025:
            r4 = r2 & 1
            boolean r3 = r12.E(r3, r4)
            if (r3 == 0) goto L_0x039e
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x003c
            r3 = -1
            java.lang.String r4 = "androidx.compose.material.RangeSlider.<anonymous> (Slider.kt:420)"
            r6 = 652589923(0x26e5bb63, float:1.5940858E-15)
            androidx.compose.runtime.ComposerKt.Y(r6, r2, r3, r4)
        L_0x003c:
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.ui.platform.CompositionLocalsKt.m()
            java.lang.Object r2 = r12.C(r2)
            androidx.compose.ui.unit.LayoutDirection r3 = androidx.compose.ui.unit.LayoutDirection.Rtl
            if (r2 != r3) goto L_0x004b
            r19 = r5
            goto L_0x004d
        L_0x004b:
            r19 = r8
        L_0x004d:
            long r1 = r32.d()
            int r1 = androidx.compose.ui.unit.Constraints.l(r1)
            float r9 = (float) r1
            kotlin.jvm.internal.Ref$FloatRef r10 = new kotlin.jvm.internal.Ref$FloatRef
            r10.<init>()
            kotlin.jvm.internal.Ref$FloatRef r11 = new kotlin.jvm.internal.Ref$FloatRef
            r11.<init>()
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r1 = r12.C(r1)
            androidx.compose.ui.unit.Density r1 = (androidx.compose.ui.unit.Density) r1
            float r2 = androidx.compose.material.SliderKt.z()
            float r2 = r1.B1(r2)
            float r2 = r9 - r2
            r10.f40905z = r2
            float r2 = androidx.compose.material.SliderKt.z()
            float r1 = r1.B1(r2)
            r11.f40905z = r1
            kotlin.ranges.ClosedFloatingPointRange r1 = r0.f8357A
            kotlin.ranges.ClosedFloatingPointRange r2 = r0.f8359z
            java.lang.Object r3 = r33.g()
            androidx.compose.runtime.Composer$Companion r30 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r30.a()
            if (r3 != r4) goto L_0x00a5
            java.lang.Comparable r1 = r1.e()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r1 = f(r2, r11, r10, r1)
            androidx.compose.runtime.MutableFloatState r3 = androidx.compose.runtime.PrimitiveSnapshotStateKt.a(r1)
            r12.N(r3)
        L_0x00a5:
            r16 = r3
            androidx.compose.runtime.MutableFloatState r16 = (androidx.compose.runtime.MutableFloatState) r16
            kotlin.ranges.ClosedFloatingPointRange r1 = r0.f8357A
            kotlin.ranges.ClosedFloatingPointRange r2 = r0.f8359z
            java.lang.Object r3 = r33.g()
            java.lang.Object r4 = r30.a()
            if (r3 != r4) goto L_0x00cc
            java.lang.Comparable r1 = r1.m()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r1 = f(r2, r11, r10, r1)
            androidx.compose.runtime.MutableFloatState r3 = androidx.compose.runtime.PrimitiveSnapshotStateKt.a(r1)
            r12.N(r3)
        L_0x00cc:
            r17 = r3
            androidx.compose.runtime.MutableFloatState r17 = (androidx.compose.runtime.MutableFloatState) r17
            kotlin.ranges.ClosedFloatingPointRange r1 = r0.f8359z
            boolean r1 = r12.W(r1)
            float r2 = r11.f40905z
            boolean r2 = r12.h(r2)
            r1 = r1 | r2
            float r2 = r10.f40905z
            boolean r2 = r12.h(r2)
            r1 = r1 | r2
            kotlin.ranges.ClosedFloatingPointRange r2 = r0.f8359z
            java.lang.Object r3 = r33.g()
            if (r1 != 0) goto L_0x00f2
            java.lang.Object r1 = r30.a()
            if (r3 != r1) goto L_0x00fa
        L_0x00f2:
            androidx.compose.material.SliderKt$RangeSlider$2$2$1 r3 = new androidx.compose.material.SliderKt$RangeSlider$2$2$1
            r3.<init>(r2, r11, r10)
            r12.N(r3)
        L_0x00fa:
            kotlin.reflect.KFunction r3 = (kotlin.reflect.KFunction) r3
            r1 = r3
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            kotlin.ranges.ClosedFloatingPointRange r2 = r0.f8359z
            float r3 = r11.f40905z
            float r4 = r10.f40905z
            kotlin.ranges.ClosedFloatingPointRange r3 = kotlin.ranges.RangesKt.b(r3, r4)
            kotlin.ranges.ClosedFloatingPointRange r4 = r0.f8357A
            java.lang.Comparable r4 = r4.e()
            java.lang.Number r4 = (java.lang.Number) r4
            float r5 = r4.floatValue()
            r7 = 3072(0xc00, float:4.305E-42)
            r4 = r16
            r6 = r33
            androidx.compose.material.SliderKt.a(r1, r2, r3, r4, r5, r6, r7)
            kotlin.ranges.ClosedFloatingPointRange r1 = r0.f8359z
            boolean r1 = r12.W(r1)
            float r2 = r11.f40905z
            boolean r2 = r12.h(r2)
            r1 = r1 | r2
            float r2 = r10.f40905z
            boolean r2 = r12.h(r2)
            r1 = r1 | r2
            kotlin.ranges.ClosedFloatingPointRange r2 = r0.f8359z
            java.lang.Object r3 = r33.g()
            if (r1 != 0) goto L_0x0140
            java.lang.Object r1 = r30.a()
            if (r3 != r1) goto L_0x0148
        L_0x0140:
            androidx.compose.material.SliderKt$RangeSlider$2$3$1 r3 = new androidx.compose.material.SliderKt$RangeSlider$2$3$1
            r3.<init>(r2, r11, r10)
            r12.N(r3)
        L_0x0148:
            kotlin.reflect.KFunction r3 = (kotlin.reflect.KFunction) r3
            r1 = r3
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            kotlin.ranges.ClosedFloatingPointRange r2 = r0.f8359z
            float r3 = r11.f40905z
            float r4 = r10.f40905z
            kotlin.ranges.ClosedFloatingPointRange r3 = kotlin.ranges.RangesKt.b(r3, r4)
            kotlin.ranges.ClosedFloatingPointRange r4 = r0.f8357A
            java.lang.Comparable r4 = r4.m()
            java.lang.Number r4 = (java.lang.Number) r4
            float r5 = r4.floatValue()
            r7 = 3072(0xc00, float:4.305E-42)
            r4 = r17
            r6 = r33
            androidx.compose.material.SliderKt.a(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r1 = r33.g()
            java.lang.Object r2 = r30.a()
            if (r1 != r2) goto L_0x017f
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.f40721z
            kotlinx.coroutines.CoroutineScope r1 = androidx.compose.runtime.EffectsKt.j(r1, r12)
            r12.N(r1)
        L_0x017f:
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            java.util.List r2 = r0.f8358B
            boolean r2 = r12.l(r2)
            float r3 = r11.f40905z
            boolean r3 = r12.h(r3)
            r2 = r2 | r3
            float r3 = r10.f40905z
            boolean r3 = r12.h(r3)
            r2 = r2 | r3
            kotlin.jvm.functions.Function0 r3 = r0.C
            boolean r3 = r12.W(r3)
            r2 = r2 | r3
            boolean r3 = r12.l(r1)
            r2 = r2 | r3
            androidx.compose.runtime.State r3 = r0.D
            boolean r3 = r12.W(r3)
            r2 = r2 | r3
            kotlin.ranges.ClosedFloatingPointRange r3 = r0.f8359z
            boolean r3 = r12.W(r3)
            r2 = r2 | r3
            java.util.List r3 = r0.f8358B
            kotlin.jvm.functions.Function0 r4 = r0.C
            androidx.compose.runtime.State r5 = r0.D
            kotlin.ranges.ClosedFloatingPointRange r6 = r0.f8359z
            java.lang.Object r7 = r33.g()
            if (r2 != 0) goto L_0x01c3
            java.lang.Object r2 = r30.a()
            if (r7 != r2) goto L_0x01df
        L_0x01c3:
            androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1 r7 = new androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1
            r20 = r7
            r21 = r16
            r22 = r17
            r23 = r3
            r24 = r11
            r25 = r10
            r26 = r4
            r27 = r1
            r28 = r5
            r29 = r6
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r12.N(r7)
        L_0x01df:
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            androidx.compose.runtime.State r1 = androidx.compose.runtime.SnapshotStateKt.p(r7, r12, r8)
            kotlin.ranges.ClosedFloatingPointRange r2 = r0.f8359z
            boolean r2 = r12.W(r2)
            float r3 = r11.f40905z
            boolean r3 = r12.h(r3)
            r2 = r2 | r3
            float r3 = r10.f40905z
            boolean r3 = r12.h(r3)
            r2 = r2 | r3
            kotlin.ranges.ClosedFloatingPointRange r3 = r0.f8357A
            boolean r3 = r12.W(r3)
            r2 = r2 | r3
            androidx.compose.runtime.State r3 = r0.D
            boolean r3 = r12.W(r3)
            r2 = r2 | r3
            kotlin.ranges.ClosedFloatingPointRange r3 = r0.f8357A
            androidx.compose.runtime.State r4 = r0.D
            kotlin.ranges.ClosedFloatingPointRange r5 = r0.f8359z
            java.lang.Object r6 = r33.g()
            if (r2 != 0) goto L_0x0219
            java.lang.Object r2 = r30.a()
            if (r6 != r2) goto L_0x0231
        L_0x0219:
            androidx.compose.material.SliderKt$RangeSlider$2$onDrag$1$1 r6 = new androidx.compose.material.SliderKt$RangeSlider$2$onDrag$1$1
            r20 = r6
            r21 = r16
            r22 = r17
            r23 = r3
            r24 = r11
            r25 = r10
            r26 = r4
            r27 = r5
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            r12.N(r6)
        L_0x0231:
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            androidx.compose.runtime.State r23 = androidx.compose.runtime.SnapshotStateKt.p(r6, r12, r8)
            androidx.compose.ui.Modifier$Companion r24 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.foundation.interaction.MutableInteractionSource r14 = r0.E
            androidx.compose.foundation.interaction.MutableInteractionSource r15 = r0.F
            boolean r2 = r0.G
            kotlin.ranges.ClosedFloatingPointRange r3 = r0.f8359z
            r13 = r24
            r18 = r2
            r20 = r9
            r21 = r3
            r22 = r1
            androidx.compose.ui.Modifier r9 = androidx.compose.material.SliderKt.A(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            kotlin.ranges.ClosedFloatingPointRange r1 = r0.f8357A
            java.lang.Comparable r1 = r1.e()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            kotlin.ranges.ClosedFloatingPointRange r2 = r0.f8359z
            java.lang.Comparable r2 = r2.e()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            kotlin.ranges.ClosedFloatingPointRange r3 = r0.f8357A
            java.lang.Comparable r3 = r3.m()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            float r1 = kotlin.ranges.RangesKt.n(r1, r2, r3)
            kotlin.ranges.ClosedFloatingPointRange r2 = r0.f8357A
            java.lang.Comparable r2 = r2.m()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            kotlin.ranges.ClosedFloatingPointRange r3 = r0.f8357A
            java.lang.Comparable r3 = r3.e()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            kotlin.ranges.ClosedFloatingPointRange r4 = r0.f8359z
            java.lang.Comparable r4 = r4.m()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            float r13 = kotlin.ranges.RangesKt.n(r2, r3, r4)
            kotlin.ranges.ClosedFloatingPointRange r2 = r0.f8359z
            java.lang.Comparable r2 = r2.e()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            kotlin.ranges.ClosedFloatingPointRange r3 = r0.f8359z
            java.lang.Comparable r3 = r3.m()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            float r14 = androidx.compose.material.SliderKt.y(r2, r3, r1)
            kotlin.ranges.ClosedFloatingPointRange r2 = r0.f8359z
            java.lang.Comparable r2 = r2.e()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            kotlin.ranges.ClosedFloatingPointRange r3 = r0.f8359z
            java.lang.Comparable r3 = r3.m()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            float r15 = androidx.compose.material.SliderKt.y(r2, r3, r13)
            int r2 = r0.H
            float r2 = (float) r2
            float r2 = r2 * r15
            double r2 = (double) r2
            double r2 = java.lang.Math.floor(r2)
            float r2 = (float) r2
            int r8 = (int) r2
            int r2 = r0.H
            float r2 = (float) r2
            r3 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 - r14
            float r2 = r2 * r3
            double r2 = (double) r2
            double r2 = java.lang.Math.floor(r2)
            float r2 = (float) r2
            int r7 = (int) r2
            boolean r4 = r0.G
            androidx.compose.runtime.State r2 = r0.D
            boolean r2 = r12.W(r2)
            boolean r3 = r12.h(r13)
            r2 = r2 | r3
            androidx.compose.runtime.State r3 = r0.D
            java.lang.Object r5 = r33.g()
            if (r2 != 0) goto L_0x030b
            java.lang.Object r2 = r30.a()
            if (r5 != r2) goto L_0x0313
        L_0x030b:
            androidx.compose.material.SliderKt$RangeSlider$2$startThumbSemantics$1$1 r5 = new androidx.compose.material.SliderKt$RangeSlider$2$startThumbSemantics$1$1
            r5.<init>(r3, r13)
            r12.N(r5)
        L_0x0313:
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            kotlin.jvm.functions.Function0 r6 = r0.C
            kotlin.ranges.ClosedFloatingPointRange r2 = r0.f8359z
            java.lang.Comparable r2 = r2.e()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            kotlin.ranges.ClosedFloatingPointRange r16 = kotlin.ranges.RangesKt.b(r2, r13)
            r2 = r24
            r3 = r1
            r17 = r7
            r7 = r16
            androidx.compose.ui.Modifier r16 = androidx.compose.material.SliderKt.E(r2, r3, r4, r5, r6, r7, r8)
            boolean r4 = r0.G
            androidx.compose.runtime.State r2 = r0.D
            boolean r2 = r12.W(r2)
            boolean r3 = r12.h(r1)
            r2 = r2 | r3
            androidx.compose.runtime.State r3 = r0.D
            java.lang.Object r5 = r33.g()
            if (r2 != 0) goto L_0x034d
            java.lang.Object r2 = r30.a()
            if (r5 != r2) goto L_0x0355
        L_0x034d:
            androidx.compose.material.SliderKt$RangeSlider$2$endThumbSemantics$1$1 r5 = new androidx.compose.material.SliderKt$RangeSlider$2$endThumbSemantics$1$1
            r5.<init>(r3, r1)
            r12.N(r5)
        L_0x0355:
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            kotlin.jvm.functions.Function0 r6 = r0.C
            kotlin.ranges.ClosedFloatingPointRange r2 = r0.f8359z
            java.lang.Comparable r2 = r2.m()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            kotlin.ranges.ClosedFloatingPointRange r7 = kotlin.ranges.RangesKt.b(r1, r2)
            r2 = r24
            r3 = r13
            r8 = r17
            androidx.compose.ui.Modifier r13 = androidx.compose.material.SliderKt.E(r2, r3, r4, r5, r6, r7, r8)
            boolean r1 = r0.G
            java.util.List r4 = r0.f8358B
            androidx.compose.material.SliderColors r5 = r0.I
            float r2 = r10.f40905z
            float r3 = r11.f40905z
            float r6 = r2 - r3
            androidx.compose.foundation.interaction.MutableInteractionSource r7 = r0.E
            androidx.compose.foundation.interaction.MutableInteractionSource r8 = r0.F
            r17 = 14155776(0xd80000, float:1.9836467E-38)
            r18 = 0
            r2 = r14
            r3 = r15
            r10 = r16
            r11 = r13
            r12 = r33
            r13 = r17
            r14 = r18
            androidx.compose.material.SliderKt.c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x03a1
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x03a1
        L_0x039e:
            r33.B()
        L_0x03a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt$RangeSlider$2.e(androidx.compose.foundation.layout.BoxWithConstraintsScope, androidx.compose.runtime.Composer, int):void");
    }
}
