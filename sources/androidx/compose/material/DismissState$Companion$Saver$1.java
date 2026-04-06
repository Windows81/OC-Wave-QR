package androidx.compose.material;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
final class DismissState$Companion$Saver$1 extends Lambda implements Function2<SaverScope, DismissState, DismissValue> {

    /* renamed from: z  reason: collision with root package name */
    public static final DismissState$Companion$Saver$1 f7684z = new DismissState$Companion$Saver$1();

    public DismissState$Companion$Saver$1() {
        super(2);
    }

    /* renamed from: b */
    public final DismissValue m(SaverScope saverScope, DismissState dismissState) {
        return (DismissValue) dismissState.p();
    }
}
