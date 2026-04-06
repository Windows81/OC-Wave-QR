package androidx.compose.material;

import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ModalBottomSheetState$anchoredDraggableState$2 extends Lambda implements Function0<Float> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Density f8035z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetState$anchoredDraggableState$2(Density density) {
        super(0);
        this.f8035z = density;
    }

    /* renamed from: b */
    public final Float invoke() {
        return Float.valueOf(this.f8035z.B1(ModalBottomSheetKt.f7987b));
    }
}
