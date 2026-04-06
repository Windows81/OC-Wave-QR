package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;

@Metadata
public interface ParentDataModifier extends Modifier.Element {

    @Metadata
    public static final class DefaultImpls {
    }

    Object F(Density density, Object obj);
}
