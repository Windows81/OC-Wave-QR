package androidx.compose.ui.graphics.vector;

import kotlin.Metadata;

@Metadata
public interface VectorConfig {

    @Metadata
    public static final class DefaultImpls {
    }

    Object a(VectorProperty vectorProperty, Object obj) {
        return obj;
    }
}
