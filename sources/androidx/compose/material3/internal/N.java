package androidx.compose.material3.internal;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class N implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ DraggableAnchorsNodeV2 f12306A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Placeable f12307B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MeasureScope f12308z;

    public /* synthetic */ N(MeasureScope measureScope, DraggableAnchorsNodeV2 draggableAnchorsNodeV2, Placeable placeable) {
        this.f12308z = measureScope;
        this.f12306A = draggableAnchorsNodeV2;
        this.f12307B = placeable;
    }

    public final Object invoke(Object obj) {
        return DraggableAnchorsNodeV2.c3(this.f12308z, this.f12306A, this.f12307B, (Placeable.PlacementScope) obj);
    }
}
