package androidx.compose.ui.res;

import kotlin.Metadata;

@Metadata
public final class ResourceResolutionException extends RuntimeException {
    public ResourceResolutionException(String str, Throwable th) {
        super(str, th);
    }
}
