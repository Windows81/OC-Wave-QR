package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class PaddingValuesModifier$measure$2 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f4132A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f4133B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Placeable f4134z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaddingValuesModifier$measure$2(Placeable placeable, int i2, int i3) {
        super(1);
        this.f4134z = placeable;
        this.f4132A = i2;
        this.f4133B = i3;
    }

    public final void b(Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.j(placementScope, this.f4134z, this.f4132A, this.f4133B, 0.0f, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable.PlacementScope) obj);
        return Unit.f40552a;
    }
}
