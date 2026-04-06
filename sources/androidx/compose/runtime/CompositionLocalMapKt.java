package androidx.compose.runtime;

import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.internal.PersistentCompositionLocalMapKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CompositionLocalMapKt {
    public static final boolean a(PersistentCompositionLocalMap persistentCompositionLocalMap, CompositionLocal compositionLocal) {
        Intrinsics.g(compositionLocal, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        return persistentCompositionLocalMap.containsKey(compositionLocal);
    }

    public static final Object b(PersistentCompositionLocalMap persistentCompositionLocalMap, CompositionLocal compositionLocal) {
        Intrinsics.g(compositionLocal, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        Object obj = persistentCompositionLocalMap.get(compositionLocal);
        if (obj == null) {
            obj = compositionLocal.a();
        }
        return ((ValueHolder) obj).a(persistentCompositionLocalMap);
    }

    public static final PersistentCompositionLocalMap c(ProvidedValue[] providedValueArr, PersistentCompositionLocalMap persistentCompositionLocalMap, PersistentCompositionLocalMap persistentCompositionLocalMap2) {
        PersistentCompositionLocalHashMap.Builder w2 = PersistentCompositionLocalMapKt.a().o();
        for (ProvidedValue providedValue : providedValueArr) {
            CompositionLocal b2 = providedValue.b();
            Intrinsics.g(b2, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
            ProvidableCompositionLocal providableCompositionLocal = (ProvidableCompositionLocal) b2;
            if (providedValue.a() || !a(persistentCompositionLocalMap, providableCompositionLocal)) {
                Intrinsics.g(providedValue, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
                w2.put(providableCompositionLocal, providableCompositionLocal.b(providedValue, (ValueHolder) persistentCompositionLocalMap2.get(providableCompositionLocal)));
            }
        }
        return w2.d();
    }

    public static /* synthetic */ PersistentCompositionLocalMap d(ProvidedValue[] providedValueArr, PersistentCompositionLocalMap persistentCompositionLocalMap, PersistentCompositionLocalMap persistentCompositionLocalMap2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            persistentCompositionLocalMap2 = PersistentCompositionLocalMapKt.a();
        }
        return c(providedValueArr, persistentCompositionLocalMap, persistentCompositionLocalMap2);
    }
}
