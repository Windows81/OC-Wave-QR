package androidx.compose.material;

import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BottomDrawerState$anchoredDraggableState$1 extends Lambda implements Function1<Float, Float> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Density f7311z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomDrawerState$anchoredDraggableState$1(Density density) {
        super(1);
        this.f7311z = density;
    }

    public final Float b(float f2) {
        return Float.valueOf(this.f7311z.B1(DrawerKt.f7707b));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).floatValue());
    }
}
