package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.MapEntryLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import androidx.datastore.preferences.protobuf.Writer;
import com.google.api.Service;
import com.google.protobuf.DescriptorProtos;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

@CheckReturnValue
final class MessageSchema<T> implements Schema<T> {

    /* renamed from: r  reason: collision with root package name */
    public static final int[] f21069r = new int[0];

    /* renamed from: s  reason: collision with root package name */
    public static final Unsafe f21070s = UnsafeUtil.I();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f21071a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f21072b;

    /* renamed from: c  reason: collision with root package name */
    public final int f21073c;

    /* renamed from: d  reason: collision with root package name */
    public final int f21074d;

    /* renamed from: e  reason: collision with root package name */
    public final MessageLite f21075e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f21076f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f21077g;

    /* renamed from: h  reason: collision with root package name */
    public final ProtoSyntax f21078h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f21079i;

    /* renamed from: j  reason: collision with root package name */
    public final int[] f21080j;

    /* renamed from: k  reason: collision with root package name */
    public final int f21081k;

    /* renamed from: l  reason: collision with root package name */
    public final int f21082l;

    /* renamed from: m  reason: collision with root package name */
    public final NewInstanceSchema f21083m;

    /* renamed from: n  reason: collision with root package name */
    public final ListFieldSchema f21084n;

    /* renamed from: o  reason: collision with root package name */
    public final UnknownFieldSchema f21085o;

    /* renamed from: p  reason: collision with root package name */
    public final ExtensionSchema f21086p;

    /* renamed from: q  reason: collision with root package name */
    public final MapFieldSchema f21087q;

    /* renamed from: androidx.datastore.preferences.protobuf.MessageSchema$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21088a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
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
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.datastore.preferences.protobuf.WireFormat$FieldType[] r0 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21088a = r0
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f21088a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f21088a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f21088a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f21088a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f21088a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f21088a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f21088a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f21088a     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f21088a     // Catch:{ NoSuchFieldError -> 0x0078 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f21088a     // Catch:{ NoSuchFieldError -> 0x0084 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f21088a     // Catch:{ NoSuchFieldError -> 0x0090 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f21088a     // Catch:{ NoSuchFieldError -> 0x009c }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f21088a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f21088a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f21088a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f21088a     // Catch:{ NoSuchFieldError -> 0x00cc }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.AnonymousClass1.<clinit>():void");
        }
    }

    public MessageSchema(int[] iArr, Object[] objArr, int i2, int i3, MessageLite messageLite, ProtoSyntax protoSyntax, boolean z2, int[] iArr2, int i4, int i5, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MapFieldSchema mapFieldSchema) {
        MessageLite messageLite2 = messageLite;
        ExtensionSchema extensionSchema2 = extensionSchema;
        this.f21071a = iArr;
        this.f21072b = objArr;
        this.f21073c = i2;
        this.f21074d = i3;
        this.f21077g = messageLite2 instanceof GeneratedMessageLite;
        this.f21078h = protoSyntax;
        this.f21076f = extensionSchema2 != null && extensionSchema2.e(messageLite);
        this.f21079i = z2;
        this.f21080j = iArr2;
        this.f21081k = i4;
        this.f21082l = i5;
        this.f21083m = newInstanceSchema;
        this.f21084n = listFieldSchema;
        this.f21085o = unknownFieldSchema;
        this.f21086p = extensionSchema2;
        this.f21075e = messageLite2;
        this.f21087q = mapFieldSchema;
    }

    public static boolean C(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).J();
        }
        return true;
    }

    public static boolean F(int i2) {
        return (i2 & 268435456) != 0;
    }

    public static long G(Object obj, long j2) {
        return UnsafeUtil.F(obj, j2);
    }

    public static MessageSchema O(Class cls, MessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MapFieldSchema mapFieldSchema) {
        return messageInfo instanceof RawMessageInfo ? Q((RawMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema) : P((StructuralMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    public static MessageSchema P(StructuralMessageInfo structuralMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MapFieldSchema mapFieldSchema) {
        int i2;
        int i3;
        int i4;
        FieldInfo[] e2 = structuralMessageInfo.e();
        if (e2.length == 0) {
            i3 = 0;
            i2 = 0;
        } else {
            i3 = e2[0].k();
            i2 = e2[e2.length - 1].k();
        }
        int length = e2.length;
        int[] iArr = new int[(length * 3)];
        Object[] objArr = new Object[(length * 2)];
        int i5 = 0;
        int i6 = 0;
        for (FieldInfo fieldInfo : e2) {
            if (fieldInfo.r() == FieldType.MAP) {
                i5++;
            } else if (fieldInfo.r().d() >= 18 && fieldInfo.r().d() <= 49) {
                i6++;
            }
        }
        int[] iArr2 = null;
        int[] iArr3 = i5 > 0 ? new int[i5] : null;
        if (i6 > 0) {
            iArr2 = new int[i6];
        }
        int[] d2 = structuralMessageInfo.d();
        if (d2 == null) {
            d2 = f21069r;
        }
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i7 < e2.length) {
            FieldInfo fieldInfo2 = e2[i7];
            int k2 = fieldInfo2.k();
            i0(fieldInfo2, iArr, i8, objArr);
            if (i9 < d2.length && d2[i9] == k2) {
                d2[i9] = i8;
                i9++;
            }
            if (fieldInfo2.r() == FieldType.MAP) {
                iArr3[i10] = i8;
                i10++;
            } else if (fieldInfo2.r().d() >= 18 && fieldInfo2.r().d() <= 49) {
                i4 = i8;
                iArr2[i11] = (int) UnsafeUtil.M(fieldInfo2.j());
                i11++;
                i7++;
                i8 = i4 + 3;
            }
            i4 = i8;
            i7++;
            i8 = i4 + 3;
        }
        if (iArr3 == null) {
            iArr3 = f21069r;
        }
        if (iArr2 == null) {
            iArr2 = f21069r;
        }
        int[] iArr4 = new int[(d2.length + iArr3.length + iArr2.length)];
        System.arraycopy(d2, 0, iArr4, 0, d2.length);
        System.arraycopy(iArr3, 0, iArr4, d2.length, iArr3.length);
        System.arraycopy(iArr2, 0, iArr4, d2.length + iArr3.length, iArr2.length);
        return new MessageSchema(iArr, objArr, i3, i2, structuralMessageInfo.b(), structuralMessageInfo.c(), true, iArr4, d2.length, d2.length + iArr3.length, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0267  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.datastore.preferences.protobuf.MessageSchema Q(androidx.datastore.preferences.protobuf.RawMessageInfo r31, androidx.datastore.preferences.protobuf.NewInstanceSchema r32, androidx.datastore.preferences.protobuf.ListFieldSchema r33, androidx.datastore.preferences.protobuf.UnknownFieldSchema r34, androidx.datastore.preferences.protobuf.ExtensionSchema r35, androidx.datastore.preferences.protobuf.MapFieldSchema r36) {
        /*
            java.lang.String r0 = r31.e()
            int r1 = r0.length()
            r2 = 0
            char r3 = r0.charAt(r2)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r5) goto L_0x001d
            r3 = 1
        L_0x0013:
            int r6 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x001e
            r3 = r6
            goto L_0x0013
        L_0x001d:
            r6 = 1
        L_0x001e:
            int r3 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x003d
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x002a:
            int r9 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x003a
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r8
            r6 = r6 | r3
            int r8 = r8 + 13
            r3 = r9
            goto L_0x002a
        L_0x003a:
            int r3 = r3 << r8
            r6 = r6 | r3
            r3 = r9
        L_0x003d:
            if (r6 != 0) goto L_0x004e
            int[] r6 = f21069r
            r10 = r2
            r11 = r10
            r12 = r11
            r13 = r12
            r15 = r13
            r17 = r15
            r16 = r6
            r6 = r17
            goto L_0x0158
        L_0x004e:
            int r6 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x006d
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x005a:
            int r9 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x006a
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r8
            r3 = r3 | r6
            int r8 = r8 + 13
            r6 = r9
            goto L_0x005a
        L_0x006a:
            int r6 = r6 << r8
            r3 = r3 | r6
            r6 = r9
        L_0x006d:
            int r8 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x008c
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0079:
            int r10 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x0089
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r6 = r6 | r8
            int r9 = r9 + 13
            r8 = r10
            goto L_0x0079
        L_0x0089:
            int r8 = r8 << r9
            r6 = r6 | r8
            r8 = r10
        L_0x008c:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x00ab
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0098:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00a8
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r8 = r8 | r9
            int r10 = r10 + 13
            r9 = r11
            goto L_0x0098
        L_0x00a8:
            int r9 = r9 << r10
            r8 = r8 | r9
            r9 = r11
        L_0x00ab:
            int r10 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00ca
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00b7:
            int r12 = r10 + 1
            char r10 = r0.charAt(r10)
            if (r10 < r5) goto L_0x00c7
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r11
            r9 = r9 | r10
            int r11 = r11 + 13
            r10 = r12
            goto L_0x00b7
        L_0x00c7:
            int r10 = r10 << r11
            r9 = r9 | r10
            r10 = r12
        L_0x00ca:
            int r11 = r10 + 1
            char r10 = r0.charAt(r10)
            if (r10 < r5) goto L_0x00e9
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00d6:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00e6
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r10 = r10 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00d6
        L_0x00e6:
            int r11 = r11 << r12
            r10 = r10 | r11
            r11 = r13
        L_0x00e9:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x0108
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00f5:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0105
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00f5
        L_0x0105:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x0108:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0127
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x0114:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0124
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x0114
        L_0x0124:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0127:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0148
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x0133:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x0144
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x0133
        L_0x0144:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0148:
            int r15 = r13 + r11
            int r15 = r15 + r12
            int[] r12 = new int[r15]
            int r15 = r3 * 2
            int r15 = r15 + r6
            r6 = r3
            r16 = r12
            r17 = r13
            r3 = r14
            r12 = r8
            r13 = r9
        L_0x0158:
            sun.misc.Unsafe r8 = f21070s
            java.lang.Object[] r9 = r31.d()
            androidx.datastore.preferences.protobuf.MessageLite r14 = r31.b()
            java.lang.Class r14 = r14.getClass()
            int r2 = r10 * 3
            int[] r2 = new int[r2]
            int r10 = r10 * 2
            java.lang.Object[] r10 = new java.lang.Object[r10]
            int r19 = r17 + r11
            r21 = r17
            r22 = r19
            r11 = 0
            r20 = 0
        L_0x0177:
            if (r3 >= r1) goto L_0x03bc
            int r23 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x019f
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r7 = r23
            r23 = 13
        L_0x0187:
            int r24 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r5) goto L_0x0199
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r23
            r3 = r3 | r7
            int r23 = r23 + 13
            r7 = r24
            goto L_0x0187
        L_0x0199:
            int r7 = r7 << r23
            r3 = r3 | r7
            r7 = r24
            goto L_0x01a1
        L_0x019f:
            r7 = r23
        L_0x01a1:
            int r23 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r5) goto L_0x01c7
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r4 = r23
            r23 = 13
        L_0x01af:
            int r25 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x01c1
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r23
            r7 = r7 | r4
            int r23 = r23 + 13
            r4 = r25
            goto L_0x01af
        L_0x01c1:
            int r4 = r4 << r23
            r7 = r7 | r4
            r4 = r25
            goto L_0x01c9
        L_0x01c7:
            r4 = r23
        L_0x01c9:
            r5 = r7 & 255(0xff, float:3.57E-43)
            r25 = r1
            r1 = r7 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x01d6
            int r1 = r11 + 1
            r16[r11] = r20
            r11 = r1
        L_0x01d6:
            r1 = 51
            r27 = r11
            if (r5 < r1) goto L_0x027f
            int r1 = r4 + 1
            char r4 = r0.charAt(r4)
            r11 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r11) goto L_0x0205
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r29 = 13
        L_0x01eb:
            int r30 = r1 + 1
            char r1 = r0.charAt(r1)
            if (r1 < r11) goto L_0x0200
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r29
            r4 = r4 | r1
            int r29 = r29 + 13
            r1 = r30
            r11 = 55296(0xd800, float:7.7486E-41)
            goto L_0x01eb
        L_0x0200:
            int r1 = r1 << r29
            r4 = r4 | r1
            r1 = r30
        L_0x0205:
            int r11 = r5 + -51
            r29 = r1
            r1 = 9
            if (r11 == r1) goto L_0x0234
            r1 = 17
            if (r11 != r1) goto L_0x0212
            goto L_0x0234
        L_0x0212:
            r1 = 12
            if (r11 != r1) goto L_0x0241
            androidx.datastore.preferences.protobuf.ProtoSyntax r1 = r31.c()
            androidx.datastore.preferences.protobuf.ProtoSyntax r11 = androidx.datastore.preferences.protobuf.ProtoSyntax.PROTO2
            boolean r1 = r1.equals(r11)
            if (r1 != 0) goto L_0x0226
            r1 = r7 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0241
        L_0x0226:
            int r1 = r20 / 3
            int r1 = r1 * 2
            r11 = 1
            int r1 = r1 + r11
            int r11 = r15 + 1
            r15 = r9[r15]
            r10[r1] = r15
        L_0x0232:
            r15 = r11
            goto L_0x0241
        L_0x0234:
            int r1 = r20 / 3
            int r1 = r1 * 2
            r11 = 1
            int r1 = r1 + r11
            int r11 = r15 + 1
            r15 = r9[r15]
            r10[r1] = r15
            goto L_0x0232
        L_0x0241:
            int r4 = r4 * 2
            r1 = r9[r4]
            boolean r11 = r1 instanceof java.lang.reflect.Field
            if (r11 == 0) goto L_0x024e
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
        L_0x024b:
            r30 = r12
            goto L_0x0257
        L_0x024e:
            java.lang.String r1 = (java.lang.String) r1
            java.lang.reflect.Field r1 = e0(r14, r1)
            r9[r4] = r1
            goto L_0x024b
        L_0x0257:
            long r11 = r8.objectFieldOffset(r1)
            int r1 = (int) r11
            int r4 = r4 + 1
            r11 = r9[r4]
            boolean r12 = r11 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x0267
            java.lang.reflect.Field r11 = (java.lang.reflect.Field) r11
            goto L_0x026f
        L_0x0267:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.reflect.Field r11 = e0(r14, r11)
            r9[r4] = r11
        L_0x026f:
            long r11 = r8.objectFieldOffset(r11)
            int r4 = (int) r11
            r26 = r13
            r23 = r15
            r12 = r29
            r15 = r0
            r0 = r4
            r4 = 0
            goto L_0x037a
        L_0x027f:
            r30 = r12
            int r1 = r15 + 1
            r11 = r9[r15]
            java.lang.String r11 = (java.lang.String) r11
            java.lang.reflect.Field r11 = e0(r14, r11)
            r12 = 9
            if (r5 == r12) goto L_0x0293
            r12 = 17
            if (r5 != r12) goto L_0x0298
        L_0x0293:
            r26 = r13
            r13 = 1
            goto L_0x0302
        L_0x0298:
            r12 = 27
            if (r5 == r12) goto L_0x02a0
            r12 = 49
            if (r5 != r12) goto L_0x02a4
        L_0x02a0:
            r26 = r13
            r13 = 1
            goto L_0x02f6
        L_0x02a4:
            r12 = 12
            if (r5 == r12) goto L_0x02da
            r12 = 30
            if (r5 == r12) goto L_0x02da
            r12 = 44
            if (r5 != r12) goto L_0x02b1
            goto L_0x02da
        L_0x02b1:
            r12 = 50
            if (r5 != r12) goto L_0x02d1
            int r12 = r21 + 1
            r16[r21] = r20
            int r21 = r20 / 3
            int r21 = r21 * 2
            int r26 = r15 + 2
            r1 = r9[r1]
            r10[r21] = r1
            r1 = r7 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x02d5
            int r21 = r21 + 1
            int r1 = r15 + 3
            r15 = r9[r26]
            r10[r21] = r15
            r21 = r12
        L_0x02d1:
            r26 = r13
        L_0x02d3:
            r13 = 1
            goto L_0x030d
        L_0x02d5:
            r21 = r12
            r1 = r26
            goto L_0x02d1
        L_0x02da:
            androidx.datastore.preferences.protobuf.ProtoSyntax r12 = r31.c()
            r26 = r13
            androidx.datastore.preferences.protobuf.ProtoSyntax r13 = androidx.datastore.preferences.protobuf.ProtoSyntax.PROTO2
            if (r12 == r13) goto L_0x02e8
            r12 = r7 & 2048(0x800, float:2.87E-42)
            if (r12 == 0) goto L_0x02d3
        L_0x02e8:
            int r12 = r20 / 3
            int r12 = r12 * 2
            r13 = 1
            int r12 = r12 + r13
            int r15 = r15 + 2
            r1 = r9[r1]
            r10[r12] = r1
        L_0x02f4:
            r1 = r15
            goto L_0x030d
        L_0x02f6:
            int r12 = r20 / 3
            int r12 = r12 * 2
            int r12 = r12 + r13
            int r15 = r15 + 2
            r1 = r9[r1]
            r10[r12] = r1
            goto L_0x02f4
        L_0x0302:
            int r12 = r20 / 3
            int r12 = r12 * 2
            int r12 = r12 + r13
            java.lang.Class r15 = r11.getType()
            r10[r12] = r15
        L_0x030d:
            long r11 = r8.objectFieldOffset(r11)
            int r11 = (int) r11
            r12 = r7 & 4096(0x1000, float:5.74E-42)
            if (r12 == 0) goto L_0x0363
            r12 = 17
            if (r5 > r12) goto L_0x0363
            int r12 = r4 + 1
            char r4 = r0.charAt(r4)
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r15) goto L_0x0340
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r23 = 13
        L_0x0329:
            int r24 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r15) goto L_0x033b
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r23
            r4 = r4 | r12
            int r23 = r23 + 13
            r12 = r24
            goto L_0x0329
        L_0x033b:
            int r12 = r12 << r23
            r4 = r4 | r12
            r12 = r24
        L_0x0340:
            int r23 = r6 * 2
            int r24 = r4 / 32
            int r23 = r23 + r24
            r13 = r9[r23]
            boolean r15 = r13 instanceof java.lang.reflect.Field
            if (r15 == 0) goto L_0x0352
            java.lang.reflect.Field r13 = (java.lang.reflect.Field) r13
        L_0x034e:
            r15 = r0
            r23 = r1
            goto L_0x035b
        L_0x0352:
            java.lang.String r13 = (java.lang.String) r13
            java.lang.reflect.Field r13 = e0(r14, r13)
            r9[r23] = r13
            goto L_0x034e
        L_0x035b:
            long r0 = r8.objectFieldOffset(r13)
            int r0 = (int) r0
            int r4 = r4 % 32
            goto L_0x036b
        L_0x0363:
            r15 = r0
            r23 = r1
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r4
            r4 = 0
        L_0x036b:
            r1 = 18
            if (r5 < r1) goto L_0x0379
            r1 = 49
            if (r5 > r1) goto L_0x0379
            int r1 = r22 + 1
            r16[r22] = r11
            r22 = r1
        L_0x0379:
            r1 = r11
        L_0x037a:
            int r11 = r20 + 1
            r2[r20] = r3
            int r3 = r20 + 2
            r13 = r7 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L_0x0387
            r13 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0388
        L_0x0387:
            r13 = 0
        L_0x0388:
            r28 = r6
            r6 = r7 & 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L_0x0391
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0392
        L_0x0391:
            r6 = 0
        L_0x0392:
            r6 = r6 | r13
            r7 = r7 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x039a
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x039b
        L_0x039a:
            r7 = 0
        L_0x039b:
            r6 = r6 | r7
            int r5 = r5 << 20
            r5 = r5 | r6
            r1 = r1 | r5
            r2[r11] = r1
            int r20 = r20 + 3
            int r1 = r4 << 20
            r0 = r0 | r1
            r2[r3] = r0
            r3 = r12
            r0 = r15
            r15 = r23
            r1 = r25
            r13 = r26
            r11 = r27
            r6 = r28
            r12 = r30
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0177
        L_0x03bc:
            r30 = r12
            r26 = r13
            androidx.datastore.preferences.protobuf.MessageSchema r0 = new androidx.datastore.preferences.protobuf.MessageSchema
            androidx.datastore.preferences.protobuf.MessageLite r13 = r31.b()
            androidx.datastore.preferences.protobuf.ProtoSyntax r14 = r31.c()
            r15 = 0
            r8 = r0
            r9 = r2
            r11 = r30
            r12 = r26
            r18 = r19
            r19 = r32
            r20 = r33
            r21 = r34
            r22 = r35
            r23 = r36
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.Q(androidx.datastore.preferences.protobuf.RawMessageInfo, androidx.datastore.preferences.protobuf.NewInstanceSchema, androidx.datastore.preferences.protobuf.ListFieldSchema, androidx.datastore.preferences.protobuf.UnknownFieldSchema, androidx.datastore.preferences.protobuf.ExtensionSchema, androidx.datastore.preferences.protobuf.MapFieldSchema):androidx.datastore.preferences.protobuf.MessageSchema");
    }

    public static long S(int i2) {
        return (long) (i2 & 1048575);
    }

    public static boolean T(Object obj, long j2) {
        return ((Boolean) UnsafeUtil.H(obj, j2)).booleanValue();
    }

    public static double U(Object obj, long j2) {
        return ((Double) UnsafeUtil.H(obj, j2)).doubleValue();
    }

    public static float V(Object obj, long j2) {
        return ((Float) UnsafeUtil.H(obj, j2)).floatValue();
    }

    public static int W(Object obj, long j2) {
        return ((Integer) UnsafeUtil.H(obj, j2)).intValue();
    }

    public static long X(Object obj, long j2) {
        return ((Long) UnsafeUtil.H(obj, j2)).longValue();
    }

    public static Field e0(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void i0(androidx.datastore.preferences.protobuf.FieldInfo r8, int[] r9, int r10, java.lang.Object[] r11) {
        /*
            androidx.datastore.preferences.protobuf.OneofInfo r0 = r8.n()
            r1 = 0
            if (r0 == 0) goto L_0x0025
            androidx.datastore.preferences.protobuf.FieldType r2 = r8.r()
            int r2 = r2.d()
            int r2 = r2 + 51
            java.lang.reflect.Field r3 = r0.b()
            long r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.M(r3)
            int r3 = (int) r3
            java.lang.reflect.Field r0 = r0.a()
            long r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.M(r0)
        L_0x0022:
            int r0 = (int) r4
            r4 = r1
            goto L_0x006c
        L_0x0025:
            androidx.datastore.preferences.protobuf.FieldType r0 = r8.r()
            java.lang.reflect.Field r2 = r8.j()
            long r2 = androidx.datastore.preferences.protobuf.UnsafeUtil.M(r2)
            int r3 = (int) r2
            int r2 = r0.d()
            boolean r4 = r0.f()
            if (r4 != 0) goto L_0x005a
            boolean r0 = r0.h()
            if (r0 != 0) goto L_0x005a
            java.lang.reflect.Field r0 = r8.o()
            if (r0 != 0) goto L_0x004c
            r0 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0051
        L_0x004c:
            long r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.M(r0)
            int r0 = (int) r4
        L_0x0051:
            int r4 = r8.p()
            int r4 = java.lang.Integer.numberOfTrailingZeros(r4)
            goto L_0x006c
        L_0x005a:
            java.lang.reflect.Field r0 = r8.f()
            if (r0 != 0) goto L_0x0063
            r0 = r1
            r4 = r0
            goto L_0x006c
        L_0x0063:
            java.lang.reflect.Field r0 = r8.f()
            long r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.M(r0)
            goto L_0x0022
        L_0x006c:
            int r5 = r8.k()
            r9[r10] = r5
            int r5 = r10 + 1
            boolean r6 = r8.t()
            if (r6 == 0) goto L_0x007d
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x007e
        L_0x007d:
            r6 = r1
        L_0x007e:
            boolean r7 = r8.x()
            if (r7 == 0) goto L_0x0086
            r1 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0086:
            r1 = r1 | r6
            int r2 = r2 << 20
            r1 = r1 | r2
            r1 = r1 | r3
            r9[r5] = r1
            int r1 = r10 + 2
            int r2 = r4 << 20
            r0 = r0 | r2
            r9[r1] = r0
            java.lang.Class r9 = r8.m()
            java.lang.Object r0 = r8.l()
            if (r0 == 0) goto L_0x00be
            int r10 = r10 / 3
            int r10 = r10 * 2
            java.lang.Object r0 = r8.l()
            r11[r10] = r0
            if (r9 == 0) goto L_0x00af
            int r10 = r10 + 1
            r11[r10] = r9
            goto L_0x00db
        L_0x00af:
            androidx.datastore.preferences.protobuf.Internal$EnumVerifier r9 = r8.h()
            if (r9 == 0) goto L_0x00db
            int r10 = r10 + 1
            androidx.datastore.preferences.protobuf.Internal$EnumVerifier r8 = r8.h()
            r11[r10] = r8
            goto L_0x00db
        L_0x00be:
            if (r9 == 0) goto L_0x00c9
            int r10 = r10 / 3
            int r10 = r10 * 2
            int r10 = r10 + 1
            r11[r10] = r9
            goto L_0x00db
        L_0x00c9:
            androidx.datastore.preferences.protobuf.Internal$EnumVerifier r9 = r8.h()
            if (r9 == 0) goto L_0x00db
            int r10 = r10 / 3
            int r10 = r10 * 2
            int r10 = r10 + 1
            androidx.datastore.preferences.protobuf.Internal$EnumVerifier r8 = r8.h()
            r11[r10] = r8
        L_0x00db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.i0(androidx.datastore.preferences.protobuf.FieldInfo, int[], int, java.lang.Object[]):void");
    }

    public static boolean k(Object obj, long j2) {
        return UnsafeUtil.u(obj, j2);
    }

    public static void l(Object obj) {
        if (!C(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
    }

    public static int l0(int i2) {
        return (i2 & 267386880) >>> 20;
    }

    public static double m(Object obj, long j2) {
        return UnsafeUtil.B(obj, j2);
    }

    public static float q(Object obj, long j2) {
        return UnsafeUtil.C(obj, j2);
    }

    public static int v(Object obj, long j2) {
        return UnsafeUtil.D(obj, j2);
    }

    public static boolean w(int i2) {
        return (i2 & 536870912) != 0;
    }

    public static boolean z(Object obj, int i2, Schema schema) {
        return schema.e(UnsafeUtil.H(obj, S(i2)));
    }

    public final boolean A(Object obj, int i2, int i3) {
        List list = (List) UnsafeUtil.H(obj, S(i2));
        if (list.isEmpty()) {
            return true;
        }
        Schema t2 = t(i3);
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (!t2.e(list.get(i4))) {
                return false;
            }
        }
        return true;
    }

    public final boolean B(Object obj, int i2, int i3) {
        Map h2 = this.f21087q.h(UnsafeUtil.H(obj, S(i2)));
        if (h2.isEmpty()) {
            return true;
        }
        if (this.f21087q.c(s(i3)).f21062c.d() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        Schema schema = null;
        for (Object next : h2.values()) {
            if (schema == null) {
                schema = Protobuf.a().c(next.getClass());
            }
            if (!schema.e(next)) {
                return false;
            }
        }
        return true;
    }

    public final boolean D(Object obj, Object obj2, int i2) {
        long Z = (long) (Z(i2) & 1048575);
        return UnsafeUtil.D(obj, Z) == UnsafeUtil.D(obj2, Z);
    }

    public final boolean E(Object obj, int i2, int i3) {
        return UnsafeUtil.D(obj, (long) (Z(i3) & 1048575)) == i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v17, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v18, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v19, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v20, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v21, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v22, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v23, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v24, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v25, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v26, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v27, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v28, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v29, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v30, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v31, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v32, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v33, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v34, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v35, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v36, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v37, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v38, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v39, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v40, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v41, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v42, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v43, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v44, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v45, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v46, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v47, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v48, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v49, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v50, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v51, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v52, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v53, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v54, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v55, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v56, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v57, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v58, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v59, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v60, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v61, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v62, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v63, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v66, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v67, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v68, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v69, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v69, resolved type: androidx.datastore.preferences.protobuf.FieldSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v71, resolved type: androidx.datastore.preferences.protobuf.FieldSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v71, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v72, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v73, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v74, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v75, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v72, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v76, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v77, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v78, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v79, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v80, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v81, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v82, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v83, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v84, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v85, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v86, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v87, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v88, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v89, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v90, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v91, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v92, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v93, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v94, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v95, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v96, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v87, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v97, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v98, resolved type: androidx.datastore.preferences.protobuf.ExtensionRegistryLite} */
    /* JADX WARNING: type inference failed for: r13v65, types: [boolean] */
    /* JADX WARNING: type inference failed for: r14v68 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00f8, code lost:
        r14 = r6;
        r15 = r7;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x010c, code lost:
        r13 = r5;
        r14 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x010e, code lost:
        r15 = r7;
        r14 = r14;
        r13 = r13;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x064b A[Catch:{ all -> 0x0671 }] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0673  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x06b1 A[LOOP:6: B:201:0x06ad->B:203:0x06b1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x06c6  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void H(androidx.datastore.preferences.protobuf.UnknownFieldSchema r19, androidx.datastore.preferences.protobuf.ExtensionSchema r20, java.lang.Object r21, androidx.datastore.preferences.protobuf.Reader r22, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r23) {
        /*
            r18 = this;
            r8 = r18
            r7 = r19
            r15 = r21
            r0 = r22
            r6 = r23
            r17 = 0
            r5 = r17
            r9 = r5
        L_0x000f:
            int r2 = r22.J()     // Catch:{ all -> 0x06a5 }
            int r3 = r8.Y(r2)     // Catch:{ all -> 0x06a5 }
            r10 = 0
            if (r3 >= 0) goto L_0x00b7
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r1) goto L_0x003f
            int r0 = r8.f21081k
            r4 = r5
        L_0x0022:
            int r1 = r8.f21082l
            if (r0 >= r1) goto L_0x0039
            int[] r1 = r8.f21080j
            r3 = r1[r0]
            r1 = r18
            r2 = r21
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.o(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L_0x0022
        L_0x0039:
            if (r4 == 0) goto L_0x003e
            r7.o(r15, r4)
        L_0x003e:
            return
        L_0x003f:
            boolean r1 = r8.f21076f     // Catch:{ all -> 0x005a }
            if (r1 != 0) goto L_0x0048
            r4 = r20
            r12 = r17
            goto L_0x0051
        L_0x0048:
            androidx.datastore.preferences.protobuf.MessageLite r1 = r8.f21075e     // Catch:{ all -> 0x005a }
            r4 = r20
            java.lang.Object r1 = r4.b(r6, r1, r2)     // Catch:{ all -> 0x005a }
            r12 = r1
        L_0x0051:
            if (r12 == 0) goto L_0x0077
            if (r9 != 0) goto L_0x005f
            androidx.datastore.preferences.protobuf.FieldSet r1 = r20.d(r21)     // Catch:{ all -> 0x005a }
            goto L_0x0060
        L_0x005a:
            r0 = move-exception
        L_0x005b:
            r11 = r15
        L_0x005c:
            r15 = r7
            goto L_0x06a9
        L_0x005f:
            r1 = r9
        L_0x0060:
            r9 = r20
            r10 = r21
            r11 = r22
            r13 = r23
            r14 = r1
            r3 = r15
            r15 = r5
            r16 = r19
            java.lang.Object r5 = r9.g(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0074 }
            r9 = r1
        L_0x0072:
            r15 = r3
            goto L_0x000f
        L_0x0074:
            r0 = move-exception
            r11 = r3
            goto L_0x005c
        L_0x0077:
            r3 = r15
            boolean r1 = r7.q(r0)     // Catch:{ all -> 0x0074 }
            if (r1 == 0) goto L_0x0085
            boolean r1 = r22.O()     // Catch:{ all -> 0x0074 }
            if (r1 == 0) goto L_0x0093
        L_0x0084:
            goto L_0x0072
        L_0x0085:
            if (r5 != 0) goto L_0x008c
            java.lang.Object r1 = r7.f(r3)     // Catch:{ all -> 0x0074 }
            r5 = r1
        L_0x008c:
            boolean r1 = r7.m(r5, r0, r10)     // Catch:{ all -> 0x0074 }
            if (r1 == 0) goto L_0x0093
            goto L_0x0084
        L_0x0093:
            int r0 = r8.f21081k
            r4 = r5
        L_0x0096:
            int r1 = r8.f21082l
            if (r0 >= r1) goto L_0x00b0
            int[] r1 = r8.f21080j
            r5 = r1[r0]
            r1 = r18
            r2 = r21
            r11 = r3
            r3 = r5
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.o(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            r3 = r11
            goto L_0x0096
        L_0x00b0:
            r11 = r3
            if (r4 == 0) goto L_0x00b6
            r7.o(r11, r4)
        L_0x00b6:
            return
        L_0x00b7:
            r4 = r20
            r11 = r15
            int r12 = r8.m0(r3)     // Catch:{ all -> 0x027d }
            int r1 = l0(r12)     // Catch:{ InvalidWireTypeException -> 0x0281 }
            switch(r1) {
                case 0: goto L_0x0632;
                case 1: goto L_0x0620;
                case 2: goto L_0x060e;
                case 3: goto L_0x05fc;
                case 4: goto L_0x05ea;
                case 5: goto L_0x05d7;
                case 6: goto L_0x05c4;
                case 7: goto L_0x05b1;
                case 8: goto L_0x05a6;
                case 9: goto L_0x0591;
                case 10: goto L_0x057e;
                case 11: goto L_0x056b;
                case 12: goto L_0x0545;
                case 13: goto L_0x0532;
                case 14: goto L_0x051f;
                case 15: goto L_0x050c;
                case 16: goto L_0x04f9;
                case 17: goto L_0x04e4;
                case 18: goto L_0x04d2;
                case 19: goto L_0x04c0;
                case 20: goto L_0x04ae;
                case 21: goto L_0x049c;
                case 22: goto L_0x048a;
                case 23: goto L_0x0478;
                case 24: goto L_0x0466;
                case 25: goto L_0x0454;
                case 26: goto L_0x044c;
                case 27: goto L_0x0437;
                case 28: goto L_0x0425;
                case 29: goto L_0x0413;
                case 30: goto L_0x03f2;
                case 31: goto L_0x03e0;
                case 32: goto L_0x03ce;
                case 33: goto L_0x03bc;
                case 34: goto L_0x03aa;
                case 35: goto L_0x0398;
                case 36: goto L_0x0386;
                case 37: goto L_0x0374;
                case 38: goto L_0x0362;
                case 39: goto L_0x0350;
                case 40: goto L_0x033e;
                case 41: goto L_0x032c;
                case 42: goto L_0x031a;
                case 43: goto L_0x0308;
                case 44: goto L_0x02e7;
                case 45: goto L_0x02d5;
                case 46: goto L_0x02c3;
                case 47: goto L_0x02b1;
                case 48: goto L_0x029f;
                case 49: goto L_0x0284;
                case 50: goto L_0x0260;
                case 51: goto L_0x024c;
                case 52: goto L_0x0238;
                case 53: goto L_0x0224;
                case 54: goto L_0x0210;
                case 55: goto L_0x01fc;
                case 56: goto L_0x01e8;
                case 57: goto L_0x01d4;
                case 58: goto L_0x01c0;
                case 59: goto L_0x01b8;
                case 60: goto L_0x01a6;
                case 61: goto L_0x0196;
                case 62: goto L_0x0182;
                case 63: goto L_0x015d;
                case 64: goto L_0x014a;
                case 65: goto L_0x0137;
                case 66: goto L_0x0124;
                case 67: goto L_0x0111;
                case 68: goto L_0x00fc;
                default: goto L_0x00c5;
            }
        L_0x00c5:
            if (r5 != 0) goto L_0x00d2
            java.lang.Object r5 = r7.f(r11)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            goto L_0x00d2
        L_0x00cc:
            r0 = move-exception
            goto L_0x005c
        L_0x00ce:
            r14 = r6
            r15 = r7
            goto L_0x0645
        L_0x00d2:
            boolean r1 = r7.m(r5, r0, r10)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            if (r1 != 0) goto L_0x00f8
            int r0 = r8.f21081k
            r4 = r5
        L_0x00db:
            int r1 = r8.f21082l
            if (r0 >= r1) goto L_0x00f2
            int[] r1 = r8.f21080j
            r3 = r1[r0]
            r1 = r18
            r2 = r21
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.o(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L_0x00db
        L_0x00f2:
            if (r4 == 0) goto L_0x00f7
            r7.o(r11, r4)
        L_0x00f7:
            return
        L_0x00f8:
            r14 = r6
            r15 = r7
            goto L_0x06a0
        L_0x00fc:
            java.lang.Object r1 = r8.N(r11, r2, r3)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            androidx.datastore.preferences.protobuf.MessageLite r1 = (androidx.datastore.preferences.protobuf.MessageLite) r1     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            androidx.datastore.preferences.protobuf.Schema r12 = r8.t(r3)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            r0.Y(r1, r12, r6)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            r8.k0(r11, r2, r3, r1)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
        L_0x010c:
            r13 = r5
            r14 = r6
        L_0x010e:
            r15 = r7
            goto L_0x0643
        L_0x0111:
            long r12 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            long r14 = r22.H()     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            java.lang.Long r1 = java.lang.Long.valueOf(r14)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            androidx.datastore.preferences.protobuf.UnsafeUtil.Y(r11, r12, r1)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            r8.g0(r11, r2, r3)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            goto L_0x010c
        L_0x0124:
            long r12 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            int r1 = r22.G()     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            androidx.datastore.preferences.protobuf.UnsafeUtil.Y(r11, r12, r1)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            r8.g0(r11, r2, r3)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            goto L_0x010c
        L_0x0137:
            long r12 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            long r14 = r22.w()     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            java.lang.Long r1 = java.lang.Long.valueOf(r14)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            androidx.datastore.preferences.protobuf.UnsafeUtil.Y(r11, r12, r1)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            r8.g0(r11, r2, r3)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            goto L_0x010c
        L_0x014a:
            long r12 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            int r1 = r22.P()     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            androidx.datastore.preferences.protobuf.UnsafeUtil.Y(r11, r12, r1)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            r8.g0(r11, r2, r3)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            goto L_0x010c
        L_0x015d:
            int r1 = r22.D()     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            androidx.datastore.preferences.protobuf.Internal$EnumVerifier r13 = r8.r(r3)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            if (r13 == 0) goto L_0x0173
            boolean r13 = r13.a(r1)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            if (r13 == 0) goto L_0x016e
            goto L_0x0173
        L_0x016e:
            java.lang.Object r5 = androidx.datastore.preferences.protobuf.SchemaUtil.J(r11, r2, r1, r5, r7)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            goto L_0x00f8
        L_0x0173:
            long r12 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            androidx.datastore.preferences.protobuf.UnsafeUtil.Y(r11, r12, r1)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            r8.g0(r11, r2, r3)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            goto L_0x010c
        L_0x0182:
            long r12 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            int r1 = r22.y()     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            androidx.datastore.preferences.protobuf.UnsafeUtil.Y(r11, r12, r1)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            r8.g0(r11, r2, r3)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            goto L_0x010c
        L_0x0196:
            long r12 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            androidx.datastore.preferences.protobuf.ByteString r1 = r22.M()     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            androidx.datastore.preferences.protobuf.UnsafeUtil.Y(r11, r12, r1)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            r8.g0(r11, r2, r3)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            goto L_0x010c
        L_0x01a6:
            java.lang.Object r1 = r8.N(r11, r2, r3)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            androidx.datastore.preferences.protobuf.MessageLite r1 = (androidx.datastore.preferences.protobuf.MessageLite) r1     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            androidx.datastore.preferences.protobuf.Schema r12 = r8.t(r3)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            r0.W(r1, r12, r6)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            r8.k0(r11, r2, r3, r1)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            goto L_0x010c
        L_0x01b8:
            r8.c0(r11, r12, r0)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            r8.g0(r11, r2, r3)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            goto L_0x010c
        L_0x01c0:
            long r12 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            boolean r1 = r22.v()     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            androidx.datastore.preferences.protobuf.UnsafeUtil.Y(r11, r12, r1)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            r8.g0(r11, r2, r3)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            goto L_0x010c
        L_0x01d4:
            long r12 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            int r1 = r22.u()     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            androidx.datastore.preferences.protobuf.UnsafeUtil.Y(r11, r12, r1)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            r8.g0(r11, r2, r3)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            goto L_0x010c
        L_0x01e8:
            long r12 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            long r14 = r22.q()     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            java.lang.Long r1 = java.lang.Long.valueOf(r14)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            androidx.datastore.preferences.protobuf.UnsafeUtil.Y(r11, r12, r1)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            r8.g0(r11, r2, r3)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            goto L_0x010c
        L_0x01fc:
            long r12 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            int r1 = r22.i()     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            androidx.datastore.preferences.protobuf.UnsafeUtil.Y(r11, r12, r1)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            r8.g0(r11, r2, r3)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            goto L_0x010c
        L_0x0210:
            long r12 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            long r14 = r22.p()     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            java.lang.Long r1 = java.lang.Long.valueOf(r14)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            androidx.datastore.preferences.protobuf.UnsafeUtil.Y(r11, r12, r1)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            r8.g0(r11, r2, r3)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            goto L_0x010c
        L_0x0224:
            long r12 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            long r14 = r22.n()     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            java.lang.Long r1 = java.lang.Long.valueOf(r14)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            androidx.datastore.preferences.protobuf.UnsafeUtil.Y(r11, r12, r1)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            r8.g0(r11, r2, r3)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            goto L_0x010c
        L_0x0238:
            long r12 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            float r1 = r22.readFloat()     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            java.lang.Float r1 = java.lang.Float.valueOf(r1)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            androidx.datastore.preferences.protobuf.UnsafeUtil.Y(r11, r12, r1)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            r8.g0(r11, r2, r3)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            goto L_0x010c
        L_0x024c:
            long r12 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            double r14 = r22.readDouble()     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            java.lang.Double r1 = java.lang.Double.valueOf(r14)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            androidx.datastore.preferences.protobuf.UnsafeUtil.Y(r11, r12, r1)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            r8.g0(r11, r2, r3)     // Catch:{ InvalidWireTypeException -> 0x00ce, all -> 0x00cc }
            goto L_0x010c
        L_0x0260:
            java.lang.Object r12 = r8.s(r3)     // Catch:{ InvalidWireTypeException -> 0x0281 }
            r1 = r18
            r2 = r21
            r4 = r12
            r13 = r5
            r5 = r23
            r14 = r6
            r6 = r22
            r1.I(r2, r3, r4, r5, r6)     // Catch:{ InvalidWireTypeException -> 0x0279, all -> 0x0274 }
            goto L_0x010e
        L_0x0274:
            r0 = move-exception
            r15 = r7
        L_0x0276:
            r5 = r13
            goto L_0x06a9
        L_0x0279:
            r15 = r7
        L_0x027a:
            r5 = r13
            goto L_0x0645
        L_0x027d:
            r0 = move-exception
            r13 = r5
            goto L_0x005c
        L_0x0281:
            r13 = r5
            goto L_0x00ce
        L_0x0284:
            r13 = r5
            r14 = r6
            long r4 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x0279, all -> 0x0274 }
            androidx.datastore.preferences.protobuf.Schema r6 = r8.t(r3)     // Catch:{ InvalidWireTypeException -> 0x0279, all -> 0x0274 }
            r1 = r18
            r2 = r21
            r3 = r4
            r5 = r22
            r15 = r7
            r7 = r23
            r1.a0(r2, r3, r5, r6, r7)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x029d:
            r0 = move-exception
            goto L_0x0276
        L_0x029f:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.f21084n     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r0.s(r1)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x02b1:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.f21084n     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r0.o(r1)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x02c3:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.f21084n     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r0.A(r1)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x02d5:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.f21084n     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r0.r(r1)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x02e7:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.f21084n     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            long r4 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            java.util.List r4 = r1.c(r11, r4)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r0.C(r4)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            androidx.datastore.preferences.protobuf.Internal$EnumVerifier r5 = r8.r(r3)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r1 = r21
            r3 = r4
            r4 = r5
            r5 = r13
            r6 = r19
            java.lang.Object r5 = androidx.datastore.preferences.protobuf.SchemaUtil.A(r1, r2, r3, r4, r5, r6)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x06a0
        L_0x0308:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.f21084n     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r0.t(r1)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x031a:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.f21084n     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r0.I(r1)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x032c:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.f21084n     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r0.F(r1)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x033e:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.f21084n     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r0.T(r1)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x0350:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.f21084n     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r0.B(r1)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x0362:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.f21084n     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r0.x(r1)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x0374:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.f21084n     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r0.z(r1)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x0386:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.f21084n     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r0.N(r1)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x0398:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.f21084n     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r0.R(r1)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x03aa:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.f21084n     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r0.s(r1)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x03bc:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.f21084n     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r0.o(r1)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x03ce:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.f21084n     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r0.A(r1)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x03e0:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.f21084n     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r0.r(r1)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x03f2:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.f21084n     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            long r4 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            java.util.List r4 = r1.c(r11, r4)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r0.C(r4)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            androidx.datastore.preferences.protobuf.Internal$EnumVerifier r5 = r8.r(r3)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r1 = r21
            r3 = r4
            r4 = r5
            r5 = r13
            r6 = r19
            java.lang.Object r5 = androidx.datastore.preferences.protobuf.SchemaUtil.A(r1, r2, r3, r4, r5, r6)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x06a0
        L_0x0413:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.f21084n     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r0.t(r1)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x0425:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.f21084n     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r0.Q(r1)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x0437:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.Schema r5 = r8.t(r3)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r1 = r18
            r2 = r21
            r3 = r12
            r4 = r22
            r6 = r23
            r1.b0(r2, r3, r4, r5, r6)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x044c:
            r13 = r5
            r14 = r6
            r15 = r7
            r8.d0(r11, r12, r0)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x0454:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.f21084n     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r0.I(r1)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x0466:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.f21084n     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r0.F(r1)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x0478:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.f21084n     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r0.T(r1)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x048a:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.f21084n     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r0.B(r1)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x049c:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.f21084n     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r0.x(r1)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x04ae:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.f21084n     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r0.z(r1)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x04c0:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.f21084n     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r0.N(r1)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x04d2:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.f21084n     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r0.R(r1)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x04e4:
            r13 = r5
            r14 = r6
            r15 = r7
            java.lang.Object r1 = r8.M(r11, r3)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            androidx.datastore.preferences.protobuf.MessageLite r1 = (androidx.datastore.preferences.protobuf.MessageLite) r1     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            androidx.datastore.preferences.protobuf.Schema r2 = r8.t(r3)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r0.Y(r1, r2, r14)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r8.j0(r11, r3, r1)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x04f9:
            r13 = r5
            r14 = r6
            r15 = r7
            long r1 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            long r4 = r22.H()     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            androidx.datastore.preferences.protobuf.UnsafeUtil.X(r11, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r8.f0(r11, r3)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x050c:
            r13 = r5
            r14 = r6
            r15 = r7
            long r1 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            int r4 = r22.G()     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            androidx.datastore.preferences.protobuf.UnsafeUtil.W(r11, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r8.f0(r11, r3)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x051f:
            r13 = r5
            r14 = r6
            r15 = r7
            long r1 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            long r4 = r22.w()     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            androidx.datastore.preferences.protobuf.UnsafeUtil.X(r11, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r8.f0(r11, r3)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x0532:
            r13 = r5
            r14 = r6
            r15 = r7
            long r1 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            int r4 = r22.P()     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            androidx.datastore.preferences.protobuf.UnsafeUtil.W(r11, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r8.f0(r11, r3)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x0545:
            r13 = r5
            r14 = r6
            r15 = r7
            int r1 = r22.D()     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            androidx.datastore.preferences.protobuf.Internal$EnumVerifier r4 = r8.r(r3)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            if (r4 == 0) goto L_0x055f
            boolean r4 = r4.a(r1)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            if (r4 == 0) goto L_0x0559
            goto L_0x055f
        L_0x0559:
            java.lang.Object r5 = androidx.datastore.preferences.protobuf.SchemaUtil.J(r11, r2, r1, r13, r15)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x06a0
        L_0x055f:
            long r4 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            androidx.datastore.preferences.protobuf.UnsafeUtil.W(r11, r4, r1)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r8.f0(r11, r3)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x056b:
            r13 = r5
            r14 = r6
            r15 = r7
            long r1 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            int r4 = r22.y()     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            androidx.datastore.preferences.protobuf.UnsafeUtil.W(r11, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r8.f0(r11, r3)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x057e:
            r13 = r5
            r14 = r6
            r15 = r7
            long r1 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            androidx.datastore.preferences.protobuf.ByteString r4 = r22.M()     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            androidx.datastore.preferences.protobuf.UnsafeUtil.Y(r11, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r8.f0(r11, r3)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x0591:
            r13 = r5
            r14 = r6
            r15 = r7
            java.lang.Object r1 = r8.M(r11, r3)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            androidx.datastore.preferences.protobuf.MessageLite r1 = (androidx.datastore.preferences.protobuf.MessageLite) r1     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            androidx.datastore.preferences.protobuf.Schema r2 = r8.t(r3)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r0.W(r1, r2, r14)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r8.j0(r11, r3, r1)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x05a6:
            r13 = r5
            r14 = r6
            r15 = r7
            r8.c0(r11, r12, r0)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r8.f0(r11, r3)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x05b1:
            r13 = r5
            r14 = r6
            r15 = r7
            long r1 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            boolean r4 = r22.v()     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            androidx.datastore.preferences.protobuf.UnsafeUtil.N(r11, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r8.f0(r11, r3)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x05c4:
            r13 = r5
            r14 = r6
            r15 = r7
            long r1 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            int r4 = r22.u()     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            androidx.datastore.preferences.protobuf.UnsafeUtil.W(r11, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r8.f0(r11, r3)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x05d7:
            r13 = r5
            r14 = r6
            r15 = r7
            long r1 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            long r4 = r22.q()     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            androidx.datastore.preferences.protobuf.UnsafeUtil.X(r11, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r8.f0(r11, r3)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x05ea:
            r13 = r5
            r14 = r6
            r15 = r7
            long r1 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            int r4 = r22.i()     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            androidx.datastore.preferences.protobuf.UnsafeUtil.W(r11, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r8.f0(r11, r3)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x05fc:
            r13 = r5
            r14 = r6
            r15 = r7
            long r1 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            long r4 = r22.p()     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            androidx.datastore.preferences.protobuf.UnsafeUtil.X(r11, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r8.f0(r11, r3)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x060e:
            r13 = r5
            r14 = r6
            r15 = r7
            long r1 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            long r4 = r22.n()     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            androidx.datastore.preferences.protobuf.UnsafeUtil.X(r11, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r8.f0(r11, r3)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x0620:
            r13 = r5
            r14 = r6
            r15 = r7
            long r1 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            float r4 = r22.readFloat()     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            androidx.datastore.preferences.protobuf.UnsafeUtil.V(r11, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r8.f0(r11, r3)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x0632:
            r13 = r5
            r14 = r6
            r15 = r7
            long r1 = S(r12)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            double r4 = r22.readDouble()     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            androidx.datastore.preferences.protobuf.UnsafeUtil.U(r11, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
            r8.f0(r11, r3)     // Catch:{ InvalidWireTypeException -> 0x027a, all -> 0x029d }
        L_0x0643:
            r5 = r13
            goto L_0x06a0
        L_0x0645:
            boolean r1 = r15.q(r0)     // Catch:{ all -> 0x0671 }
            if (r1 == 0) goto L_0x0673
            boolean r1 = r22.O()     // Catch:{ all -> 0x0671 }
            if (r1 != 0) goto L_0x06a0
            int r0 = r8.f21081k
            r4 = r5
        L_0x0654:
            int r1 = r8.f21082l
            if (r0 >= r1) goto L_0x066b
            int[] r1 = r8.f21080j
            r3 = r1[r0]
            r1 = r18
            r2 = r21
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.o(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L_0x0654
        L_0x066b:
            if (r4 == 0) goto L_0x0670
            r15.o(r11, r4)
        L_0x0670:
            return
        L_0x0671:
            r0 = move-exception
            goto L_0x06a9
        L_0x0673:
            if (r5 != 0) goto L_0x067a
            java.lang.Object r1 = r15.f(r11)     // Catch:{ all -> 0x0671 }
            r5 = r1
        L_0x067a:
            boolean r1 = r15.m(r5, r0, r10)     // Catch:{ all -> 0x0671 }
            if (r1 != 0) goto L_0x06a0
            int r0 = r8.f21081k
            r4 = r5
        L_0x0683:
            int r1 = r8.f21082l
            if (r0 >= r1) goto L_0x069a
            int[] r1 = r8.f21080j
            r3 = r1[r0]
            r1 = r18
            r2 = r21
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.o(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L_0x0683
        L_0x069a:
            if (r4 == 0) goto L_0x069f
            r15.o(r11, r4)
        L_0x069f:
            return
        L_0x06a0:
            r6 = r14
            r7 = r15
            r15 = r11
            goto L_0x000f
        L_0x06a5:
            r0 = move-exception
            r13 = r5
            goto L_0x005b
        L_0x06a9:
            int r1 = r8.f21081k
            r7 = r1
            r4 = r5
        L_0x06ad:
            int r1 = r8.f21082l
            if (r7 >= r1) goto L_0x06c4
            int[] r1 = r8.f21080j
            r3 = r1[r7]
            r1 = r18
            r2 = r21
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.o(r2, r3, r4, r5, r6)
            int r7 = r7 + 1
            goto L_0x06ad
        L_0x06c4:
            if (r4 == 0) goto L_0x06c9
            r15.o(r11, r4)
        L_0x06c9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.H(androidx.datastore.preferences.protobuf.UnknownFieldSchema, androidx.datastore.preferences.protobuf.ExtensionSchema, java.lang.Object, androidx.datastore.preferences.protobuf.Reader, androidx.datastore.preferences.protobuf.ExtensionRegistryLite):void");
    }

    public final void I(Object obj, int i2, Object obj2, ExtensionRegistryLite extensionRegistryLite, Reader reader) {
        long S = S(m0(i2));
        Object H = UnsafeUtil.H(obj, S);
        if (H == null) {
            H = this.f21087q.e(obj2);
            UnsafeUtil.Y(obj, S, H);
        } else if (this.f21087q.g(H)) {
            Object e2 = this.f21087q.e(obj2);
            this.f21087q.a(e2, H);
            UnsafeUtil.Y(obj, S, e2);
            H = e2;
        }
        reader.X(this.f21087q.d(H), this.f21087q.c(obj2), extensionRegistryLite);
    }

    public final void J(Object obj, Object obj2, int i2) {
        if (x(obj2, i2)) {
            long S = S(m0(i2));
            Unsafe unsafe = f21070s;
            Object object = unsafe.getObject(obj2, S);
            if (object != null) {
                Schema t2 = t(i2);
                if (!x(obj, i2)) {
                    if (!C(object)) {
                        unsafe.putObject(obj, S, object);
                    } else {
                        Object g2 = t2.g();
                        t2.a(g2, object);
                        unsafe.putObject(obj, S, g2);
                    }
                    f0(obj, i2);
                    return;
                }
                Object object2 = unsafe.getObject(obj, S);
                if (!C(object2)) {
                    Object g3 = t2.g();
                    t2.a(g3, object2);
                    unsafe.putObject(obj, S, g3);
                    object2 = g3;
                }
                t2.a(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + R(i2) + " is present but null: " + obj2);
        }
    }

    public final void K(Object obj, Object obj2, int i2) {
        int R = R(i2);
        if (E(obj2, R, i2)) {
            long S = S(m0(i2));
            Unsafe unsafe = f21070s;
            Object object = unsafe.getObject(obj2, S);
            if (object != null) {
                Schema t2 = t(i2);
                if (!E(obj, R, i2)) {
                    if (!C(object)) {
                        unsafe.putObject(obj, S, object);
                    } else {
                        Object g2 = t2.g();
                        t2.a(g2, object);
                        unsafe.putObject(obj, S, g2);
                    }
                    g0(obj, R, i2);
                    return;
                }
                Object object2 = unsafe.getObject(obj, S);
                if (!C(object2)) {
                    Object g3 = t2.g();
                    t2.a(g3, object2);
                    unsafe.putObject(obj, S, g3);
                    object2 = g3;
                }
                t2.a(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + R(i2) + " is present but null: " + obj2);
        }
    }

    public final void L(Object obj, Object obj2, int i2) {
        int m0 = m0(i2);
        long S = S(m0);
        int R = R(i2);
        switch (l0(m0)) {
            case 0:
                if (x(obj2, i2)) {
                    UnsafeUtil.U(obj, S, UnsafeUtil.B(obj2, S));
                    f0(obj, i2);
                    return;
                }
                return;
            case 1:
                if (x(obj2, i2)) {
                    UnsafeUtil.V(obj, S, UnsafeUtil.C(obj2, S));
                    f0(obj, i2);
                    return;
                }
                return;
            case 2:
                if (x(obj2, i2)) {
                    UnsafeUtil.X(obj, S, UnsafeUtil.F(obj2, S));
                    f0(obj, i2);
                    return;
                }
                return;
            case 3:
                if (x(obj2, i2)) {
                    UnsafeUtil.X(obj, S, UnsafeUtil.F(obj2, S));
                    f0(obj, i2);
                    return;
                }
                return;
            case 4:
                if (x(obj2, i2)) {
                    UnsafeUtil.W(obj, S, UnsafeUtil.D(obj2, S));
                    f0(obj, i2);
                    return;
                }
                return;
            case 5:
                if (x(obj2, i2)) {
                    UnsafeUtil.X(obj, S, UnsafeUtil.F(obj2, S));
                    f0(obj, i2);
                    return;
                }
                return;
            case 6:
                if (x(obj2, i2)) {
                    UnsafeUtil.W(obj, S, UnsafeUtil.D(obj2, S));
                    f0(obj, i2);
                    return;
                }
                return;
            case 7:
                if (x(obj2, i2)) {
                    UnsafeUtil.N(obj, S, UnsafeUtil.u(obj2, S));
                    f0(obj, i2);
                    return;
                }
                return;
            case 8:
                if (x(obj2, i2)) {
                    UnsafeUtil.Y(obj, S, UnsafeUtil.H(obj2, S));
                    f0(obj, i2);
                    return;
                }
                return;
            case 9:
                J(obj, obj2, i2);
                return;
            case 10:
                if (x(obj2, i2)) {
                    UnsafeUtil.Y(obj, S, UnsafeUtil.H(obj2, S));
                    f0(obj, i2);
                    return;
                }
                return;
            case 11:
                if (x(obj2, i2)) {
                    UnsafeUtil.W(obj, S, UnsafeUtil.D(obj2, S));
                    f0(obj, i2);
                    return;
                }
                return;
            case 12:
                if (x(obj2, i2)) {
                    UnsafeUtil.W(obj, S, UnsafeUtil.D(obj2, S));
                    f0(obj, i2);
                    return;
                }
                return;
            case 13:
                if (x(obj2, i2)) {
                    UnsafeUtil.W(obj, S, UnsafeUtil.D(obj2, S));
                    f0(obj, i2);
                    return;
                }
                return;
            case 14:
                if (x(obj2, i2)) {
                    UnsafeUtil.X(obj, S, UnsafeUtil.F(obj2, S));
                    f0(obj, i2);
                    return;
                }
                return;
            case 15:
                if (x(obj2, i2)) {
                    UnsafeUtil.W(obj, S, UnsafeUtil.D(obj2, S));
                    f0(obj, i2);
                    return;
                }
                return;
            case 16:
                if (x(obj2, i2)) {
                    UnsafeUtil.X(obj, S, UnsafeUtil.F(obj2, S));
                    f0(obj, i2);
                    return;
                }
                return;
            case 17:
                J(obj, obj2, i2);
                return;
            case 18:
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER:
            case 20:
            case 21:
            case 22:
            case 23:
            case Service.METRICS_FIELD_NUMBER /*24*/:
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /*25*/:
            case Service.BILLING_FIELD_NUMBER /*26*/:
            case 27:
            case Service.MONITORING_FIELD_NUMBER /*28*/:
            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /*29*/:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /*42*/:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f21084n.a(obj, obj2, S);
                return;
            case 50:
                SchemaUtil.F(this.f21087q, obj, obj2, S);
                return;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (E(obj2, R, i2)) {
                    UnsafeUtil.Y(obj, S, UnsafeUtil.H(obj2, S));
                    g0(obj, R, i2);
                    return;
                }
                return;
            case 60:
                K(obj, obj2, i2);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (E(obj2, R, i2)) {
                    UnsafeUtil.Y(obj, S, UnsafeUtil.H(obj2, S));
                    g0(obj, R, i2);
                    return;
                }
                return;
            case 68:
                K(obj, obj2, i2);
                return;
            default:
                return;
        }
    }

    public final Object M(Object obj, int i2) {
        Schema t2 = t(i2);
        long S = S(m0(i2));
        if (!x(obj, i2)) {
            return t2.g();
        }
        Object object = f21070s.getObject(obj, S);
        if (C(object)) {
            return object;
        }
        Object g2 = t2.g();
        if (object != null) {
            t2.a(g2, object);
        }
        return g2;
    }

    public final Object N(Object obj, int i2, int i3) {
        Schema t2 = t(i3);
        if (!E(obj, i2, i3)) {
            return t2.g();
        }
        Object object = f21070s.getObject(obj, S(m0(i3)));
        if (C(object)) {
            return object;
        }
        Object g2 = t2.g();
        if (object != null) {
            t2.a(g2, object);
        }
        return g2;
    }

    public final int R(int i2) {
        return this.f21071a[i2];
    }

    public final int Y(int i2) {
        if (i2 < this.f21073c || i2 > this.f21074d) {
            return -1;
        }
        return h0(i2, 0);
    }

    public final int Z(int i2) {
        return this.f21071a[i2 + 2];
    }

    public void a(Object obj, Object obj2) {
        l(obj);
        obj2.getClass();
        for (int i2 = 0; i2 < this.f21071a.length; i2 += 3) {
            L(obj, obj2, i2);
        }
        SchemaUtil.G(this.f21085o, obj, obj2);
        if (this.f21076f) {
            SchemaUtil.E(this.f21086p, obj, obj2);
        }
    }

    public final void a0(Object obj, long j2, Reader reader, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        reader.Z(this.f21084n.c(obj, j2), schema, extensionRegistryLite);
    }

    public boolean b(Object obj, Object obj2) {
        int length = this.f21071a.length;
        for (int i2 = 0; i2 < length; i2 += 3) {
            if (!n(obj, obj2, i2)) {
                return false;
            }
        }
        if (!this.f21085o.g(obj).equals(this.f21085o.g(obj2))) {
            return false;
        }
        if (this.f21076f) {
            return this.f21086p.c(obj).equals(this.f21086p.c(obj2));
        }
        return true;
    }

    public final void b0(Object obj, int i2, Reader reader, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        reader.a0(this.f21084n.c(obj, S(i2)), schema, extensionRegistryLite);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x016b, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0229, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int c(java.lang.Object r9) {
        /*
            r8 = this;
            int[] r0 = r8.f21071a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x022d
            int r3 = r8.m0(r1)
            int r4 = r8.R(r1)
            long r5 = S(r3)
            int r3 = l0(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0219;
                case 1: goto L_0x020d;
                case 2: goto L_0x0201;
                case 3: goto L_0x01f5;
                case 4: goto L_0x01ed;
                case 5: goto L_0x01e1;
                case 6: goto L_0x01d9;
                case 7: goto L_0x01cd;
                case 8: goto L_0x01bf;
                case 9: goto L_0x01b4;
                case 10: goto L_0x01a8;
                case 11: goto L_0x01a0;
                case 12: goto L_0x0198;
                case 13: goto L_0x0190;
                case 14: goto L_0x0184;
                case 15: goto L_0x017c;
                case 16: goto L_0x0170;
                case 17: goto L_0x0161;
                case 18: goto L_0x0155;
                case 19: goto L_0x0155;
                case 20: goto L_0x0155;
                case 21: goto L_0x0155;
                case 22: goto L_0x0155;
                case 23: goto L_0x0155;
                case 24: goto L_0x0155;
                case 25: goto L_0x0155;
                case 26: goto L_0x0155;
                case 27: goto L_0x0155;
                case 28: goto L_0x0155;
                case 29: goto L_0x0155;
                case 30: goto L_0x0155;
                case 31: goto L_0x0155;
                case 32: goto L_0x0155;
                case 33: goto L_0x0155;
                case 34: goto L_0x0155;
                case 35: goto L_0x0155;
                case 36: goto L_0x0155;
                case 37: goto L_0x0155;
                case 38: goto L_0x0155;
                case 39: goto L_0x0155;
                case 40: goto L_0x0155;
                case 41: goto L_0x0155;
                case 42: goto L_0x0155;
                case 43: goto L_0x0155;
                case 44: goto L_0x0155;
                case 45: goto L_0x0155;
                case 46: goto L_0x0155;
                case 47: goto L_0x0155;
                case 48: goto L_0x0155;
                case 49: goto L_0x0155;
                case 50: goto L_0x0149;
                case 51: goto L_0x0133;
                case 52: goto L_0x0121;
                case 53: goto L_0x010f;
                case 54: goto L_0x00fd;
                case 55: goto L_0x00ef;
                case 56: goto L_0x00dd;
                case 57: goto L_0x00cf;
                case 58: goto L_0x00bd;
                case 59: goto L_0x00a9;
                case 60: goto L_0x0098;
                case 61: goto L_0x0087;
                case 62: goto L_0x007a;
                case 63: goto L_0x006d;
                case 64: goto L_0x0060;
                case 65: goto L_0x004f;
                case 66: goto L_0x0042;
                case 67: goto L_0x0031;
                case 68: goto L_0x001e;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x0229
        L_0x001e:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
        L_0x002e:
            int r2 = r2 + r3
            goto L_0x0229
        L_0x0031:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = X(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.Internal.f(r3)
            goto L_0x002e
        L_0x0042:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = W(r9, r5)
            goto L_0x002e
        L_0x004f:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = X(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.Internal.f(r3)
            goto L_0x002e
        L_0x0060:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = W(r9, r5)
            goto L_0x002e
        L_0x006d:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = W(r9, r5)
            goto L_0x002e
        L_0x007a:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = W(r9, r5)
            goto L_0x002e
        L_0x0087:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x0098:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x00a9:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x00bd:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            boolean r3 = T(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.Internal.c(r3)
            goto L_0x002e
        L_0x00cf:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = W(r9, r5)
            goto L_0x002e
        L_0x00dd:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = X(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.Internal.f(r3)
            goto L_0x002e
        L_0x00ef:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = W(r9, r5)
            goto L_0x002e
        L_0x00fd:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = X(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.Internal.f(r3)
            goto L_0x002e
        L_0x010f:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = X(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.Internal.f(r3)
            goto L_0x002e
        L_0x0121:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            float r3 = V(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x002e
        L_0x0133:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            double r3 = U(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = androidx.datastore.preferences.protobuf.Internal.f(r3)
            goto L_0x002e
        L_0x0149:
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x0155:
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x0161:
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r9, r5)
            if (r3 == 0) goto L_0x016b
            int r7 = r3.hashCode()
        L_0x016b:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0229
        L_0x0170:
            int r2 = r2 * 53
            long r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.F(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.Internal.f(r3)
            goto L_0x002e
        L_0x017c:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.D(r9, r5)
            goto L_0x002e
        L_0x0184:
            int r2 = r2 * 53
            long r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.F(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.Internal.f(r3)
            goto L_0x002e
        L_0x0190:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.D(r9, r5)
            goto L_0x002e
        L_0x0198:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.D(r9, r5)
            goto L_0x002e
        L_0x01a0:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.D(r9, r5)
            goto L_0x002e
        L_0x01a8:
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x01b4:
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r9, r5)
            if (r3 == 0) goto L_0x016b
            int r7 = r3.hashCode()
            goto L_0x016b
        L_0x01bf:
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x01cd:
            int r2 = r2 * 53
            boolean r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.u(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.Internal.c(r3)
            goto L_0x002e
        L_0x01d9:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.D(r9, r5)
            goto L_0x002e
        L_0x01e1:
            int r2 = r2 * 53
            long r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.F(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.Internal.f(r3)
            goto L_0x002e
        L_0x01ed:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.D(r9, r5)
            goto L_0x002e
        L_0x01f5:
            int r2 = r2 * 53
            long r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.F(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.Internal.f(r3)
            goto L_0x002e
        L_0x0201:
            int r2 = r2 * 53
            long r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.F(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.Internal.f(r3)
            goto L_0x002e
        L_0x020d:
            int r2 = r2 * 53
            float r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.C(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x002e
        L_0x0219:
            int r2 = r2 * 53
            double r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.B(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = androidx.datastore.preferences.protobuf.Internal.f(r3)
            goto L_0x002e
        L_0x0229:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022d:
            int r2 = r2 * 53
            androidx.datastore.preferences.protobuf.UnknownFieldSchema r0 = r8.f21085o
            java.lang.Object r0 = r0.g(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f21076f
            if (r0 == 0) goto L_0x024b
            int r2 = r2 * 53
            androidx.datastore.preferences.protobuf.ExtensionSchema r0 = r8.f21086p
            androidx.datastore.preferences.protobuf.FieldSet r9 = r0.c(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x024b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.c(java.lang.Object):int");
    }

    public final void c0(Object obj, int i2, Reader reader) {
        if (w(i2)) {
            UnsafeUtil.Y(obj, S(i2), reader.S());
        } else if (this.f21077g) {
            UnsafeUtil.Y(obj, S(i2), reader.h());
        } else {
            UnsafeUtil.Y(obj, S(i2), reader.M());
        }
    }

    public void d(Object obj) {
        if (C(obj)) {
            if (obj instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
                generatedMessageLite.t();
                generatedMessageLite.s();
                generatedMessageLite.L();
            }
            int length = this.f21071a.length;
            for (int i2 = 0; i2 < length; i2 += 3) {
                int m0 = m0(i2);
                long S = S(m0);
                int l0 = l0(m0);
                if (l0 != 9) {
                    if (l0 == 60 || l0 == 68) {
                        if (E(obj, R(i2), i2)) {
                            t(i2).d(f21070s.getObject(obj, S));
                        }
                    } else {
                        switch (l0) {
                            case 17:
                                break;
                            case 18:
                            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case Service.METRICS_FIELD_NUMBER /*24*/:
                            case Service.MONITORED_RESOURCES_FIELD_NUMBER /*25*/:
                            case Service.BILLING_FIELD_NUMBER /*26*/:
                            case 27:
                            case Service.MONITORING_FIELD_NUMBER /*28*/:
                            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /*29*/:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /*42*/:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.f21084n.b(obj, S);
                                continue;
                            case 50:
                                Unsafe unsafe = f21070s;
                                Object object = unsafe.getObject(obj, S);
                                if (object != null) {
                                    unsafe.putObject(obj, S, this.f21087q.b(object));
                                    break;
                                } else {
                                    continue;
                                }
                        }
                    }
                }
                if (x(obj, i2)) {
                    t(i2).d(f21070s.getObject(obj, S));
                }
            }
            this.f21085o.j(obj);
            if (this.f21076f) {
                this.f21086p.f(obj);
            }
        }
    }

    public final void d0(Object obj, int i2, Reader reader) {
        if (w(i2)) {
            reader.L(this.f21084n.c(obj, S(i2)));
        } else {
            reader.K(this.f21084n.c(obj, S(i2)));
        }
    }

    public final boolean e(Object obj) {
        int i2;
        int i3;
        Object obj2 = obj;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.f21081k) {
            int i7 = this.f21080j[i6];
            int R = R(i7);
            int m0 = m0(i7);
            int i8 = this.f21071a[i7 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i4) {
                if (i9 != 1048575) {
                    i5 = f21070s.getInt(obj2, (long) i9);
                }
                i2 = i5;
                i3 = i9;
            } else {
                i3 = i4;
                i2 = i5;
            }
            if (F(m0) && !y(obj, i7, i3, i2, i10)) {
                return false;
            }
            int l0 = l0(m0);
            if (l0 != 9 && l0 != 17) {
                if (l0 != 27) {
                    if (l0 == 60 || l0 == 68) {
                        if (E(obj2, R, i7) && !z(obj2, m0, t(i7))) {
                            return false;
                        }
                    } else if (l0 != 49) {
                        if (l0 == 50 && !B(obj2, m0, i7)) {
                            return false;
                        }
                    }
                }
                if (!A(obj2, m0, i7)) {
                    return false;
                }
            } else if (y(obj, i7, i3, i2, i10) && !z(obj2, m0, t(i7))) {
                return false;
            }
            i6++;
            i4 = i3;
            i5 = i2;
        }
        return !this.f21076f || this.f21086p.c(obj2).p();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x034d, code lost:
        r12 = r12 + r0;
        r15 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0602, code lost:
        r11 = r11 + 3;
        r0 = r14;
        r1 = r16;
        r10 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b0, code lost:
        r12 = r12 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01bc, code lost:
        r1 = (r1 + r2) + r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int f(java.lang.Object r19) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
            sun.misc.Unsafe r8 = f21070s
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r10
            r1 = 0
            r11 = 0
            r12 = 0
        L_0x000d:
            int[] r2 = r6.f21071a
            int r2 = r2.length
            if (r11 >= r2) goto L_0x060c
            int r2 = r6.m0(r11)
            int r3 = l0(r2)
            int r13 = r6.R(r11)
            int[] r4 = r6.f21071a
            int r5 = r11 + 2
            r4 = r4[r5]
            r5 = r4 & r10
            r14 = 17
            r15 = 1
            if (r3 > r14) goto L_0x0042
            if (r5 == r0) goto L_0x0038
            if (r5 != r10) goto L_0x0031
            r1 = 0
            goto L_0x0037
        L_0x0031:
            long r0 = (long) r5
            int r0 = r8.getInt(r7, r0)
            r1 = r0
        L_0x0037:
            r0 = r5
        L_0x0038:
            int r4 = r4 >>> 20
            int r4 = r15 << r4
            r14 = r0
            r16 = r1
            r17 = r4
            goto L_0x0047
        L_0x0042:
            r14 = r0
            r16 = r1
            r17 = 0
        L_0x0047:
            long r1 = S(r2)
            androidx.datastore.preferences.protobuf.FieldType r0 = androidx.datastore.preferences.protobuf.FieldType.DOUBLE_LIST_PACKED
            int r0 = r0.d()
            if (r3 < r0) goto L_0x005c
            androidx.datastore.preferences.protobuf.FieldType r0 = androidx.datastore.preferences.protobuf.FieldType.SINT64_LIST_PACKED
            int r0 = r0.d()
            if (r3 > r0) goto L_0x005c
            goto L_0x005d
        L_0x005c:
            r5 = 0
        L_0x005d:
            r4 = 0
            r9 = 0
            switch(r3) {
                case 0: goto L_0x05e9;
                case 1: goto L_0x05d1;
                case 2: goto L_0x05b6;
                case 3: goto L_0x059b;
                case 4: goto L_0x0580;
                case 5: goto L_0x056a;
                case 6: goto L_0x0552;
                case 7: goto L_0x053c;
                case 8: goto L_0x0513;
                case 9: goto L_0x04f4;
                case 10: goto L_0x04d7;
                case 11: goto L_0x04bc;
                case 12: goto L_0x04a1;
                case 13: goto L_0x048a;
                case 14: goto L_0x0474;
                case 15: goto L_0x0459;
                case 16: goto L_0x043e;
                case 17: goto L_0x041d;
                case 18: goto L_0x0410;
                case 19: goto L_0x0403;
                case 20: goto L_0x03f6;
                case 21: goto L_0x03e9;
                case 22: goto L_0x03dc;
                case 23: goto L_0x03cf;
                case 24: goto L_0x03c2;
                case 25: goto L_0x03b6;
                case 26: goto L_0x03aa;
                case 27: goto L_0x039a;
                case 28: goto L_0x038e;
                case 29: goto L_0x0381;
                case 30: goto L_0x0375;
                case 31: goto L_0x0369;
                case 32: goto L_0x035d;
                case 33: goto L_0x0351;
                case 34: goto L_0x0342;
                case 35: goto L_0x0324;
                case 36: goto L_0x0306;
                case 37: goto L_0x02e8;
                case 38: goto L_0x02ca;
                case 39: goto L_0x02ac;
                case 40: goto L_0x028e;
                case 41: goto L_0x0270;
                case 42: goto L_0x0252;
                case 43: goto L_0x0234;
                case 44: goto L_0x0217;
                case 45: goto L_0x01fa;
                case 46: goto L_0x01dd;
                case 47: goto L_0x01c0;
                case 48: goto L_0x01a0;
                case 49: goto L_0x0190;
                case 50: goto L_0x0180;
                case 51: goto L_0x0172;
                case 52: goto L_0x0166;
                case 53: goto L_0x0156;
                case 54: goto L_0x0146;
                case 55: goto L_0x0136;
                case 56: goto L_0x012a;
                case 57: goto L_0x011e;
                case 58: goto L_0x0112;
                case 59: goto L_0x00f4;
                case 60: goto L_0x00e1;
                case 61: goto L_0x00d0;
                case 62: goto L_0x00c1;
                case 63: goto L_0x00b2;
                case 64: goto L_0x00a5;
                case 65: goto L_0x009a;
                case 66: goto L_0x008b;
                case 67: goto L_0x007c;
                case 68: goto L_0x0064;
                default: goto L_0x0063;
            }
        L_0x0063:
            goto L_0x0079
        L_0x0064:
            boolean r0 = r6.E(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r8.getObject(r7, r1)
            androidx.datastore.preferences.protobuf.MessageLite r0 = (androidx.datastore.preferences.protobuf.MessageLite) r0
            androidx.datastore.preferences.protobuf.Schema r1 = r6.t(r11)
            int r0 = androidx.datastore.preferences.protobuf.CodedOutputStream.k0(r13, r0, r1)
        L_0x0078:
            int r12 = r12 + r0
        L_0x0079:
            r15 = 0
            goto L_0x0602
        L_0x007c:
            boolean r0 = r6.E(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            long r0 = X(r7, r1)
            int r0 = androidx.datastore.preferences.protobuf.CodedOutputStream.I0(r13, r0)
            goto L_0x0078
        L_0x008b:
            boolean r0 = r6.E(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            int r0 = W(r7, r1)
            int r0 = androidx.datastore.preferences.protobuf.CodedOutputStream.G0(r13, r0)
            goto L_0x0078
        L_0x009a:
            boolean r0 = r6.E(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            int r0 = androidx.datastore.preferences.protobuf.CodedOutputStream.E0(r13, r9)
            goto L_0x0078
        L_0x00a5:
            boolean r0 = r6.E(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            r0 = 0
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.C0(r13, r0)
        L_0x00b0:
            int r12 = r12 + r1
            goto L_0x0079
        L_0x00b2:
            boolean r0 = r6.E(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            int r0 = W(r7, r1)
            int r0 = androidx.datastore.preferences.protobuf.CodedOutputStream.m(r13, r0)
            goto L_0x0078
        L_0x00c1:
            boolean r0 = r6.E(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            int r0 = W(r7, r1)
            int r0 = androidx.datastore.preferences.protobuf.CodedOutputStream.N0(r13, r0)
            goto L_0x0078
        L_0x00d0:
            boolean r0 = r6.E(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r8.getObject(r7, r1)
            androidx.datastore.preferences.protobuf.ByteString r0 = (androidx.datastore.preferences.protobuf.ByteString) r0
            int r0 = androidx.datastore.preferences.protobuf.CodedOutputStream.i(r13, r0)
            goto L_0x0078
        L_0x00e1:
            boolean r0 = r6.E(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r8.getObject(r7, r1)
            androidx.datastore.preferences.protobuf.Schema r1 = r6.t(r11)
            int r0 = androidx.datastore.preferences.protobuf.SchemaUtil.o(r13, r0, r1)
            goto L_0x0078
        L_0x00f4:
            boolean r0 = r6.E(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r8.getObject(r7, r1)
            boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.ByteString
            if (r1 == 0) goto L_0x010a
            androidx.datastore.preferences.protobuf.ByteString r0 = (androidx.datastore.preferences.protobuf.ByteString) r0
            int r0 = androidx.datastore.preferences.protobuf.CodedOutputStream.i(r13, r0)
            goto L_0x0078
        L_0x010a:
            java.lang.String r0 = (java.lang.String) r0
            int r0 = androidx.datastore.preferences.protobuf.CodedOutputStream.K0(r13, r0)
            goto L_0x0078
        L_0x0112:
            boolean r0 = r6.E(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            int r0 = androidx.datastore.preferences.protobuf.CodedOutputStream.f(r13, r15)
            goto L_0x0078
        L_0x011e:
            boolean r0 = r6.E(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            r0 = 0
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.e0(r13, r0)
            goto L_0x00b0
        L_0x012a:
            boolean r0 = r6.E(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            int r0 = androidx.datastore.preferences.protobuf.CodedOutputStream.g0(r13, r9)
            goto L_0x0078
        L_0x0136:
            boolean r0 = r6.E(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            int r0 = W(r7, r1)
            int r0 = androidx.datastore.preferences.protobuf.CodedOutputStream.n0(r13, r0)
            goto L_0x0078
        L_0x0146:
            boolean r0 = r6.E(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            long r0 = X(r7, r1)
            int r0 = androidx.datastore.preferences.protobuf.CodedOutputStream.P0(r13, r0)
            goto L_0x0078
        L_0x0156:
            boolean r0 = r6.E(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            long r0 = X(r7, r1)
            int r0 = androidx.datastore.preferences.protobuf.CodedOutputStream.p0(r13, r0)
            goto L_0x0078
        L_0x0166:
            boolean r0 = r6.E(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            int r0 = androidx.datastore.preferences.protobuf.CodedOutputStream.i0(r13, r4)
            goto L_0x0078
        L_0x0172:
            boolean r0 = r6.E(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            r0 = 0
            int r0 = androidx.datastore.preferences.protobuf.CodedOutputStream.k(r13, r0)
            goto L_0x0078
        L_0x0180:
            androidx.datastore.preferences.protobuf.MapFieldSchema r0 = r6.f21087q
            java.lang.Object r1 = r8.getObject(r7, r1)
            java.lang.Object r2 = r6.s(r11)
            int r0 = r0.f(r13, r1, r2)
            goto L_0x0078
        L_0x0190:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            androidx.datastore.preferences.protobuf.Schema r1 = r6.t(r11)
            int r0 = androidx.datastore.preferences.protobuf.SchemaUtil.j(r13, r0, r1)
            goto L_0x0078
        L_0x01a0:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.SchemaUtil.t(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f21079i
            if (r1 == 0) goto L_0x01b4
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x01b4:
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.M0(r13)
            int r2 = androidx.datastore.preferences.protobuf.CodedOutputStream.O0(r0)
        L_0x01bc:
            int r1 = r1 + r2
            int r1 = r1 + r0
            goto L_0x00b0
        L_0x01c0:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.SchemaUtil.r(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f21079i
            if (r1 == 0) goto L_0x01d4
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x01d4:
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.M0(r13)
            int r2 = androidx.datastore.preferences.protobuf.CodedOutputStream.O0(r0)
            goto L_0x01bc
        L_0x01dd:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.SchemaUtil.i(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f21079i
            if (r1 == 0) goto L_0x01f1
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x01f1:
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.M0(r13)
            int r2 = androidx.datastore.preferences.protobuf.CodedOutputStream.O0(r0)
            goto L_0x01bc
        L_0x01fa:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.SchemaUtil.g(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f21079i
            if (r1 == 0) goto L_0x020e
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x020e:
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.M0(r13)
            int r2 = androidx.datastore.preferences.protobuf.CodedOutputStream.O0(r0)
            goto L_0x01bc
        L_0x0217:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.SchemaUtil.e(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f21079i
            if (r1 == 0) goto L_0x022b
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x022b:
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.M0(r13)
            int r2 = androidx.datastore.preferences.protobuf.CodedOutputStream.O0(r0)
            goto L_0x01bc
        L_0x0234:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.SchemaUtil.w(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f21079i
            if (r1 == 0) goto L_0x0248
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x0248:
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.M0(r13)
            int r2 = androidx.datastore.preferences.protobuf.CodedOutputStream.O0(r0)
            goto L_0x01bc
        L_0x0252:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.SchemaUtil.b(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f21079i
            if (r1 == 0) goto L_0x0266
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x0266:
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.M0(r13)
            int r2 = androidx.datastore.preferences.protobuf.CodedOutputStream.O0(r0)
            goto L_0x01bc
        L_0x0270:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.SchemaUtil.g(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f21079i
            if (r1 == 0) goto L_0x0284
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x0284:
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.M0(r13)
            int r2 = androidx.datastore.preferences.protobuf.CodedOutputStream.O0(r0)
            goto L_0x01bc
        L_0x028e:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.SchemaUtil.i(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f21079i
            if (r1 == 0) goto L_0x02a2
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x02a2:
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.M0(r13)
            int r2 = androidx.datastore.preferences.protobuf.CodedOutputStream.O0(r0)
            goto L_0x01bc
        L_0x02ac:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.SchemaUtil.l(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f21079i
            if (r1 == 0) goto L_0x02c0
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x02c0:
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.M0(r13)
            int r2 = androidx.datastore.preferences.protobuf.CodedOutputStream.O0(r0)
            goto L_0x01bc
        L_0x02ca:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.SchemaUtil.y(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f21079i
            if (r1 == 0) goto L_0x02de
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x02de:
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.M0(r13)
            int r2 = androidx.datastore.preferences.protobuf.CodedOutputStream.O0(r0)
            goto L_0x01bc
        L_0x02e8:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.SchemaUtil.n(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f21079i
            if (r1 == 0) goto L_0x02fc
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x02fc:
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.M0(r13)
            int r2 = androidx.datastore.preferences.protobuf.CodedOutputStream.O0(r0)
            goto L_0x01bc
        L_0x0306:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.SchemaUtil.g(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f21079i
            if (r1 == 0) goto L_0x031a
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x031a:
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.M0(r13)
            int r2 = androidx.datastore.preferences.protobuf.CodedOutputStream.O0(r0)
            goto L_0x01bc
        L_0x0324:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.SchemaUtil.i(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f21079i
            if (r1 == 0) goto L_0x0338
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x0338:
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.M0(r13)
            int r2 = androidx.datastore.preferences.protobuf.CodedOutputStream.O0(r0)
            goto L_0x01bc
        L_0x0342:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            r3 = 0
            int r0 = androidx.datastore.preferences.protobuf.SchemaUtil.s(r13, r0, r3)
        L_0x034d:
            int r12 = r12 + r0
            r15 = r3
            goto L_0x0602
        L_0x0351:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.SchemaUtil.q(r13, r0, r3)
            goto L_0x034d
        L_0x035d:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.SchemaUtil.h(r13, r0, r3)
            goto L_0x034d
        L_0x0369:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.SchemaUtil.f(r13, r0, r3)
            goto L_0x034d
        L_0x0375:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.SchemaUtil.d(r13, r0, r3)
            goto L_0x034d
        L_0x0381:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.SchemaUtil.v(r13, r0, r3)
            goto L_0x0078
        L_0x038e:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.SchemaUtil.c(r13, r0)
            goto L_0x0078
        L_0x039a:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            androidx.datastore.preferences.protobuf.Schema r1 = r6.t(r11)
            int r0 = androidx.datastore.preferences.protobuf.SchemaUtil.p(r13, r0, r1)
            goto L_0x0078
        L_0x03aa:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.SchemaUtil.u(r13, r0)
            goto L_0x0078
        L_0x03b6:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            r3 = 0
            int r0 = androidx.datastore.preferences.protobuf.SchemaUtil.a(r13, r0, r3)
            goto L_0x034d
        L_0x03c2:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.SchemaUtil.f(r13, r0, r3)
            goto L_0x034d
        L_0x03cf:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.SchemaUtil.h(r13, r0, r3)
            goto L_0x034d
        L_0x03dc:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.SchemaUtil.k(r13, r0, r3)
            goto L_0x034d
        L_0x03e9:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.SchemaUtil.x(r13, r0, r3)
            goto L_0x034d
        L_0x03f6:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.SchemaUtil.m(r13, r0, r3)
            goto L_0x034d
        L_0x0403:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.SchemaUtil.f(r13, r0, r3)
            goto L_0x034d
        L_0x0410:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.SchemaUtil.h(r13, r0, r3)
            goto L_0x0078
        L_0x041d:
            r0 = r18
            r9 = r1
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r8.getObject(r7, r9)
            androidx.datastore.preferences.protobuf.MessageLite r0 = (androidx.datastore.preferences.protobuf.MessageLite) r0
            androidx.datastore.preferences.protobuf.Schema r1 = r6.t(r11)
            int r0 = androidx.datastore.preferences.protobuf.CodedOutputStream.k0(r13, r0, r1)
            goto L_0x0078
        L_0x043e:
            r9 = r1
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            long r0 = r8.getLong(r7, r9)
            int r0 = androidx.datastore.preferences.protobuf.CodedOutputStream.I0(r13, r0)
            goto L_0x0078
        L_0x0459:
            r9 = r1
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            int r0 = r8.getInt(r7, r9)
            int r0 = androidx.datastore.preferences.protobuf.CodedOutputStream.G0(r13, r0)
            goto L_0x0078
        L_0x0474:
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            int r0 = androidx.datastore.preferences.protobuf.CodedOutputStream.E0(r13, r9)
            goto L_0x0078
        L_0x048a:
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            r0 = 0
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.C0(r13, r0)
            goto L_0x00b0
        L_0x04a1:
            r9 = r1
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            int r0 = r8.getInt(r7, r9)
            int r0 = androidx.datastore.preferences.protobuf.CodedOutputStream.m(r13, r0)
            goto L_0x0078
        L_0x04bc:
            r9 = r1
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            int r0 = r8.getInt(r7, r9)
            int r0 = androidx.datastore.preferences.protobuf.CodedOutputStream.N0(r13, r0)
            goto L_0x0078
        L_0x04d7:
            r9 = r1
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r8.getObject(r7, r9)
            androidx.datastore.preferences.protobuf.ByteString r0 = (androidx.datastore.preferences.protobuf.ByteString) r0
            int r0 = androidx.datastore.preferences.protobuf.CodedOutputStream.i(r13, r0)
            goto L_0x0078
        L_0x04f4:
            r9 = r1
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r8.getObject(r7, r9)
            androidx.datastore.preferences.protobuf.Schema r1 = r6.t(r11)
            int r0 = androidx.datastore.preferences.protobuf.SchemaUtil.o(r13, r0, r1)
            goto L_0x0078
        L_0x0513:
            r9 = r1
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r8.getObject(r7, r9)
            boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.ByteString
            if (r1 == 0) goto L_0x0534
            androidx.datastore.preferences.protobuf.ByteString r0 = (androidx.datastore.preferences.protobuf.ByteString) r0
            int r0 = androidx.datastore.preferences.protobuf.CodedOutputStream.i(r13, r0)
            goto L_0x0078
        L_0x0534:
            java.lang.String r0 = (java.lang.String) r0
            int r0 = androidx.datastore.preferences.protobuf.CodedOutputStream.K0(r13, r0)
            goto L_0x0078
        L_0x053c:
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            int r0 = androidx.datastore.preferences.protobuf.CodedOutputStream.f(r13, r15)
            goto L_0x0078
        L_0x0552:
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            r15 = 0
            int r0 = androidx.datastore.preferences.protobuf.CodedOutputStream.e0(r13, r15)
        L_0x0567:
            int r12 = r12 + r0
            goto L_0x0602
        L_0x056a:
            r15 = 0
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0602
            int r0 = androidx.datastore.preferences.protobuf.CodedOutputStream.g0(r13, r9)
            goto L_0x0567
        L_0x0580:
            r9 = r1
            r15 = 0
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0602
            int r0 = r8.getInt(r7, r9)
            int r0 = androidx.datastore.preferences.protobuf.CodedOutputStream.n0(r13, r0)
            goto L_0x0567
        L_0x059b:
            r9 = r1
            r15 = 0
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0602
            long r0 = r8.getLong(r7, r9)
            int r0 = androidx.datastore.preferences.protobuf.CodedOutputStream.P0(r13, r0)
            goto L_0x0567
        L_0x05b6:
            r9 = r1
            r15 = 0
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0602
            long r0 = r8.getLong(r7, r9)
            int r0 = androidx.datastore.preferences.protobuf.CodedOutputStream.p0(r13, r0)
            goto L_0x0567
        L_0x05d1:
            r15 = 0
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r9 = r4
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0602
            int r0 = androidx.datastore.preferences.protobuf.CodedOutputStream.i0(r13, r9)
            goto L_0x0567
        L_0x05e9:
            r15 = 0
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0602
            r0 = 0
            int r0 = androidx.datastore.preferences.protobuf.CodedOutputStream.k(r13, r0)
            goto L_0x0567
        L_0x0602:
            int r11 = r11 + 3
            r0 = r14
            r1 = r16
            r10 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000d
        L_0x060c:
            androidx.datastore.preferences.protobuf.UnknownFieldSchema r0 = r6.f21085o
            int r0 = r6.u(r0, r7)
            int r12 = r12 + r0
            boolean r0 = r6.f21076f
            if (r0 == 0) goto L_0x0622
            androidx.datastore.preferences.protobuf.ExtensionSchema r0 = r6.f21086p
            androidx.datastore.preferences.protobuf.FieldSet r0 = r0.c(r7)
            int r0 = r0.l()
            int r12 = r12 + r0
        L_0x0622:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.f(java.lang.Object):int");
    }

    public final void f0(Object obj, int i2) {
        int Z = Z(i2);
        long j2 = (long) (1048575 & Z);
        if (j2 != 1048575) {
            UnsafeUtil.W(obj, j2, (1 << (Z >>> 20)) | UnsafeUtil.D(obj, j2));
        }
    }

    public Object g() {
        return this.f21083m.a(this.f21075e);
    }

    public final void g0(Object obj, int i2, int i3) {
        UnsafeUtil.W(obj, (long) (Z(i3) & 1048575), i2);
    }

    public void h(Object obj, Reader reader, ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.getClass();
        l(obj);
        H(this.f21085o, this.f21086p, obj, reader, extensionRegistryLite);
    }

    public final int h0(int i2, int i3) {
        int length = (this.f21071a.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int R = R(i5);
            if (i2 == R) {
                return i5;
            }
            if (i2 < R) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    public void i(Object obj, Writer writer) {
        if (writer.x() == Writer.FieldOrder.DESCENDING) {
            o0(obj, writer);
        } else {
            n0(obj, writer);
        }
    }

    public final boolean j(Object obj, Object obj2, int i2) {
        return x(obj, i2) == x(obj2, i2);
    }

    public final void j0(Object obj, int i2, Object obj2) {
        f21070s.putObject(obj, S(m0(i2)), obj2);
        f0(obj, i2);
    }

    public final void k0(Object obj, int i2, int i3, Object obj2) {
        f21070s.putObject(obj, S(m0(i3)), obj2);
        g0(obj, i2, i3);
    }

    public final int m0(int i2) {
        return this.f21071a[i2 + 1];
    }

    public final boolean n(Object obj, Object obj2, int i2) {
        int m0 = m0(i2);
        long S = S(m0);
        switch (l0(m0)) {
            case 0:
                return j(obj, obj2, i2) && Double.doubleToLongBits(UnsafeUtil.B(obj, S)) == Double.doubleToLongBits(UnsafeUtil.B(obj2, S));
            case 1:
                return j(obj, obj2, i2) && Float.floatToIntBits(UnsafeUtil.C(obj, S)) == Float.floatToIntBits(UnsafeUtil.C(obj2, S));
            case 2:
                return j(obj, obj2, i2) && UnsafeUtil.F(obj, S) == UnsafeUtil.F(obj2, S);
            case 3:
                return j(obj, obj2, i2) && UnsafeUtil.F(obj, S) == UnsafeUtil.F(obj2, S);
            case 4:
                return j(obj, obj2, i2) && UnsafeUtil.D(obj, S) == UnsafeUtil.D(obj2, S);
            case 5:
                return j(obj, obj2, i2) && UnsafeUtil.F(obj, S) == UnsafeUtil.F(obj2, S);
            case 6:
                return j(obj, obj2, i2) && UnsafeUtil.D(obj, S) == UnsafeUtil.D(obj2, S);
            case 7:
                return j(obj, obj2, i2) && UnsafeUtil.u(obj, S) == UnsafeUtil.u(obj2, S);
            case 8:
                return j(obj, obj2, i2) && SchemaUtil.I(UnsafeUtil.H(obj, S), UnsafeUtil.H(obj2, S));
            case 9:
                return j(obj, obj2, i2) && SchemaUtil.I(UnsafeUtil.H(obj, S), UnsafeUtil.H(obj2, S));
            case 10:
                return j(obj, obj2, i2) && SchemaUtil.I(UnsafeUtil.H(obj, S), UnsafeUtil.H(obj2, S));
            case 11:
                return j(obj, obj2, i2) && UnsafeUtil.D(obj, S) == UnsafeUtil.D(obj2, S);
            case 12:
                return j(obj, obj2, i2) && UnsafeUtil.D(obj, S) == UnsafeUtil.D(obj2, S);
            case 13:
                return j(obj, obj2, i2) && UnsafeUtil.D(obj, S) == UnsafeUtil.D(obj2, S);
            case 14:
                return j(obj, obj2, i2) && UnsafeUtil.F(obj, S) == UnsafeUtil.F(obj2, S);
            case 15:
                return j(obj, obj2, i2) && UnsafeUtil.D(obj, S) == UnsafeUtil.D(obj2, S);
            case 16:
                return j(obj, obj2, i2) && UnsafeUtil.F(obj, S) == UnsafeUtil.F(obj2, S);
            case 17:
                return j(obj, obj2, i2) && SchemaUtil.I(UnsafeUtil.H(obj, S), UnsafeUtil.H(obj2, S));
            case 18:
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER:
            case 20:
            case 21:
            case 22:
            case 23:
            case Service.METRICS_FIELD_NUMBER /*24*/:
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /*25*/:
            case Service.BILLING_FIELD_NUMBER /*26*/:
            case 27:
            case Service.MONITORING_FIELD_NUMBER /*28*/:
            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /*29*/:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /*42*/:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return SchemaUtil.I(UnsafeUtil.H(obj, S), UnsafeUtil.H(obj2, S));
            case 50:
                return SchemaUtil.I(UnsafeUtil.H(obj, S), UnsafeUtil.H(obj2, S));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return D(obj, obj2, i2) && SchemaUtil.I(UnsafeUtil.H(obj, S), UnsafeUtil.H(obj2, S));
            default:
                return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02ba, code lost:
        r19 = r4;
        r20 = r11;
        r16 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0617, code lost:
        r15 = r15 + 3;
        r0 = r9;
        r1 = r16;
        r2 = r17;
        r11 = r20;
        r13 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0098, code lost:
        r20 = r11;
        r16 = r14;
     */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0629  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n0(java.lang.Object r22, androidx.datastore.preferences.protobuf.Writer r23) {
        /*
            r21 = this;
            r6 = r21
            r7 = r22
            r8 = r23
            boolean r0 = r6.f21076f
            if (r0 == 0) goto L_0x0022
            androidx.datastore.preferences.protobuf.ExtensionSchema r0 = r6.f21086p
            androidx.datastore.preferences.protobuf.FieldSet r0 = r0.c(r7)
            boolean r1 = r0.n()
            if (r1 != 0) goto L_0x0022
            java.util.Iterator r0 = r0.t()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            r10 = r0
            goto L_0x0024
        L_0x0022:
            r1 = 0
            r10 = 0
        L_0x0024:
            int[] r0 = r6.f21071a
            int r11 = r0.length
            sun.misc.Unsafe r12 = f21070s
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r13
            r2 = 0
            r15 = 0
        L_0x002f:
            if (r15 >= r11) goto L_0x0625
            int r3 = r6.m0(r15)
            int r5 = r6.R(r15)
            int r4 = l0(r3)
            r9 = 17
            if (r4 > r9) goto L_0x006a
            int[] r9 = r6.f21071a
            int r16 = r15 + 2
            r9 = r9[r16]
            r14 = r9 & r13
            if (r14 == r0) goto L_0x005b
            if (r14 != r13) goto L_0x0051
            r17 = r1
            r2 = 0
            goto L_0x0059
        L_0x0051:
            r17 = r1
            long r0 = (long) r14
            int r0 = r12.getInt(r7, r0)
            r2 = r0
        L_0x0059:
            r0 = r14
            goto L_0x005d
        L_0x005b:
            r17 = r1
        L_0x005d:
            int r1 = r9 >>> 20
            r9 = 1
            int r1 = r9 << r1
            r9 = r0
            r18 = r1
            r14 = r17
        L_0x0067:
            r17 = r2
            goto L_0x0072
        L_0x006a:
            r17 = r1
            r9 = r0
            r14 = r17
            r18 = 0
            goto L_0x0067
        L_0x0072:
            if (r14 == 0) goto L_0x0091
            androidx.datastore.preferences.protobuf.ExtensionSchema r0 = r6.f21086p
            int r0 = r0.a(r14)
            if (r0 > r5) goto L_0x0091
            androidx.datastore.preferences.protobuf.ExtensionSchema r0 = r6.f21086p
            r0.j(r8, r14)
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x008f
            java.lang.Object r0 = r10.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r14 = r0
            goto L_0x0072
        L_0x008f:
            r14 = 0
            goto L_0x0072
        L_0x0091:
            long r2 = S(r3)
            switch(r4) {
                case 0: goto L_0x05f8;
                case 1: goto L_0x05d8;
                case 2: goto L_0x05b8;
                case 3: goto L_0x0597;
                case 4: goto L_0x0576;
                case 5: goto L_0x0555;
                case 6: goto L_0x0534;
                case 7: goto L_0x0513;
                case 8: goto L_0x04f2;
                case 9: goto L_0x04cd;
                case 10: goto L_0x04aa;
                case 11: goto L_0x0489;
                case 12: goto L_0x0468;
                case 13: goto L_0x0447;
                case 14: goto L_0x0426;
                case 15: goto L_0x0405;
                case 16: goto L_0x03e4;
                case 17: goto L_0x03be;
                case 18: goto L_0x03ae;
                case 19: goto L_0x039e;
                case 20: goto L_0x038e;
                case 21: goto L_0x037e;
                case 22: goto L_0x036e;
                case 23: goto L_0x035e;
                case 24: goto L_0x034e;
                case 25: goto L_0x033e;
                case 26: goto L_0x032f;
                case 27: goto L_0x031c;
                case 28: goto L_0x030d;
                case 29: goto L_0x02fe;
                case 30: goto L_0x02ef;
                case 31: goto L_0x02e0;
                case 32: goto L_0x02d1;
                case 33: goto L_0x02c2;
                case 34: goto L_0x02ac;
                case 35: goto L_0x029c;
                case 36: goto L_0x028c;
                case 37: goto L_0x027c;
                case 38: goto L_0x026c;
                case 39: goto L_0x025c;
                case 40: goto L_0x024c;
                case 41: goto L_0x023c;
                case 42: goto L_0x022c;
                case 43: goto L_0x021c;
                case 44: goto L_0x020c;
                case 45: goto L_0x01fc;
                case 46: goto L_0x01ec;
                case 47: goto L_0x01dc;
                case 48: goto L_0x01cc;
                case 49: goto L_0x01b9;
                case 50: goto L_0x01b0;
                case 51: goto L_0x01a1;
                case 52: goto L_0x0192;
                case 53: goto L_0x0183;
                case 54: goto L_0x0174;
                case 55: goto L_0x0165;
                case 56: goto L_0x0156;
                case 57: goto L_0x0147;
                case 58: goto L_0x0138;
                case 59: goto L_0x0129;
                case 60: goto L_0x0116;
                case 61: goto L_0x0106;
                case 62: goto L_0x00f8;
                case 63: goto L_0x00ea;
                case 64: goto L_0x00dc;
                case 65: goto L_0x00ce;
                case 66: goto L_0x00c0;
                case 67: goto L_0x00b2;
                case 68: goto L_0x00a0;
                default: goto L_0x0098;
            }
        L_0x0098:
            r20 = r11
            r16 = r14
            r19 = 0
            goto L_0x0617
        L_0x00a0:
            boolean r0 = r6.E(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            java.lang.Object r0 = r12.getObject(r7, r2)
            androidx.datastore.preferences.protobuf.Schema r1 = r6.t(r15)
            r8.d0(r5, r0, r1)
            goto L_0x0098
        L_0x00b2:
            boolean r0 = r6.E(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            long r0 = X(r7, r2)
            r8.O(r5, r0)
            goto L_0x0098
        L_0x00c0:
            boolean r0 = r6.E(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            int r0 = W(r7, r2)
            r8.W(r5, r0)
            goto L_0x0098
        L_0x00ce:
            boolean r0 = r6.E(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            long r0 = X(r7, r2)
            r8.J(r5, r0)
            goto L_0x0098
        L_0x00dc:
            boolean r0 = r6.E(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            int r0 = W(r7, r2)
            r8.F(r5, r0)
            goto L_0x0098
        L_0x00ea:
            boolean r0 = r6.E(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            int r0 = W(r7, r2)
            r8.S(r5, r0)
            goto L_0x0098
        L_0x00f8:
            boolean r0 = r6.E(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            int r0 = W(r7, r2)
            r8.q(r5, r0)
            goto L_0x0098
        L_0x0106:
            boolean r0 = r6.E(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            java.lang.Object r0 = r12.getObject(r7, r2)
            androidx.datastore.preferences.protobuf.ByteString r0 = (androidx.datastore.preferences.protobuf.ByteString) r0
            r8.a0(r5, r0)
            goto L_0x0098
        L_0x0116:
            boolean r0 = r6.E(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            java.lang.Object r0 = r12.getObject(r7, r2)
            androidx.datastore.preferences.protobuf.Schema r1 = r6.t(r15)
            r8.b0(r5, r0, r1)
            goto L_0x0098
        L_0x0129:
            boolean r0 = r6.E(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            java.lang.Object r0 = r12.getObject(r7, r2)
            r6.q0(r5, r0, r8)
            goto L_0x0098
        L_0x0138:
            boolean r0 = r6.E(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            boolean r0 = T(r7, r2)
            r8.E(r5, r0)
            goto L_0x0098
        L_0x0147:
            boolean r0 = r6.E(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            int r0 = W(r7, r2)
            r8.s(r5, r0)
            goto L_0x0098
        L_0x0156:
            boolean r0 = r6.E(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            long r0 = X(r7, r2)
            r8.w(r5, r0)
            goto L_0x0098
        L_0x0165:
            boolean r0 = r6.E(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            int r0 = W(r7, r2)
            r8.o(r5, r0)
            goto L_0x0098
        L_0x0174:
            boolean r0 = r6.E(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            long r0 = X(r7, r2)
            r8.A(r5, r0)
            goto L_0x0098
        L_0x0183:
            boolean r0 = r6.E(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            long r0 = X(r7, r2)
            r8.D(r5, r0)
            goto L_0x0098
        L_0x0192:
            boolean r0 = r6.E(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            float r0 = V(r7, r2)
            r8.P(r5, r0)
            goto L_0x0098
        L_0x01a1:
            boolean r0 = r6.E(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            double r0 = U(r7, r2)
            r8.t(r5, r0)
            goto L_0x0098
        L_0x01b0:
            java.lang.Object r0 = r12.getObject(r7, r2)
            r6.p0(r8, r5, r0, r15)
            goto L_0x0098
        L_0x01b9:
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.Schema r2 = r6.t(r15)
            androidx.datastore.preferences.protobuf.SchemaUtil.T(r0, r1, r8, r2)
            goto L_0x0098
        L_0x01cc:
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            r4 = 1
            androidx.datastore.preferences.protobuf.SchemaUtil.a0(r0, r1, r8, r4)
            goto L_0x0098
        L_0x01dc:
            r4 = 1
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.SchemaUtil.Z(r0, r1, r8, r4)
            goto L_0x0098
        L_0x01ec:
            r4 = 1
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.SchemaUtil.Y(r0, r1, r8, r4)
            goto L_0x0098
        L_0x01fc:
            r4 = 1
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.SchemaUtil.X(r0, r1, r8, r4)
            goto L_0x0098
        L_0x020c:
            r4 = 1
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.SchemaUtil.P(r0, r1, r8, r4)
            goto L_0x0098
        L_0x021c:
            r4 = 1
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.SchemaUtil.c0(r0, r1, r8, r4)
            goto L_0x0098
        L_0x022c:
            r4 = 1
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.SchemaUtil.M(r0, r1, r8, r4)
            goto L_0x0098
        L_0x023c:
            r4 = 1
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.SchemaUtil.Q(r0, r1, r8, r4)
            goto L_0x0098
        L_0x024c:
            r4 = 1
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.SchemaUtil.R(r0, r1, r8, r4)
            goto L_0x0098
        L_0x025c:
            r4 = 1
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.SchemaUtil.U(r0, r1, r8, r4)
            goto L_0x0098
        L_0x026c:
            r4 = 1
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.SchemaUtil.d0(r0, r1, r8, r4)
            goto L_0x0098
        L_0x027c:
            r4 = 1
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.SchemaUtil.V(r0, r1, r8, r4)
            goto L_0x0098
        L_0x028c:
            r4 = 1
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.SchemaUtil.S(r0, r1, r8, r4)
            goto L_0x0098
        L_0x029c:
            r4 = 1
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.SchemaUtil.O(r0, r1, r8, r4)
            goto L_0x0098
        L_0x02ac:
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            r4 = 0
            androidx.datastore.preferences.protobuf.SchemaUtil.a0(r0, r1, r8, r4)
        L_0x02ba:
            r19 = r4
            r20 = r11
            r16 = r14
            goto L_0x0617
        L_0x02c2:
            r4 = 0
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.SchemaUtil.Z(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x02d1:
            r4 = 0
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.SchemaUtil.Y(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x02e0:
            r4 = 0
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.SchemaUtil.X(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x02ef:
            r4 = 0
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.SchemaUtil.P(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x02fe:
            r4 = 0
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.SchemaUtil.c0(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x030d:
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.SchemaUtil.N(r0, r1, r8)
            goto L_0x0098
        L_0x031c:
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.Schema r2 = r6.t(r15)
            androidx.datastore.preferences.protobuf.SchemaUtil.W(r0, r1, r8, r2)
            goto L_0x0098
        L_0x032f:
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.SchemaUtil.b0(r0, r1, r8)
            goto L_0x0098
        L_0x033e:
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            r4 = 0
            androidx.datastore.preferences.protobuf.SchemaUtil.M(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x034e:
            r4 = 0
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.SchemaUtil.Q(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x035e:
            r4 = 0
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.SchemaUtil.R(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x036e:
            r4 = 0
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.SchemaUtil.U(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x037e:
            r4 = 0
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.SchemaUtil.d0(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x038e:
            r4 = 0
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.SchemaUtil.V(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x039e:
            r4 = 0
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.SchemaUtil.S(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x03ae:
            r4 = 0
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.SchemaUtil.O(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x03be:
            r4 = 0
            r0 = r21
            r1 = r22
            r16 = r14
            r13 = r2
            r2 = r15
            r3 = r9
            r19 = r4
            r4 = r17
            r20 = r11
            r11 = r5
            r5 = r18
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            java.lang.Object r0 = r12.getObject(r7, r13)
            androidx.datastore.preferences.protobuf.Schema r1 = r6.t(r15)
            r8.d0(r11, r0, r1)
            goto L_0x0617
        L_0x03e4:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            long r0 = r12.getLong(r7, r13)
            r8.O(r11, r0)
            goto L_0x0617
        L_0x0405:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            int r0 = r12.getInt(r7, r13)
            r8.W(r11, r0)
            goto L_0x0617
        L_0x0426:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            long r0 = r12.getLong(r7, r13)
            r8.J(r11, r0)
            goto L_0x0617
        L_0x0447:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            int r0 = r12.getInt(r7, r13)
            r8.F(r11, r0)
            goto L_0x0617
        L_0x0468:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            int r0 = r12.getInt(r7, r13)
            r8.S(r11, r0)
            goto L_0x0617
        L_0x0489:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            int r0 = r12.getInt(r7, r13)
            r8.q(r11, r0)
            goto L_0x0617
        L_0x04aa:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            java.lang.Object r0 = r12.getObject(r7, r13)
            androidx.datastore.preferences.protobuf.ByteString r0 = (androidx.datastore.preferences.protobuf.ByteString) r0
            r8.a0(r11, r0)
            goto L_0x0617
        L_0x04cd:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            java.lang.Object r0 = r12.getObject(r7, r13)
            androidx.datastore.preferences.protobuf.Schema r1 = r6.t(r15)
            r8.b0(r11, r0, r1)
            goto L_0x0617
        L_0x04f2:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            java.lang.Object r0 = r12.getObject(r7, r13)
            r6.q0(r11, r0, r8)
            goto L_0x0617
        L_0x0513:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            boolean r0 = k(r7, r13)
            r8.E(r11, r0)
            goto L_0x0617
        L_0x0534:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            int r0 = r12.getInt(r7, r13)
            r8.s(r11, r0)
            goto L_0x0617
        L_0x0555:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            long r0 = r12.getLong(r7, r13)
            r8.w(r11, r0)
            goto L_0x0617
        L_0x0576:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            int r0 = r12.getInt(r7, r13)
            r8.o(r11, r0)
            goto L_0x0617
        L_0x0597:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            long r0 = r12.getLong(r7, r13)
            r8.A(r11, r0)
            goto L_0x0617
        L_0x05b8:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            long r0 = r12.getLong(r7, r13)
            r8.D(r11, r0)
            goto L_0x0617
        L_0x05d8:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            float r0 = q(r7, r13)
            r8.P(r11, r0)
            goto L_0x0617
        L_0x05f8:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            double r0 = m(r7, r13)
            r8.t(r11, r0)
        L_0x0617:
            int r15 = r15 + 3
            r0 = r9
            r1 = r16
            r2 = r17
            r11 = r20
            r13 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x002f
        L_0x0625:
            r17 = r1
        L_0x0627:
            if (r1 == 0) goto L_0x063e
            androidx.datastore.preferences.protobuf.ExtensionSchema r0 = r6.f21086p
            r0.j(r8, r1)
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x063c
            java.lang.Object r0 = r10.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r1 = r0
            goto L_0x0627
        L_0x063c:
            r1 = 0
            goto L_0x0627
        L_0x063e:
            androidx.datastore.preferences.protobuf.UnknownFieldSchema r0 = r6.f21085o
            r6.r0(r0, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.n0(java.lang.Object, androidx.datastore.preferences.protobuf.Writer):void");
    }

    public final Object o(Object obj, int i2, Object obj2, UnknownFieldSchema unknownFieldSchema, Object obj3) {
        Internal.EnumVerifier r2;
        int R = R(i2);
        Object H = UnsafeUtil.H(obj, S(m0(i2)));
        if (H == null || (r2 = r(i2)) == null) {
            return obj2;
        }
        return p(i2, R, this.f21087q.d(H), r2, obj2, unknownFieldSchema, obj3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x058e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o0(java.lang.Object r11, androidx.datastore.preferences.protobuf.Writer r12) {
        /*
            r10 = this;
            androidx.datastore.preferences.protobuf.UnknownFieldSchema r0 = r10.f21085o
            r10.r0(r0, r11, r12)
            boolean r0 = r10.f21076f
            r1 = 0
            if (r0 == 0) goto L_0x0021
            androidx.datastore.preferences.protobuf.ExtensionSchema r0 = r10.f21086p
            androidx.datastore.preferences.protobuf.FieldSet r0 = r0.c(r11)
            boolean r2 = r0.n()
            if (r2 != 0) goto L_0x0021
            java.util.Iterator r0 = r0.g()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0023
        L_0x0021:
            r0 = r1
            r2 = r0
        L_0x0023:
            int[] r3 = r10.f21071a
            int r3 = r3.length
            int r3 = r3 + -3
        L_0x0028:
            if (r3 < 0) goto L_0x058c
            int r4 = r10.m0(r3)
            int r5 = r10.R(r3)
        L_0x0032:
            if (r2 == 0) goto L_0x0050
            androidx.datastore.preferences.protobuf.ExtensionSchema r6 = r10.f21086p
            int r6 = r6.a(r2)
            if (r6 <= r5) goto L_0x0050
            androidx.datastore.preferences.protobuf.ExtensionSchema r6 = r10.f21086p
            r6.j(r12, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x004e
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0032
        L_0x004e:
            r2 = r1
            goto L_0x0032
        L_0x0050:
            int r6 = l0(r4)
            r7 = 0
            r8 = 1
            switch(r6) {
                case 0: goto L_0x0577;
                case 1: goto L_0x0565;
                case 2: goto L_0x0553;
                case 3: goto L_0x0541;
                case 4: goto L_0x052f;
                case 5: goto L_0x051d;
                case 6: goto L_0x050b;
                case 7: goto L_0x04f8;
                case 8: goto L_0x04e5;
                case 9: goto L_0x04ce;
                case 10: goto L_0x04b9;
                case 11: goto L_0x04a6;
                case 12: goto L_0x0493;
                case 13: goto L_0x0480;
                case 14: goto L_0x046d;
                case 15: goto L_0x045a;
                case 16: goto L_0x0447;
                case 17: goto L_0x0430;
                case 18: goto L_0x041d;
                case 19: goto L_0x040a;
                case 20: goto L_0x03f7;
                case 21: goto L_0x03e4;
                case 22: goto L_0x03d1;
                case 23: goto L_0x03be;
                case 24: goto L_0x03ab;
                case 25: goto L_0x0398;
                case 26: goto L_0x0385;
                case 27: goto L_0x036e;
                case 28: goto L_0x035b;
                case 29: goto L_0x0348;
                case 30: goto L_0x0335;
                case 31: goto L_0x0322;
                case 32: goto L_0x030f;
                case 33: goto L_0x02fc;
                case 34: goto L_0x02e9;
                case 35: goto L_0x02d6;
                case 36: goto L_0x02c3;
                case 37: goto L_0x02b0;
                case 38: goto L_0x029d;
                case 39: goto L_0x028a;
                case 40: goto L_0x0277;
                case 41: goto L_0x0264;
                case 42: goto L_0x0251;
                case 43: goto L_0x023e;
                case 44: goto L_0x022b;
                case 45: goto L_0x0218;
                case 46: goto L_0x0205;
                case 47: goto L_0x01f2;
                case 48: goto L_0x01df;
                case 49: goto L_0x01c8;
                case 50: goto L_0x01bb;
                case 51: goto L_0x01a8;
                case 52: goto L_0x0195;
                case 53: goto L_0x0182;
                case 54: goto L_0x016f;
                case 55: goto L_0x015c;
                case 56: goto L_0x0149;
                case 57: goto L_0x0136;
                case 58: goto L_0x0123;
                case 59: goto L_0x0110;
                case 60: goto L_0x00f9;
                case 61: goto L_0x00e4;
                case 62: goto L_0x00d1;
                case 63: goto L_0x00be;
                case 64: goto L_0x00ab;
                case 65: goto L_0x0098;
                case 66: goto L_0x0085;
                case 67: goto L_0x0072;
                case 68: goto L_0x005b;
                default: goto L_0x0059;
            }
        L_0x0059:
            goto L_0x0588
        L_0x005b:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r11, r6)
            androidx.datastore.preferences.protobuf.Schema r6 = r10.t(r3)
            r12.d0(r5, r4, r6)
            goto L_0x0588
        L_0x0072:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            long r6 = X(r11, r6)
            r12.O(r5, r6)
            goto L_0x0588
        L_0x0085:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            int r4 = W(r11, r6)
            r12.W(r5, r4)
            goto L_0x0588
        L_0x0098:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            long r6 = X(r11, r6)
            r12.J(r5, r6)
            goto L_0x0588
        L_0x00ab:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            int r4 = W(r11, r6)
            r12.F(r5, r4)
            goto L_0x0588
        L_0x00be:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            int r4 = W(r11, r6)
            r12.S(r5, r4)
            goto L_0x0588
        L_0x00d1:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            int r4 = W(r11, r6)
            r12.q(r5, r4)
            goto L_0x0588
        L_0x00e4:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r11, r6)
            androidx.datastore.preferences.protobuf.ByteString r4 = (androidx.datastore.preferences.protobuf.ByteString) r4
            r12.a0(r5, r4)
            goto L_0x0588
        L_0x00f9:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r11, r6)
            androidx.datastore.preferences.protobuf.Schema r6 = r10.t(r3)
            r12.b0(r5, r4, r6)
            goto L_0x0588
        L_0x0110:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r11, r6)
            r10.q0(r5, r4, r12)
            goto L_0x0588
        L_0x0123:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            boolean r4 = T(r11, r6)
            r12.E(r5, r4)
            goto L_0x0588
        L_0x0136:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            int r4 = W(r11, r6)
            r12.s(r5, r4)
            goto L_0x0588
        L_0x0149:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            long r6 = X(r11, r6)
            r12.w(r5, r6)
            goto L_0x0588
        L_0x015c:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            int r4 = W(r11, r6)
            r12.o(r5, r4)
            goto L_0x0588
        L_0x016f:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            long r6 = X(r11, r6)
            r12.A(r5, r6)
            goto L_0x0588
        L_0x0182:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            long r6 = X(r11, r6)
            r12.D(r5, r6)
            goto L_0x0588
        L_0x0195:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            float r4 = V(r11, r6)
            r12.P(r5, r4)
            goto L_0x0588
        L_0x01a8:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            double r6 = U(r11, r6)
            r12.t(r5, r6)
            goto L_0x0588
        L_0x01bb:
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r11, r6)
            r10.p0(r12, r5, r4, r3)
            goto L_0x0588
        L_0x01c8:
            int r5 = r10.R(r3)
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.Schema r6 = r10.t(r3)
            androidx.datastore.preferences.protobuf.SchemaUtil.T(r5, r4, r12, r6)
            goto L_0x0588
        L_0x01df:
            int r5 = r10.R(r3)
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.a0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x01f2:
            int r5 = r10.R(r3)
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.Z(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0205:
            int r5 = r10.R(r3)
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.Y(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0218:
            int r5 = r10.R(r3)
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.X(r5, r4, r12, r8)
            goto L_0x0588
        L_0x022b:
            int r5 = r10.R(r3)
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.P(r5, r4, r12, r8)
            goto L_0x0588
        L_0x023e:
            int r5 = r10.R(r3)
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.c0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0251:
            int r5 = r10.R(r3)
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.M(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0264:
            int r5 = r10.R(r3)
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.Q(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0277:
            int r5 = r10.R(r3)
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.R(r5, r4, r12, r8)
            goto L_0x0588
        L_0x028a:
            int r5 = r10.R(r3)
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.U(r5, r4, r12, r8)
            goto L_0x0588
        L_0x029d:
            int r5 = r10.R(r3)
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.d0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x02b0:
            int r5 = r10.R(r3)
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.V(r5, r4, r12, r8)
            goto L_0x0588
        L_0x02c3:
            int r5 = r10.R(r3)
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.S(r5, r4, r12, r8)
            goto L_0x0588
        L_0x02d6:
            int r5 = r10.R(r3)
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.O(r5, r4, r12, r8)
            goto L_0x0588
        L_0x02e9:
            int r5 = r10.R(r3)
            long r8 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.a0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02fc:
            int r5 = r10.R(r3)
            long r8 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.Z(r5, r4, r12, r7)
            goto L_0x0588
        L_0x030f:
            int r5 = r10.R(r3)
            long r8 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.Y(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0322:
            int r5 = r10.R(r3)
            long r8 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.X(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0335:
            int r5 = r10.R(r3)
            long r8 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.P(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0348:
            int r5 = r10.R(r3)
            long r8 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.c0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x035b:
            int r5 = r10.R(r3)
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.N(r5, r4, r12)
            goto L_0x0588
        L_0x036e:
            int r5 = r10.R(r3)
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.Schema r6 = r10.t(r3)
            androidx.datastore.preferences.protobuf.SchemaUtil.W(r5, r4, r12, r6)
            goto L_0x0588
        L_0x0385:
            int r5 = r10.R(r3)
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.b0(r5, r4, r12)
            goto L_0x0588
        L_0x0398:
            int r5 = r10.R(r3)
            long r8 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.M(r5, r4, r12, r7)
            goto L_0x0588
        L_0x03ab:
            int r5 = r10.R(r3)
            long r8 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.Q(r5, r4, r12, r7)
            goto L_0x0588
        L_0x03be:
            int r5 = r10.R(r3)
            long r8 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.R(r5, r4, r12, r7)
            goto L_0x0588
        L_0x03d1:
            int r5 = r10.R(r3)
            long r8 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.U(r5, r4, r12, r7)
            goto L_0x0588
        L_0x03e4:
            int r5 = r10.R(r3)
            long r8 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.d0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x03f7:
            int r5 = r10.R(r3)
            long r8 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.V(r5, r4, r12, r7)
            goto L_0x0588
        L_0x040a:
            int r5 = r10.R(r3)
            long r8 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.S(r5, r4, r12, r7)
            goto L_0x0588
        L_0x041d:
            int r5 = r10.R(r3)
            long r8 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.O(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0430:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r11, r6)
            androidx.datastore.preferences.protobuf.Schema r6 = r10.t(r3)
            r12.d0(r5, r4, r6)
            goto L_0x0588
        L_0x0447:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            long r6 = G(r11, r6)
            r12.O(r5, r6)
            goto L_0x0588
        L_0x045a:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            int r4 = v(r11, r6)
            r12.W(r5, r4)
            goto L_0x0588
        L_0x046d:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            long r6 = G(r11, r6)
            r12.J(r5, r6)
            goto L_0x0588
        L_0x0480:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            int r4 = v(r11, r6)
            r12.F(r5, r4)
            goto L_0x0588
        L_0x0493:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            int r4 = v(r11, r6)
            r12.S(r5, r4)
            goto L_0x0588
        L_0x04a6:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            int r4 = v(r11, r6)
            r12.q(r5, r4)
            goto L_0x0588
        L_0x04b9:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r11, r6)
            androidx.datastore.preferences.protobuf.ByteString r4 = (androidx.datastore.preferences.protobuf.ByteString) r4
            r12.a0(r5, r4)
            goto L_0x0588
        L_0x04ce:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r11, r6)
            androidx.datastore.preferences.protobuf.Schema r6 = r10.t(r3)
            r12.b0(r5, r4, r6)
            goto L_0x0588
        L_0x04e5:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.H(r11, r6)
            r10.q0(r5, r4, r12)
            goto L_0x0588
        L_0x04f8:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            boolean r4 = k(r11, r6)
            r12.E(r5, r4)
            goto L_0x0588
        L_0x050b:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            int r4 = v(r11, r6)
            r12.s(r5, r4)
            goto L_0x0588
        L_0x051d:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            long r6 = G(r11, r6)
            r12.w(r5, r6)
            goto L_0x0588
        L_0x052f:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            int r4 = v(r11, r6)
            r12.o(r5, r4)
            goto L_0x0588
        L_0x0541:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            long r6 = G(r11, r6)
            r12.A(r5, r6)
            goto L_0x0588
        L_0x0553:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            long r6 = G(r11, r6)
            r12.D(r5, r6)
            goto L_0x0588
        L_0x0565:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            float r4 = q(r11, r6)
            r12.P(r5, r4)
            goto L_0x0588
        L_0x0577:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            double r6 = m(r11, r6)
            r12.t(r5, r6)
        L_0x0588:
            int r3 = r3 + -3
            goto L_0x0028
        L_0x058c:
            if (r2 == 0) goto L_0x05a3
            androidx.datastore.preferences.protobuf.ExtensionSchema r11 = r10.f21086p
            r11.j(r12, r2)
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x05a1
            java.lang.Object r11 = r0.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            r2 = r11
            goto L_0x058c
        L_0x05a1:
            r2 = r1
            goto L_0x058c
        L_0x05a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.o0(java.lang.Object, androidx.datastore.preferences.protobuf.Writer):void");
    }

    public final Object p(int i2, int i3, Map map, Internal.EnumVerifier enumVerifier, Object obj, UnknownFieldSchema unknownFieldSchema, Object obj2) {
        MapEntryLite.Metadata c2 = this.f21087q.c(s(i2));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!enumVerifier.a(((Integer) entry.getValue()).intValue())) {
                if (obj == null) {
                    obj = unknownFieldSchema.f(obj2);
                }
                ByteString.CodedBuilder E = ByteString.E(MapEntryLite.b(c2, entry.getKey(), entry.getValue()));
                try {
                    MapEntryLite.e(E.b(), c2, entry.getKey(), entry.getValue());
                    unknownFieldSchema.d(obj, i3, E.a());
                    it.remove();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return obj;
    }

    public final void p0(Writer writer, int i2, Object obj, int i3) {
        if (obj != null) {
            writer.c0(i2, this.f21087q.c(s(i3)), this.f21087q.h(obj));
        }
    }

    public final void q0(int i2, Object obj, Writer writer) {
        if (obj instanceof String) {
            writer.z(i2, (String) obj);
        } else {
            writer.a0(i2, (ByteString) obj);
        }
    }

    public final Internal.EnumVerifier r(int i2) {
        return (Internal.EnumVerifier) this.f21072b[((i2 / 3) * 2) + 1];
    }

    public final void r0(UnknownFieldSchema unknownFieldSchema, Object obj, Writer writer) {
        unknownFieldSchema.t(unknownFieldSchema.g(obj), writer);
    }

    public final Object s(int i2) {
        return this.f21072b[(i2 / 3) * 2];
    }

    public final Schema t(int i2) {
        int i3 = (i2 / 3) * 2;
        Schema schema = (Schema) this.f21072b[i3];
        if (schema != null) {
            return schema;
        }
        Schema c2 = Protobuf.a().c((Class) this.f21072b[i3 + 1]);
        this.f21072b[i3] = c2;
        return c2;
    }

    public final int u(UnknownFieldSchema unknownFieldSchema, Object obj) {
        return unknownFieldSchema.h(unknownFieldSchema.g(obj));
    }

    public final boolean x(Object obj, int i2) {
        int Z = Z(i2);
        long j2 = (long) (1048575 & Z);
        if (j2 == 1048575) {
            int m0 = m0(i2);
            long S = S(m0);
            switch (l0(m0)) {
                case 0:
                    return Double.doubleToRawLongBits(UnsafeUtil.B(obj, S)) != 0;
                case 1:
                    return Float.floatToRawIntBits(UnsafeUtil.C(obj, S)) != 0;
                case 2:
                    return UnsafeUtil.F(obj, S) != 0;
                case 3:
                    return UnsafeUtil.F(obj, S) != 0;
                case 4:
                    return UnsafeUtil.D(obj, S) != 0;
                case 5:
                    return UnsafeUtil.F(obj, S) != 0;
                case 6:
                    return UnsafeUtil.D(obj, S) != 0;
                case 7:
                    return UnsafeUtil.u(obj, S);
                case 8:
                    Object H = UnsafeUtil.H(obj, S);
                    if (H instanceof String) {
                        return !((String) H).isEmpty();
                    }
                    if (H instanceof ByteString) {
                        return !ByteString.f20770A.equals(H);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return UnsafeUtil.H(obj, S) != null;
                case 10:
                    return !ByteString.f20770A.equals(UnsafeUtil.H(obj, S));
                case 11:
                    return UnsafeUtil.D(obj, S) != 0;
                case 12:
                    return UnsafeUtil.D(obj, S) != 0;
                case 13:
                    return UnsafeUtil.D(obj, S) != 0;
                case 14:
                    return UnsafeUtil.F(obj, S) != 0;
                case 15:
                    return UnsafeUtil.D(obj, S) != 0;
                case 16:
                    return UnsafeUtil.F(obj, S) != 0;
                case 17:
                    return UnsafeUtil.H(obj, S) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            return (UnsafeUtil.D(obj, j2) & (1 << (Z >>> 20))) != 0;
        }
    }

    public final boolean y(Object obj, int i2, int i3, int i4, int i5) {
        return i3 == 1048575 ? x(obj, i2) : (i4 & i5) != 0;
    }
}
