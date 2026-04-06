package androidx.compose.runtime.internal;

import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.CompositionLocalMapKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.ValueHolder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PersistentCompositionLocalHashMap extends PersistentHashMap<CompositionLocal<Object>, ValueHolder<Object>> implements PersistentCompositionLocalMap {
    public static final Companion H = new Companion((DefaultConstructorMarker) null);
    public static final int I = 8;
    public static final PersistentCompositionLocalHashMap J;

    @Metadata
    public static final class Builder extends PersistentHashMapBuilder<CompositionLocal<Object>, ValueHolder<Object>> implements PersistentCompositionLocalMap.Builder {
        public PersistentCompositionLocalHashMap F;

        public Builder(PersistentCompositionLocalHashMap persistentCompositionLocalHashMap) {
            super(persistentCompositionLocalHashMap);
            this.F = persistentCompositionLocalHashMap;
        }

        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof CompositionLocal)) {
                return false;
            }
            return p((CompositionLocal) obj);
        }

        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof ValueHolder)) {
                return false;
            }
            return q((ValueHolder) obj);
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (!(obj instanceof CompositionLocal)) {
                return null;
            }
            return r((CompositionLocal) obj);
        }

        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof CompositionLocal) ? obj2 : s((CompositionLocal) obj, (ValueHolder) obj2);
        }

        /* renamed from: o */
        public PersistentCompositionLocalHashMap f() {
            PersistentCompositionLocalHashMap persistentCompositionLocalHashMap;
            if (h() == this.F.r()) {
                persistentCompositionLocalHashMap = this.F;
            } else {
                m(new MutabilityOwnership());
                persistentCompositionLocalHashMap = new PersistentCompositionLocalHashMap(h(), size());
            }
            this.F = persistentCompositionLocalHashMap;
            return persistentCompositionLocalHashMap;
        }

        public /* bridge */ boolean p(CompositionLocal compositionLocal) {
            return super.containsKey(compositionLocal);
        }

        public /* bridge */ boolean q(ValueHolder valueHolder) {
            return super.containsValue(valueHolder);
        }

        public /* bridge */ ValueHolder r(CompositionLocal compositionLocal) {
            return (ValueHolder) super.get(compositionLocal);
        }

        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (!(obj instanceof CompositionLocal)) {
                return null;
            }
            return t((CompositionLocal) obj);
        }

        public /* bridge */ ValueHolder s(CompositionLocal compositionLocal, ValueHolder valueHolder) {
            return (ValueHolder) super.getOrDefault(compositionLocal, valueHolder);
        }

        public /* bridge */ ValueHolder t(CompositionLocal compositionLocal) {
            return (ValueHolder) super.remove(compositionLocal);
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PersistentCompositionLocalHashMap a() {
            return PersistentCompositionLocalHashMap.J;
        }

        public Companion() {
        }
    }

    static {
        TrieNode a2 = TrieNode.f15056e.a();
        Intrinsics.g(a2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.ValueHolder<kotlin.Any?>>");
        J = new PersistentCompositionLocalHashMap(a2, 0);
    }

    public PersistentCompositionLocalHashMap(TrieNode trieNode, int i2) {
        super(trieNode, i2);
    }

    public /* bridge */ ValueHolder A(CompositionLocal compositionLocal, ValueHolder valueHolder) {
        return (ValueHolder) super.getOrDefault(compositionLocal, valueHolder);
    }

    public PersistentCompositionLocalMap X(CompositionLocal compositionLocal, ValueHolder valueHolder) {
        TrieNode.ModificationResult P = r().P(compositionLocal.hashCode(), compositionLocal, valueHolder, 0);
        return P == null ? this : new PersistentCompositionLocalHashMap(P.a(), size() + P.b());
    }

    public Object a(CompositionLocal compositionLocal) {
        return CompositionLocalMapKt.b(this, compositionLocal);
    }

    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof CompositionLocal)) {
            return false;
        }
        return x((CompositionLocal) obj);
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof ValueHolder)) {
            return false;
        }
        return y((ValueHolder) obj);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof CompositionLocal)) {
            return null;
        }
        return z((CompositionLocal) obj);
    }

    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof CompositionLocal) ? obj2 : A((CompositionLocal) obj, (ValueHolder) obj2);
    }

    /* renamed from: w */
    public Builder o() {
        return new Builder(this);
    }

    public /* bridge */ boolean x(CompositionLocal compositionLocal) {
        return super.containsKey(compositionLocal);
    }

    public /* bridge */ boolean y(ValueHolder valueHolder) {
        return super.containsValue(valueHolder);
    }

    public /* bridge */ ValueHolder z(CompositionLocal compositionLocal) {
        return (ValueHolder) super.get(compositionLocal);
    }
}
