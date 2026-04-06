package androidx.compose.ui.modifier;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class SingleLocalMap extends ModifierLocalMap {

    /* renamed from: a  reason: collision with root package name */
    public final ModifierLocal f17197a;

    /* renamed from: b  reason: collision with root package name */
    public final MutableState f17198b = SnapshotStateKt__SnapshotStateKt.e((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);

    public SingleLocalMap(ModifierLocal modifierLocal) {
        super((DefaultConstructorMarker) null);
        this.f17197a = modifierLocal;
    }

    public boolean a(ModifierLocal modifierLocal) {
        return modifierLocal == this.f17197a;
    }

    public Object b(ModifierLocal modifierLocal) {
        if (!(modifierLocal == this.f17197a)) {
            InlineClassHelperKt.c("Check failed.");
        }
        Object d2 = d();
        if (d2 == null) {
            return null;
        }
        return d2;
    }

    public void c(ModifierLocal modifierLocal, Object obj) {
        if (!(modifierLocal == this.f17197a)) {
            InlineClassHelperKt.c("Check failed.");
        }
        e(obj);
    }

    public final Object d() {
        return this.f17198b.getValue();
    }

    public final void e(Object obj) {
        this.f17198b.setValue(obj);
    }
}
