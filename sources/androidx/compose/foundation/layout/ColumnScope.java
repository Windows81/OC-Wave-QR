package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;

@Metadata
@LayoutScopeMarker
public interface ColumnScope {

    @Metadata
    public static final class DefaultImpls {
    }

    static /* synthetic */ Modifier c(ColumnScope columnScope, Modifier modifier, float f2, boolean z2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                z2 = true;
            }
            return columnScope.a(modifier, f2, z2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: weight");
    }

    Modifier a(Modifier modifier, float f2, boolean z2);

    Modifier b(Modifier modifier, Alignment.Horizontal horizontal);
}
