package dagger.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class SetFactory<T> implements Factory<Set<T>> {

    /* renamed from: c  reason: collision with root package name */
    public static final Factory f39776c = InstanceFactory.a(Collections.emptySet());

    /* renamed from: a  reason: collision with root package name */
    public final List f39777a;

    /* renamed from: b  reason: collision with root package name */
    public final List f39778b;

    public static final class Builder<T> {
    }

    /* renamed from: a */
    public Set get() {
        int size = this.f39777a.size();
        ArrayList arrayList = new ArrayList(this.f39778b.size());
        int size2 = this.f39778b.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Collection collection = (Collection) ((Provider) this.f39778b.get(i2)).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet b2 = DaggerCollections.b(size);
        int size3 = this.f39777a.size();
        for (int i3 = 0; i3 < size3; i3++) {
            b2.add(Preconditions.b(((Provider) this.f39777a.get(i3)).get()));
        }
        int size4 = arrayList.size();
        for (int i4 = 0; i4 < size4; i4++) {
            for (Object b3 : (Collection) arrayList.get(i4)) {
                b2.add(Preconditions.b(b3));
            }
        }
        return Collections.unmodifiableSet(b2);
    }
}
