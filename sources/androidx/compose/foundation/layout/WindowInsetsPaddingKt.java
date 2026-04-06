package androidx.compose.foundation.layout;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class WindowInsetsPaddingKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ProvidableModifierLocal f4255a = ModifierLocalKt.a(WindowInsetsPaddingKt$ModifierLocalConsumedWindowInsets$1.f4260z);

    public static final Modifier a(Modifier modifier, PaddingValues paddingValues) {
        return ComposedModifierKt.b(modifier, InspectableValueKt.b() ? new WindowInsetsPaddingKt$consumeWindowInsets$$inlined$debugInspectorInfo$2(paddingValues) : InspectableValueKt.a(), new WindowInsetsPaddingKt$consumeWindowInsets$4(paddingValues));
    }

    public static final Modifier b(Modifier modifier, WindowInsets windowInsets) {
        return ComposedModifierKt.b(modifier, InspectableValueKt.b() ? new WindowInsetsPaddingKt$consumeWindowInsets$$inlined$debugInspectorInfo$1(windowInsets) : InspectableValueKt.a(), new WindowInsetsPaddingKt$consumeWindowInsets$2(windowInsets));
    }

    public static final ProvidableModifierLocal c() {
        return f4255a;
    }

    public static final Modifier d(Modifier modifier, Function1 function1) {
        return ComposedModifierKt.b(modifier, InspectableValueKt.b() ? new WindowInsetsPaddingKt$onConsumedWindowInsetsChanged$$inlined$debugInspectorInfo$1(function1) : InspectableValueKt.a(), new WindowInsetsPaddingKt$onConsumedWindowInsetsChanged$2(function1));
    }

    public static final Modifier e(Modifier modifier, WindowInsets windowInsets) {
        return ComposedModifierKt.b(modifier, InspectableValueKt.b() ? new WindowInsetsPaddingKt$windowInsetsPadding$$inlined$debugInspectorInfo$1(windowInsets) : InspectableValueKt.a(), new WindowInsetsPaddingKt$windowInsetsPadding$2(windowInsets));
    }
}
