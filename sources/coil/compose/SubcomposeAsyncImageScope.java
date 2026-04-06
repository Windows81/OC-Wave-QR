package coil.compose;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import kotlin.Metadata;

@Metadata
@LayoutScopeMarker
public interface SubcomposeAsyncImageScope extends BoxScope {
    ContentScale b();

    float c();

    ColorFilter f();

    String getContentDescription();

    Alignment h();

    AsyncImagePainter i();

    boolean p();
}
