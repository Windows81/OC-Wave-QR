package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyListMeasureKt$measureLazyList$8 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f4398A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ List f4399B;
    public final /* synthetic */ boolean C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MutableState f4400z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyListMeasureKt$measureLazyList$8(MutableState mutableState, List list, List list2, boolean z2) {
        super(1);
        this.f4400z = mutableState;
        this.f4398A = list;
        this.f4399B = list2;
        this.C = z2;
    }

    public final void b(Placeable.PlacementScope placementScope) {
        final List list = this.f4398A;
        final List list2 = this.f4399B;
        final boolean z2 = this.C;
        placementScope.C(new Function1<Placeable.PlacementScope, Unit>() {
            public final void b(Placeable.PlacementScope placementScope) {
                List list = list;
                boolean z2 = z2;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((LazyListMeasuredItem) list.get(i2)).r(placementScope, z2);
                }
                List list2 = list2;
                boolean z3 = z2;
                int size2 = list2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((LazyListMeasuredItem) list2.get(i3)).r(placementScope, z3);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Placeable.PlacementScope) obj);
                return Unit.f40552a;
            }
        });
        ObservableScopeInvalidator.a(this.f4400z);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable.PlacementScope) obj);
        return Unit.f40552a;
    }
}
