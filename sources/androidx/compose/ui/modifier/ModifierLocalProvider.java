package androidx.compose.ui.modifier;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;

@Metadata
public interface ModifierLocalProvider<T> extends Modifier.Element {

    @Metadata
    public static final class DefaultImpls {
    }

    ProvidableModifierLocal getKey();

    Object getValue();
}
