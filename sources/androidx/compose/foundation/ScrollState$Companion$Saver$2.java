package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ScrollState$Companion$Saver$2 extends Lambda implements Function1<Integer, ScrollState> {

    /* renamed from: z  reason: collision with root package name */
    public static final ScrollState$Companion$Saver$2 f3175z = new ScrollState$Companion$Saver$2();

    public ScrollState$Companion$Saver$2() {
        super(1);
    }

    public final ScrollState b(int i2) {
        return new ScrollState(i2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).intValue());
    }
}
