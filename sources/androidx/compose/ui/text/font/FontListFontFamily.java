package androidx.compose.ui.text.font;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class FontListFontFamily extends FileBasedFontFamily implements List<Font>, KMappedMarker {
    public final List G;

    public FontListFontFamily(List list) {
        super((DefaultConstructorMarker) null);
        this.G = list;
        if (list.isEmpty()) {
            InlineClassHelperKt.c("At least one font should be passed to FontFamily");
        }
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
        if (!(obj instanceof Font)) {
            return false;
        }
        return n((Font) obj);
    }

    public boolean containsAll(Collection collection) {
        return this.G.containsAll(collection);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FontListFontFamily) && Intrinsics.d(this.G, ((FontListFontFamily) obj).G);
    }

    public int hashCode() {
        return this.G.hashCode();
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Font)) {
            return -1;
        }
        return s((Font) obj);
    }

    public boolean isEmpty() {
        return this.G.isEmpty();
    }

    public Iterator iterator() {
        return this.G.iterator();
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Font)) {
            return -1;
        }
        return u((Font) obj);
    }

    public ListIterator listIterator() {
        return this.G.listIterator();
    }

    public boolean n(Font font) {
        return this.G.contains(font);
    }

    /* renamed from: o */
    public Font get(int i2) {
        return (Font) this.G.get(i2);
    }

    public final List p() {
        return this.G;
    }

    public int q() {
        return this.G.size();
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

    public int s(Font font) {
        return this.G.indexOf(font);
    }

    public /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return q();
    }

    public void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List subList(int i2, int i3) {
        return this.G.subList(i2, i3);
    }

    public Object[] toArray() {
        return CollectionToArray.a(this);
    }

    public String toString() {
        return "FontListFontFamily(fonts=" + this.G + ')';
    }

    public int u(Font font) {
        return this.G.lastIndexOf(font);
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public ListIterator listIterator(int i2) {
        return this.G.listIterator(i2);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object[] toArray(Object[] objArr) {
        return CollectionToArray.b(this, objArr);
    }
}
