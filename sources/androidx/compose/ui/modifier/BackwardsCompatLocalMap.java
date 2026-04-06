package androidx.compose.ui.modifier;

import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class BackwardsCompatLocalMap extends ModifierLocalMap {

    /* renamed from: a  reason: collision with root package name */
    public ModifierLocalProvider f17180a;

    public BackwardsCompatLocalMap(ModifierLocalProvider modifierLocalProvider) {
        super((DefaultConstructorMarker) null);
        this.f17180a = modifierLocalProvider;
    }

    public boolean a(ModifierLocal modifierLocal) {
        return modifierLocal == this.f17180a.getKey();
    }

    public Object b(ModifierLocal modifierLocal) {
        if (!(modifierLocal == this.f17180a.getKey())) {
            InlineClassHelperKt.c("Check failed.");
        }
        return this.f17180a.getValue();
    }

    public void c(ModifierLocal modifierLocal, Object obj) {
        throw new IllegalStateException("Set is not allowed on a backwards compat provider");
    }

    public final void d(ModifierLocalProvider modifierLocalProvider) {
        this.f17180a = modifierLocalProvider;
    }
}
