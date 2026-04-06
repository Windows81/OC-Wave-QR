package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class RecalculateWindowInsetsModifierNode$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Placeable f4136z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecalculateWindowInsetsModifierNode$measure$1(Placeable placeable) {
        super(1);
        this.f4136z = placeable;
    }

    public final void b(Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.j(placementScope, this.f4136z, 0, 0, 0.0f, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable.PlacementScope) obj);
        return Unit.f40552a;
    }
}
