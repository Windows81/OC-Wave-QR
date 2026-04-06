package androidx.compose.foundation.text;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextMeasurePolicy$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f6011A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f6012z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextMeasurePolicy$measure$1(List list, List list2) {
        super(1);
        this.f6012z = list;
        this.f6011A = list2;
    }

    public final void b(Placeable.PlacementScope placementScope) {
        List list = this.f6012z;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Pair pair = (Pair) list.get(i2);
                Placeable.PlacementScope.l(placementScope, (Placeable) pair.a(), ((IntOffset) pair.b()).r(), 0.0f, 2, (Object) null);
            }
        }
        List list2 = this.f6011A;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                Pair pair2 = (Pair) list2.get(i3);
                Placeable placeable = (Placeable) pair2.a();
                Function0 function0 = (Function0) pair2.b();
                Placeable.PlacementScope.l(placementScope, placeable, function0 != null ? ((IntOffset) function0.invoke()).r() : IntOffset.f19160b.b(), 0.0f, 2, (Object) null);
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable.PlacementScope) obj);
        return Unit.f40552a;
    }
}
