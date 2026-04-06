package androidx.compose.material3;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;

@Metadata
final class TabRowKt$TabRowWithSubcomposeImpl$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f11331A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function3 f11332B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f11333z;

    public static final MeasureResult f(Function2 function2, Function2 function22, Function3 function3, SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
        SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
        int l2 = Constraints.l(constraints.r());
        List j0 = subcomposeMeasureScope2.j0(TabSlots.Tabs, function2);
        int size = j0.size();
        Ref.IntRef intRef = new Ref.IntRef();
        if (size > 0) {
            intRef.f40906z = l2 / size;
        }
        Integer num = 0;
        Collection collection = j0;
        int size2 = collection.size();
        for (int i2 = 0; i2 < size2; i2++) {
            num = Integer.valueOf(Math.max(((Measurable) j0.get(i2)).C(intRef.f40906z), num.intValue()));
        }
        int intValue = num.intValue();
        ArrayList arrayList = new ArrayList(j0.size());
        int size3 = collection.size();
        for (int i3 = 0; i3 < size3; i3++) {
            long r2 = constraints.r();
            int i4 = intRef.f40906z;
            arrayList.add(((Measurable) j0.get(i3)).c0(Constraints.c(r2, i4, i4, intValue, intValue)));
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i5 = 0; i5 < size; i5++) {
            arrayList2.add(new TabPosition(Dp.m(subcomposeMeasureScope2.D(intRef.f40906z) * ((float) i5)), subcomposeMeasureScope2.D(intRef.f40906z), ((Dp) ComparisonsKt.j(Dp.j(Dp.m(subcomposeMeasureScope2.D(Math.min(((Measurable) j0.get(i5)).a0(intValue), intRef.f40906z)) - Dp.m(TabKt.k() * ((float) 2)))), Dp.j(Dp.m((float) 24)))).t(), (DefaultConstructorMarker) null));
        }
        return MeasureScope.R1(subcomposeMeasureScope, l2, intValue, (Map) null, new Z6(arrayList, subcomposeMeasureScope, function22, intRef, constraints, intValue, function3, arrayList2, l2), 4, (Object) null);
    }

    public static final Unit g(List list, SubcomposeMeasureScope subcomposeMeasureScope, Function2 function2, Ref.IntRef intRef, Constraints constraints, int i2, Function3 function3, List list2, int i3, Placeable.PlacementScope placementScope) {
        List list3 = list;
        SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
        int i4 = i2;
        int size = list3.size();
        for (int i5 = 0; i5 < size; i5++) {
            Placeable.PlacementScope.n(placementScope, (Placeable) list3.get(i5), i5 * intRef.f40906z, 0, 0.0f, 4, (Object) null);
        }
        List j0 = subcomposeMeasureScope2.j0(TabSlots.Divider, function2);
        int size2 = j0.size();
        for (int i6 = 0; i6 < size2; i6++) {
            Placeable c0 = ((Measurable) j0.get(i6)).c0(Constraints.d(constraints.r(), 0, 0, 0, 0, 11, (Object) null));
            Placeable.PlacementScope.n(placementScope, c0, 0, i4 - c0.C0(), 0.0f, 4, (Object) null);
        }
        List j02 = subcomposeMeasureScope2.j0(TabSlots.Indicator, ComposableLambdaKt.c(1918742627, true, new TabRowKt$TabRowWithSubcomposeImpl$1$1$1$1$3(function3, list2)));
        int size3 = j02.size();
        for (int i7 = 0; i7 < size3; i7++) {
            Placeable.PlacementScope.n(placementScope, ((Measurable) j02.get(i7)).c0(Constraints.f19137b.c(i3, i4)), 0, 0, 0.0f, 4, (Object) null);
        }
        return Unit.f40552a;
    }

    public final void e(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1815327065, i2, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl.<anonymous> (TabRow.kt:768)");
            }
            Modifier h2 = SizeKt.h(Modifier.f15489d, 0.0f, 1, (Object) null);
            boolean W = composer.W(this.f11333z) | composer.W(this.f11331A) | composer.W(this.f11332B);
            Function2 function2 = this.f11333z;
            Function2 function22 = this.f11331A;
            Function3 function3 = this.f11332B;
            Object g2 = composer.g();
            if (W || g2 == Composer.f14567a.a()) {
                g2 = new Y6(function2, function22, function3);
                composer.N(g2);
            }
            SubcomposeLayoutKt.a(h2, (Function2) g2, composer, 6, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        e((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
