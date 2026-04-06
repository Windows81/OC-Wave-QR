package androidx.compose.material;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
final class SwipeableState$Companion$Saver$1 extends Lambda implements Function2<SaverScope, SwipeableState<Object>, Object> {

    /* renamed from: z  reason: collision with root package name */
    public static final SwipeableState$Companion$Saver$1 f8600z = new SwipeableState$Companion$Saver$1();

    public SwipeableState$Companion$Saver$1() {
        super(2);
    }

    /* renamed from: b */
    public final Object m(SaverScope saverScope, SwipeableState swipeableState) {
        return swipeableState.p();
    }
}
