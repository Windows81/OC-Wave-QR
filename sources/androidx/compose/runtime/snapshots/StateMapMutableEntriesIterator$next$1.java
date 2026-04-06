package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;

@Metadata
public final class StateMapMutableEntriesIterator$next$1 implements Map.Entry<K, V>, KMutableMap.Entry {

    /* renamed from: A  reason: collision with root package name */
    public Object f15336A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ StateMapMutableEntriesIterator f15337B;

    /* renamed from: z  reason: collision with root package name */
    public final Object f15338z;

    public StateMapMutableEntriesIterator$next$1(StateMapMutableEntriesIterator stateMapMutableEntriesIterator) {
        this.f15337B = stateMapMutableEntriesIterator;
        Map.Entry f2 = stateMapMutableEntriesIterator.f();
        Intrinsics.f(f2);
        this.f15338z = f2.getKey();
        Map.Entry f3 = stateMapMutableEntriesIterator.f();
        Intrinsics.f(f3);
        this.f15336A = f3.getValue();
    }

    public void a(Object obj) {
        this.f15336A = obj;
    }

    public Object getKey() {
        return this.f15338z;
    }

    public Object getValue() {
        return this.f15336A;
    }

    public Object setValue(Object obj) {
        StateMapMutableEntriesIterator stateMapMutableEntriesIterator = this.f15337B;
        if (stateMapMutableEntriesIterator.g().j() == stateMapMutableEntriesIterator.f15340B) {
            Object value = getValue();
            stateMapMutableEntriesIterator.g().put(getKey(), obj);
            a(obj);
            return value;
        }
        throw new ConcurrentModificationException();
    }
}
