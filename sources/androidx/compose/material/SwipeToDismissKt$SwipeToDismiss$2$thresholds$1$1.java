package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1 extends Lambda implements Function2<DismissValue, DismissValue, ThresholdConfig> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f8551z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1(Function1 function1) {
        super(2);
        this.f8551z = function1;
    }

    /* renamed from: b */
    public final ThresholdConfig m(DismissValue dismissValue, DismissValue dismissValue2) {
        Function1 function1 = this.f8551z;
        DismissDirection c2 = SwipeToDismissKt.d(dismissValue, dismissValue2);
        Intrinsics.f(c2);
        return (ThresholdConfig) function1.invoke(c2);
    }
}
