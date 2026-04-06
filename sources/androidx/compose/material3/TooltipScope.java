package androidx.compose.material3;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.Metadata;

@Metadata
public interface TooltipScope {
    PopupPositionProvider a();

    LayoutCoordinates b(MeasureScope measureScope);
}
