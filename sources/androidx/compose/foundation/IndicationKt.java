package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.Metadata;

@Metadata
public final class IndicationKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ProvidableCompositionLocal f3087a = CompositionLocalKt.j(IndicationKt$LocalIndication$1.f3090z);

    public static final ProvidableCompositionLocal a() {
        return f3087a;
    }

    public static final Modifier b(Modifier modifier, InteractionSource interactionSource, Indication indication) {
        if (indication == null) {
            return modifier;
        }
        if (indication instanceof IndicationNodeFactory) {
            return modifier.o0(new IndicationModifierElement(interactionSource, (IndicationNodeFactory) indication));
        }
        return ComposedModifierKt.b(modifier, InspectableValueKt.b() ? new IndicationKt$indication$$inlined$debugInspectorInfo$1(interactionSource, indication) : InspectableValueKt.a(), new IndicationKt$indication$2(indication, interactionSource));
    }
}
