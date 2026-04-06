package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ModalBottomSheetState$Companion$Saver$2 extends Lambda implements Function1<ModalBottomSheetValue, ModalBottomSheetState> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f8030A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ AnimationSpec f8031B;
    public final /* synthetic */ boolean C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Density f8032z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetState$Companion$Saver$2(Density density, Function1 function1, AnimationSpec animationSpec, boolean z2) {
        super(1);
        this.f8032z = density;
        this.f8030A = function1;
        this.f8031B = animationSpec;
        this.C = z2;
    }

    /* renamed from: b */
    public final ModalBottomSheetState invoke(ModalBottomSheetValue modalBottomSheetValue) {
        return new ModalBottomSheetState(modalBottomSheetValue, this.f8032z, this.f8030A, this.f8031B, this.C);
    }
}
