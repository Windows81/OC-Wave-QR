package androidx.compose.material3;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class Q6 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Placeable f10648A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ MeasureScope f10649B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;
    public final /* synthetic */ Integer E;
    public final /* synthetic */ Integer F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Placeable f10650z;

    public /* synthetic */ Q6(Placeable placeable, Placeable placeable2, MeasureScope measureScope, int i2, int i3, Integer num, Integer num2) {
        this.f10650z = placeable;
        this.f10648A = placeable2;
        this.f10649B = measureScope;
        this.C = i2;
        this.D = i3;
        this.E = num;
        this.F = num2;
    }

    public final Object invoke(Object obj) {
        return TabKt$TabBaselineLayout$2$1.d(this.f10650z, this.f10648A, this.f10649B, this.C, this.D, this.E, this.F, (Placeable.PlacementScope) obj);
    }
}
