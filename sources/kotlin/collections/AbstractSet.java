package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public abstract class AbstractSet<E> extends AbstractCollection<E> implements Set<E>, KMappedMarker {

    /* renamed from: z  reason: collision with root package name */
    public static final Companion f40577z = new Companion((DefaultConstructorMarker) null);

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(Set set, Set set2) {
            Intrinsics.i(set, "c");
            Intrinsics.i(set2, "other");
            if (set.size() != set2.size()) {
                return false;
            }
            return set.containsAll(set2);
        }

        public final int b(Collection collection) {
            Intrinsics.i(collection, "c");
            Iterator it = collection.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                i2 += next != null ? next.hashCode() : 0;
            }
            return i2;
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        return f40577z.a(this, (Set) obj);
    }

    public int hashCode() {
        return f40577z.b(this);
    }

    public Iterator iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
