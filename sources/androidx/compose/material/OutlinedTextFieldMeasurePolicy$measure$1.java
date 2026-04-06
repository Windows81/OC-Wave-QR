package androidx.compose.material;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class OutlinedTextFieldMeasurePolicy$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f8156A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Placeable f8157B;
    public final /* synthetic */ Placeable C;
    public final /* synthetic */ Placeable D;
    public final /* synthetic */ Placeable E;
    public final /* synthetic */ Placeable F;
    public final /* synthetic */ Placeable G;
    public final /* synthetic */ OutlinedTextFieldMeasurePolicy H;
    public final /* synthetic */ MeasureScope I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f8158z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OutlinedTextFieldMeasurePolicy$measure$1(int i2, int i3, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy, MeasureScope measureScope) {
        super(1);
        this.f8158z = i2;
        this.f8156A = i3;
        this.f8157B = placeable;
        this.C = placeable2;
        this.D = placeable3;
        this.E = placeable4;
        this.F = placeable5;
        this.G = placeable6;
        this.H = outlinedTextFieldMeasurePolicy;
        this.I = measureScope;
    }

    public final void b(Placeable.PlacementScope placementScope) {
        OutlinedTextFieldKt.p(placementScope, this.f8158z, this.f8156A, this.f8157B, this.C, this.D, this.E, this.F, this.G, this.H.f8152c, this.H.f8151b, this.I.getDensity(), this.I.getLayoutDirection(), this.H.f8153d);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable.PlacementScope) obj);
        return Unit.f40552a;
    }
}
