package kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.PersistentMap;
import kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap;
import kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder;
import kotlinx.collections.immutable.internal.DeltaCounter;
import kotlinx.collections.immutable.internal.MapImplementation;
import kotlinx.collections.immutable.internal.MutabilityOwnership;

@Metadata
public final class PersistentHashMapBuilder<K, V> extends AbstractMutableMap<K, V> implements PersistentMap.Builder<K, V> {

    /* renamed from: A  reason: collision with root package name */
    public MutabilityOwnership f41269A;

    /* renamed from: B  reason: collision with root package name */
    public TrieNode f41270B;
    public Object C;
    public int D;
    public int E;

    /* renamed from: z  reason: collision with root package name */
    public PersistentHashMap f41271z;

    public Set a() {
        return new PersistentHashMapBuilderEntries(this);
    }

    public Set b() {
        return new PersistentHashMapBuilderKeys(this);
    }

    public int c() {
        return this.E;
    }

    public void clear() {
        TrieNode a2 = TrieNode.f41283e.a();
        Intrinsics.g(a2, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f41270B = a2;
        m(0);
    }

    public boolean containsKey(Object obj) {
        return this.f41270B.g(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    public Collection e() {
        return new PersistentHashMapBuilderValues(this);
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
        return map instanceof PersistentHashMap ? this.f41270B.k(((PersistentHashMap) obj).q(), PersistentHashMapBuilder$equals$1.f41272z) : map instanceof PersistentHashMapBuilder ? this.f41270B.k(((PersistentHashMapBuilder) obj).f41270B, PersistentHashMapBuilder$equals$2.f41273z) : map instanceof PersistentOrderedMap ? this.f41270B.k(((PersistentOrderedMap) obj).p().q(), PersistentHashMapBuilder$equals$3.f41274z) : map instanceof PersistentOrderedMapBuilder ? this.f41270B.k(((PersistentOrderedMapBuilder) obj).g().f41270B, PersistentHashMapBuilder$equals$4.f41275z) : MapImplementation.f41358a.b(this, map);
    }

    public PersistentHashMap f() {
        PersistentHashMap persistentHashMap;
        if (this.f41270B == this.f41271z.q()) {
            persistentHashMap = this.f41271z;
        } else {
            this.f41269A = new MutabilityOwnership();
            persistentHashMap = new PersistentHashMap(this.f41270B, size());
        }
        this.f41271z = persistentHashMap;
        return persistentHashMap;
    }

    public final int g() {
        return this.D;
    }

    public Object get(Object obj) {
        return this.f41270B.l(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    public final TrieNode h() {
        return this.f41270B;
    }

    public int hashCode() {
        return MapImplementation.f41358a.c(this);
    }

    public final MutabilityOwnership i() {
        return this.f41269A;
    }

    public final void j(int i2) {
        this.D = i2;
    }

    public final void k(Object obj) {
        this.C = obj;
    }

    public void m(int i2) {
        this.E = i2;
        this.D++;
    }

    public Object put(Object obj, Object obj2) {
        this.C = null;
        this.f41270B = this.f41270B.y(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.C;
    }

    public void putAll(Map map) {
        Intrinsics.i(map, "from");
        PersistentHashMap persistentHashMap = map instanceof PersistentHashMap ? (PersistentHashMap) map : null;
        if (persistentHashMap == null) {
            PersistentHashMapBuilder persistentHashMapBuilder = map instanceof PersistentHashMapBuilder ? (PersistentHashMapBuilder) map : null;
            persistentHashMap = persistentHashMapBuilder != null ? persistentHashMapBuilder.f() : null;
        }
        if (persistentHashMap != null) {
            DeltaCounter deltaCounter = new DeltaCounter(0, 1, (DefaultConstructorMarker) null);
            int size = size();
            TrieNode trieNode = this.f41270B;
            TrieNode q2 = persistentHashMap.q();
            Intrinsics.g(q2, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
            this.f41270B = trieNode.z(q2, 0, deltaCounter, this);
            int size2 = (persistentHashMap.size() + size) - deltaCounter.a();
            if (size != size2) {
                m(size2);
                return;
            }
            return;
        }
        super.putAll(map);
    }

    public Object remove(Object obj) {
        this.C = null;
        TrieNode B2 = this.f41270B.B(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (B2 == null) {
            B2 = TrieNode.f41283e.a();
            Intrinsics.g(B2, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.f41270B = B2;
        return this.C;
    }

    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        TrieNode C2 = this.f41270B.C(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (C2 == null) {
            C2 = TrieNode.f41283e.a();
            Intrinsics.g(C2, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.f41270B = C2;
        if (size != size()) {
            return true;
        }
        return false;
    }
}
