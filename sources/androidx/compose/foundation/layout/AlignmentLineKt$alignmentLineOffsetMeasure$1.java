package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AlignmentLineKt$alignmentLineOffsetMeasure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f3720A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f3721B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;
    public final /* synthetic */ Placeable E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AlignmentLine f3722z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlignmentLineKt$alignmentLineOffsetMeasure$1(AlignmentLine alignmentLine, float f2, int i2, int i3, int i4, Placeable placeable, int i5) {
        super(1);
        this.f3722z = alignmentLine;
        this.f3720A = f2;
        this.f3721B = i2;
        this.C = i3;
        this.D = i4;
        this.E = placeable;
        this.F = i5;
    }

    public final void b(Placeable.PlacementScope placementScope) {
        int i2;
        int i3 = 0;
        if (AlignmentLineKt.d(this.f3722z)) {
            i2 = 0;
        } else {
            i2 = !Dp.o(this.f3720A, Dp.f19144A.c()) ? this.f3721B : (this.C - this.D) - this.E.L0();
        }
        if (AlignmentLineKt.d(this.f3722z)) {
            i3 = !Dp.o(this.f3720A, Dp.f19144A.c()) ? this.f3721B : (this.F - this.D) - this.E.C0();
        }
        Placeable.PlacementScope.n(placementScope, this.E, i2, i3, 0.0f, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable.PlacementScope) obj);
        return Unit.f40552a;
    }
}
