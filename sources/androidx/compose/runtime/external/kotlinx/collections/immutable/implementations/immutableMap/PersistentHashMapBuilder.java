package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public class PersistentHashMapBuilder<K, V> extends AbstractMutableMap<K, V> implements PersistentMap.Builder<K, V> {

    /* renamed from: A  reason: collision with root package name */
    public MutabilityOwnership f15046A = new MutabilityOwnership();

    /* renamed from: B  reason: collision with root package name */
    public TrieNode f15047B = this.f15048z.r();
    public Object C;
    public int D;
    public int E = this.f15048z.size();

    /* renamed from: z  reason: collision with root package name */
    public PersistentHashMap f15048z;

    public PersistentHashMapBuilder(PersistentHashMap persistentHashMap) {
        this.f15048z = persistentHashMap;
    }

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
        TrieNode a2 = TrieNode.f15056e.a();
        Intrinsics.g(a2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f15047B = a2;
        n(0);
    }

    public boolean containsKey(Object obj) {
        return this.f15047B.k(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    public Collection e() {
        return new PersistentHashMapBuilderValues(this);
    }

    /* renamed from: f */
    public PersistentHashMap d() {
        PersistentHashMap persistentHashMap;
        if (this.f15047B == this.f15048z.r()) {
            persistentHashMap = this.f15048z;
        } else {
            this.f15046A = new MutabilityOwnership();
            persistentHashMap = new PersistentHashMap(this.f15047B, size());
        }
        this.f15048z = persistentHashMap;
        return persistentHashMap;
    }

    public final int g() {
        return this.D;
    }

    public Object get(Object obj) {
        return this.f15047B.o(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    public final TrieNode h() {
        return this.f15047B;
    }

    public final MutabilityOwnership i() {
        return this.f15046A;
    }

    public final void j(int i2) {
        this.D = i2;
    }

    public final void k(Object obj) {
        this.C = obj;
    }

    public final void m(MutabilityOwnership mutabilityOwnership) {
        this.f15046A = mutabilityOwnership;
    }

    public void n(int i2) {
        this.E = i2;
        this.D++;
    }

    public Object put(Object obj, Object obj2) {
        this.C = null;
        this.f15047B = this.f15047B.D(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.C;
    }

    public void putAll(Map map) {
        PersistentHashMap persistentHashMap = map instanceof PersistentHashMap ? (PersistentHashMap) map : null;
        if (persistentHashMap == null) {
            PersistentHashMapBuilder persistentHashMapBuilder = map instanceof PersistentHashMapBuilder ? (PersistentHashMapBuilder) map : null;
            persistentHashMap = persistentHashMapBuilder != null ? persistentHashMapBuilder.d() : null;
        }
        if (persistentHashMap != null) {
            DeltaCounter deltaCounter = new DeltaCounter(0, 1, (DefaultConstructorMarker) null);
            int size = size();
            TrieNode trieNode = this.f15047B;
            TrieNode r2 = persistentHashMap.r();
            Intrinsics.g(r2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
            this.f15047B = trieNode.E(r2, 0, deltaCounter, this);
            int size2 = (persistentHashMap.size() + size) - deltaCounter.a();
            if (size != size2) {
                n(size2);
                return;
            }
            return;
        }
        super.putAll(map);
    }

    public Object remove(Object obj) {
        this.C = null;
        TrieNode G = this.f15047B.G(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (G == null) {
            G = TrieNode.f15056e.a();
            Intrinsics.g(G, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.f15047B = G;
        return this.C;
    }

    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        TrieNode H = this.f15047B.H(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (H == null) {
            H = TrieNode.f15056e.a();
            Intrinsics.g(H, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.f15047B = H;
        if (size != size()) {
            return true;
        }
        return false;
    }
}
