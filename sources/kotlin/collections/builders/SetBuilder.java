package kotlin.collections.builders;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableSet;

@Metadata
public final class SetBuilder<E> extends AbstractMutableSet<E> implements Set<E>, Serializable, KMutableSet {

    /* renamed from: A  reason: collision with root package name */
    public static final Companion f40676A = new Companion((DefaultConstructorMarker) null);

    /* renamed from: B  reason: collision with root package name */
    public static final SetBuilder f40677B = new SetBuilder(MapBuilder.M.e());

    /* renamed from: z  reason: collision with root package name */
    public final MapBuilder f40678z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public SetBuilder(MapBuilder mapBuilder) {
        Intrinsics.i(mapBuilder, "backing");
        this.f40678z = mapBuilder;
    }

    public boolean add(Object obj) {
        return this.f40678z.j(obj) >= 0;
    }

    public boolean addAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        this.f40678z.n();
        return super.addAll(collection);
    }

    public void clear() {
        this.f40678z.clear();
    }

    public boolean contains(Object obj) {
        return this.f40678z.containsKey(obj);
    }

    public int e() {
        return this.f40678z.size();
    }

    public final Set g() {
        this.f40678z.m();
        return size() > 0 ? this : f40677B;
    }

    public boolean isEmpty() {
        return this.f40678z.isEmpty();
    }

    public Iterator iterator() {
        return this.f40678z.E();
    }

    public boolean remove(Object obj) {
        return this.f40678z.P(obj);
    }

    public boolean removeAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        this.f40678z.n();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        this.f40678z.n();
        return super.retainAll(collection);
    }

    public SetBuilder(int i2) {
        this(new MapBuilder(i2));
    }
}
