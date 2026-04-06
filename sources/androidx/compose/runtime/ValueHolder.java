package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata
public interface ValueHolder<T> {
    Object a(PersistentCompositionLocalMap persistentCompositionLocalMap);
}
