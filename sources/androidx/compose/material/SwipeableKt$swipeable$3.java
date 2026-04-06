package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SwipeableKt$swipeable$3 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SwipeableState f8574A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ ResistanceConfig f8575B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ float D;
    public final /* synthetic */ Orientation E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ MutableInteractionSource G;
    public final /* synthetic */ boolean H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Map f8576z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeableKt$swipeable$3(Map map, SwipeableState swipeableState, ResistanceConfig resistanceConfig, Function2 function2, float f2, Orientation orientation, boolean z2, MutableInteractionSource mutableInteractionSource, boolean z3) {
        super(3);
        this.f8576z = map;
        this.f8574A = swipeableState;
        this.f8575B = resistanceConfig;
        this.C = function2;
        this.D = f2;
        this.E = orientation;
        this.F = z2;
        this.G = mutableInteractionSource;
        this.H = z3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: kotlin.jvm.functions.Function3} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.ui.Modifier b(androidx.compose.ui.Modifier r24, androidx.compose.runtime.Composer r25, int r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            r2 = 43594985(0x29934e9, float:2.2511698E-37)
            r1.X(r2)
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x0018
            r3 = -1
            java.lang.String r4 = "androidx.compose.material.swipeable.<anonymous> (Swipeable.kt:585)"
            r5 = r26
            androidx.compose.runtime.ComposerKt.Y(r2, r5, r3, r4)
        L_0x0018:
            java.util.Map r2 = r0.f8576z
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x00fc
            java.util.Map r2 = r0.f8576z
            java.util.Collection r2 = r2.values()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r2 = kotlin.collections.CollectionsKt.Y(r2)
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            java.util.Map r3 = r0.f8576z
            int r3 = r3.size()
            if (r2 != r3) goto L_0x00f4
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r2 = r1.C(r2)
            r7 = r2
            androidx.compose.ui.unit.Density r7 = (androidx.compose.ui.unit.Density) r7
            androidx.compose.material.SwipeableState r2 = r0.f8574A
            java.util.Map r3 = r0.f8576z
            r2.l(r3)
            java.util.Map r2 = r0.f8576z
            androidx.compose.material.SwipeableState r11 = r0.f8574A
            androidx.compose.material.SwipeableState r3 = r0.f8574A
            boolean r3 = r1.W(r3)
            java.util.Map r4 = r0.f8576z
            boolean r4 = r1.l(r4)
            r3 = r3 | r4
            androidx.compose.material.ResistanceConfig r4 = r0.f8575B
            boolean r4 = r1.W(r4)
            r3 = r3 | r4
            kotlin.jvm.functions.Function2 r4 = r0.C
            boolean r4 = r1.W(r4)
            r3 = r3 | r4
            boolean r4 = r1.W(r7)
            r3 = r3 | r4
            float r4 = r0.D
            boolean r4 = r1.h(r4)
            r3 = r3 | r4
            androidx.compose.material.SwipeableState r4 = r0.f8574A
            java.util.Map r5 = r0.f8576z
            androidx.compose.material.ResistanceConfig r6 = r0.f8575B
            kotlin.jvm.functions.Function2 r8 = r0.C
            float r9 = r0.D
            java.lang.Object r10 = r25.g()
            if (r3 != 0) goto L_0x008f
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r10 != r3) goto L_0x009a
        L_0x008f:
            androidx.compose.material.SwipeableKt$swipeable$3$3$1 r12 = new androidx.compose.material.SwipeableKt$swipeable$3$3$1
            r10 = 0
            r3 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r1.N(r12)
            r10 = r12
        L_0x009a:
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            r3 = 0
            androidx.compose.runtime.EffectsKt.f(r2, r11, r10, r1, r3)
            androidx.compose.ui.Modifier$Companion r12 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.material.SwipeableState r2 = r0.f8574A
            boolean r17 = r2.x()
            androidx.compose.material.SwipeableState r2 = r0.f8574A
            androidx.compose.foundation.gestures.DraggableState r13 = r2.q()
            androidx.compose.foundation.gestures.Orientation r14 = r0.E
            boolean r15 = r0.F
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r0.G
            androidx.compose.material.SwipeableState r3 = r0.f8574A
            boolean r3 = r1.W(r3)
            androidx.compose.material.SwipeableState r4 = r0.f8574A
            java.lang.Object r5 = r25.g()
            if (r3 != 0) goto L_0x00ca
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r5 != r3) goto L_0x00d3
        L_0x00ca:
            androidx.compose.material.SwipeableKt$swipeable$3$4$1 r5 = new androidx.compose.material.SwipeableKt$swipeable$3$4$1
            r3 = 0
            r5.<init>(r4, r3)
            r1.N(r5)
        L_0x00d3:
            r19 = r5
            kotlin.jvm.functions.Function3 r19 = (kotlin.jvm.functions.Function3) r19
            boolean r3 = r0.H
            r21 = 32
            r22 = 0
            r18 = 0
            r16 = r2
            r20 = r3
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.gestures.DraggableKt.h(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x00f0
            androidx.compose.runtime.ComposerKt.X()
        L_0x00f0:
            r25.M()
            return r2
        L_0x00f4:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "You cannot have two anchors mapped to the same state."
            r1.<init>(r2)
            throw r1
        L_0x00fc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "You must have at least one anchor."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableKt$swipeable$3.b(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return b((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
