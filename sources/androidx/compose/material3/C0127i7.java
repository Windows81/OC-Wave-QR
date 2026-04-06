package androidx.compose.material3;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* renamed from: androidx.compose.material3.i7  reason: case insensitive filesystem */
public final /* synthetic */ class C0127i7 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f12093A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ TextFieldMeasurePolicy f12094B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;
    public final /* synthetic */ MeasureScope E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;
    public final /* synthetic */ Placeable H;
    public final /* synthetic */ Placeable I;
    public final /* synthetic */ Placeable J;
    public final /* synthetic */ Placeable K;
    public final /* synthetic */ Placeable L;
    public final /* synthetic */ Placeable M;
    public final /* synthetic */ Placeable N;
    public final /* synthetic */ Placeable O;
    public final /* synthetic */ float P;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f12095z;

    public /* synthetic */ C0127i7(Ref.ObjectRef objectRef, boolean z2, TextFieldMeasurePolicy textFieldMeasurePolicy, int i2, int i3, MeasureScope measureScope, int i4, int i5, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, float f2) {
        this.f12095z = objectRef;
        this.f12093A = z2;
        this.f12094B = textFieldMeasurePolicy;
        this.C = i2;
        this.D = i3;
        this.E = measureScope;
        this.F = i4;
        this.G = i5;
        this.H = placeable;
        this.I = placeable2;
        this.J = placeable3;
        this.K = placeable4;
        this.L = placeable5;
        this.M = placeable6;
        this.N = placeable7;
        this.O = placeable8;
        this.P = f2;
    }

    public final Object invoke(Object obj) {
        return TextFieldMeasurePolicy.q(this.f12095z, this.f12093A, this.f12094B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, (Placeable.PlacementScope) obj);
    }
}
