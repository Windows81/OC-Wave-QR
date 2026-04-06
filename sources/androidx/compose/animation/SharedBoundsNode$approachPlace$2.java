package androidx.compose.animation;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SharedBoundsNode$approachPlace$2 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Placeable f2304A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SharedBoundsNode f2305z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharedBoundsNode$approachPlace$2(SharedBoundsNode sharedBoundsNode, Placeable placeable) {
        super(1);
        this.f2305z = sharedBoundsNode;
        this.f2304A = placeable;
    }

    public final void b(Placeable.PlacementScope placementScope) {
        long j2;
        LayoutCoordinates e2;
        if (this.f2305z.j3().h() != null) {
            BoundsAnimation Z2 = this.f2305z.g3();
            Rect c2 = this.f2305z.j3().c();
            Intrinsics.f(c2);
            Rect h2 = this.f2305z.j3().h();
            Intrinsics.f(h2);
            Z2.a(c2, h2);
        }
        Rect h3 = this.f2305z.g3().h();
        LayoutCoordinates e3 = placementScope.e();
        Offset d2 = e3 != null ? Offset.d(this.f2305z.h3().N(e3, Offset.f15855b.c())) : null;
        if (h3 != null) {
            if (this.f2305z.g3().f()) {
                this.f2305z.j3().p(h3);
            }
            j2 = h3.t();
        } else {
            if (this.f2305z.g3().f() && (e2 = placementScope.e()) != null) {
                this.f2305z.o3(e2);
            }
            Rect c3 = this.f2305z.j3().c();
            Intrinsics.f(c3);
            j2 = c3.t();
        }
        long p2 = d2 != null ? Offset.p(j2, d2.t()) : Offset.f15855b.c();
        Placeable.PlacementScope.j(placementScope, this.f2304A, Math.round(Float.intBitsToFloat((int) (p2 >> 32))), Math.round(Float.intBitsToFloat((int) (p2 & 4294967295L))), 0.0f, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable.PlacementScope) obj);
        return Unit.f40552a;
    }
}
