package androidx.compose.material3;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;

/* renamed from: androidx.compose.material3.e4  reason: case insensitive filesystem */
public final /* synthetic */ class C0087e4 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f12011A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f12012B;
    public final /* synthetic */ Placeable C;
    public final /* synthetic */ int D;
    public final /* synthetic */ float E;
    public final /* synthetic */ float F;
    public final /* synthetic */ Placeable G;
    public final /* synthetic */ int H;
    public final /* synthetic */ float I;
    public final /* synthetic */ Placeable J;
    public final /* synthetic */ int K;
    public final /* synthetic */ float L;
    public final /* synthetic */ int M;
    public final /* synthetic */ MeasureScope N;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Placeable f12013z;

    public /* synthetic */ C0087e4(Placeable placeable, boolean z2, float f2, Placeable placeable2, int i2, float f3, float f4, Placeable placeable3, int i3, float f5, Placeable placeable4, int i4, float f6, int i5, MeasureScope measureScope) {
        this.f12013z = placeable;
        this.f12011A = z2;
        this.f12012B = f2;
        this.C = placeable2;
        this.D = i2;
        this.E = f3;
        this.F = f4;
        this.G = placeable3;
        this.H = i3;
        this.I = f5;
        this.J = placeable4;
        this.K = i4;
        this.L = f6;
        this.M = i5;
        this.N = measureScope;
    }

    public final Object invoke(Object obj) {
        return NavigationBarKt.n(this.f12013z, this.f12011A, this.f12012B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, (Placeable.PlacementScope) obj);
    }
}
