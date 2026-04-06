package androidx.compose.foundation.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class RecalculateWindowInsetsModifierNode$measure$2 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Measurable f4137A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f4138B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ RecalculateWindowInsetsModifierNode f4139z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecalculateWindowInsetsModifierNode$measure$2(RecalculateWindowInsetsModifierNode recalculateWindowInsetsModifierNode, Measurable measurable, int i2, int i3) {
        super(1);
        this.f4139z = recalculateWindowInsetsModifierNode;
        this.f4137A = measurable;
        this.f4138B = i2;
        this.C = i3;
    }

    public final void b(Placeable.PlacementScope placementScope) {
        Object obj;
        LayoutCoordinates e2 = placementScope.e();
        if (e2 != null) {
            this.f4139z.a3(IntOffsetKt.d(LayoutCoordinatesKt.f(e2)));
        }
        if (e2 == null) {
            obj = (WindowInsets) this.f4139z.b(WindowInsetsPaddingKt.c());
        } else {
            long f2 = LayoutCoordinatesKt.f(e2);
            long a2 = e2.a();
            long o0 = e2.o0(Offset.e((((long) Float.floatToRawIntBits((float) ((int) (a2 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits((float) ((int) (a2 >> 32)))) << 32)));
            long a3 = LayoutCoordinatesKt.d(e2).a();
            int round = Math.round(Float.intBitsToFloat((int) (f2 >> 32)));
            int round2 = Math.round(Float.intBitsToFloat((int) (f2 & 4294967295L)));
            int round3 = ((int) (a3 >> 32)) - Math.round(Float.intBitsToFloat((int) (o0 >> 32)));
            int round4 = ((int) (a3 & 4294967295L)) - Math.round(Float.intBitsToFloat((int) (o0 & 4294967295L)));
            InsetsValues e3 = this.f4139z.Z2().e();
            if (!(e3.b() == round && e3.d() == round2 && e3.c() == round3 && e3.a() == round4)) {
                this.f4139z.Z2().f(new InsetsValues(round, round2, round3, round4));
            }
            obj = this.f4139z.Z2();
        }
        this.f4139z.T0(WindowInsetsPaddingKt.c(), obj);
        Placeable.PlacementScope.j(placementScope, this.f4137A.c0(Constraints.f19137b.c(this.f4138B, this.C)), 0, 0, 0.0f, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable.PlacementScope) obj);
        return Unit.f40552a;
    }
}
