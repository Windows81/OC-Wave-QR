package org.bson;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.bson.assertions.Assertions;
import org.bson.io.ByteBufferBsonInput;

public class RawBsonArray extends BsonArray implements Serializable {

    /* renamed from: A  reason: collision with root package name */
    public final transient RawBsonArrayList f43686A;

    public static class RawBsonArrayList extends AbstractList<BsonValue> {

        /* renamed from: A  reason: collision with root package name */
        public final byte[] f43687A;

        /* renamed from: B  reason: collision with root package name */
        public final int f43688B;
        public final int C;

        /* renamed from: z  reason: collision with root package name */
        public Integer f43689z;

        public class Itr implements Iterator<BsonValue> {

            /* renamed from: A  reason: collision with root package name */
            public BsonBinaryReader f43690A;

            /* renamed from: B  reason: collision with root package name */
            public int f43691B;

            /* renamed from: z  reason: collision with root package name */
            public int f43692z;

            public Itr(RawBsonArrayList rawBsonArrayList) {
                this(0);
            }

            public int b() {
                return this.f43692z;
            }

            /* renamed from: c */
            public BsonValue next() {
                while (this.f43692z > this.f43691B && this.f43690A.t1() != BsonType.END_OF_DOCUMENT) {
                    this.f43690A.L0();
                    this.f43690A.Y();
                    this.f43691B++;
                }
                if (this.f43690A.t1() != BsonType.END_OF_DOCUMENT) {
                    this.f43690A.L0();
                    int i2 = this.f43692z + 1;
                    this.f43692z = i2;
                    this.f43691B = i2;
                    return RawBsonValueHelper.a(RawBsonArrayList.this.f43687A, this.f43690A);
                }
                this.f43690A.close();
                throw new NoSuchElementException();
            }

            public void d(int i2) {
                this.f43692z = i2;
                this.f43691B = 0;
                BsonBinaryReader bsonBinaryReader = this.f43690A;
                if (bsonBinaryReader != null) {
                    bsonBinaryReader.close();
                }
                BsonBinaryReader i3 = RawBsonArrayList.this.m();
                this.f43690A = i3;
                i3.Z0();
            }

            public boolean hasNext() {
                boolean z2 = this.f43692z != RawBsonArrayList.this.size();
                if (!z2) {
                    this.f43690A.close();
                }
                return z2;
            }

            public void remove() {
                throw new UnsupportedOperationException("RawBsonArray instances are immutable");
            }

            public Itr(int i2) {
                this.f43692z = 0;
                this.f43691B = 0;
                d(i2);
            }
        }

        public class ListItr extends Itr implements ListIterator<BsonValue> {
            public ListItr(int i2) {
                super(i2);
            }

            /* renamed from: e */
            public void add(BsonValue bsonValue) {
                throw new UnsupportedOperationException("RawBsonArray instances are immutable");
            }

            /* renamed from: f */
            public BsonValue previous() {
                try {
                    BsonValue n2 = RawBsonArrayList.this.get(previousIndex());
                    d(previousIndex());
                    return n2;
                } catch (IndexOutOfBoundsException unused) {
                    throw new NoSuchElementException();
                }
            }

            /* renamed from: g */
            public void set(BsonValue bsonValue) {
                throw new UnsupportedOperationException("RawBsonArray instances are immutable");
            }

            public boolean hasPrevious() {
                return b() != 0;
            }

            public int nextIndex() {
                return b();
            }

            public int previousIndex() {
                return b() - 1;
            }
        }

        public RawBsonArrayList(byte[] bArr, int i2, int i3) {
            Assertions.d("bytes", bArr);
            boolean z2 = false;
            Assertions.c("offset >= 0", i2 >= 0);
            Assertions.c("offset < bytes.length", i2 < bArr.length);
            Assertions.c("length <= bytes.length - offset", i3 <= bArr.length - i2);
            Assertions.c("length >= 5", i3 >= 5 ? true : z2);
            this.f43687A = bArr;
            this.f43688B = i2;
            this.C = i3;
        }

        public Iterator iterator() {
            return new Itr(this);
        }

        public ListIterator listIterator() {
            return new ListItr(0);
        }

        public final BsonBinaryReader m() {
            return new BsonBinaryReader(new ByteBufferBsonInput(o()));
        }

        /* renamed from: n */
        public BsonValue get(int i2) {
            if (i2 >= 0) {
                BsonBinaryReader m2 = m();
                try {
                    m2.Z0();
                    int i3 = 0;
                    while (m2.t1() != BsonType.END_OF_DOCUMENT) {
                        m2.L0();
                        if (i3 == i2) {
                            return RawBsonValueHelper.a(this.f43687A, m2);
                        }
                        m2.Y();
                        i3++;
                    }
                    m2.T0();
                    m2.close();
                    throw new IndexOutOfBoundsException();
                } finally {
                    m2.close();
                }
            } else {
                throw new IndexOutOfBoundsException();
            }
        }

        public ByteBuf o() {
            ByteBuffer wrap = ByteBuffer.wrap(this.f43687A, this.f43688B, this.C);
            wrap.order(ByteOrder.LITTLE_ENDIAN);
            return new ByteBufNIO(wrap);
        }

        public int size() {
            Integer num = this.f43689z;
            if (num != null) {
                return num.intValue();
            }
            BsonBinaryReader m2 = m();
            try {
                m2.Z0();
                int i2 = 0;
                while (m2.t1() != BsonType.END_OF_DOCUMENT) {
                    i2++;
                    m2.h1();
                    m2.Y();
                }
                m2.T0();
                m2.close();
                Integer valueOf = Integer.valueOf(i2);
                this.f43689z = valueOf;
                return valueOf.intValue();
            } catch (Throwable th) {
                m2.close();
                throw th;
            }
        }

        public ListIterator listIterator(int i2) {
            return new ListItr(i2);
        }
    }

    public static class SerializationProxy implements Serializable {
    }

    public RawBsonArray(byte[] bArr, int i2, int i3) {
        this(new RawBsonArrayList(bArr, i2, i3));
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("RawBsonArray instances are immutable");
    }

    public void clear() {
        throw new UnsupportedOperationException("RawBsonArray instances are immutable");
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    /* renamed from: l0 */
    public void add(int i2, BsonValue bsonValue) {
        throw new UnsupportedOperationException("RawBsonArray instances are immutable");
    }

    /* renamed from: p0 */
    public boolean add(BsonValue bsonValue) {
        throw new UnsupportedOperationException("RawBsonArray instances are immutable");
    }

    /* renamed from: q0 */
    public BsonArray clone() {
        return new RawBsonArray((byte[]) this.f43686A.f43687A.clone(), this.f43686A.f43688B, this.f43686A.C);
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("RawBsonArray instances are immutable");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("RawBsonArray instances are immutable");
    }

    /* renamed from: v0 */
    public BsonValue remove(int i2) {
        throw new UnsupportedOperationException("RawBsonArray instances are immutable");
    }

    /* renamed from: x0 */
    public BsonValue set(int i2, BsonValue bsonValue) {
        throw new UnsupportedOperationException("RawBsonArray instances are immutable");
    }

    public RawBsonArray(RawBsonArrayList rawBsonArrayList) {
        super(rawBsonArrayList, false);
        this.f43686A = rawBsonArrayList;
    }

    public boolean addAll(int i2, Collection collection) {
        throw new UnsupportedOperationException("RawBsonArray instances are immutable");
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("RawBsonArray instances are immutable");
    }
}
