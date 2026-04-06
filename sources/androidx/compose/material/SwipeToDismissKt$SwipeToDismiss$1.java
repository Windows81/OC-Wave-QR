package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SwipeToDismissKt$SwipeToDismiss$1 extends Lambda implements Function1<DismissDirection, FixedThreshold> {

    /* renamed from: z  reason: collision with root package name */
    public static final SwipeToDismissKt$SwipeToDismiss$1 f8546z = new SwipeToDismissKt$SwipeToDismiss$1();

    public SwipeToDismissKt$SwipeToDismiss$1() {
        super(1);
    }

    /* renamed from: b */
    public final FixedThreshold invoke(DismissDirection dismissDirection) {
        return new FixedThreshold(SwipeToDismissKt.f8545a, (DefaultConstructorMarker) null);
    }
}
