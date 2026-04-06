package androidx.compose.foundation;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
final class PreferKeepClearElement extends ModifierNodeElement<PreferKeepClearNode> {

    /* renamed from: z  reason: collision with root package name */
    public final Function1 f3147z;

    /* renamed from: c */
    public PreferKeepClearNode a() {
        return new PreferKeepClearNode(this.f3147z);
    }

    /* renamed from: d */
    public void b(PreferKeepClearNode preferKeepClearNode) {
        preferKeepClearNode.e3(this.f3147z);
    }

    public boolean equals(Object obj) {
        return (obj instanceof PreferKeepClearNode) && this.f3147z == ((PreferKeepClearNode) obj).b3();
    }

    public int hashCode() {
        Function1 function1 = this.f3147z;
        if (function1 != null) {
            return function1.hashCode();
        }
        return 0;
    }
}
