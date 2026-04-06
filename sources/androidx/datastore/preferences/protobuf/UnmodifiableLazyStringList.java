package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
public class UnmodifiableLazyStringList extends AbstractList<String> implements LazyStringList, RandomAccess {

    /* renamed from: z  reason: collision with root package name */
    public final LazyStringList f21177z;

    public Object G(int i2) {
        return this.f21177z.G(i2);
    }

    /* renamed from: g */
    public String get(int i2) {
        return (String) this.f21177z.get(i2);
    }

    public Iterator iterator() {
        return new Iterator<String>() {

            /* renamed from: z  reason: collision with root package name */
            public Iterator f21182z;

            {
                this.f21182z = UnmodifiableLazyStringList.this.f21177z.iterator();
            }

            /* renamed from: b */
            public String next() {
                return (String) this.f21182z.next();
            }

            public boolean hasNext() {
                return this.f21182z.hasNext();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public ListIterator listIterator(int i2) {
        return new ListIterator<String>(i2) {

            /* renamed from: A  reason: collision with root package name */
            public final /* synthetic */ int f21178A;

            /* renamed from: z  reason: collision with root package name */
            public ListIterator f21180z;

            {
                this.f21178A = r2;
                this.f21180z = UnmodifiableLazyStringList.this.f21177z.listIterator(r2);
            }

            /* renamed from: b */
            public void add(String str) {
                throw new UnsupportedOperationException();
            }

            /* renamed from: c */
            public String next() {
                return (String) this.f21180z.next();
            }

            /* renamed from: d */
            public String previous() {
                return (String) this.f21180z.previous();
            }

            /* renamed from: e */
            public void set(String str) {
                throw new UnsupportedOperationException();
            }

            public boolean hasNext() {
                return this.f21180z.hasNext();
            }

            public boolean hasPrevious() {
                return this.f21180z.hasPrevious();
            }

            public int nextIndex() {
                return this.f21180z.nextIndex();
            }

            public int previousIndex() {
                return this.f21180z.previousIndex();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public void s0(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    public int size() {
        return this.f21177z.size();
    }

    public List y() {
        return this.f21177z.y();
    }
}
