package androidx.compose.material3;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class h8 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f12071A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Placeable f12072B;
    public final /* synthetic */ Placeable C;
    public final /* synthetic */ long D;
    public final /* synthetic */ MeasureScope E;
    public final /* synthetic */ TopAppBarMeasurePolicy F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Placeable f12073z;

    public /* synthetic */ h8(Placeable placeable, int i2, Placeable placeable2, Placeable placeable3, long j2, MeasureScope measureScope, TopAppBarMeasurePolicy topAppBarMeasurePolicy, int i3, int i4) {
        this.f12073z = placeable;
        this.f12071A = i2;
        this.f12072B = placeable2;
        this.C = placeable3;
        this.D = j2;
        this.E = measureScope;
        this.F = topAppBarMeasurePolicy;
        this.G = i3;
        this.H = i4;
    }

    public final Object invoke(Object obj) {
        return TopAppBarMeasurePolicy.e(this.f12073z, this.f12071A, this.f12072B, this.C, this.D, this.E, this.F, this.G, this.H, (Placeable.PlacementScope) obj);
    }
}
