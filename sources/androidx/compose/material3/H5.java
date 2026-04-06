package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class H5 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f10092A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ MutableState f10093B;
    public final /* synthetic */ float C;
    public final /* synthetic */ float D;
    public final /* synthetic */ MutableState E;
    public final /* synthetic */ int F;
    public final /* synthetic */ Placeable G;
    public final /* synthetic */ int H;
    public final /* synthetic */ Placeable I;
    public final /* synthetic */ int J;
    public final /* synthetic */ Placeable K;
    public final /* synthetic */ int L;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MeasureScope f10094z;

    public /* synthetic */ H5(MeasureScope measureScope, long j2, MutableState mutableState, float f2, float f3, MutableState mutableState2, int i2, Placeable placeable, int i3, Placeable placeable2, int i4, Placeable placeable3, int i5) {
        this.f10094z = measureScope;
        this.f10092A = j2;
        this.f10093B = mutableState;
        this.C = f2;
        this.D = f3;
        this.E = mutableState2;
        this.F = i2;
        this.G = placeable;
        this.H = i3;
        this.I = placeable2;
        this.J = i4;
        this.K = placeable3;
        this.L = i5;
    }

    public final Object invoke(Object obj) {
        return SearchBarKt$SearchBarLayout$2$1.d(this.f10094z, this.f10092A, this.f10093B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, (Placeable.PlacementScope) obj);
    }
}
