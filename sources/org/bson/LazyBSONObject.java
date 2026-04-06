package org.bson;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.UuidCodec;
import org.bson.io.ByteBufferBsonInput;
import org.bson.types.BSONTimestamp;
import org.bson.types.Binary;
import org.bson.types.Code;
import org.bson.types.CodeWScope;
import org.bson.types.MaxKey;
import org.bson.types.MinKey;
import org.bson.types.Symbol;

public class LazyBSONObject implements BSONObject {

    /* renamed from: A  reason: collision with root package name */
    public final int f43681A;

    /* renamed from: B  reason: collision with root package name */
    public final LazyBSONCallback f43682B;

    /* renamed from: z  reason: collision with root package name */
    public final byte[] f43683z;

    /* renamed from: org.bson.LazyBSONObject$1  reason: invalid class name */
    class AnonymousClass1 implements Set<Map.Entry<String, Object>> {

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ List f43684z;

        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            throw new UnsupportedOperationException();
        }

        public boolean contains(Object obj) {
            return this.f43684z.contains(obj);
        }

        public boolean containsAll(Collection collection) {
            return this.f43684z.containsAll(collection);
        }

        /* renamed from: e */
        public boolean add(Map.Entry entry) {
            throw new UnsupportedOperationException();
        }

        public boolean isEmpty() {
            return this.f43684z.isEmpty();
        }

        public Iterator iterator() {
            return this.f43684z.iterator();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return this.f43684z.size();
        }

        public Object[] toArray() {
            return this.f43684z.toArray();
        }

        public Object[] toArray(Object[] objArr) {
            return this.f43684z.toArray(objArr);
        }
    }

    /* renamed from: org.bson.LazyBSONObject$2  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f43685a;

        /* JADX WARNING: Can't wrap try/catch for region: R(42:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|(3:41|42|44)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(44:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|44) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                org.bson.BsonType[] r0 = org.bson.BsonType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f43685a = r0
                org.bson.BsonType r1 = org.bson.BsonType.DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f43685a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.bson.BsonType r1 = org.bson.BsonType.ARRAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f43685a     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.bson.BsonType r1 = org.bson.BsonType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f43685a     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.bson.BsonType r1 = org.bson.BsonType.STRING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f43685a     // Catch:{ NoSuchFieldError -> 0x003e }
                org.bson.BsonType r1 = org.bson.BsonType.BINARY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f43685a     // Catch:{ NoSuchFieldError -> 0x0049 }
                org.bson.BsonType r1 = org.bson.BsonType.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f43685a     // Catch:{ NoSuchFieldError -> 0x0054 }
                org.bson.BsonType r1 = org.bson.BsonType.UNDEFINED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f43685a     // Catch:{ NoSuchFieldError -> 0x0060 }
                org.bson.BsonType r1 = org.bson.BsonType.OBJECT_ID     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f43685a     // Catch:{ NoSuchFieldError -> 0x006c }
                org.bson.BsonType r1 = org.bson.BsonType.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f43685a     // Catch:{ NoSuchFieldError -> 0x0078 }
                org.bson.BsonType r1 = org.bson.BsonType.DATE_TIME     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f43685a     // Catch:{ NoSuchFieldError -> 0x0084 }
                org.bson.BsonType r1 = org.bson.BsonType.REGULAR_EXPRESSION     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f43685a     // Catch:{ NoSuchFieldError -> 0x0090 }
                org.bson.BsonType r1 = org.bson.BsonType.DB_POINTER     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f43685a     // Catch:{ NoSuchFieldError -> 0x009c }
                org.bson.BsonType r1 = org.bson.BsonType.JAVASCRIPT     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f43685a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                org.bson.BsonType r1 = org.bson.BsonType.SYMBOL     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f43685a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                org.bson.BsonType r1 = org.bson.BsonType.JAVASCRIPT_WITH_SCOPE     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f43685a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                org.bson.BsonType r1 = org.bson.BsonType.INT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f43685a     // Catch:{ NoSuchFieldError -> 0x00cc }
                org.bson.BsonType r1 = org.bson.BsonType.TIMESTAMP     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f43685a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                org.bson.BsonType r1 = org.bson.BsonType.INT64     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                int[] r0 = f43685a     // Catch:{ NoSuchFieldError -> 0x00e4 }
                org.bson.BsonType r1 = org.bson.BsonType.DECIMAL128     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                int[] r0 = f43685a     // Catch:{ NoSuchFieldError -> 0x00f0 }
                org.bson.BsonType r1 = org.bson.BsonType.MIN_KEY     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                int[] r0 = f43685a     // Catch:{ NoSuchFieldError -> 0x00fc }
                org.bson.BsonType r1 = org.bson.BsonType.MAX_KEY     // Catch:{ NoSuchFieldError -> 0x00fc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fc }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fc }
            L_0x00fc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bson.LazyBSONObject.AnonymousClass2.<clinit>():void");
        }
    }

    public LazyBSONObject(byte[] bArr, int i2, LazyBSONCallback lazyBSONCallback) {
        this.f43683z = bArr;
        this.f43682B = lazyBSONCallback;
        this.f43681A = i2;
    }

    public Object e(String str) {
        Object obj;
        BsonBinaryReader m2 = m();
        try {
            m2.Z0();
            while (true) {
                if (m2.t1() == BsonType.END_OF_DOCUMENT) {
                    obj = null;
                    break;
                } else if (str.equals(m2.h1())) {
                    obj = s(m2);
                    break;
                } else {
                    m2.Y();
                }
            }
            return obj;
        } finally {
            m2.close();
        }
    }

    public boolean equals(Object obj) {
        byte b2;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LazyBSONObject lazyBSONObject = (LazyBSONObject) obj;
            byte[] bArr = this.f43683z;
            byte[] bArr2 = lazyBSONObject.f43683z;
            if (bArr == bArr2 && this.f43681A == lazyBSONObject.f43681A) {
                return true;
            }
            if (bArr == null || bArr2 == null || bArr.length == 0 || bArr2.length == 0 || bArr2[lazyBSONObject.f43681A] != (b2 = bArr[this.f43681A])) {
                return false;
            }
            for (int i2 = 0; i2 < b2; i2++) {
                if (this.f43683z[this.f43681A + i2] != lazyBSONObject.f43683z[lazyBSONObject.f43681A + i2]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public Object g(String str, Object obj) {
        throw new UnsupportedOperationException("Object is read only");
    }

    /* JADX INFO: finally extract failed */
    public boolean h(String str) {
        BsonBinaryReader m2 = m();
        try {
            m2.Z0();
            while (m2.t1() != BsonType.END_OF_DOCUMENT) {
                if (m2.h1().equals(str)) {
                    m2.close();
                    return true;
                }
                m2.Y();
            }
            m2.close();
            return false;
        } catch (Throwable th) {
            m2.close();
            throw th;
        }
    }

    public int hashCode() {
        int i2 = i();
        int i3 = 1;
        for (int i4 = this.f43681A; i4 < this.f43681A + i2; i4++) {
            i3 = (i3 * 31) + this.f43683z[i4];
        }
        return i3;
    }

    public int i() {
        return n().getInt();
    }

    public boolean isEmpty() {
        return keySet().size() == 0;
    }

    public Set keySet() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        BsonBinaryReader m2 = m();
        try {
            m2.Z0();
            while (m2.t1() != BsonType.END_OF_DOCUMENT) {
                linkedHashSet.add(m2.h1());
                m2.Y();
            }
            m2.T0();
            m2.close();
            return Collections.unmodifiableSet(linkedHashSet);
        } catch (Throwable th) {
            m2.close();
            throw th;
        }
    }

    public BsonBinaryReader m() {
        return new BsonBinaryReader(new ByteBufferBsonInput(new ByteBufNIO(n())));
    }

    public final ByteBuffer n() {
        byte[] bArr = this.f43683z;
        int i2 = this.f43681A;
        ByteBuffer slice = ByteBuffer.wrap(bArr, i2, bArr.length - i2).slice();
        slice.order(ByteOrder.LITTLE_ENDIAN);
        slice.limit(slice.getInt());
        slice.rewind();
        return slice;
    }

    public final Object o(BsonBinaryReader bsonBinaryReader) {
        int position = bsonBinaryReader.j1().getPosition();
        bsonBinaryReader.Y();
        return this.f43682B.A(this.f43683z, this.f43681A + position);
    }

    public final Object p(BsonBinaryReader bsonBinaryReader) {
        int position = bsonBinaryReader.j1().getPosition();
        bsonBinaryReader.Y();
        return this.f43682B.C(this.f43683z, this.f43681A + position);
    }

    public final Object q(BsonBinaryReader bsonBinaryReader) {
        int position = bsonBinaryReader.j1().getPosition();
        bsonBinaryReader.Z0();
        while (bsonBinaryReader.t1() != BsonType.END_OF_DOCUMENT) {
            bsonBinaryReader.L0();
            bsonBinaryReader.Y();
        }
        bsonBinaryReader.T0();
        return this.f43682B.C(this.f43683z, this.f43681A + position);
    }

    public Object s(BsonBinaryReader bsonBinaryReader) {
        switch (AnonymousClass2.f43685a[bsonBinaryReader.C1().ordinal()]) {
            case 1:
                return p(bsonBinaryReader);
            case 2:
                return o(bsonBinaryReader);
            case 3:
                return Double.valueOf(bsonBinaryReader.readDouble());
            case 4:
                return bsonBinaryReader.h();
            case 5:
                byte Y0 = bsonBinaryReader.Y0();
                if (BsonBinarySubType.f(Y0) && bsonBinaryReader.z1() == 16) {
                    return new UuidCodec(UuidRepresentation.JAVA_LEGACY).b(bsonBinaryReader, DecoderContext.a().a());
                }
                BsonBinary J = bsonBinaryReader.J();
                return (Y0 == BsonBinarySubType.BINARY.d() || Y0 == BsonBinarySubType.OLD_BINARY.d()) ? J.p0() : new Binary(J.q0(), J.p0());
            case 6:
                bsonBinaryReader.i1();
                return null;
            case 7:
                bsonBinaryReader.X0();
                return null;
            case 8:
                return bsonBinaryReader.w();
            case 9:
                return Boolean.valueOf(bsonBinaryReader.readBoolean());
            case 10:
                return new Date(bsonBinaryReader.r0());
            case 11:
                BsonRegularExpression f1 = bsonBinaryReader.f1();
                return Pattern.compile(f1.p0(), BSON.f(f1.l0()));
            case 12:
                BsonDbPointer U = bsonBinaryReader.U();
                return this.f43682B.B(U.p0(), U.l0());
            case 13:
                return new Code(bsonBinaryReader.R0());
            case 14:
                return new Symbol(bsonBinaryReader.b0());
            case 15:
                return new CodeWScope(bsonBinaryReader.C0(), (BSONObject) q(bsonBinaryReader));
            case 16:
                return Integer.valueOf(bsonBinaryReader.i());
            case 17:
                BsonTimestamp W = bsonBinaryReader.W();
                return new BSONTimestamp(W.q0(), W.p0());
            case 18:
                return Long.valueOf(bsonBinaryReader.n());
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER:
                return bsonBinaryReader.K();
            case 20:
                bsonBinaryReader.Z();
                return new MinKey();
            case 21:
                bsonBinaryReader.D0();
                return new MaxKey();
            default:
                throw new IllegalArgumentException("unhandled BSON type: " + bsonBinaryReader.C1());
        }
    }
}
