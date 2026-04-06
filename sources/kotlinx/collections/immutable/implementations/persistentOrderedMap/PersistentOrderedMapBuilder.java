package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableMap;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.PersistentMap;
import kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import kotlinx.collections.immutable.internal.CommonFunctionsKt;
import kotlinx.collections.immutable.internal.EndOfChain;
import kotlinx.collections.immutable.internal.MapImplementation;

@Metadata
public final class PersistentOrderedMapBuilder<K, V> extends AbstractMutableMap<K, V> implements PersistentMap.Builder<K, V> {

    /* renamed from: A  reason: collision with root package name */
    public Object f41316A;

    /* renamed from: B  reason: collision with root package name */
    public final PersistentHashMapBuilder f41317B;

    /* renamed from: z  reason: collision with root package name */
    public Object f41318z;

    public Set a() {
        return new PersistentOrderedMapBuilderEntries(this);
    }

    public Set b() {
        return new PersistentOrderedMapBuilderKeys(this);
    }

    public int c() {
        return this.f41317B.size();
    }

    public void clear() {
        this.f41317B.clear();
        EndOfChain endOfChain = EndOfChain.f41356a;
        this.f41318z = endOfChain;
        this.f41316A = endOfChain;
    }

    public boolean containsKey(Object obj) {
        return this.f41317B.containsKey(obj);
    }

    public Collection e() {
        return new PersistentOrderedMapBuilderValues(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        return map instanceof PersistentOrderedMap ? this.f41317B.h().k(((PersistentOrderedMap) obj).p().q(), PersistentOrderedMapBuilder$equals$1.f41319z) : map instanceof PersistentOrderedMapBuilder ? this.f41317B.h().k(((PersistentOrderedMapBuilder) obj).f41317B.h(), PersistentOrderedMapBuilder$equals$2.f41320z) : map instanceof PersistentHashMap ? this.f41317B.h().k(((PersistentHashMap) obj).q(), PersistentOrderedMapBuilder$equals$3.f41321z) : map instanceof PersistentHashMapBuilder ? this.f41317B.h().k(((PersistentHashMapBuilder) obj).h(), PersistentOrderedMapBuilder$equals$4.f41322z) : MapImplementation.f41358a.b(this, map);
    }

    public final Object f() {
        return this.f41318z;
    }

    public final PersistentHashMapBuilder g() {
        return this.f41317B;
    }

    public Object get(Object obj) {
        LinkedValue linkedValue = (LinkedValue) this.f41317B.get(obj);
        if (linkedValue != null) {
            return linkedValue.e();
        }
        return null;
    }

    public int hashCode() {
        return MapImplementation.f41358a.c(this);
    }

    public Object put(Object obj, Object obj2) {
        LinkedValue linkedValue = (LinkedValue) this.f41317B.get(obj);
        if (linkedValue != null) {
            if (linkedValue.e() == obj2) {
                return obj2;
            }
            this.f41317B.put(obj, linkedValue.h(obj2));
            return linkedValue.e();
        } else if (isEmpty()) {
            this.f41318z = obj;
            this.f41316A = obj;
            this.f41317B.put(obj, new LinkedValue(obj2));
            return null;
        } else {
            Object obj3 = this.f41316A;
            Object obj4 = this.f41317B.get(obj3);
            Intrinsics.f(obj4);
            LinkedValue linkedValue2 = (LinkedValue) obj4;
            CommonFunctionsKt.a(!linkedValue2.a());
            this.f41317B.put(obj3, linkedValue2.f(obj));
            this.f41317B.put(obj, new LinkedValue(obj2, obj3));
            this.f41316A = obj;
            return null;
        }
    }

    public Object remove(Object obj) {
        LinkedValue linkedValue = (LinkedValue) this.f41317B.remove(obj);
        if (linkedValue == null) {
            return null;
        }
        if (linkedValue.b()) {
            Object obj2 = this.f41317B.get(linkedValue.d());
            Intrinsics.f(obj2);
            this.f41317B.put(linkedValue.d(), ((LinkedValue) obj2).f(linkedValue.c()));
        } else {
            this.f41318z = linkedValue.c();
        }
        if (linkedValue.a()) {
            Object obj3 = this.f41317B.get(linkedValue.c());
            Intrinsics.f(obj3);
            this.f41317B.put(linkedValue.c(), ((LinkedValue) obj3).g(linkedValue.d()));
        } else {
            this.f41316A = linkedValue.d();
        }
        return linkedValue.e();
    }

    public final boolean remove(Object obj, Object obj2) {
        LinkedValue linkedValue = (LinkedValue) this.f41317B.get(obj);
        if (linkedValue == null || !Intrinsics.d(linkedValue.e(), obj2)) {
            return false;
        }
        remove(obj);
        return true;
    }
}
