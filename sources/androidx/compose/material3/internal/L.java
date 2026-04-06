package androidx.compose.material3.internal;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class L implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ DraggableAnchorsNode f12277A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Placeable f12278B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MeasureScope f12279z;

    public /* synthetic */ L(MeasureScope measureScope, DraggableAnchorsNode draggableAnchorsNode, Placeable placeable) {
        this.f12279z = measureScope;
        this.f12277A = draggableAnchorsNode;
        this.f12278B = placeable;
    }

    public final Object invoke(Object obj) {
        return DraggableAnchorsNode.b3(this.f12279z, this.f12277A, this.f12278B, (Placeable.PlacementScope) obj);
    }
}
