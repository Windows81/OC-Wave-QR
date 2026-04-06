package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BottomSheetState$Companion$Saver$2 extends Lambda implements Function1<BottomSheetValue, BottomSheetState> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ AnimationSpec f7414A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f7415B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Density f7416z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomSheetState$Companion$Saver$2(Density density, AnimationSpec animationSpec, Function1 function1) {
        super(1);
        this.f7416z = density;
        this.f7414A = animationSpec;
        this.f7415B = function1;
    }

    /* renamed from: b */
    public final BottomSheetState invoke(BottomSheetValue bottomSheetValue) {
        return new BottomSheetState(bottomSheetValue, this.f7416z, this.f7414A, this.f7415B);
    }
}
