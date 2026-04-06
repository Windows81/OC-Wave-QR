package androidx.compose.material;

import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BottomSheetState$anchoredDraggableState$2 extends Lambda implements Function0<Float> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Density f7418z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomSheetState$anchoredDraggableState$2(Density density) {
        super(0);
        this.f7418z = density;
    }

    /* renamed from: b */
    public final Float invoke() {
        return Float.valueOf(this.f7418z.B1(BottomSheetScaffoldKt.f7360c));
    }
}
