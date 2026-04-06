package androidx.compose.material3;

import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class TabRowKt$ScrollableTabRowWithSubcomposeImpl$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f11314A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f11315B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ Function3 D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ScrollState f11316z;

    public static final MeasureResult f(float f2, Function2 function2, Function2 function22, ScrollableTabData scrollableTabData, int i2, Function3 function3, SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
        SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
        int P1 = subcomposeMeasureScope2.P1(TabRowDefaults.f11293a.g());
        int P12 = subcomposeMeasureScope2.P1(f2);
        List j0 = subcomposeMeasureScope2.j0(TabSlots.Tabs, function2);
        Integer num = 0;
        Collection collection = j0;
        int size = collection.size();
        for (int i3 = 0; i3 < size; i3++) {
            num = Integer.valueOf(Math.max(num.intValue(), ((Measurable) j0.get(i3)).C(Integer.MAX_VALUE)));
        }
        int intValue = num.intValue();
        long d2 = Constraints.d(constraints.r(), P1, 0, intValue, intValue, 2, (Object) null);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size2 = collection.size();
        for (int i4 = 0; i4 < size2; i4++) {
            Measurable measurable = (Measurable) j0.get(i4);
            Placeable c0 = measurable.c0(d2);
            float m2 = Dp.m(subcomposeMeasureScope2.D(Math.min(measurable.a0(c0.C0()), c0.L0())) - Dp.m(TabKt.k() * ((float) 2)));
            arrayList.add(c0);
            arrayList2.add(Dp.j(m2));
        }
        Integer valueOf = Integer.valueOf(P12 * 2);
        int size3 = arrayList.size();
        for (int i5 = 0; i5 < size3; i5++) {
            valueOf = Integer.valueOf(valueOf.intValue() + ((Placeable) arrayList.get(i5)).L0());
        }
        int intValue2 = valueOf.intValue();
        return MeasureScope.R1(subcomposeMeasureScope, intValue2, intValue, (Map) null, new W6(P12, arrayList, subcomposeMeasureScope, function22, scrollableTabData, i2, arrayList2, constraints, intValue2, intValue, function3), 4, (Object) null);
    }

    public static final Unit g(int i2, List list, SubcomposeMeasureScope subcomposeMeasureScope, Function2 function2, ScrollableTabData scrollableTabData, int i3, List list2, Constraints constraints, int i4, int i5, Function3 function3, Placeable.PlacementScope placementScope) {
        List list3 = list;
        SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
        int i6 = i5;
        ArrayList arrayList = new ArrayList();
        int size = list3.size();
        int i7 = i2;
        for (int i8 = 0; i8 < size; i8++) {
            Placeable placeable = (Placeable) list3.get(i8);
            Placeable.PlacementScope.n(placementScope, placeable, i7, 0, 0.0f, 4, (Object) null);
            arrayList.add(new TabPosition(subcomposeMeasureScope2.D(i7), subcomposeMeasureScope2.D(placeable.L0()), ((Dp) list2.get(i8)).t(), (DefaultConstructorMarker) null));
            i7 += placeable.L0();
        }
        List j0 = subcomposeMeasureScope2.j0(TabSlots.Divider, function2);
        int size2 = j0.size();
        for (int i9 = 0; i9 < size2; i9++) {
            Placeable c0 = ((Measurable) j0.get(i9)).c0(Constraints.d(constraints.r(), i4, i4, 0, 0, 8, (Object) null));
            Placeable.PlacementScope.n(placementScope, c0, 0, i6 - c0.C0(), 0.0f, 4, (Object) null);
        }
        List j02 = subcomposeMeasureScope2.j0(TabSlots.Indicator, ComposableLambdaKt.c(2125766411, true, new TabRowKt$ScrollableTabRowWithSubcomposeImpl$1$1$1$2$3(function3, arrayList)));
        int size3 = j02.size();
        for (int i10 = 0; i10 < size3; i10++) {
            Placeable.PlacementScope.n(placementScope, ((Measurable) j02.get(i10)).c0(Constraints.f19137b.c(i4, i6)), 0, 0, 0.0f, 4, (Object) null);
        }
        scrollableTabData.d(subcomposeMeasureScope2, i2, arrayList, i3);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: androidx.compose.material3.ScrollableTabData} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: androidx.compose.material3.V6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: androidx.compose.material3.V6} */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d0, code lost:
        if (r8 == r3.a()) goto L_0x00d2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(androidx.compose.runtime.Composer r24, int r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r2 & 3
            r4 = 1
            r5 = 0
            r6 = 2
            if (r3 == r6) goto L_0x000f
            r3 = r4
            goto L_0x0010
        L_0x000f:
            r3 = r5
        L_0x0010:
            r7 = r2 & 1
            boolean r3 = r1.E(r3, r7)
            if (r3 == 0) goto L_0x00ee
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x0027
            r3 = -1
            java.lang.String r7 = "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl.<anonymous> (TabRow.kt:836)"
            r8 = 2077251399(0x7bd05747, float:2.1635359E36)
            androidx.compose.runtime.ComposerKt.Y(r8, r2, r3, r7)
        L_0x0027:
            java.lang.Object r2 = r24.g()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r7 = r3.a()
            if (r2 != r7) goto L_0x003c
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.f40721z
            kotlinx.coroutines.CoroutineScope r2 = androidx.compose.runtime.EffectsKt.j(r2, r1)
            r1.N(r2)
        L_0x003c:
            kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
            androidx.compose.material3.tokens.MotionSchemeKeyTokens r7 = androidx.compose.material3.tokens.MotionSchemeKeyTokens.DefaultSpatial
            r8 = 6
            androidx.compose.animation.core.FiniteAnimationSpec r7 = androidx.compose.material3.MotionSchemeKt.b(r7, r1, r8)
            androidx.compose.foundation.ScrollState r8 = r0.f11316z
            boolean r8 = r1.W(r8)
            boolean r9 = r1.W(r2)
            r8 = r8 | r9
            androidx.compose.foundation.ScrollState r9 = r0.f11316z
            java.lang.Object r10 = r24.g()
            if (r8 != 0) goto L_0x005e
            java.lang.Object r8 = r3.a()
            if (r10 != r8) goto L_0x0066
        L_0x005e:
            androidx.compose.material3.ScrollableTabData r10 = new androidx.compose.material3.ScrollableTabData
            r10.<init>(r9, r2, r7)
            r1.N(r10)
        L_0x0066:
            r15 = r10
            androidx.compose.material3.ScrollableTabData r15 = (androidx.compose.material3.ScrollableTabData) r15
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            r7 = 0
            r8 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.h(r2, r7, r4, r8)
            androidx.compose.ui.Alignment$Companion r4 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r4 = r4.h()
            androidx.compose.ui.Modifier r16 = androidx.compose.foundation.layout.SizeKt.E(r2, r4, r5, r6, r8)
            androidx.compose.foundation.ScrollState r2 = r0.f11316z
            r21 = 14
            r22 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r17 = r2
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.ScrollKt.b(r16, r17, r18, r19, r20, r21, r22)
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.selection.SelectableGroupKt.a(r2)
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.draw.ClipKt.b(r2)
            float r4 = r0.f11314A
            boolean r4 = r1.h(r4)
            kotlin.jvm.functions.Function2 r6 = r0.f11315B
            boolean r6 = r1.W(r6)
            r4 = r4 | r6
            kotlin.jvm.functions.Function2 r6 = r0.C
            boolean r6 = r1.W(r6)
            r4 = r4 | r6
            kotlin.jvm.functions.Function3 r6 = r0.D
            boolean r6 = r1.W(r6)
            r4 = r4 | r6
            boolean r6 = r1.l(r15)
            r4 = r4 | r6
            int r6 = r0.E
            boolean r6 = r1.i(r6)
            r4 = r4 | r6
            float r12 = r0.f11314A
            kotlin.jvm.functions.Function2 r13 = r0.f11315B
            kotlin.jvm.functions.Function2 r14 = r0.C
            int r6 = r0.E
            kotlin.jvm.functions.Function3 r7 = r0.D
            java.lang.Object r8 = r24.g()
            if (r4 != 0) goto L_0x00d2
            java.lang.Object r3 = r3.a()
            if (r8 != r3) goto L_0x00df
        L_0x00d2:
            androidx.compose.material3.V6 r8 = new androidx.compose.material3.V6
            r11 = r8
            r16 = r6
            r17 = r7
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r1.N(r8)
        L_0x00df:
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            androidx.compose.ui.layout.SubcomposeLayoutKt.a(r2, r8, r1, r5, r5)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x00f1
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x00f1
        L_0x00ee:
            r24.B()
        L_0x00f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1.e(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        e((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
