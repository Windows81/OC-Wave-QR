package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableCollection;
import kotlinx.collections.immutable.ImmutableSet;
import kotlinx.collections.immutable.PersistentMap;
import kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import kotlinx.collections.immutable.internal.EndOfChain;

@Metadata
public final class PersistentOrderedMap<K, V> extends AbstractMap<K, V> implements PersistentMap<K, V> {
    public static final Companion F = new Companion((DefaultConstructorMarker) null);
    public static final PersistentOrderedMap G;
    public final Object C;
    public final Object D;
    public final PersistentHashMap E;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    static {
        EndOfChain endOfChain = EndOfChain.f41356a;
        G = new PersistentOrderedMap(endOfChain, endOfChain, PersistentHashMap.E.a());
    }

    public PersistentOrderedMap(Object obj, Object obj2, PersistentHashMap persistentHashMap) {
        Intrinsics.i(persistentHashMap, "hashMap");
        this.C = obj;
        this.D = obj2;
        this.E = persistentHashMap;
    }

    private final ImmutableSet n() {
        return new PersistentOrderedMapEntries(this);
    }

    public boolean containsKey(Object obj) {
        return this.E.containsKey(obj);
    }

    public final Set e() {
        return n();
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
        return map instanceof PersistentOrderedMap ? this.E.q().k(((PersistentOrderedMap) obj).E.q(), PersistentOrderedMap$equals$1.f41312z) : map instanceof PersistentOrderedMapBuilder ? this.E.q().k(((PersistentOrderedMapBuilder) obj).g().h(), PersistentOrderedMap$equals$2.f41313z) : map instanceof PersistentHashMap ? this.E.q().k(((PersistentHashMap) obj).q(), PersistentOrderedMap$equals$3.f41314z) : map instanceof PersistentHashMapBuilder ? this.E.q().k(((PersistentHashMapBuilder) obj).h(), PersistentOrderedMap$equals$4.f41315z) : super.equals(obj);
    }

    public int g() {
        return this.E.size();
    }

    public Object get(Object obj) {
        LinkedValue linkedValue = (LinkedValue) this.E.get(obj);
        if (linkedValue != null) {
            return linkedValue.e();
        }
        return null;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public final Object o() {
        return this.C;
    }

    public final PersistentHashMap p() {
        return this.E;
    }

    /* renamed from: q */
    public ImmutableSet f() {
        return new PersistentOrderedMapKeys(this);
    }

    /* renamed from: r */
    public ImmutableCollection h() {
        return new PersistentOrderedMapValues(this);
    }
}
