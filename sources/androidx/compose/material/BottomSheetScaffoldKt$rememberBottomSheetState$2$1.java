package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BottomSheetScaffoldKt$rememberBottomSheetState$2$1 extends Lambda implements Function0<BottomSheetState> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Density f7405A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ AnimationSpec f7406B;
    public final /* synthetic */ Function1 C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BottomSheetValue f7407z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$rememberBottomSheetState$2$1(BottomSheetValue bottomSheetValue, Density density, AnimationSpec animationSpec, Function1 function1) {
        super(0);
        this.f7407z = bottomSheetValue;
        this.f7405A = density;
        this.f7406B = animationSpec;
        this.C = function1;
    }

    /* renamed from: b */
    public final BottomSheetState invoke() {
        return new BottomSheetState(this.f7407z, this.f7405A, this.f7406B, this.C);
    }
}
