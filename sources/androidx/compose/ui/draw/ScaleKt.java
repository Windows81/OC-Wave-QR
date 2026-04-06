package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;

@Metadata
public final class ScaleKt {
    public static final Modifier a(Modifier modifier, float f2, float f3) {
        return (f2 == 1.0f && f3 == 1.0f) ? modifier : GraphicsLayerModifierKt.c(modifier, f2, f3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, (Shape) null, false, (RenderEffect) null, 0, 0, 0, 131068, (Object) null);
    }
}
