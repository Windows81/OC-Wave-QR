package androidx.compose.material;

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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BackdropScaffoldKt$BackdropStack$1$1 extends Lambda implements Function2<SubcomposeMeasureScope, Constraints, MeasureResult> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f7241A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function4 f7242B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f7243z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$BackdropStack$1$1(Function2 function2, Function1 function1, Function4 function4) {
        super(2);
        this.f7243z = function2;
        this.f7241A = function1;
        this.f7242B = function4;
    }

    public final MeasureResult b(SubcomposeMeasureScope subcomposeMeasureScope, long j2) {
        final Placeable c0 = ((Measurable) CollectionsKt.e0(subcomposeMeasureScope.j0(BackdropLayers.Back, this.f7243z))).c0(((Constraints) this.f7241A.invoke(Constraints.a(j2))).r());
        List j0 = subcomposeMeasureScope.j0(BackdropLayers.Front, ComposableLambdaKt.c(-1222642649, true, new BackdropScaffoldKt$BackdropStack$1$1$placeables$1(this.f7242B, j2, (float) c0.C0())));
        final ArrayList arrayList = new ArrayList(j0.size());
        int size = j0.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((Measurable) j0.get(i2)).c0(j2));
        }
        int max = Math.max(Constraints.n(j2), c0.L0());
        int max2 = Math.max(Constraints.m(j2), c0.C0());
        int size2 = arrayList.size();
        int i3 = max2;
        int i4 = max;
        for (int i5 = 0; i5 < size2; i5++) {
            Placeable placeable = (Placeable) arrayList.get(i5);
            i4 = Math.max(i4, placeable.L0());
            i3 = Math.max(i3, placeable.C0());
        }
        return MeasureScope.R1(subcomposeMeasureScope, i4, i3, (Map) null, new Function1<Placeable.PlacementScope, Unit>() {
            public final void b(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.n(placementScope, c0, 0, 0, 0.0f, 4, (Object) null);
                List list = arrayList;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Placeable.PlacementScope.n(placementScope, (Placeable) list.get(i2), 0, 0, 0.0f, 4, (Object) null);
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
