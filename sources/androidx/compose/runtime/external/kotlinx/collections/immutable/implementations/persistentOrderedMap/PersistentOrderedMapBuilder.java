package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableMap;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PersistentOrderedMapBuilder<K, V> extends AbstractMutableMap<K, V> implements PersistentMap.Builder<K, V> {

    /* renamed from: A  reason: collision with root package name */
    public Object f15089A;

    /* renamed from: B  reason: collision with root package name */
    public Object f15090B = this.f15091z.r();
    public final PersistentHashMapBuilder C = this.f15091z.p().l();

    /* renamed from: z  reason: collision with root package name */
    public PersistentOrderedMap f15091z;

    public PersistentOrderedMapBuilder(PersistentOrderedMap persistentOrderedMap) {
        this.f15091z = persistentOrderedMap;
        this.f15089A = persistentOrderedMap.o();
    }

    public Set a() {
        return new PersistentOrderedMapBuilderEntries(this);
    }

    public Set b() {
        return new PersistentOrderedMapBuilderKeys(this);
    }

    public int c() {
        return this.C.size();
    }

    public void clear() {
        this.C.clear();
        EndOfChain endOfChain = EndOfChain.f15121a;
        this.f15089A = endOfChain;
        this.f15090B = endOfChain;
    }

    public boolean containsKey(Object obj) {
        return this.C.containsKey(obj);
    }

    public PersistentMap d() {
        PersistentOrderedMap persistentOrderedMap;
        PersistentHashMap f2 = this.C.d();
        if (f2 == this.f15091z.p()) {
            boolean z2 = false;
            CommonFunctionsKt.a(this.f15089A == this.f15091z.o());
            if (this.f15090B == this.f15091z.r()) {
                z2 = true;
            }
            CommonFunctionsKt.a(z2);
            persistentOrderedMap = this.f15091z;
        } else {
            persistentOrderedMap = new PersistentOrderedMap(this.f15089A, this.f15090B, f2);
        }
        this.f15091z = persistentOrderedMap;
        return persistentOrderedMap;
    }

    public Collection e() {
        return new PersistentOrderedMapBuilderValues(this);
    }

    public final Object f() {
        return this.f15089A;
    }

    public final PersistentHashMapBuilder g() {
        return this.C;
    }

    public Object get(Object obj) {
        LinkedValue linkedValue = (LinkedValue) this.C.get(obj);
        if (linkedValue != null) {
            return linkedValue.e();
        }
        return null;
    }

    public Object put(Object obj, Object obj2) {
        LinkedValue linkedValue = (LinkedValue) this.C.get(obj);
        if (linkedValue != null) {
            if (linkedValue.e() == obj2) {
                return obj2;
            }
            this.C.put(obj, linkedValue.h(obj2));
            return linkedValue.e();
        } else if (isEmpty()) {
            this.f15089A = obj;
            this.f15090B = obj;
            this.C.put(obj, new LinkedValue(obj2));
            return null;
        } else {
            Object obj3 = this.f15090B;
            Object obj4 = this.C.get(obj3);
            Intrinsics.f(obj4);
            LinkedValue linkedValue2 = (LinkedValue) obj4;
            CommonFunctionsKt.a(!linkedValue2.a());
            this.C.put(obj3, linkedValue2.f(obj));
            this.C.put(obj, new LinkedValue(obj2, obj3));
            this.f15090B = obj;
            return null;
        }
    }

    public Object remove(Object obj) {
        LinkedValue linkedValue = (LinkedValue) this.C.remove(obj);
        if (linkedValue == null) {
            return null;
        }
        if (linkedValue.b()) {
            Object obj2 = this.C.get(linkedValue.d());
            Intrinsics.f(obj2);
            this.C.put(linkedValue.d(), ((LinkedValue) obj2).f(linkedValue.c()));
        } else {
            this.f15089A = linkedValue.c();
        }
        if (linkedValue.a()) {
            Object obj3 = this.C.get(linkedValue.c());
            Intrinsics.f(obj3);
            this.C.put(linkedValue.c(), ((LinkedValue) obj3).g(linkedValue.d()));
        } else {
            this.f15090B = linkedValue.d();
        }
        return linkedValue.e();
    }

    public final boolean remove(Object obj, Object obj2) {
        LinkedValue linkedValue = (LinkedValue) this.C.get(obj);
        if (linkedValue == null || !Intrinsics.d(linkedValue.e(), obj2)) {
            return false;
        }
        remove(obj);
        return true;
    }
}
