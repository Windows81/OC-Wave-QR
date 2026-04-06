package androidx.compose.runtime;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import kotlin.Metadata;

@Metadata
public interface PersistentCompositionLocalMap extends PersistentMap<CompositionLocal<Object>, ValueHolder<Object>>, CompositionLocalMap, CompositionLocalAccessorScope {

    @Metadata
    public interface Builder extends PersistentMap.Builder<CompositionLocal<Object>, ValueHolder<Object>> {
        PersistentCompositionLocalMap d();
    }

    Object H(CompositionLocal compositionLocal) {
        return CompositionLocalMapKt.b(this, compositionLocal);
    }

    PersistentCompositionLocalMap X(CompositionLocal compositionLocal, ValueHolder valueHolder);

    Builder l();
}
