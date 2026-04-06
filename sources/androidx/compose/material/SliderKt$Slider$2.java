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
public final class SliderKt$Slider$2 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f8381A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ List f8382B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ MutableInteractionSource D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ SliderColors F;
    public final /* synthetic */ State G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ClosedFloatingPointRange f8383z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$Slider$2(ClosedFloatingPointRange closedFloatingPointRange, float f2, List list, Function0 function0, MutableInteractionSource mutableInteractionSource, boolean z2, SliderColors sliderColors, State state) {
        super(3);
        this.f8383z = closedFloatingPointRange;
        this.f8381A = f2;
        this.f8382B = list;
        this.C = function0;
        this.D = mutableInteractionSource;
        this.E = z2;
        this.F = sliderColors;
        this.G = state;
    }

    /* access modifiers changed from: private */
    public static final float f(ClosedFloatingPointRange closedFloatingPointRange, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, float f2) {
        return SliderKt.B(((Number) closedFloatingPointRange.e()).floatValue(), ((Number) closedFloatingPointRange.m()).floatValue(), f2, floatRef.f40905z, floatRef2.f40905z);
    }

    public static final float g(Ref.FloatRef floatRef, Ref.FloatRef floatRef2, ClosedFloatingPointRange closedFloatingPointRange, float f2) {
        return SliderKt.B(floatRef.f40905z, floatRef2.f40905z, f2, ((Number) closedFloatingPointRange.e()).floatValue(), ((Number) closedFloatingPointRange.m()).floatValue());
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        e((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: kotlin.jvm.functions.Function3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: androidx.compose.material.SliderKt$Slider$2$gestureEndAction$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v2, resolved type: androidx.compose.material.SliderKt$Slider$2$gestureEndAction$1$1} */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0188, code lost:
        if (r4 == r28.a()) goto L_0x018a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(androidx.compose.foundation.layout.BoxWithConstraintsScope r30, androidx.compose.runtime.Composer r31, int r32) {
        /*
            r29 = this;
            r0 = r29
            r8 = r31
            r1 = r32 & 6
            if (r1 != 0) goto L_0x0016
            r1 = r30
            boolean r2 = r8.W(r1)
            if (r2 == 0) goto L_0x0012
            r2 = 4
            goto L_0x0013
        L_0x0012:
            r2 = 2
        L_0x0013:
            r2 = r32 | r2
            goto L_0x001a
        L_0x0016:
            r1 = r30
            r2 = r32
        L_0x001a:
            r3 = r2 & 19
            r4 = 18
            r9 = 0
            r5 = 1
            if (r3 == r4) goto L_0x0024
            r3 = r5
            goto L_0x0025
        L_0x0024:
            r3 = r9
        L_0x0025:
            r4 = r2 & 1
            boolean r3 = r8.E(r3, r4)
            if (r3 == 0) goto L_0x0259
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x003c
            r3 = -1
            java.lang.String r4 = "androidx.compose.material.Slider.<anonymous> (Slider.kt:196)"
            r6 = 2085116814(0x7c485b8e, float:4.1612653E36)
            androidx.compose.runtime.ComposerKt.Y(r6, r2, r3, r4)
        L_0x003c:
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.ui.platform.CompositionLocalsKt.m()
            java.lang.Object r2 = r8.C(r2)
            androidx.compose.ui.unit.LayoutDirection r3 = androidx.compose.ui.unit.LayoutDirection.Rtl
            if (r2 != r3) goto L_0x004b
            r19 = r5
            goto L_0x004d
        L_0x004b:
            r19 = r9
        L_0x004d:
            long r1 = r30.d()
            int r1 = androidx.compose.ui.unit.Constraints.l(r1)
            float r13 = (float) r1
            kotlin.jvm.internal.Ref$FloatRef r15 = new kotlin.jvm.internal.Ref$FloatRef
            r15.<init>()
            kotlin.jvm.internal.Ref$FloatRef r14 = new kotlin.jvm.internal.Ref$FloatRef
            r14.<init>()
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r1 = r8.C(r1)
            androidx.compose.ui.unit.Density r1 = (androidx.compose.ui.unit.Density) r1
            float r2 = androidx.compose.material.SliderKt.z()
            float r2 = r1.B1(r2)
            float r2 = r13 - r2
            r3 = 0
            float r2 = java.lang.Math.max(r2, r3)
            r15.f40905z = r2
            float r2 = androidx.compose.material.SliderKt.z()
            float r1 = r1.B1(r2)
            float r2 = r15.f40905z
            float r1 = java.lang.Math.min(r1, r2)
            r14.f40905z = r1
            java.lang.Object r1 = r31.g()
            androidx.compose.runtime.Composer$Companion r28 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r28.a()
            if (r1 != r2) goto L_0x00a0
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.f40721z
            kotlinx.coroutines.CoroutineScope r1 = androidx.compose.runtime.EffectsKt.j(r1, r8)
            r8.N(r1)
        L_0x00a0:
            r10 = r1
            kotlinx.coroutines.CoroutineScope r10 = (kotlinx.coroutines.CoroutineScope) r10
            float r1 = r0.f8381A
            kotlin.ranges.ClosedFloatingPointRange r2 = r0.f8383z
            java.lang.Object r4 = r31.g()
            java.lang.Object r5 = r28.a()
            if (r4 != r5) goto L_0x00bc
            float r1 = f(r2, r14, r15, r1)
            androidx.compose.runtime.MutableFloatState r4 = androidx.compose.runtime.PrimitiveSnapshotStateKt.a(r1)
            r8.N(r4)
        L_0x00bc:
            r16 = r4
            androidx.compose.runtime.MutableFloatState r16 = (androidx.compose.runtime.MutableFloatState) r16
            java.lang.Object r1 = r31.g()
            java.lang.Object r2 = r28.a()
            if (r1 != r2) goto L_0x00d1
            androidx.compose.runtime.MutableFloatState r1 = androidx.compose.runtime.PrimitiveSnapshotStateKt.a(r3)
            r8.N(r1)
        L_0x00d1:
            r17 = r1
            androidx.compose.runtime.MutableFloatState r17 = (androidx.compose.runtime.MutableFloatState) r17
            float r1 = r14.f40905z
            boolean r1 = r8.h(r1)
            float r2 = r15.f40905z
            boolean r2 = r8.h(r2)
            r1 = r1 | r2
            kotlin.ranges.ClosedFloatingPointRange r2 = r0.f8383z
            boolean r2 = r8.W(r2)
            r1 = r1 | r2
            androidx.compose.runtime.State r6 = r0.G
            kotlin.ranges.ClosedFloatingPointRange r7 = r0.f8383z
            java.lang.Object r2 = r31.g()
            if (r1 != 0) goto L_0x00f9
            java.lang.Object r1 = r28.a()
            if (r2 != r1) goto L_0x010e
        L_0x00f9:
            androidx.compose.material.SliderDraggableState r11 = new androidx.compose.material.SliderDraggableState
            androidx.compose.material.SliderKt$Slider$2$draggableState$1$1 r12 = new androidx.compose.material.SliderKt$Slider$2$draggableState$1$1
            r1 = r12
            r2 = r16
            r3 = r17
            r4 = r14
            r5 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r11.<init>(r12)
            r8.N(r11)
            r2 = r11
        L_0x010e:
            r12 = r2
            androidx.compose.material.SliderDraggableState r12 = (androidx.compose.material.SliderDraggableState) r12
            kotlin.ranges.ClosedFloatingPointRange r1 = r0.f8383z
            boolean r1 = r8.W(r1)
            float r2 = r14.f40905z
            boolean r2 = r8.h(r2)
            r1 = r1 | r2
            float r2 = r15.f40905z
            boolean r2 = r8.h(r2)
            r1 = r1 | r2
            kotlin.ranges.ClosedFloatingPointRange r2 = r0.f8383z
            java.lang.Object r3 = r31.g()
            if (r1 != 0) goto L_0x0133
            java.lang.Object r1 = r28.a()
            if (r3 != r1) goto L_0x013b
        L_0x0133:
            androidx.compose.material.SliderKt$Slider$2$2$1 r3 = new androidx.compose.material.SliderKt$Slider$2$2$1
            r3.<init>(r2, r14, r15)
            r8.N(r3)
        L_0x013b:
            kotlin.reflect.KFunction r3 = (kotlin.reflect.KFunction) r3
            r1 = r3
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            kotlin.ranges.ClosedFloatingPointRange r2 = r0.f8383z
            float r3 = r14.f40905z
            float r4 = r15.f40905z
            kotlin.ranges.ClosedFloatingPointRange r3 = kotlin.ranges.RangesKt.b(r3, r4)
            float r5 = r0.f8381A
            r7 = 3072(0xc00, float:4.305E-42)
            r4 = r16
            r6 = r31
            androidx.compose.material.SliderKt.a(r1, r2, r3, r4, r5, r6, r7)
            java.util.List r1 = r0.f8382B
            boolean r1 = r8.l(r1)
            float r2 = r14.f40905z
            boolean r2 = r8.h(r2)
            r1 = r1 | r2
            float r2 = r15.f40905z
            boolean r2 = r8.h(r2)
            r1 = r1 | r2
            boolean r2 = r8.l(r10)
            r1 = r1 | r2
            boolean r2 = r8.l(r12)
            r1 = r1 | r2
            kotlin.jvm.functions.Function0 r2 = r0.C
            boolean r2 = r8.W(r2)
            r1 = r1 | r2
            java.util.List r2 = r0.f8382B
            kotlin.jvm.functions.Function0 r3 = r0.C
            java.lang.Object r4 = r31.g()
            if (r1 != 0) goto L_0x018a
            java.lang.Object r1 = r28.a()
            if (r4 != r1) goto L_0x01a2
        L_0x018a:
            androidx.compose.material.SliderKt$Slider$2$gestureEndAction$1$1 r4 = new androidx.compose.material.SliderKt$Slider$2$gestureEndAction$1$1
            r20 = r4
            r21 = r16
            r22 = r2
            r23 = r14
            r24 = r15
            r25 = r10
            r26 = r12
            r27 = r3
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            r8.N(r4)
        L_0x01a2:
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            androidx.compose.runtime.State r1 = androidx.compose.runtime.SnapshotStateKt.p(r4, r8, r9)
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.foundation.interaction.MutableInteractionSource r3 = r0.D
            boolean r4 = r0.E
            r10 = r2
            r11 = r12
            r5 = r12
            r12 = r3
            r3 = r14
            r14 = r19
            r6 = r15
            r15 = r16
            r16 = r1
            r18 = r4
            androidx.compose.ui.Modifier r4 = androidx.compose.material.SliderKt.F(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            androidx.compose.foundation.gestures.Orientation r12 = androidx.compose.foundation.gestures.Orientation.Horizontal
            boolean r15 = r5.h()
            boolean r13 = r0.E
            androidx.compose.foundation.interaction.MutableInteractionSource r14 = r0.D
            boolean r7 = r8.W(r1)
            java.lang.Object r9 = r31.g()
            if (r7 != 0) goto L_0x01da
            java.lang.Object r7 = r28.a()
            if (r9 != r7) goto L_0x01e3
        L_0x01da:
            androidx.compose.material.SliderKt$Slider$2$drag$1$1 r9 = new androidx.compose.material.SliderKt$Slider$2$drag$1$1
            r7 = 0
            r9.<init>(r1, r7)
            r8.N(r9)
        L_0x01e3:
            r17 = r9
            kotlin.jvm.functions.Function3 r17 = (kotlin.jvm.functions.Function3) r17
            r1 = 32
            r20 = 0
            r16 = 0
            r10 = r2
            r11 = r5
            r18 = r19
            r19 = r1
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.gestures.DraggableKt.h(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            float r2 = r0.f8381A
            kotlin.ranges.ClosedFloatingPointRange r5 = r0.f8383z
            java.lang.Comparable r5 = r5.e()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            kotlin.ranges.ClosedFloatingPointRange r7 = r0.f8383z
            java.lang.Comparable r7 = r7.m()
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            float r2 = kotlin.ranges.RangesKt.n(r2, r5, r7)
            kotlin.ranges.ClosedFloatingPointRange r5 = r0.f8383z
            java.lang.Comparable r5 = r5.e()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            kotlin.ranges.ClosedFloatingPointRange r7 = r0.f8383z
            java.lang.Comparable r7 = r7.m()
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            float r2 = androidx.compose.material.SliderKt.y(r5, r7, r2)
            boolean r5 = r0.E
            java.util.List r7 = r0.f8382B
            androidx.compose.material.SliderColors r9 = r0.F
            float r6 = r6.f40905z
            float r3 = r3.f40905z
            float r6 = r6 - r3
            androidx.compose.foundation.interaction.MutableInteractionSource r10 = r0.D
            androidx.compose.ui.Modifier r11 = r4.o0(r1)
            r12 = 0
            r1 = r5
            r3 = r7
            r4 = r9
            r5 = r6
            r6 = r10
            r7 = r11
            r8 = r31
            r9 = r12
            androidx.compose.material.SliderKt.e(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x025c
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x025c
        L_0x0259:
            r31.B()
        L_0x025c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt$Slider$2.e(androidx.compose.foundation.layout.BoxWithConstraintsScope, androidx.compose.runtime.Composer, int):void");
    }
}
