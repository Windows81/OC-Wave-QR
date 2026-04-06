package androidx.compose.ui.modifier;

import androidx.compose.runtime.snapshots.SnapshotStateMap;
import kotlin.Metadata;

@Metadata
public final class MultiLocalMap extends ModifierLocalMap {

    /* renamed from: a  reason: collision with root package name */
    public final SnapshotStateMap f17196a;

    public boolean a(ModifierLocal modifierLocal) {
        return this.f17196a.containsKey(modifierLocal);
    }

    public Object b(ModifierLocal modifierLocal) {
        Object obj = this.f17196a.get(modifierLocal);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public void c(ModifierLocal modifierLocal, Object obj) {
        this.f17196a.put(modifierLocal, obj);
    }
}
