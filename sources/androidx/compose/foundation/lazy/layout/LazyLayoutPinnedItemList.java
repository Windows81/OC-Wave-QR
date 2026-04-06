package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class LazyLayoutPinnedItemList implements List<PinnedItem>, KMappedMarker {

    /* renamed from: z  reason: collision with root package name */
    public final List f4907z;

    @Metadata
    public interface PinnedItem {
        int getIndex();

        Object getKey();
    }

    public LazyLayoutPinnedItemList(List list) {
        this.f4907z = list;
    }

    public /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i2, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof PinnedItem)) {
            return false;
        }
        return e((PinnedItem) obj);
    }

    public boolean containsAll(Collection collection) {
        return this.f4907z.containsAll(collection);
    }

    public boolean e(PinnedItem pinnedItem) {
        return this.f4907z.contains(pinnedItem);
    }

    /* renamed from: g */
    public PinnedItem get(int i2) {
        return (PinnedItem) this.f4907z.get(i2);
    }

    public int h() {
        return this.f4907z.size();
    }

    public int i(PinnedItem pinnedItem) {
        return this.f4907z.indexOf(pinnedItem);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof PinnedItem)) {
            return -1;
        }
        return i((PinnedItem) obj);
    }

    public boolean isEmpty() {
        return this.f4907z.isEmpty();
    }

    public Iterator iterator() {
        return this.f4907z.iterator();
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof PinnedItem)) {
            return -1;
        }
        return m((PinnedItem) obj);
    }

    public ListIterator listIterator() {
        return this.f4907z.listIterator();
    }

    public int m(PinnedItem pinnedItem) {
        return this.f4907z.lastIndexOf(pinnedItem);
    }

    public final void n(PinnedItem pinnedItem) {
        this.f4907z.add(pinnedItem);
    }

    public final void o(PinnedItem pinnedItem) {
        this.f4907z.remove(pinnedItem);
    }

    public /* bridge */ /* synthetic */ Object remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return h();
    }

    public void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List subList(int i2, int i3) {
        return this.f4907z.subList(i2, i3);
    }

    public Object[] toArray() {
        return CollectionToArray.a(this);
    }

    public LazyLayoutPinnedItemList() {
        this(new SnapshotStateList());
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public ListIterator listIterator(int i2) {
        return this.f4907z.listIterator(i2);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object[] toArray(Object[] objArr) {
        return CollectionToArray.b(this, objArr);
    }
}
