package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public class PersistentHashMap<K, V> extends AbstractMap<K, V> implements PersistentMap<K, V> {
    public static final Companion E = new Companion((DefaultConstructorMarker) null);
    public static final int F = 8;
    public static final PersistentHashMap G = new PersistentHashMap(TrieNode.f15056e.a(), 0);
    public final TrieNode C;
    public final int D;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PersistentHashMap a() {
            PersistentHashMap n2 = PersistentHashMap.G;
            Intrinsics.g(n2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            return n2;
        }

        public Companion() {
        }
    }

    public PersistentHashMap(TrieNode trieNode, int i2) {
        this.C = trieNode;
        this.D = i2;
    }

    public boolean containsKey(Object obj) {
        return this.C.k(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    public final Set e() {
        return p();
    }

    public int g() {
        return this.D;
    }

    public Object get(Object obj) {
        return this.C.o(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    /* renamed from: o */
    public PersistentHashMapBuilder l() {
        return new PersistentHashMapBuilder(this);
    }

    public final ImmutableSet p() {
        return new PersistentHashMapEntries(this);
    }

    /* renamed from: q */
    public ImmutableSet f() {
        return new PersistentHashMapKeys(this);
    }

    public final TrieNode r() {
        return this.C;
    }

    /* renamed from: s */
    public ImmutableCollection h() {
        return new PersistentHashMapValues(this);
    }

    public PersistentHashMap t(Object obj, Object obj2) {
        TrieNode.ModificationResult P = this.C.P(obj != null ? obj.hashCode() : 0, obj, obj2, 0);
        return P == null ? this : new PersistentHashMap(P.a(), size() + P.b());
    }

    public PersistentHashMap u(Object obj) {
        TrieNode Q = this.C.Q(obj != null ? obj.hashCode() : 0, obj, 0);
        return this.C == Q ? this : Q == null ? E.a() : new PersistentHashMap(Q, size() - 1);
    }
}
