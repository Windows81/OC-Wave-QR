package kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableCollection;
import kotlinx.collections.immutable.ImmutableSet;
import kotlinx.collections.immutable.PersistentMap;
import kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap;
import kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder;

@Metadata
public final class PersistentHashMap<K, V> extends AbstractMap<K, V> implements PersistentMap<K, V> {
    public static final Companion E = new Companion((DefaultConstructorMarker) null);
    public static final PersistentHashMap F = new PersistentHashMap(TrieNode.f41283e.a(), 0);
    public final TrieNode C;
    public final int D;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PersistentHashMap a() {
            PersistentHashMap n2 = PersistentHashMap.F;
            Intrinsics.g(n2, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            return n2;
        }

        public Companion() {
        }
    }

    public PersistentHashMap(TrieNode trieNode, int i2) {
        Intrinsics.i(trieNode, "node");
        this.C = trieNode;
        this.D = i2;
    }

    public boolean containsKey(Object obj) {
        return this.C.g(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    public final Set e() {
        return o();
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
        return map instanceof PersistentOrderedMap ? this.C.k(((PersistentOrderedMap) obj).p().C, PersistentHashMap$equals$1.f41262z) : map instanceof PersistentOrderedMapBuilder ? this.C.k(((PersistentOrderedMapBuilder) obj).g().h(), PersistentHashMap$equals$2.f41263z) : map instanceof PersistentHashMap ? this.C.k(((PersistentHashMap) obj).C, PersistentHashMap$equals$3.f41264z) : map instanceof PersistentHashMapBuilder ? this.C.k(((PersistentHashMapBuilder) obj).h(), PersistentHashMap$equals$4.f41265z) : super.equals(obj);
    }

    public int g() {
        return this.D;
    }

    public Object get(Object obj) {
        return this.C.l(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public final ImmutableSet o() {
        return new PersistentHashMapEntries(this);
    }

    /* renamed from: p */
    public ImmutableSet f() {
        return new PersistentHashMapKeys(this);
    }

    public final TrieNode q() {
        return this.C;
    }

    /* renamed from: r */
    public ImmutableCollection h() {
        return new PersistentHashMapValues(this);
    }
}
