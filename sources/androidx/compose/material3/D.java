package androidx.compose.material3;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class D implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MeasureScope f9622A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Placeable f9623B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Placeable f9624z;

    public /* synthetic */ D(Placeable placeable, MeasureScope measureScope, Placeable placeable2) {
        this.f9624z = placeable;
        this.f9622A = measureScope;
        this.f9623B = placeable2;
    }

    public final Object invoke(Object obj) {
        return BadgeKt$BadgedBox$1$1.d(this.f9624z, this.f9622A, this.f9623B, (Placeable.PlacementScope) obj);
    }
}
