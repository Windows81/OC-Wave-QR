package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BottomDrawerState$Companion$Saver$2 extends Lambda implements Function1<BottomDrawerValue, BottomDrawerState> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f7308A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ AnimationSpec f7309B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Density f7310z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomDrawerState$Companion$Saver$2(Density density, Function1 function1, AnimationSpec animationSpec) {
        super(1);
        this.f7310z = density;
        this.f7308A = function1;
        this.f7309B = animationSpec;
    }

    /* renamed from: b */
    public final BottomDrawerState invoke(BottomDrawerValue bottomDrawerValue) {
        return new BottomDrawerState(bottomDrawerValue, this.f7310z, this.f7308A, this.f7309B);
    }
}
