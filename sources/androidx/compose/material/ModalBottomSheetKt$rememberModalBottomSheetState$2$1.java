package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ModalBottomSheetKt$rememberModalBottomSheetState$2$1 extends Lambda implements Function0<ModalBottomSheetState> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Density f8020A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f8021B;
    public final /* synthetic */ AnimationSpec C;
    public final /* synthetic */ boolean D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ModalBottomSheetValue f8022z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$rememberModalBottomSheetState$2$1(ModalBottomSheetValue modalBottomSheetValue, Density density, Function1 function1, AnimationSpec animationSpec, boolean z2) {
        super(0);
        this.f8022z = modalBottomSheetValue;
        this.f8020A = density;
        this.f8021B = function1;
        this.C = animationSpec;
        this.D = z2;
    }

    /* renamed from: b */
    public final ModalBottomSheetState invoke() {
        return new ModalBottomSheetState(this.f8022z, this.f8020A, this.f8021B, this.C, this.D);
    }
}
