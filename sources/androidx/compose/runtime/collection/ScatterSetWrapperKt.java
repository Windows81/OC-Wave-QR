package androidx.compose.runtime.collection;

import androidx.collection.ScatterSet;
import java.util.Set;
import kotlin.Metadata;

@Metadata
public final class ScatterSetWrapperKt {
    public static final Set a(ScatterSet scatterSet) {
        return new ScatterSetWrapper(scatterSet);
    }
}
