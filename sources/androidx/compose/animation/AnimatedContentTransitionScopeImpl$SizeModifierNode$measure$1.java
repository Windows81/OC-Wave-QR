package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Placeable f2073A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f2074B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AnimatedContentTransitionScopeImpl.SizeModifierNode f2075z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$1(AnimatedContentTransitionScopeImpl.SizeModifierNode sizeModifierNode, Placeable placeable, long j2) {
        super(1);
        this.f2075z = sizeModifierNode;
        this.f2073A = placeable;
        this.f2074B = j2;
    }

    public final void b(Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope placementScope2 = placementScope;
        Placeable.PlacementScope.l(placementScope2, this.f2073A, this.f2075z.a3().k().a(IntSize.c((((long) this.f2073A.L0()) << 32) | (((long) this.f2073A.C0()) & 4294967295L)), this.f2074B, LayoutDirection.Ltr), 0.0f, 2, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable.PlacementScope) obj);
        return Unit.f40552a;
    }
}
