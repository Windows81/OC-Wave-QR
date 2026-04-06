package androidx.compose.ui.text.intl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class LocaleList implements Collection<Locale>, KMappedMarker {

    /* renamed from: B  reason: collision with root package name */
    public static final Companion f18941B = new Companion((DefaultConstructorMarker) null);
    public static final LocaleList C = new LocaleList(CollectionsKt.m());

    /* renamed from: A  reason: collision with root package name */
    public final int f18942A;

    /* renamed from: z  reason: collision with root package name */
    public final List f18943z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LocaleList a() {
            return PlatformLocaleKt.a().b();
        }

        public final LocaleList b() {
            return LocaleList.C;
        }

        public Companion() {
        }
    }

    public LocaleList(List list) {
        this.f18943z = list;
        this.f18942A = list.size();
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Locale)) {
            return false;
        }
        return g((Locale) obj);
    }

    public boolean containsAll(Collection collection) {
        return this.f18943z.containsAll(collection);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocaleList) && Intrinsics.d(this.f18943z, ((LocaleList) obj).f18943z);
    }

    public boolean g(Locale locale) {
        return this.f18943z.contains(locale);
    }

    public final Locale h(int i2) {
        return (Locale) this.f18943z.get(i2);
    }

    public int hashCode() {
        return this.f18943z.hashCode();
    }

    public final List i() {
        return this.f18943z;
    }

    public boolean isEmpty() {
        return this.f18943z.isEmpty();
    }

    public Iterator iterator() {
        return this.f18943z.iterator();
    }

    public int m() {
        return this.f18942A;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return m();
    }

    public Object[] toArray() {
        return CollectionToArray.a(this);
    }

    public String toString() {
        return "LocaleList(localeList=" + this.f18943z + ')';
    }

    public Object[] toArray(Object[] objArr) {
        return CollectionToArray.b(this, objArr);
    }
}
