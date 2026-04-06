package androidx.compose.material;

import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavigationRailKt$placeIcon$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f8076A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f8077B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Placeable f8078z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavigationRailKt$placeIcon$1(Placeable placeable, int i2, int i3) {
        super(1);
        this.f8078z = placeable;
        this.f8076A = i2;
        this.f8077B = i3;
    }

    public final void b(Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.n(placementScope, this.f8078z, this.f8076A, this.f8077B, 0.0f, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable.PlacementScope) obj);
        return Unit.f40552a;
    }
}
