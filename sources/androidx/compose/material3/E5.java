package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class E5 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f9900A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ SearchBarState f9901B;
    public final /* synthetic */ Placeable C;
    public final /* synthetic */ Placeable D;
    public final /* synthetic */ int E;
    public final /* synthetic */ Placeable F;
    public final /* synthetic */ int G;
    public final /* synthetic */ long H;
    public final /* synthetic */ MeasureScope I;
    public final /* synthetic */ int J;
    public final /* synthetic */ MutableState K;
    public final /* synthetic */ int L;
    public final /* synthetic */ int M;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MutableState f9902z;

    public /* synthetic */ E5(MutableState mutableState, float f2, SearchBarState searchBarState, Placeable placeable, Placeable placeable2, int i2, Placeable placeable3, int i3, long j2, MeasureScope measureScope, int i4, MutableState mutableState2, int i5, int i6) {
        this.f9902z = mutableState;
        this.f9900A = f2;
        this.f9901B = searchBarState;
        this.C = placeable;
        this.D = placeable2;
        this.E = i2;
        this.F = placeable3;
        this.G = i3;
        this.H = j2;
        this.I = measureScope;
        this.J = i4;
        this.K = mutableState2;
        this.L = i5;
        this.M = i6;
    }

    public final Object invoke(Object obj) {
        return SearchBarKt$FullScreenSearchBarLayout$2$1.e(this.f9902z, this.f9900A, this.f9901B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, (Placeable.PlacementScope) obj);
    }
}
