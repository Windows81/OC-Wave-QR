package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class TabRowKt$ScrollableTabRow$2$1$1 extends Lambda implements Function2<SubcomposeMeasureScope, Constraints, MeasureResult> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f8701A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f8702B;
    public final /* synthetic */ ScrollableTabData C;
    public final /* synthetic */ int D;
    public final /* synthetic */ Function3 E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f8703z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabRowKt$ScrollableTabRow$2$1$1(float f2, Function2 function2, Function2 function22, ScrollableTabData scrollableTabData, int i2, Function3 function3) {
        super(2);
        this.f8703z = f2;
        this.f8701A = function2;
        this.f8702B = function22;
        this.C = scrollableTabData;
        this.D = i2;
        this.E = function3;
    }

    public final MeasureResult b(SubcomposeMeasureScope subcomposeMeasureScope, long j2) {
        SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
        int P1 = subcomposeMeasureScope2.P1(TabRowKt.f8695a);
        int P12 = subcomposeMeasureScope2.P1(this.f8703z);
        long d2 = Constraints.d(j2, P1, 0, 0, 0, 14, (Object) null);
        List j0 = subcomposeMeasureScope2.j0(TabSlots.Tabs, this.f8701A);
        ArrayList arrayList = new ArrayList(j0.size());
        int size = j0.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((Measurable) j0.get(i2)).c0(d2));
        }
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.f40906z = P12 * 2;
        Ref.IntRef intRef2 = new Ref.IntRef();
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Placeable placeable = (Placeable) arrayList.get(i3);
            intRef.f40906z += placeable.L0();
            intRef2.f40906z = Math.max(intRef2.f40906z, placeable.C0());
        }
        int i4 = intRef.f40906z;
        int i5 = intRef2.f40906z;
        final Function2 function2 = this.f8702B;
        final ScrollableTabData scrollableTabData = this.C;
        final int i6 = this.D;
        final int i7 = P12;
        final ArrayList arrayList2 = arrayList;
        final SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
        final long j3 = j2;
        final Ref.IntRef intRef3 = intRef;
        final Ref.IntRef intRef4 = intRef2;
        final Function3 function3 = this.E;
        return MeasureScope.R1(subcomposeMeasureScope, i4, i5, (Map) null, new Function1<Placeable.PlacementScope, Unit>() {
            public final void b(Placeable.PlacementScope placementScope) {
                final ArrayList arrayList = new ArrayList();
                int i2 = i7;
                List list = arrayList2;
                SubcomposeMeasureScope subcomposeMeasureScope = subcomposeMeasureScope3;
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Placeable placeable = (Placeable) list.get(i3);
                    Placeable.PlacementScope.n(placementScope, placeable, i2, 0, 0.0f, 4, (Object) null);
                    arrayList.add(new TabPosition(subcomposeMeasureScope.D(i2), subcomposeMeasureScope.D(placeable.L0()), (DefaultConstructorMarker) null));
                    i2 += placeable.L0();
                }
                List j0 = subcomposeMeasureScope3.j0(TabSlots.Divider, function2);
                long j2 = j3;
                Ref.IntRef intRef = intRef3;
                Ref.IntRef intRef2 = intRef4;
                int i4 = 0;
                for (int size2 = j0.size(); i4 < size2; size2 = size2) {
                    int i5 = intRef.f40906z;
                    Placeable c0 = ((Measurable) j0.get(i4)).c0(Constraints.d(j2, i5, i5, 0, 0, 8, (Object) null));
                    Placeable.PlacementScope.n(placementScope, c0, 0, intRef2.f40906z - c0.C0(), 0.0f, 4, (Object) null);
                    i4++;
                }
                SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope3;
                TabSlots tabSlots = TabSlots.Indicator;
                final Function3 function3 = function3;
                List j02 = subcomposeMeasureScope2.j0(tabSlots, ComposableLambdaKt.c(-411868839, true, new Function2<Composer, Integer, Unit>() {
                    public final void b(Composer composer, int i2) {
                        if (composer.E((i2 & 3) != 2, i2 & 1)) {
                            if (ComposerKt.P()) {
                                ComposerKt.Y(-411868839, i2, -1, "androidx.compose.material.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:292)");
                            }
                            function3.d(arrayList, composer, 0);
                            if (ComposerKt.P()) {
                                ComposerKt.X();
                                return;
                            }
                            return;
                        }
                        composer.B();
                    }

                    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
                        b((Composer) obj, ((Number) obj2).intValue());
                        return Unit.f40552a;
                    }
                }));
                Ref.IntRef intRef3 = intRef3;
                Ref.IntRef intRef4 = intRef4;
                int size3 = j02.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    Placeable.PlacementScope.n(placementScope, ((Measurable) j02.get(i6)).c0(Constraints.f19137b.c(intRef3.f40906z, intRef4.f40906z)), 0, 0, 0.0f, 4, (Object) null);
                }
                scrollableTabData.c(subcomposeMeasureScope3, i7, arrayList, i6);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Placeable.PlacementScope) obj);
                return Unit.f40552a;
            }
        }, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return b((SubcomposeMeasureScope) obj, ((Constraints) obj2).r());
    }
}
