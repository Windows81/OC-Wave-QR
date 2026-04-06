package androidx.compose.foundation.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
abstract class InsetsConsumingModifier implements ModifierLocalConsumer, ModifierLocalProvider<WindowInsets> {

    /* renamed from: z  reason: collision with root package name */
    public final MutableState f4045z;

    public /* synthetic */ InsetsConsumingModifier(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final WindowInsets b() {
        return (WindowInsets) this.f4045z.getValue();
    }

    private final void d(WindowInsets windowInsets) {
        this.f4045z.setValue(windowInsets);
    }

    public void H0(ModifierLocalReadScope modifierLocalReadScope) {
        d(a((WindowInsets) modifierLocalReadScope.b(WindowInsetsPaddingKt.c())));
    }

    public abstract WindowInsets a(WindowInsets windowInsets);

    /* renamed from: c */
    public WindowInsets getValue() {
        return b();
    }

    public ProvidableModifierLocal getKey() {
        return WindowInsetsPaddingKt.c();
    }

    public InsetsConsumingModifier() {
        this.f4045z = SnapshotStateKt__SnapshotStateKt.e(WindowInsetsKt.a(0, 0, 0, 0), (SnapshotMutationPolicy) null, 2, (Object) null);
    }
}
