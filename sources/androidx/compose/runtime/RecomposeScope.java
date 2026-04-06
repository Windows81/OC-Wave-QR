package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata
public interface RecomposeScope {
    void invalidate();
}
