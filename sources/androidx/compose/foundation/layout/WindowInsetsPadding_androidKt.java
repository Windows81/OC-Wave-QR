package androidx.compose.foundation.layout;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.Metadata;

@Metadata
public final class WindowInsetsPadding_androidKt {
    public static final Modifier a(Modifier modifier) {
        return ComposedModifierKt.b(modifier, InspectableValueKt.b() ? new WindowInsetsPadding_androidKt$imePadding$$inlined$debugInspectorInfo$1() : InspectableValueKt.a(), new WindowInsetsPadding_androidKt$imePadding$$inlined$windowInsetsPadding$1());
    }

    public static final Modifier b(Modifier modifier) {
        return ComposedModifierKt.b(modifier, InspectableValueKt.b() ? new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$debugInspectorInfo$1() : InspectableValueKt.a(), new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1());
    }
}
