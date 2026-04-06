package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class PagerMeasureKt$measurePager$14 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f5304A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MutableState f5305z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagerMeasureKt$measurePager$14(MutableState mutableState, List list) {
        super(1);
        this.f5305z = mutableState;
        this.f5304A = list;
    }

    public final void b(Placeable.PlacementScope placementScope) {
        final List list = this.f5304A;
        placementScope.C(new Function1<Placeable.PlacementScope, Unit>() {
            public final void b(Placeable.PlacementScope placementScope) {
                List list = list;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((MeasuredPage) list.get(i2)).h(placementScope);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Placeable.PlacementScope) obj);
                return Unit.f40552a;
            }
        });
        ObservableScopeInvalidator.a(this.f5305z);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable.PlacementScope) obj);
        return Unit.f40552a;
    }
}
