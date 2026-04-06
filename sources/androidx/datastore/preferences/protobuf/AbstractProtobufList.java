package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

abstract class AbstractProtobufList<E> extends AbstractList<E> implements Internal.ProtobufList<E> {

    /* renamed from: z  reason: collision with root package name */
    public boolean f20718z;

    public AbstractProtobufList() {
        this(true);
    }

    public boolean I() {
        return this.f20718z;
    }

    public boolean add(Object obj) {
        e();
        return super.add(obj);
    }

    public boolean addAll(Collection collection) {
        e();
        return super.addAll(collection);
    }

    public void clear() {
        e();
        super.clear();
    }

    public void e() {
        if (!this.f20718z) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i2 = 0; i2 < size; i2++) {
            if (!get(i2).equals(list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i2 = 1;
        for (int i3 = 0; i3 < size; i3++) {
            i2 = (i2 * 31) + get(i3).hashCode();
        }
        return i2;
    }

    public final void r() {
        if (this.f20718z) {
            this.f20718z = false;
        }
    }

    public Object remove(int i2) {
        e();
        return super.remove(i2);
    }

    public boolean removeAll(Collection collection) {
        e();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        e();
        return super.retainAll(collection);
    }

    public Object set(int i2, Object obj) {
        e();
        return super.set(i2, obj);
    }

    public AbstractProtobufList(boolean z2) {
        this.f20718z = z2;
    }

    public void add(int i2, Object obj) {
        e();
        super.add(i2, obj);
    }

    public boolean addAll(int i2, Collection collection) {
        e();
        return super.addAll(i2, collection);
    }

    public boolean remove(Object obj) {
        e();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }
}
