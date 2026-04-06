package androidx.compose.material;

import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BottomNavigationKt$placeIcon$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f7348A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Placeable f7349z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomNavigationKt$placeIcon$1(Placeable placeable, int i2) {
        super(1);
        this.f7349z = placeable;
        this.f7348A = i2;
    }

    public final void b(Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.n(placementScope, this.f7349z, 0, this.f7348A, 0.0f, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable.PlacementScope) obj);
        return Unit.f40552a;
    }
}
