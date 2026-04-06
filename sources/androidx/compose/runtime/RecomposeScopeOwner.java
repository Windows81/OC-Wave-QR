package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata
public interface RecomposeScopeOwner {
    InvalidationResult a(RecomposeScopeImpl recomposeScopeImpl, Object obj);

    void b(Object obj);

    void c(RecomposeScopeImpl recomposeScopeImpl);
}
