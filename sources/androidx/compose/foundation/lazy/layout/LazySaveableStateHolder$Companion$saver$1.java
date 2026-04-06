package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazySaveableStateHolder$Companion$saver$1 extends Lambda implements Function2<SaverScope, LazySaveableStateHolder, Map<String, ? extends List<? extends Object>>> {

    /* renamed from: z  reason: collision with root package name */
    public static final LazySaveableStateHolder$Companion$saver$1 f4940z = new LazySaveableStateHolder$Companion$saver$1();

    public LazySaveableStateHolder$Companion$saver$1() {
        super(2);
    }

    /* renamed from: b */
    public final Map m(SaverScope saverScope, LazySaveableStateHolder lazySaveableStateHolder) {
        Map d2 = lazySaveableStateHolder.d();
        if (d2.isEmpty()) {
            return null;
        }
        return d2;
    }
}
