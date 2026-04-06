package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableIterator;

@Metadata
public abstract class IndexBasedArrayIterator<T> implements Iterator<T>, KMutableIterator {

    /* renamed from: A  reason: collision with root package name */
    public int f1767A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f1768B;

    /* renamed from: z  reason: collision with root package name */
    public int f1769z;

    public IndexBasedArrayIterator(int i2) {
        this.f1769z = i2;
    }

    public abstract Object b(int i2);

    public abstract void c(int i2);

    public boolean hasNext() {
        return this.f1767A < this.f1769z;
    }

    public Object next() {
        if (hasNext()) {
            Object b2 = b(this.f1767A);
            this.f1767A++;
            this.f1768B = true;
            return b2;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        if (!this.f1768B) {
            RuntimeHelpersKt.b("Call next() before removing an element.");
        }
        int i2 = this.f1767A - 1;
        this.f1767A = i2;
        c(i2);
        this.f1769z--;
        this.f1768B = false;
    }
}
