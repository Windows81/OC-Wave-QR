package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DrawerKt$rememberBottomDrawerState$2$1 extends Lambda implements Function0<BottomDrawerState> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Density f7778A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f7779B;
    public final /* synthetic */ AnimationSpec C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BottomDrawerValue f7780z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawerKt$rememberBottomDrawerState$2$1(BottomDrawerValue bottomDrawerValue, Density density, Function1 function1, AnimationSpec animationSpec) {
        super(0);
        this.f7780z = bottomDrawerValue;
        this.f7778A = density;
        this.f7779B = function1;
        this.C = animationSpec;
    }

    /* renamed from: b */
    public final BottomDrawerState invoke() {
        return new BottomDrawerState(this.f7780z, this.f7778A, this.f7779B, this.C);
    }
}
