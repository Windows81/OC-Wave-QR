package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class PersistentOrderedMap<K, V> extends AbstractMap<K, V> implements PersistentMap<K, V> {
    public static final Companion F = new Companion((DefaultConstructorMarker) null);
    public static final int G = 8;
    public static final PersistentOrderedMap H;
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
        EndOfChain endOfChain = EndOfChain.f15121a;
        H = new PersistentOrderedMap(endOfChain, endOfChain, PersistentHashMap.E.a());
    }

    public PersistentOrderedMap(Object obj, Object obj2, PersistentHashMap persistentHashMap) {
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

    public PersistentMap.Builder l() {
        return new PersistentOrderedMapBuilder(this);
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

    public final Object r() {
        return this.D;
    }

    /* renamed from: s */
    public ImmutableCollection h() {
        return new PersistentOrderedMapValues(this);
    }
}
