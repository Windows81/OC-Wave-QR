package androidx.compose.animation;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SizeAnimationModifierNode$measure$2 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f2390A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f2391B;
    public final /* synthetic */ int C;
    public final /* synthetic */ MeasureScope D;
    public final /* synthetic */ Placeable E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SizeAnimationModifierNode f2392z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SizeAnimationModifierNode$measure$2(SizeAnimationModifierNode sizeAnimationModifierNode, long j2, int i2, int i3, MeasureScope measureScope, Placeable placeable) {
        super(1);
        this.f2392z = sizeAnimationModifierNode;
        this.f2390A = j2;
        this.f2391B = i2;
        this.C = i3;
        this.D = measureScope;
        this.E = placeable;
    }

    public final void b(Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope placementScope2 = placementScope;
        Placeable.PlacementScope.l(placementScope2, this.E, this.f2392z.a3().a(this.f2390A, IntSize.c((((long) this.f2391B) << 32) | (((long) this.C) & 4294967295L)), this.D.getLayoutDirection()), 0.0f, 2, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable.PlacementScope) obj);
        return Unit.f40552a;
    }
}
