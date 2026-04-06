package androidx.compose.material;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;

@Metadata
public final class SwipeToDismissKt$SwipeToDismiss$2$1$1$1 extends Lambda implements Function1<Density, IntOffset> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DismissState f8550z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeToDismissKt$SwipeToDismiss$2$1$1$1(DismissState dismissState) {
        super(1);
        this.f8550z = dismissState;
    }

    public final long b(Density density) {
        return IntOffsetKt.a(MathKt.d(((Number) this.f8550z.t().getValue()).floatValue()), 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntOffset.c(b((Density) obj));
    }
}
