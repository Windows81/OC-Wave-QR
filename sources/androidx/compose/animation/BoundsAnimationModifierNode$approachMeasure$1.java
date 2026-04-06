package androidx.compose.animation;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BoundsAnimationModifierNode$approachMeasure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Placeable f2165A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BoundsAnimationModifierNode f2166z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BoundsAnimationModifierNode$approachMeasure$1(BoundsAnimationModifierNode boundsAnimationModifierNode, Placeable placeable) {
        super(1);
        this.f2166z = boundsAnimationModifierNode;
        this.f2165A = placeable;
    }

    public final void b(Placeable.PlacementScope placementScope) {
        long j2;
        Rect e2 = this.f2166z.S.e();
        LookaheadScope b3 = this.f2166z.b3();
        BoundsAnimationModifierNode boundsAnimationModifierNode = this.f2166z;
        LayoutCoordinates e3 = placementScope.e();
        Offset d2 = e3 != null ? Offset.d(b3.u(placementScope).I(e3, Offset.f15855b.c(), boundsAnimationModifierNode.a3())) : null;
        if (e2 != null) {
            this.f2166z.S.h(e2.t(), e2.q());
            j2 = e2.t();
        } else {
            Rect c2 = this.f2166z.S.c();
            j2 = c2 != null ? c2.t() : Offset.f15855b.c();
        }
        long p2 = d2 != null ? Offset.p(j2, d2.t()) : Offset.f15855b.c();
        Placeable.PlacementScope.j(placementScope, this.f2165A, Math.round(Float.intBitsToFloat((int) (p2 >> 32))), Math.round(Float.intBitsToFloat((int) (p2 & 4294967295L))), 0.0f, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable.PlacementScope) obj);
        return Unit.f40552a;
    }
}
