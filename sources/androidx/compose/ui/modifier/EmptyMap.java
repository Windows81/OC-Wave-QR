package androidx.compose.ui.modifier;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class EmptyMap extends ModifierLocalMap {

    /* renamed from: a  reason: collision with root package name */
    public static final EmptyMap f17181a = new EmptyMap();

    public EmptyMap() {
        super((DefaultConstructorMarker) null);
    }

    public boolean a(ModifierLocal modifierLocal) {
        return false;
    }

    public Object b(ModifierLocal modifierLocal) {
        throw new IllegalStateException("");
    }

    /* renamed from: d */
    public Void c(ModifierLocal modifierLocal, Object obj) {
        throw new IllegalStateException("");
    }
}
