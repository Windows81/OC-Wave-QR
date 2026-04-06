package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;

@Metadata
public interface RemeasurementModifier extends Modifier.Element {

    @Metadata
    public static final class DefaultImpls {
    }

    void g2(Remeasurement remeasurement);
}
