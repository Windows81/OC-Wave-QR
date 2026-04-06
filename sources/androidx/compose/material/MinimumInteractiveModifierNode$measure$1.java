package androidx.compose.material;

import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;

@Metadata
public final class MinimumInteractiveModifierNode$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Placeable f7979A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f7980B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f7981z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MinimumInteractiveModifierNode$measure$1(int i2, Placeable placeable, int i3) {
        super(1);
        this.f7981z = i2;
        this.f7979A = placeable;
        this.f7980B = i3;
    }

    public final void b(Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope placementScope2 = placementScope;
        Placeable.PlacementScope.j(placementScope2, this.f7979A, MathKt.d(((float) (this.f7981z - this.f7979A.L0())) / 2.0f), MathKt.d(((float) (this.f7980B - this.f7979A.C0())) / 2.0f), 0.0f, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable.PlacementScope) obj);
        return Unit.f40552a;
    }
}
