package androidx.compose.foundation;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ScrollState$Companion$Saver$1 extends Lambda implements Function2<SaverScope, ScrollState, Integer> {

    /* renamed from: z  reason: collision with root package name */
    public static final ScrollState$Companion$Saver$1 f3174z = new ScrollState$Companion$Saver$1();

    public ScrollState$Companion$Saver$1() {
        super(2);
    }

    /* renamed from: b */
    public final Integer m(SaverScope saverScope, ScrollState scrollState) {
        return Integer.valueOf(scrollState.n());
    }
}
