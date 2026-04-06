package kotlinx.collections.immutable.implementations.immutableMap;

import kotlin.Metadata;
import kotlinx.collections.immutable.internal.CommonFunctionsKt;

@Metadata
public final class TrieNodeValuesIterator<K, V> extends TrieNodeBaseIterator<K, V, V> {
    public Object next() {
        CommonFunctionsKt.a(g());
        n(f() + 2);
        return e()[f() - 1];
    }
}
