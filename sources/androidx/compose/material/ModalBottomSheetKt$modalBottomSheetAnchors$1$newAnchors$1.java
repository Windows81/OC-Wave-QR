package androidx.compose.material;

import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ModalBottomSheetKt$modalBottomSheetAnchors$1$newAnchors$1 extends Lambda implements Function1<DraggableAnchorsConfig<ModalBottomSheetValue>, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ModalBottomSheetState f8016A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f8017B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f8018z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$modalBottomSheetAnchors$1$newAnchors$1(float f2, ModalBottomSheetState modalBottomSheetState, long j2) {
        super(1);
        this.f8018z = f2;
        this.f8016A = modalBottomSheetState;
        this.f8017B = j2;
    }

    public final void b(DraggableAnchorsConfig draggableAnchorsConfig) {
        draggableAnchorsConfig.a(ModalBottomSheetValue.Hidden, this.f8018z);
        float f2 = this.f8018z / 2.0f;
        if (!this.f8016A.j() && ((float) IntSize.f(this.f8017B)) > f2) {
            draggableAnchorsConfig.a(ModalBottomSheetValue.HalfExpanded, f2);
        }
        if (IntSize.f(this.f8017B) != 0) {
            draggableAnchorsConfig.a(ModalBottomSheetValue.Expanded, Math.max(0.0f, this.f8018z - ((float) IntSize.f(this.f8017B))));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((DraggableAnchorsConfig) obj);
        return Unit.f40552a;
    }
}
