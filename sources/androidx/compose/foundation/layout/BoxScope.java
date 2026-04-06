package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;

@Metadata
@LayoutScopeMarker
public interface BoxScope {
    Modifier a(Modifier modifier);

    Modifier g(Modifier modifier, Alignment alignment);
}
