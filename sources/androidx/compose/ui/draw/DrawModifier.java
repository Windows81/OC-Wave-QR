package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.Metadata;

@Metadata
public interface DrawModifier extends Modifier.Element {

    @Metadata
    public static final class DefaultImpls {
    }

    void U(ContentDrawScope contentDrawScope);
}
