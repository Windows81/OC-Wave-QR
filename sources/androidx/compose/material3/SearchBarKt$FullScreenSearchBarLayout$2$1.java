package androidx.compose.material3;

import androidx.compose.material3.internal.BackEventProgress;
import androidx.compose.material3.internal.MutableWindowInsets;
import androidx.compose.material3.internal.SwipeEdge;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.compose.ui.util.MathHelpersKt;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

@Metadata
public final class SearchBarKt$FullScreenSearchBarLayout$2$1 implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MutableState f10861a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SearchBarState f10862b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ MutableWindowInsets f10863c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ MutableState f10864d;

    public SearchBarKt$FullScreenSearchBarLayout$2$1(MutableState mutableState, SearchBarState searchBarState, MutableWindowInsets mutableWindowInsets, MutableState mutableState2) {
        this.f10861a = mutableState;
        this.f10862b = searchBarState;
        this.f10863c = mutableWindowInsets;
        this.f10864d = mutableState2;
    }

    public static final Unit e(MutableState mutableState, float f2, SearchBarState searchBarState, Placeable placeable, Placeable placeable2, int i2, Placeable placeable3, int i3, long j2, MeasureScope measureScope, int i4, MutableState mutableState2, int i5, int i6, Placeable.PlacementScope placementScope) {
        float f3 = f2;
        BackEventProgress.InProgress inProgress = (BackEventProgress.InProgress) mutableState.getValue();
        int c2 = MathHelpersKt.c(0, inProgress != null ? g(inProgress, j2, measureScope, i4, searchBarState) : 0, f2);
        BackEventProgress.InProgress inProgress2 = (BackEventProgress.InProgress) mutableState.getValue();
        int c3 = MathHelpersKt.c(0, inProgress2 != null ? j(inProgress2, mutableState2, j2, i5, measureScope, i6, searchBarState) : 0, f2);
        int c4 = MathHelpersKt.c(SearchBarKt.J(searchBarState).g(), c2, searchBarState.e());
        int c5 = MathHelpersKt.c(SearchBarKt.J(searchBarState).j(), c3, searchBarState.e());
        Placeable.PlacementScope placementScope2 = placementScope;
        int i7 = c4;
        Placeable.PlacementScope.j(placementScope2, placeable, i7, c5, 0.0f, 4, (Object) null);
        int i8 = c5 + i2;
        Placeable.PlacementScope.j(placementScope2, placeable2, i7, i8, 0.0f, 4, (Object) null);
        SearchBarState searchBarState2 = searchBarState;
        Placeable.PlacementScope.x(placementScope, placeable3, c4, i8 + placeable2.C0() + i3, 0.0f, new F5(searchBarState), 4, (Object) null);
        return Unit.f40552a;
    }

    public static final int g(BackEventProgress.InProgress inProgress, long j2, MeasureScope measureScope, int i2, SearchBarState searchBarState) {
        return RangesKt.j(RangesKt.e(inProgress.b() == SwipeEdge.f12324z ? (Constraints.l(j2) - measureScope.P1(SearchBarKt.f10821i)) - i2 : measureScope.P1(SearchBarKt.f10821i), SearchBarKt.J(searchBarState).h() - i2), SearchBarKt.J(searchBarState).g());
    }

    public static final int j(BackEventProgress.InProgress inProgress, MutableState mutableState, long j2, int i2, MeasureScope measureScope, int i3, SearchBarState searchBarState) {
        float c2 = inProgress.c();
        BackEventProgress.InProgress inProgress2 = (BackEventProgress.InProgress) mutableState.getValue();
        if (inProgress2 == null) {
            return 0;
        }
        float c3 = c2 - inProgress2.c();
        return RangesKt.j((MathHelpersKt.c(0, Math.min(RangesKt.e(((Constraints.k(j2) - i2) / 2) - measureScope.P1(SearchBarKt.f10821i), 0), measureScope.P1(SearchBarKt.f10822j)), Math.abs(c3) / ((float) Constraints.k(j2))) * ((int) Math.signum(c3))) + i3, SearchBarKt.J(searchBarState).j());
    }

    public static final Unit k(SearchBarState searchBarState, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.d(searchBarState.e());
        return Unit.f40552a;
    }

    public final MeasureResult b(MeasureScope measureScope, List list, long j2) {
        MeasureScope measureScope2 = measureScope;
        List list2 = list;
        long j3 = j2;
        float F = SearchBarKt.O((BackEventProgress.InProgress) this.f10861a.getValue());
        Integer valueOf = Integer.valueOf(SearchBarKt.J(this.f10862b).l());
        Integer num = null;
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : measureScope2.P1(SearchBarKt.L());
        Integer valueOf2 = Integer.valueOf(SearchBarKt.J(this.f10862b).f());
        if (valueOf2.intValue() != 0) {
            num = valueOf2;
        }
        int intValue2 = num != null ? num.intValue() : measureScope2.P1(SearchBarDefaults.f10786a.n());
        int e2 = RangesKt.e(MathKt.d(((float) Constraints.l(j2)) * 0.9f), intValue);
        int e3 = RangesKt.e(MathKt.d(((float) Constraints.k(j2)) * 0.9f), intValue2);
        int c2 = MathHelpersKt.c(Constraints.l(j2), e2, F);
        int c3 = MathHelpersKt.c(Constraints.k(j2), e3, F);
        int g2 = ConstraintsKt.g(j3, MathHelpersKt.c(intValue, c2, this.f10862b.e()));
        int f2 = ConstraintsKt.f(j3, MathHelpersKt.c(intValue2, c3, this.f10862b.e()));
        int size = list2.size();
        int i2 = 0;
        while (i2 < size) {
            Measurable measurable = (Measurable) list2.get(i2);
            int i3 = size;
            if (Intrinsics.d(LayoutIdKt.a(measurable), "Surface")) {
                Placeable c0 = measurable.c0(Constraints.f19137b.c(g2, f2));
                Collection collection = list2;
                int size2 = collection.size();
                int i4 = 0;
                while (i4 < size2) {
                    int i5 = size2;
                    Measurable measurable2 = (Measurable) list2.get(i4);
                    if (Intrinsics.d(LayoutIdKt.a(measurable2), "InputField")) {
                        Placeable c02 = measurable2.c0(Constraints.f19137b.c(g2, intValue2));
                        int a2 = this.f10863c.a(measureScope2) + measureScope2.P1(SearchBarKt.M());
                        int P1 = measureScope2.P1(SearchBarKt.M());
                        int c4 = MathHelpersKt.c(0, a2, Math.min(this.f10862b.e(), ((float) 1) - F));
                        int i6 = a2;
                        int c5 = MathHelpersKt.c(0, P1, this.f10862b.e());
                        int C0 = c02.C0() + c4 + c5;
                        int size3 = collection.size();
                        int i7 = 0;
                        while (i7 < size3) {
                            Measurable measurable3 = (Measurable) list2.get(i7);
                            int i8 = size3;
                            int i9 = e3;
                            if (Intrinsics.d(LayoutIdKt.a(measurable3), "Content")) {
                                return MeasureScope.R1(measureScope, Constraints.l(j2), Constraints.k(j2), (Map) null, new E5(this.f10861a, F, this.f10862b, c0, c02, c4, measurable3.c0(ConstraintsKt.a(g2, g2, 0, RangesKt.e(f2 - C0, 0))), c5, j2, measureScope, e2, this.f10864d, i9, i6), 4, (Object) null);
                            }
                            int i10 = i6;
                            i7++;
                            MeasureScope measureScope3 = measureScope;
                            list2 = list;
                            size3 = i8;
                            e3 = i9;
                        }
                        ListUtilsKt.f("Collection contains no element matching the predicate.");
                        throw new KotlinNothingValueException();
                    }
                    i4++;
                    measureScope2 = measureScope;
                    list2 = list;
                    long j4 = j2;
                    size2 = i5;
                    e3 = e3;
                }
                ListUtilsKt.f("Collection contains no element matching the predicate.");
                throw new KotlinNothingValueException();
            }
            i2++;
            measureScope2 = measureScope;
            list2 = list;
            long j5 = j2;
            size = i3;
            e3 = e3;
        }
        ListUtilsKt.f("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }
}
