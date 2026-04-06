package androidx.compose.material3.internal;

import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class O implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f12309A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f12310B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Placeable f12311z;

    public /* synthetic */ O(Placeable placeable, float f2, float f3) {
        this.f12311z = placeable;
        this.f12309A = f2;
        this.f12310B = f3;
    }

    public final Object invoke(Object obj) {
        return DraggableAnchorsNodeV2.d3(this.f12311z, this.f12309A, this.f12310B, (Placeable.PlacementScope) obj);
    }
}
