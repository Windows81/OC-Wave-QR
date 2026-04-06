package androidx.compose.animation;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class EnterExitTransitionModifierNode$measure$2 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f2261A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f2262B;
    public final /* synthetic */ Function1 C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Placeable f2263z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionModifierNode$measure$2(Placeable placeable, long j2, long j3, Function1 function1) {
        super(1);
        this.f2263z = placeable;
        this.f2261A = j2;
        this.f2262B = j3;
        this.C = function1;
    }

    public final void b(Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope placementScope2 = placementScope;
        placementScope2.w(this.f2263z, IntOffset.k(this.f2262B) + IntOffset.k(this.f2261A), IntOffset.l(this.f2262B) + IntOffset.l(this.f2261A), 0.0f, this.C);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable.PlacementScope) obj);
        return Unit.f40552a;
    }
}
