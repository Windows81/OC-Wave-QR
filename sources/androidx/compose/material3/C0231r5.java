package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import kotlin.jvm.functions.Function1;

/* renamed from: androidx.compose.material3.r5  reason: case insensitive filesystem */
public final /* synthetic */ class C0231r5 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Placeable f12673A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Placeable f12674B;
    public final /* synthetic */ int C;
    public final /* synthetic */ WindowInsets D;
    public final /* synthetic */ SubcomposeMeasureScope E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;
    public final /* synthetic */ Placeable H;
    public final /* synthetic */ FabPlacement I;
    public final /* synthetic */ Placeable J;
    public final /* synthetic */ Integer K;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Placeable f12675z;

    public /* synthetic */ C0231r5(Placeable placeable, Placeable placeable2, Placeable placeable3, int i2, WindowInsets windowInsets, SubcomposeMeasureScope subcomposeMeasureScope, int i3, int i4, Placeable placeable4, FabPlacement fabPlacement, Placeable placeable5, Integer num) {
        this.f12675z = placeable;
        this.f12673A = placeable2;
        this.f12674B = placeable3;
        this.C = i2;
        this.D = windowInsets;
        this.E = subcomposeMeasureScope;
        this.F = i3;
        this.G = i4;
        this.H = placeable4;
        this.I = fabPlacement;
        this.J = placeable5;
        this.K = num;
    }

    public final Object invoke(Object obj) {
        return ScaffoldKt.i(this.f12675z, this.f12673A, this.f12674B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, (Placeable.PlacementScope) obj);
    }
}
