package androidx.compose.runtime.tooling;

import kotlin.Metadata;

@Metadata
public interface CompositionErrorContext {
    boolean e(Throwable th, Object obj);
}
