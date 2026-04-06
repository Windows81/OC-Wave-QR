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
public final class LinksTextMeasurePolicy$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ LinksTextMeasurePolicy f5819A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f5820z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LinksTextMeasurePolicy$measure$1(List list, LinksTextMeasurePolicy linksTextMeasurePolicy) {
        super(1);
        this.f5820z = list;
        this.f5819A = linksTextMeasurePolicy;
    }

    public final void b(Placeable.PlacementScope placementScope) {
        List n2 = BasicTextKt.o(this.f5820z, this.f5819A.f5818a);
        if (n2 != null) {
            int size = n2.size();
            for (int i2 = 0; i2 < size; i2++) {
                Pair pair = (Pair) n2.get(i2);
                Placeable placeable = (Placeable) pair.a();
                Function0 function0 = (Function0) pair.b();
                Placeable.PlacementScope.l(placementScope, placeable, function0 != null ? ((IntOffset) function0.invoke()).r() : IntOffset.f19160b.b(), 0.0f, 2, (Object) null);
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable.PlacementScope) obj);
        return Unit.f40552a;
    }
}
