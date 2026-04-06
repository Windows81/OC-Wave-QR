package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AspectRatioNode$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Placeable f3776z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AspectRatioNode$measure$1(Placeable placeable) {
        super(1);
        this.f3776z = placeable;
    }

    public final void b(Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.n(placementScope, this.f3776z, 0, 0, 0.0f, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable.PlacementScope) obj);
        return Unit.f40552a;
    }
}
