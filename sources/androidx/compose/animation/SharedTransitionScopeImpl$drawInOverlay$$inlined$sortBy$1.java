package androidx.compose.animation;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;

@Metadata
public final class SharedTransitionScopeImpl$drawInOverlay$$inlined$sortBy$1<T> implements Comparator {
    public final int compare(Object obj, Object obj2) {
        LayerRenderer layerRenderer = (LayerRenderer) obj;
        float f2 = -1.0f;
        Float valueOf = Float.valueOf((layerRenderer.a() == 0.0f && (layerRenderer instanceof SharedElementInternalState) && ((SharedElementInternalState) layerRenderer).l() == null) ? -1.0f : layerRenderer.a());
        LayerRenderer layerRenderer2 = (LayerRenderer) obj2;
        if (!(layerRenderer2.a() == 0.0f && (layerRenderer2 instanceof SharedElementInternalState) && ((SharedElementInternalState) layerRenderer2).l() == null)) {
            f2 = layerRenderer2.a();
        }
        return ComparisonsKt.d(valueOf, Float.valueOf(f2));
    }
}
