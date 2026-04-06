package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class IntrinsicSizeModifier$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Placeable f4070z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IntrinsicSizeModifier$measure$1(Placeable placeable) {
        super(1);
        this.f4070z = placeable;
    }

    public final void b(Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.p(placementScope, this.f4070z, IntOffset.f19160b.b(), 0.0f, 2, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable.PlacementScope) obj);
        return Unit.f40552a;
    }
}
