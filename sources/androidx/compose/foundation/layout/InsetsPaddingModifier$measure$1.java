package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class InsetsPaddingModifier$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f4050A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f4051B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Placeable f4052z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InsetsPaddingModifier$measure$1(Placeable placeable, int i2, int i3) {
        super(1);
        this.f4052z = placeable;
        this.f4050A = i2;
        this.f4051B = i3;
    }

    public final void b(Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.j(placementScope, this.f4052z, this.f4050A, this.f4051B, 0.0f, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable.PlacementScope) obj);
        return Unit.f40552a;
    }
}
