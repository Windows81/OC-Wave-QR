package com.google.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class UnmodifiableLazyStringList extends AbstractList<String> implements LazyStringList, RandomAccess {

    /* renamed from: z  reason: collision with root package name */
    public final LazyStringList f32330z;

    public UnmodifiableLazyStringList(LazyStringList lazyStringList) {
        this.f32330z = lazyStringList;
    }

    public Object G(int i2) {
        return this.f32330z.G(i2);
    }

    public void c0(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    public String get(int i2) {
        return (String) this.f32330z.get(i2);
    }

    public Iterator iterator() {
        return new Iterator<String>() {

            /* renamed from: z  reason: collision with root package name */
            public Iterator f32335z;

            {
                this.f32335z = UnmodifiableLazyStringList.this.f32330z.iterator();
            }

            /* renamed from: b */
            public String next() {
                return (String) this.f32335z.next();
            }

            public boolean hasNext() {
                return this.f32335z.hasNext();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public LazyStringList j1() {
        return this;
    }

    public ListIterator listIterator(int i2) {
        return new ListIterator<String>(i2) {

            /* renamed from: A  reason: collision with root package name */
            public final /* synthetic */ int f32331A;

            /* renamed from: z  reason: collision with root package name */
            public ListIterator f32333z;

            {
                this.f32331A = r2;
                this.f32333z = UnmodifiableLazyStringList.this.f32330z.listIterator(r2);
            }

            /* renamed from: b */
            public void add(String str) {
                throw new UnsupportedOperationException();
            }

            /* renamed from: c */
            public String next() {
                return (String) this.f32333z.next();
            }

            /* renamed from: d */
            public String previous() {
                return (String) this.f32333z.previous();
            }

            /* renamed from: e */
            public void set(String str) {
                throw new UnsupportedOperationException();
            }

            public boolean hasNext() {
                return this.f32333z.hasNext();
            }

            public boolean hasPrevious() {
                return this.f32333z.hasPrevious();
            }

            public int nextIndex() {
                return this.f32333z.nextIndex();
            }

            public int previousIndex() {
                return this.f32333z.previousIndex();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public int size() {
        return this.f32330z.size();
    }

    public List y() {
        return this.f32330z.y();
    }
}
