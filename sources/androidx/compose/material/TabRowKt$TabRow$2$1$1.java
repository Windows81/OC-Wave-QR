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
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TabRowKt$TabRow$2$1$1 extends Lambda implements Function2<SubcomposeMeasureScope, Constraints, MeasureResult> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f8716A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function3 f8717B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f8718z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabRowKt$TabRow$2$1$1(Function2 function2, Function2 function22, Function3 function3) {
        super(2);
        this.f8718z = function2;
        this.f8716A = function22;
        this.f8717B = function3;
    }

    public final MeasureResult b(SubcomposeMeasureScope subcomposeMeasureScope, long j2) {
        Object obj;
        SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
        int l2 = Constraints.l(j2);
        List j0 = subcomposeMeasureScope2.j0(TabSlots.Tabs, this.f8718z);
        int size = j0.size();
        int i2 = l2 / size;
        ArrayList arrayList = new ArrayList(j0.size());
        int size2 = j0.size();
        int i3 = 0;
        int i4 = 0;
        while (i4 < size2) {
            arrayList.add(((Measurable) j0.get(i4)).c0(Constraints.d(j2, i2, i2, 0, 0, 12, (Object) null)));
            i4++;
            i3 = i3;
            j0 = j0;
        }
        int i5 = i3;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(i5);
            int C0 = ((Placeable) obj).C0();
            int o2 = CollectionsKt.o(arrayList);
            int i6 = 1;
            if (1 <= o2) {
                while (true) {
                    Object obj2 = arrayList.get(i6);
                    int C02 = ((Placeable) obj2).C0();
                    if (C0 < C02) {
                        obj = obj2;
                        C0 = C02;
                    }
                    if (i6 == o2) {
                        break;
                    }
                    i6++;
                }
            }
        }
        Placeable placeable = (Placeable) obj;
        int C03 = placeable != null ? placeable.C0() : i5;
        final ArrayList arrayList2 = new ArrayList(size);
        while (i5 < size) {
            arrayList2.add(new TabPosition(Dp.m(subcomposeMeasureScope2.D(i2) * ((float) i5)), subcomposeMeasureScope2.D(i2), (DefaultConstructorMarker) null));
            i5++;
        }
        final Function2 function2 = this.f8716A;
        final Function3 function3 = this.f8717B;
        final ArrayList arrayList3 = arrayList;
        final SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
        final int i7 = i2;
        final long j3 = j2;
        final int i8 = C03;
        final int i9 = l2;
        return MeasureScope.R1(subcomposeMeasureScope, l2, C03, (Map) null, new Function1<Placeable.PlacementScope, Unit>() {
            public final void b(Placeable.PlacementScope placementScope) {
                List list = arrayList3;
                int i2 = i7;
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Placeable.PlacementScope.n(placementScope, (Placeable) list.get(i3), i3 * i2, 0, 0.0f, 4, (Object) null);
                }
                List j0 = subcomposeMeasureScope3.j0(TabSlots.Divider, function2);
                long j2 = j3;
                int i4 = i8;
                int size2 = j0.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    Placeable c0 = ((Measurable) j0.get(i5)).c0(Constraints.d(j2, 0, 0, 0, 0, 11, (Object) null));
                    Placeable.PlacementScope.n(placementScope, c0, 0, i4 - c0.C0(), 0.0f, 4, (Object) null);
                }
                SubcomposeMeasureScope subcomposeMeasureScope = subcomposeMeasureScope3;
                TabSlots tabSlots = TabSlots.Indicator;
                final Function3 function3 = function3;
                final List list2 = arrayList2;
                List j02 = subcomposeMeasureScope.j0(tabSlots, ComposableLambdaKt.c(-641946361, true, new Function2<Composer, Integer, Unit>() {
                    public final void b(Composer composer, int i2) {
                        if (composer.E((i2 & 3) != 2, i2 & 1)) {
                            if (ComposerKt.P()) {
                                ComposerKt.Y(-641946361, i2, -1, "androidx.compose.material.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:176)");
                            }
                            function3.d(list2, composer, 0);
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
                int i6 = i9;
                int i7 = i8;
                int size3 = j02.size();
                for (int i8 = 0; i8 < size3; i8++) {
                    Placeable.PlacementScope.n(placementScope, ((Measurable) j02.get(i8)).c0(Constraints.f19137b.c(i6, i7)), 0, 0, 0.0f, 4, (Object) null);
                }
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
