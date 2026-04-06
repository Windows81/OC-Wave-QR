package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;

@Metadata
public final class RotateKt {
    public static final Modifier a(Modifier modifier, float f2) {
        return f2 == 0.0f ? modifier : GraphicsLayerModifierKt.c(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f2, 0.0f, 0, (Shape) null, false, (RenderEffect) null, 0, 0, 0, 130815, (Object) null);
    }
}
