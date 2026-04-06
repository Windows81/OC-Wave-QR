package androidx.compose.material3;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

public final /* synthetic */ class U4 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f11699A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f11700B;
    public final /* synthetic */ Placeable C;
    public final /* synthetic */ Placeable D;
    public final /* synthetic */ Placeable E;
    public final /* synthetic */ Placeable F;
    public final /* synthetic */ Placeable G;
    public final /* synthetic */ Ref.ObjectRef H;
    public final /* synthetic */ Placeable I;
    public final /* synthetic */ Placeable J;
    public final /* synthetic */ Placeable K;
    public final /* synthetic */ MeasureScope L;
    public final /* synthetic */ boolean M;
    public final /* synthetic */ float N;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ OutlinedTextFieldMeasurePolicy f11701z;

    public /* synthetic */ U4(OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy, int i2, int i3, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Ref.ObjectRef objectRef, Placeable placeable6, Placeable placeable7, Placeable placeable8, MeasureScope measureScope, boolean z2, float f2) {
        this.f11701z = outlinedTextFieldMeasurePolicy;
        this.f11699A = i2;
        this.f11700B = i3;
        this.C = placeable;
        this.D = placeable2;
        this.E = placeable3;
        this.F = placeable4;
        this.G = placeable5;
        this.H = objectRef;
        this.I = placeable6;
        this.J = placeable7;
        this.K = placeable8;
        this.L = measureScope;
        this.M = z2;
        this.N = f2;
    }

    public final Object invoke(Object obj) {
        return OutlinedTextFieldMeasurePolicy.q(this.f11701z, this.f11699A, this.f11700B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, (Placeable.PlacementScope) obj);
    }
}
