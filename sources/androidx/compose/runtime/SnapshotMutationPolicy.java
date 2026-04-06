package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata
public interface SnapshotMutationPolicy<T> {

    @Metadata
    public static final class DefaultImpls {
    }

    boolean a(Object obj, Object obj2);

    Object b(Object obj, Object obj2, Object obj3) {
        return null;
    }
}
