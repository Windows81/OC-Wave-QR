package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class RootMeasurePolicy$measure$3 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f17150z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RootMeasurePolicy$measure$3(List list) {
        super(1);
        this.f17150z = list;
    }

    public final void b(Placeable.PlacementScope placementScope) {
        List list = this.f17150z;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Placeable.PlacementScope.r(placementScope, (Placeable) list.get(i2), 0, 0, 0.0f, (Function1) null, 12, (Object) null);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable.PlacementScope) obj);
        return Unit.f40552a;
    }
}
