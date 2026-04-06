package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BoxMeasurePolicy$measure$2 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Measurable f3791A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ MeasureScope f3792B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;
    public final /* synthetic */ BoxMeasurePolicy E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Placeable f3793z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BoxMeasurePolicy$measure$2(Placeable placeable, Measurable measurable, MeasureScope measureScope, int i2, int i3, BoxMeasurePolicy boxMeasurePolicy) {
        super(1);
        this.f3793z = placeable;
        this.f3791A = measurable;
        this.f3792B = measureScope;
        this.C = i2;
        this.D = i3;
        this.E = boxMeasurePolicy;
    }

    public final void b(Placeable.PlacementScope placementScope) {
        BoxKt.h(placementScope, this.f3793z, this.f3791A, this.f3792B.getLayoutDirection(), this.C, this.D, this.E.f3788a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable.PlacementScope) obj);
        return Unit.f40552a;
    }
}
