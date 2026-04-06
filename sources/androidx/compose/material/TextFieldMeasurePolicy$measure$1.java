package androidx.compose.material;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;

@Metadata
public final class TextFieldMeasurePolicy$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f8845A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f8846B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;
    public final /* synthetic */ Placeable E;
    public final /* synthetic */ Placeable F;
    public final /* synthetic */ Placeable G;
    public final /* synthetic */ Placeable H;
    public final /* synthetic */ TextFieldMeasurePolicy I;
    public final /* synthetic */ int J;
    public final /* synthetic */ int K;
    public final /* synthetic */ MeasureScope L;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Placeable f8847z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldMeasurePolicy$measure$1(Placeable placeable, int i2, int i3, int i4, int i5, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, TextFieldMeasurePolicy textFieldMeasurePolicy, int i6, int i7, MeasureScope measureScope) {
        super(1);
        this.f8847z = placeable;
        this.f8845A = i2;
        this.f8846B = i3;
        this.C = i4;
        this.D = i5;
        this.E = placeable2;
        this.F = placeable3;
        this.G = placeable4;
        this.H = placeable5;
        this.I = textFieldMeasurePolicy;
        this.J = i6;
        this.K = i7;
        this.L = measureScope;
    }

    public final void b(Placeable.PlacementScope placementScope) {
        if (this.f8847z != null) {
            Placeable.PlacementScope placementScope2 = placementScope;
            TextFieldKt.r(placementScope2, this.C, this.D, this.E, this.f8847z, this.F, this.G, this.H, this.I.f8840a, RangesKt.e(this.f8845A - this.f8846B, 0), this.J + this.K, this.I.f8841b, this.L.getDensity());
            return;
        }
        int i2 = this.C;
        int i3 = this.D;
        Placeable placeable = this.E;
        Placeable placeable2 = this.F;
        Placeable placeable3 = this.G;
        TextFieldKt.s(placementScope, i2, i3, placeable, placeable2, placeable3, this.H, this.I.f8840a, this.L.getDensity(), this.I.f8842c);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable.PlacementScope) obj);
        return Unit.f40552a;
    }
}
