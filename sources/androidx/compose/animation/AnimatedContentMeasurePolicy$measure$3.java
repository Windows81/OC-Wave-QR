package androidx.compose.animation;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AnimatedContentMeasurePolicy$measure$3 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ AnimatedContentMeasurePolicy f2049A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f2050B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Placeable[] f2051z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedContentMeasurePolicy$measure$3(Placeable[] placeableArr, AnimatedContentMeasurePolicy animatedContentMeasurePolicy, int i2, int i3) {
        super(1);
        this.f2051z = placeableArr;
        this.f2049A = animatedContentMeasurePolicy;
        this.f2050B = i2;
        this.C = i3;
    }

    public final void b(Placeable.PlacementScope placementScope) {
        Placeable[] placeableArr;
        Placeable[] placeableArr2 = this.f2051z;
        AnimatedContentMeasurePolicy animatedContentMeasurePolicy = this.f2049A;
        int i2 = this.f2050B;
        int i3 = this.C;
        int length = placeableArr2.length;
        int i4 = 0;
        while (i4 < length) {
            Placeable placeable = placeableArr2[i4];
            if (placeable != null) {
                placeableArr = placeableArr2;
                long a2 = animatedContentMeasurePolicy.a().k().a(IntSize.c((((long) placeable.L0()) << 32) | (((long) placeable.C0()) & 4294967295L)), IntSize.c((((long) i3) & 4294967295L) | (((long) i2) << 32)), LayoutDirection.Ltr);
                Placeable.PlacementScope.j(placementScope, placeable, IntOffset.k(a2), IntOffset.l(a2), 0.0f, 4, (Object) null);
            } else {
                placeableArr = placeableArr2;
            }
            i4++;
            placeableArr2 = placeableArr;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable.PlacementScope) obj);
        return Unit.f40552a;
    }
}
