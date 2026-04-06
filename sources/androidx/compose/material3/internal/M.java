package androidx.compose.material3.internal;

import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class M implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f12293A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f12294B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Placeable f12295z;

    public /* synthetic */ M(Placeable placeable, float f2, float f3) {
        this.f12295z = placeable;
        this.f12293A = f2;
        this.f12294B = f3;
    }

    public final Object invoke(Object obj) {
        return DraggableAnchorsNode.c3(this.f12295z, this.f12293A, this.f12294B, (Placeable.PlacementScope) obj);
    }
}
