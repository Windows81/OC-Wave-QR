package com.google.protobuf;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.google.api.Service;
import com.google.protobuf.ByteString;
import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.Internal;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.Writer;
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
    public static final int[] f32227r = new int[0];

    /* renamed from: s  reason: collision with root package name */
    public static final Unsafe f32228s = UnsafeUtil.I();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f32229a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f32230b;

    /* renamed from: c  reason: collision with root package name */
    public final int f32231c;

    /* renamed from: d  reason: collision with root package name */
    public final int f32232d;

    /* renamed from: e  reason: collision with root package name */
    public final MessageLite f32233e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f32234f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f32235g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f32236h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f32237i;

    /* renamed from: j  reason: collision with root package name */
    public final int[] f32238j;

    /* renamed from: k  reason: collision with root package name */
    public final int f32239k;

    /* renamed from: l  reason: collision with root package name */
    public final int f32240l;

    /* renamed from: m  reason: collision with root package name */
    public final NewInstanceSchema f32241m;

    /* renamed from: n  reason: collision with root package name */
    public final ListFieldSchema f32242n;

    /* renamed from: o  reason: collision with root package name */
    public final UnknownFieldSchema f32243o;

    /* renamed from: p  reason: collision with root package name */
    public final ExtensionSchema f32244p;

    /* renamed from: q  reason: collision with root package name */
    public final MapFieldSchema f32245q;

    /* renamed from: com.google.protobuf.MessageSchema$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f32246a;

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
                com.google.protobuf.WireFormat$FieldType[] r0 = com.google.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f32246a = r0
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f32246a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f32246a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f32246a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f32246a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f32246a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f32246a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f32246a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f32246a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f32246a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f32246a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f32246a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f32246a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f32246a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f32246a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f32246a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f32246a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.AnonymousClass1.<clinit>():void");
        }
    }

    public MessageSchema(int[] iArr, Object[] objArr, int i2, int i3, MessageLite messageLite, boolean z2, boolean z3, int[] iArr2, int i4, int i5, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MapFieldSchema mapFieldSchema) {
        MessageLite messageLite2 = messageLite;
        ExtensionSchema extensionSchema2 = extensionSchema;
        this.f32229a = iArr;
        this.f32230b = objArr;
        this.f32231c = i2;
        this.f32232d = i3;
        this.f32235g = messageLite2 instanceof GeneratedMessageLite;
        this.f32236h = z2;
        this.f32234f = extensionSchema2 != null && extensionSchema2.e(messageLite);
        this.f32237i = z3;
        this.f32238j = iArr2;
        this.f32239k = i4;
        this.f32240l = i5;
        this.f32241m = newInstanceSchema;
        this.f32242n = listFieldSchema;
        this.f32243o = unknownFieldSchema;
        this.f32244p = extensionSchema2;
        this.f32233e = messageLite2;
        this.f32245q = mapFieldSchema;
    }

    public static boolean B(Object obj, int i2, Schema schema) {
        return schema.e(UnsafeUtil.H(obj, V(i2)));
    }

    public static boolean E(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).Q();
        }
        return true;
    }

    public static boolean H(int i2) {
        return (i2 & 268435456) != 0;
    }

    public static List I(Object obj, long j2) {
        return (List) UnsafeUtil.H(obj, j2);
    }

    public static long J(Object obj, long j2) {
        return UnsafeUtil.F(obj, j2);
    }

    public static MessageSchema R(Class cls, MessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MapFieldSchema mapFieldSchema) {
        return messageInfo instanceof RawMessageInfo ? T((RawMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema) : S((StructuralMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    public static MessageSchema S(StructuralMessageInfo structuralMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MapFieldSchema mapFieldSchema) {
        int i2;
        int i3;
        int i4;
        boolean z2 = structuralMessageInfo.c() == ProtoSyntax.PROTO3;
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
            } else if (fieldInfo.r().f() >= 18 && fieldInfo.r().f() <= 49) {
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
            d2 = f32227r;
        }
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i7 < e2.length) {
            FieldInfo fieldInfo2 = e2[i7];
            int k2 = fieldInfo2.k();
            l0(fieldInfo2, iArr, i8, objArr);
            if (i9 < d2.length && d2[i9] == k2) {
                d2[i9] = i8;
                i9++;
            }
            if (fieldInfo2.r() == FieldType.MAP) {
                iArr3[i10] = i8;
                i10++;
            } else if (fieldInfo2.r().f() >= 18 && fieldInfo2.r().f() <= 49) {
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
            iArr3 = f32227r;
        }
        if (iArr2 == null) {
            iArr2 = f32227r;
        }
        int[] iArr4 = new int[(d2.length + iArr3.length + iArr2.length)];
        System.arraycopy(d2, 0, iArr4, 0, d2.length);
        System.arraycopy(iArr3, 0, iArr4, d2.length, iArr3.length);
        System.arraycopy(iArr2, 0, iArr4, d2.length + iArr3.length, iArr2.length);
        return new MessageSchema(iArr, objArr, i3, i2, structuralMessageInfo.b(), z2, true, iArr4, d2.length, d2.length + iArr3.length, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    /* JADX WARNING: Removed duplicated region for block: B:119:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x036d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.protobuf.MessageSchema T(com.google.protobuf.RawMessageInfo r33, com.google.protobuf.NewInstanceSchema r34, com.google.protobuf.ListFieldSchema r35, com.google.protobuf.UnknownFieldSchema r36, com.google.protobuf.ExtensionSchema r37, com.google.protobuf.MapFieldSchema r38) {
        /*
            com.google.protobuf.ProtoSyntax r0 = r33.c()
            com.google.protobuf.ProtoSyntax r1 = com.google.protobuf.ProtoSyntax.PROTO3
            r2 = 0
            if (r0 != r1) goto L_0x000b
            r10 = 1
            goto L_0x000c
        L_0x000b:
            r10 = r2
        L_0x000c:
            java.lang.String r0 = r33.e()
            int r1 = r0.length()
            char r4 = r0.charAt(r2)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L_0x0028
            r4 = 1
        L_0x001e:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0029
            r4 = r6
            goto L_0x001e
        L_0x0028:
            r6 = 1
        L_0x0029:
            int r4 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0048
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0035:
            int r9 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0045
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r8
            r6 = r6 | r4
            int r8 = r8 + 13
            r4 = r9
            goto L_0x0035
        L_0x0045:
            int r4 = r4 << r8
            r6 = r6 | r4
            r4 = r9
        L_0x0048:
            if (r6 != 0) goto L_0x0058
            int[] r6 = f32227r
            r8 = r2
            r9 = r8
            r11 = r9
            r12 = r11
            r14 = r12
            r16 = r14
            r13 = r6
            r6 = r16
            goto L_0x0162
        L_0x0058:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0077
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0064:
            int r9 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0074
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r8
            r4 = r4 | r6
            int r8 = r8 + 13
            r6 = r9
            goto L_0x0064
        L_0x0074:
            int r6 = r6 << r8
            r4 = r4 | r6
            r6 = r9
        L_0x0077:
            int r8 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0096
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0083:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x0093
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r6 = r6 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x0083
        L_0x0093:
            int r8 = r8 << r9
            r6 = r6 | r8
            r8 = r11
        L_0x0096:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x00b5
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00a2:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00b2
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x00a2
        L_0x00b2:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00b5:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00d4
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00c1:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00d1
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00c1
        L_0x00d1:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00d4:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00f3
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00e0:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x00f0
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00e0
        L_0x00f0:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00f3:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0112
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00ff:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x010f
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00ff
        L_0x010f:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0112:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0133
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x011e:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x012f
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x011e
        L_0x012f:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0133:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x0156
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x013f:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r5) goto L_0x0151
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x013f
        L_0x0151:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0156:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int[] r13 = new int[r13]
            int r16 = r4 * 2
            int r16 = r16 + r6
            r6 = r4
            r4 = r15
        L_0x0162:
            sun.misc.Unsafe r15 = f32228s
            java.lang.Object[] r17 = r33.d()
            com.google.protobuf.MessageLite r18 = r33.b()
            java.lang.Class r2 = r18.getClass()
            int r7 = r11 * 3
            int[] r7 = new int[r7]
            int r11 = r11 * 2
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r20 = r14 + r12
            r22 = r14
            r23 = r20
            r12 = 0
            r21 = 0
        L_0x0181:
            if (r4 >= r1) goto L_0x03bb
            int r24 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x01a9
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r3 = r24
            r24 = 13
        L_0x0191:
            int r26 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x01a3
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r24
            r4 = r4 | r3
            int r24 = r24 + 13
            r3 = r26
            goto L_0x0191
        L_0x01a3:
            int r3 = r3 << r24
            r4 = r4 | r3
            r3 = r26
            goto L_0x01ab
        L_0x01a9:
            r3 = r24
        L_0x01ab:
            int r24 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x01d8
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r5 = r24
            r24 = 13
        L_0x01b9:
            int r27 = r5 + 1
            char r5 = r0.charAt(r5)
            r28 = r1
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r1) goto L_0x01d2
            r1 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r24
            r3 = r3 | r1
            int r24 = r24 + 13
            r5 = r27
            r1 = r28
            goto L_0x01b9
        L_0x01d2:
            int r1 = r5 << r24
            r3 = r3 | r1
            r1 = r27
            goto L_0x01dc
        L_0x01d8:
            r28 = r1
            r1 = r24
        L_0x01dc:
            r5 = r3 & 255(0xff, float:3.57E-43)
            r24 = r14
            r14 = r3 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x01e9
            int r14 = r12 + 1
            r13[r12] = r21
            r12 = r14
        L_0x01e9:
            r14 = 51
            r30 = r12
            if (r5 < r14) goto L_0x0289
            int r14 = r1 + 1
            char r1 = r0.charAt(r1)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r12) goto L_0x0218
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r31 = 13
        L_0x01fe:
            int r32 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r12) goto L_0x0213
            r12 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r31
            r1 = r1 | r12
            int r31 = r31 + 13
            r14 = r32
            r12 = 55296(0xd800, float:7.7486E-41)
            goto L_0x01fe
        L_0x0213:
            int r12 = r14 << r31
            r1 = r1 | r12
            r14 = r32
        L_0x0218:
            int r12 = r5 + -51
            r31 = r14
            r14 = 9
            if (r12 == r14) goto L_0x023a
            r14 = 17
            if (r12 != r14) goto L_0x0225
            goto L_0x023a
        L_0x0225:
            r14 = 12
            if (r12 != r14) goto L_0x0247
            if (r10 != 0) goto L_0x0247
            int r12 = r21 / 3
            int r12 = r12 * 2
            r14 = 1
            int r12 = r12 + r14
            int r14 = r16 + 1
            r16 = r17[r16]
            r11[r12] = r16
        L_0x0237:
            r16 = r14
            goto L_0x0247
        L_0x023a:
            int r12 = r21 / 3
            int r12 = r12 * 2
            r14 = 1
            int r12 = r12 + r14
            int r14 = r16 + 1
            r16 = r17[r16]
            r11[r12] = r16
            goto L_0x0237
        L_0x0247:
            int r1 = r1 * 2
            r12 = r17[r1]
            boolean r14 = r12 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0255
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
        L_0x0251:
            r14 = r8
            r32 = r9
            goto L_0x025e
        L_0x0255:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = h0(r2, r12)
            r17[r1] = r12
            goto L_0x0251
        L_0x025e:
            long r8 = r15.objectFieldOffset(r12)
            int r8 = (int) r8
            int r1 = r1 + 1
            r9 = r17[r1]
            boolean r12 = r9 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x026f
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
        L_0x026d:
            r1 = r8
            goto L_0x0278
        L_0x026f:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = h0(r2, r9)
            r17[r1] = r9
            goto L_0x026d
        L_0x0278:
            long r8 = r15.objectFieldOffset(r9)
            int r8 = (int) r8
            r29 = r0
            r9 = r8
            r0 = r10
            r27 = r31
            r25 = 1
            r8 = r1
            r1 = 0
            goto L_0x0384
        L_0x0289:
            r14 = r8
            r32 = r9
            int r8 = r16 + 1
            r9 = r17[r16]
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = h0(r2, r9)
            r12 = 9
            if (r5 == r12) goto L_0x029e
            r12 = 17
            if (r5 != r12) goto L_0x02a2
        L_0x029e:
            r25 = 1
            goto L_0x0305
        L_0x02a2:
            r12 = 27
            if (r5 == r12) goto L_0x02aa
            r12 = 49
            if (r5 != r12) goto L_0x02ad
        L_0x02aa:
            r25 = 1
            goto L_0x02f8
        L_0x02ad:
            r12 = 12
            if (r5 == r12) goto L_0x02e5
            r12 = 30
            if (r5 == r12) goto L_0x02e5
            r12 = 44
            if (r5 != r12) goto L_0x02ba
            goto L_0x02e5
        L_0x02ba:
            r12 = 50
            if (r5 != r12) goto L_0x02da
            int r12 = r22 + 1
            r13[r22] = r21
            int r22 = r21 / 3
            int r22 = r22 * 2
            int r27 = r16 + 2
            r8 = r17[r8]
            r11[r22] = r8
            r8 = r3 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x02de
            int r22 = r22 + 1
            int r8 = r16 + 3
            r16 = r17[r27]
            r11[r22] = r16
            r22 = r12
        L_0x02da:
            r25 = 1
        L_0x02dc:
            r12 = r8
            goto L_0x0312
        L_0x02de:
            r22 = r12
            r12 = r27
            r25 = 1
            goto L_0x0312
        L_0x02e5:
            if (r10 != 0) goto L_0x02da
            int r12 = r21 / 3
            int r12 = r12 * 2
            r25 = 1
            int r12 = r12 + 1
            int r16 = r16 + 2
            r8 = r17[r8]
            r11[r12] = r8
        L_0x02f5:
            r12 = r16
            goto L_0x0312
        L_0x02f8:
            int r12 = r21 / 3
            int r12 = r12 * 2
            int r12 = r12 + 1
            int r16 = r16 + 2
            r8 = r17[r8]
            r11[r12] = r8
            goto L_0x02f5
        L_0x0305:
            int r12 = r21 / 3
            int r12 = r12 * 2
            int r12 = r12 + 1
            java.lang.Class r16 = r9.getType()
            r11[r12] = r16
            goto L_0x02dc
        L_0x0312:
            long r8 = r15.objectFieldOffset(r9)
            int r8 = (int) r8
            r9 = r3 & 4096(0x1000, float:5.74E-42)
            r16 = r12
            r12 = 4096(0x1000, float:5.74E-42)
            if (r9 != r12) goto L_0x036d
            r9 = 17
            if (r5 > r9) goto L_0x036d
            int r9 = r1 + 1
            char r1 = r0.charAt(r1)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r12) goto L_0x0348
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r26 = 13
        L_0x0332:
            int r27 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r12) goto L_0x0344
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r26
            r1 = r1 | r9
            int r26 = r26 + 13
            r9 = r27
            goto L_0x0332
        L_0x0344:
            int r9 = r9 << r26
            r1 = r1 | r9
            goto L_0x034a
        L_0x0348:
            r27 = r9
        L_0x034a:
            int r9 = r6 * 2
            int r26 = r1 / 32
            int r9 = r9 + r26
            r12 = r17[r9]
            r29 = r0
            boolean r0 = r12 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x035c
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
        L_0x035a:
            r0 = r10
            goto L_0x0365
        L_0x035c:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = h0(r2, r12)
            r17[r9] = r12
            goto L_0x035a
        L_0x0365:
            long r9 = r15.objectFieldOffset(r12)
            int r9 = (int) r9
            int r1 = r1 % 32
            goto L_0x0376
        L_0x036d:
            r29 = r0
            r0 = r10
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r27 = r1
            r1 = 0
        L_0x0376:
            r10 = 18
            if (r5 < r10) goto L_0x0384
            r10 = 49
            if (r5 > r10) goto L_0x0384
            int r10 = r23 + 1
            r13[r23] = r8
            r23 = r10
        L_0x0384:
            int r10 = r21 + 1
            r7[r21] = r4
            int r4 = r21 + 2
            r12 = r3 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0391
            r12 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0392
        L_0x0391:
            r12 = 0
        L_0x0392:
            r3 = r3 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x0399
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x039a
        L_0x0399:
            r3 = 0
        L_0x039a:
            r3 = r3 | r12
            int r5 = r5 << 20
            r3 = r3 | r5
            r3 = r3 | r8
            r7[r10] = r3
            int r21 = r21 + 3
            int r1 = r1 << 20
            r1 = r1 | r9
            r7[r4] = r1
            r10 = r0
            r8 = r14
            r14 = r24
            r4 = r27
            r1 = r28
            r0 = r29
            r12 = r30
            r9 = r32
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0181
        L_0x03bb:
            r32 = r9
            r0 = r10
            r24 = r14
            r14 = r8
            com.google.protobuf.MessageSchema r1 = new com.google.protobuf.MessageSchema
            com.google.protobuf.MessageLite r9 = r33.b()
            r2 = 0
            r4 = r1
            r5 = r7
            r6 = r11
            r7 = r14
            r8 = r32
            r11 = r2
            r12 = r13
            r13 = r24
            r14 = r20
            r15 = r34
            r16 = r35
            r17 = r36
            r18 = r37
            r19 = r38
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.T(com.google.protobuf.RawMessageInfo, com.google.protobuf.NewInstanceSchema, com.google.protobuf.ListFieldSchema, com.google.protobuf.UnknownFieldSchema, com.google.protobuf.ExtensionSchema, com.google.protobuf.MapFieldSchema):com.google.protobuf.MessageSchema");
    }

    public static long V(int i2) {
        return (long) (i2 & 1048575);
    }

    public static boolean W(Object obj, long j2) {
        return ((Boolean) UnsafeUtil.H(obj, j2)).booleanValue();
    }

    public static double X(Object obj, long j2) {
        return ((Double) UnsafeUtil.H(obj, j2)).doubleValue();
    }

    public static float Y(Object obj, long j2) {
        return ((Float) UnsafeUtil.H(obj, j2)).floatValue();
    }

    public static int Z(Object obj, long j2) {
        return ((Integer) UnsafeUtil.H(obj, j2)).intValue();
    }

    public static long a0(Object obj, long j2) {
        return ((Long) UnsafeUtil.H(obj, j2)).longValue();
    }

    public static Field h0(Class cls, String str) {
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

    public static boolean k(Object obj, long j2) {
        return UnsafeUtil.u(obj, j2);
    }

    public static void l(Object obj) {
        if (!E(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void l0(com.google.protobuf.FieldInfo r8, int[] r9, int r10, java.lang.Object[] r11) {
        /*
            com.google.protobuf.OneofInfo r0 = r8.n()
            r1 = 0
            if (r0 == 0) goto L_0x0025
            com.google.protobuf.FieldType r2 = r8.r()
            int r2 = r2.f()
            int r2 = r2 + 51
            java.lang.reflect.Field r3 = r0.b()
            long r3 = com.google.protobuf.UnsafeUtil.M(r3)
            int r3 = (int) r3
            java.lang.reflect.Field r0 = r0.a()
            long r4 = com.google.protobuf.UnsafeUtil.M(r0)
        L_0x0022:
            int r0 = (int) r4
            r4 = r1
            goto L_0x006c
        L_0x0025:
            com.google.protobuf.FieldType r0 = r8.r()
            java.lang.reflect.Field r2 = r8.j()
            long r2 = com.google.protobuf.UnsafeUtil.M(r2)
            int r3 = (int) r2
            int r2 = r0.f()
            boolean r4 = r0.h()
            if (r4 != 0) goto L_0x005a
            boolean r0 = r0.j()
            if (r0 != 0) goto L_0x005a
            java.lang.reflect.Field r0 = r8.o()
            if (r0 != 0) goto L_0x004c
            r0 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0051
        L_0x004c:
            long r4 = com.google.protobuf.UnsafeUtil.M(r0)
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
            long r4 = com.google.protobuf.UnsafeUtil.M(r0)
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
            com.google.protobuf.Internal$EnumVerifier r9 = r8.h()
            if (r9 == 0) goto L_0x00db
            int r10 = r10 + 1
            com.google.protobuf.Internal$EnumVerifier r8 = r8.h()
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
            com.google.protobuf.Internal$EnumVerifier r9 = r8.h()
            if (r9 == 0) goto L_0x00db
            int r10 = r10 / 3
            int r10 = r10 * 2
            int r10 = r10 + 1
            com.google.protobuf.Internal$EnumVerifier r8 = r8.h()
            r11[r10] = r8
        L_0x00db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.l0(com.google.protobuf.FieldInfo, int[], int, java.lang.Object[]):void");
    }

    public static double m(Object obj, long j2) {
        return UnsafeUtil.B(obj, j2);
    }

    public static int o0(int i2) {
        return (i2 & 267386880) >>> 20;
    }

    public static float q(Object obj, long j2) {
        return UnsafeUtil.C(obj, j2);
    }

    public static int x(Object obj, long j2) {
        return UnsafeUtil.D(obj, j2);
    }

    public static boolean y(int i2) {
        return (i2 & 536870912) != 0;
    }

    public final boolean A(Object obj, int i2, int i3, int i4, int i5) {
        return i3 == 1048575 ? z(obj, i2) : (i4 & i5) != 0;
    }

    public final boolean C(Object obj, int i2, int i3) {
        List list = (List) UnsafeUtil.H(obj, V(i2));
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

    public final boolean D(Object obj, int i2, int i3) {
        Map h2 = this.f32245q.h(UnsafeUtil.H(obj, V(i2)));
        if (h2.isEmpty()) {
            return true;
        }
        if (this.f32245q.c(s(i3)).f32220c.f() != WireFormat.JavaType.MESSAGE) {
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

    public final boolean F(Object obj, Object obj2, int i2) {
        long c0 = (long) (c0(i2) & 1048575);
        return UnsafeUtil.D(obj, c0) == UnsafeUtil.D(obj2, c0);
    }

    public final boolean G(Object obj, int i2, int i3) {
        return UnsafeUtil.D(obj, (long) (c0(i3) & 1048575)) == i2;
    }

    /* JADX WARNING: type inference failed for: r12v65, types: [boolean] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00fc, code lost:
        r13 = r6;
        r14 = r7;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0110, code lost:
        r12 = r5;
        r13 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0112, code lost:
        r14 = r7;
        r12 = r12;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x064f A[Catch:{ all -> 0x0675 }] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0677  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x06b5 A[LOOP:6: B:204:0x06b1->B:206:0x06b5, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x06ca  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void K(com.google.protobuf.UnknownFieldSchema r19, com.google.protobuf.ExtensionSchema r20, java.lang.Object r21, com.google.protobuf.Reader r22, com.google.protobuf.ExtensionRegistryLite r23) {
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
            int r2 = r22.J()     // Catch:{ all -> 0x06a9 }
            int r3 = r8.b0(r2)     // Catch:{ all -> 0x06a9 }
            if (r3 >= 0) goto L_0x00bb
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r1) goto L_0x003e
            int r0 = r8.f32239k
            r4 = r5
        L_0x0021:
            int r1 = r8.f32240l
            if (r0 >= r1) goto L_0x0038
            int[] r1 = r8.f32238j
            r3 = r1[r0]
            r1 = r18
            r2 = r21
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.o(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L_0x0021
        L_0x0038:
            if (r4 == 0) goto L_0x003d
            r7.o(r15, r4)
        L_0x003d:
            return
        L_0x003e:
            boolean r1 = r8.f32234f     // Catch:{ all -> 0x00b8 }
            if (r1 != 0) goto L_0x0047
            r4 = r20
            r12 = r17
            goto L_0x0050
        L_0x0047:
            com.google.protobuf.MessageLite r1 = r8.f32233e     // Catch:{ all -> 0x00b8 }
            r4 = r20
            java.lang.Object r1 = r4.b(r6, r1, r2)     // Catch:{ all -> 0x00b8 }
            r12 = r1
        L_0x0050:
            if (r12 == 0) goto L_0x0078
            if (r9 != 0) goto L_0x005e
            com.google.protobuf.FieldSet r1 = r20.d(r21)     // Catch:{ all -> 0x0059 }
            goto L_0x005f
        L_0x0059:
            r0 = move-exception
        L_0x005a:
            r14 = r7
            r10 = r15
            goto L_0x06ad
        L_0x005e:
            r1 = r9
        L_0x005f:
            r9 = r20
            r10 = r21
            r11 = r22
            r13 = r23
            r14 = r1
            r3 = r15
            r15 = r5
            r16 = r19
            java.lang.Object r5 = r9.g(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0073 }
            r9 = r1
        L_0x0071:
            r15 = r3
            goto L_0x000f
        L_0x0073:
            r0 = move-exception
            r10 = r3
        L_0x0075:
            r14 = r7
            goto L_0x06ad
        L_0x0078:
            r3 = r15
            boolean r1 = r7.q(r0)     // Catch:{ all -> 0x0073 }
            if (r1 == 0) goto L_0x0086
            boolean r1 = r22.O()     // Catch:{ all -> 0x0073 }
            if (r1 == 0) goto L_0x0094
        L_0x0085:
            goto L_0x0071
        L_0x0086:
            if (r5 != 0) goto L_0x008d
            java.lang.Object r1 = r7.f(r3)     // Catch:{ all -> 0x0073 }
            r5 = r1
        L_0x008d:
            boolean r1 = r7.m(r5, r0)     // Catch:{ all -> 0x0073 }
            if (r1 == 0) goto L_0x0094
            goto L_0x0085
        L_0x0094:
            int r0 = r8.f32239k
            r4 = r5
        L_0x0097:
            int r1 = r8.f32240l
            if (r0 >= r1) goto L_0x00b1
            int[] r1 = r8.f32238j
            r5 = r1[r0]
            r1 = r18
            r2 = r21
            r10 = r3
            r3 = r5
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.o(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            r3 = r10
            goto L_0x0097
        L_0x00b1:
            r10 = r3
            if (r4 == 0) goto L_0x00b7
            r7.o(r10, r4)
        L_0x00b7:
            return
        L_0x00b8:
            r0 = move-exception
            r10 = r15
            goto L_0x0075
        L_0x00bb:
            r4 = r20
            r10 = r15
            int r11 = r8.p0(r3)     // Catch:{ all -> 0x0281 }
            int r1 = o0(r11)     // Catch:{ InvalidWireTypeException -> 0x0285 }
            switch(r1) {
                case 0: goto L_0x0636;
                case 1: goto L_0x0624;
                case 2: goto L_0x0612;
                case 3: goto L_0x0600;
                case 4: goto L_0x05ee;
                case 5: goto L_0x05db;
                case 6: goto L_0x05c8;
                case 7: goto L_0x05b5;
                case 8: goto L_0x05aa;
                case 9: goto L_0x0595;
                case 10: goto L_0x0582;
                case 11: goto L_0x056f;
                case 12: goto L_0x0549;
                case 13: goto L_0x0536;
                case 14: goto L_0x0523;
                case 15: goto L_0x0510;
                case 16: goto L_0x04fd;
                case 17: goto L_0x04e8;
                case 18: goto L_0x04d6;
                case 19: goto L_0x04c4;
                case 20: goto L_0x04b2;
                case 21: goto L_0x04a0;
                case 22: goto L_0x048e;
                case 23: goto L_0x047c;
                case 24: goto L_0x046a;
                case 25: goto L_0x0458;
                case 26: goto L_0x0450;
                case 27: goto L_0x043b;
                case 28: goto L_0x0429;
                case 29: goto L_0x0417;
                case 30: goto L_0x03f6;
                case 31: goto L_0x03e4;
                case 32: goto L_0x03d2;
                case 33: goto L_0x03c0;
                case 34: goto L_0x03ae;
                case 35: goto L_0x039c;
                case 36: goto L_0x038a;
                case 37: goto L_0x0378;
                case 38: goto L_0x0366;
                case 39: goto L_0x0354;
                case 40: goto L_0x0342;
                case 41: goto L_0x0330;
                case 42: goto L_0x031e;
                case 43: goto L_0x030c;
                case 44: goto L_0x02eb;
                case 45: goto L_0x02d9;
                case 46: goto L_0x02c7;
                case 47: goto L_0x02b5;
                case 48: goto L_0x02a3;
                case 49: goto L_0x0288;
                case 50: goto L_0x0264;
                case 51: goto L_0x0250;
                case 52: goto L_0x023c;
                case 53: goto L_0x0228;
                case 54: goto L_0x0214;
                case 55: goto L_0x0200;
                case 56: goto L_0x01ec;
                case 57: goto L_0x01d8;
                case 58: goto L_0x01c4;
                case 59: goto L_0x01bc;
                case 60: goto L_0x01aa;
                case 61: goto L_0x019a;
                case 62: goto L_0x0186;
                case 63: goto L_0x0161;
                case 64: goto L_0x014e;
                case 65: goto L_0x013b;
                case 66: goto L_0x0128;
                case 67: goto L_0x0115;
                case 68: goto L_0x0100;
                default: goto L_0x00c9;
            }
        L_0x00c9:
            if (r5 != 0) goto L_0x00d6
            java.lang.Object r5 = r7.f(r10)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            goto L_0x00d6
        L_0x00d0:
            r0 = move-exception
            goto L_0x0075
        L_0x00d2:
            r13 = r6
            r14 = r7
            goto L_0x0649
        L_0x00d6:
            boolean r1 = r7.m(r5, r0)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            if (r1 != 0) goto L_0x00fc
            int r0 = r8.f32239k
            r4 = r5
        L_0x00df:
            int r1 = r8.f32240l
            if (r0 >= r1) goto L_0x00f6
            int[] r1 = r8.f32238j
            r3 = r1[r0]
            r1 = r18
            r2 = r21
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.o(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L_0x00df
        L_0x00f6:
            if (r4 == 0) goto L_0x00fb
            r7.o(r10, r4)
        L_0x00fb:
            return
        L_0x00fc:
            r13 = r6
            r14 = r7
            goto L_0x06a4
        L_0x0100:
            java.lang.Object r1 = r8.Q(r10, r2, r3)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            com.google.protobuf.MessageLite r1 = (com.google.protobuf.MessageLite) r1     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            com.google.protobuf.Schema r11 = r8.t(r3)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            r0.c(r1, r11, r6)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            r8.n0(r10, r2, r3, r1)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
        L_0x0110:
            r12 = r5
            r13 = r6
        L_0x0112:
            r14 = r7
            goto L_0x0647
        L_0x0115:
            long r11 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            long r13 = r22.H()     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            java.lang.Long r1 = java.lang.Long.valueOf(r13)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            com.google.protobuf.UnsafeUtil.Y(r10, r11, r1)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            r8.j0(r10, r2, r3)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x0128:
            long r11 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            int r1 = r22.G()     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            com.google.protobuf.UnsafeUtil.Y(r10, r11, r1)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            r8.j0(r10, r2, r3)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x013b:
            long r11 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            long r13 = r22.w()     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            java.lang.Long r1 = java.lang.Long.valueOf(r13)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            com.google.protobuf.UnsafeUtil.Y(r10, r11, r1)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            r8.j0(r10, r2, r3)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x014e:
            long r11 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            int r1 = r22.P()     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            com.google.protobuf.UnsafeUtil.Y(r10, r11, r1)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            r8.j0(r10, r2, r3)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x0161:
            int r1 = r22.D()     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            com.google.protobuf.Internal$EnumVerifier r12 = r8.r(r3)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            if (r12 == 0) goto L_0x0177
            boolean r12 = r12.a(r1)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            if (r12 == 0) goto L_0x0172
            goto L_0x0177
        L_0x0172:
            java.lang.Object r5 = com.google.protobuf.SchemaUtil.L(r10, r2, r1, r5, r7)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            goto L_0x00fc
        L_0x0177:
            long r11 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            com.google.protobuf.UnsafeUtil.Y(r10, r11, r1)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            r8.j0(r10, r2, r3)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x0186:
            long r11 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            int r1 = r22.y()     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            com.google.protobuf.UnsafeUtil.Y(r10, r11, r1)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            r8.j0(r10, r2, r3)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x019a:
            long r11 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            com.google.protobuf.ByteString r1 = r22.M()     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            com.google.protobuf.UnsafeUtil.Y(r10, r11, r1)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            r8.j0(r10, r2, r3)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x01aa:
            java.lang.Object r1 = r8.Q(r10, r2, r3)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            com.google.protobuf.MessageLite r1 = (com.google.protobuf.MessageLite) r1     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            com.google.protobuf.Schema r11 = r8.t(r3)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            r0.f(r1, r11, r6)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            r8.n0(r10, r2, r3, r1)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x01bc:
            r8.f0(r10, r11, r0)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            r8.j0(r10, r2, r3)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x01c4:
            long r11 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            boolean r1 = r22.v()     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            com.google.protobuf.UnsafeUtil.Y(r10, r11, r1)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            r8.j0(r10, r2, r3)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x01d8:
            long r11 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            int r1 = r22.u()     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            com.google.protobuf.UnsafeUtil.Y(r10, r11, r1)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            r8.j0(r10, r2, r3)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x01ec:
            long r11 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            long r13 = r22.q()     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            java.lang.Long r1 = java.lang.Long.valueOf(r13)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            com.google.protobuf.UnsafeUtil.Y(r10, r11, r1)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            r8.j0(r10, r2, r3)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x0200:
            long r11 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            int r1 = r22.i()     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            com.google.protobuf.UnsafeUtil.Y(r10, r11, r1)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            r8.j0(r10, r2, r3)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x0214:
            long r11 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            long r13 = r22.p()     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            java.lang.Long r1 = java.lang.Long.valueOf(r13)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            com.google.protobuf.UnsafeUtil.Y(r10, r11, r1)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            r8.j0(r10, r2, r3)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x0228:
            long r11 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            long r13 = r22.n()     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            java.lang.Long r1 = java.lang.Long.valueOf(r13)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            com.google.protobuf.UnsafeUtil.Y(r10, r11, r1)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            r8.j0(r10, r2, r3)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x023c:
            long r11 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            float r1 = r22.readFloat()     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            java.lang.Float r1 = java.lang.Float.valueOf(r1)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            com.google.protobuf.UnsafeUtil.Y(r10, r11, r1)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            r8.j0(r10, r2, r3)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x0250:
            long r11 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            double r13 = r22.readDouble()     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            java.lang.Double r1 = java.lang.Double.valueOf(r13)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            com.google.protobuf.UnsafeUtil.Y(r10, r11, r1)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            r8.j0(r10, r2, r3)     // Catch:{ InvalidWireTypeException -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x0264:
            java.lang.Object r11 = r8.s(r3)     // Catch:{ InvalidWireTypeException -> 0x0285 }
            r1 = r18
            r2 = r21
            r4 = r11
            r12 = r5
            r5 = r23
            r13 = r6
            r6 = r22
            r1.L(r2, r3, r4, r5, r6)     // Catch:{ InvalidWireTypeException -> 0x027d, all -> 0x0278 }
            goto L_0x0112
        L_0x0278:
            r0 = move-exception
            r14 = r7
        L_0x027a:
            r5 = r12
            goto L_0x06ad
        L_0x027d:
            r14 = r7
        L_0x027e:
            r5 = r12
            goto L_0x0649
        L_0x0281:
            r0 = move-exception
            r12 = r5
            goto L_0x0075
        L_0x0285:
            r12 = r5
            goto L_0x00d2
        L_0x0288:
            r12 = r5
            r13 = r6
            long r4 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x027d, all -> 0x0278 }
            com.google.protobuf.Schema r6 = r8.t(r3)     // Catch:{ InvalidWireTypeException -> 0x027d, all -> 0x0278 }
            r1 = r18
            r2 = r21
            r3 = r4
            r5 = r22
            r14 = r7
            r7 = r23
            r1.d0(r2, r3, r5, r6, r7)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x02a1:
            r0 = move-exception
            goto L_0x027a
        L_0x02a3:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.ListFieldSchema r1 = r8.f32242n     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            long r2 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r0.s(r1)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x02b5:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.ListFieldSchema r1 = r8.f32242n     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            long r2 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r0.o(r1)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x02c7:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.ListFieldSchema r1 = r8.f32242n     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            long r2 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r0.A(r1)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x02d9:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.ListFieldSchema r1 = r8.f32242n     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            long r2 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r0.r(r1)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x02eb:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.ListFieldSchema r1 = r8.f32242n     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            long r4 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            java.util.List r4 = r1.e(r10, r4)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r0.C(r4)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            com.google.protobuf.Internal$EnumVerifier r5 = r8.r(r3)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r1 = r21
            r3 = r4
            r4 = r5
            r5 = r12
            r6 = r19
            java.lang.Object r5 = com.google.protobuf.SchemaUtil.A(r1, r2, r3, r4, r5, r6)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x06a4
        L_0x030c:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.ListFieldSchema r1 = r8.f32242n     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            long r2 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r0.t(r1)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x031e:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.ListFieldSchema r1 = r8.f32242n     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            long r2 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r0.I(r1)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0330:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.ListFieldSchema r1 = r8.f32242n     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            long r2 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r0.F(r1)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0342:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.ListFieldSchema r1 = r8.f32242n     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            long r2 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r0.T(r1)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0354:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.ListFieldSchema r1 = r8.f32242n     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            long r2 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r0.B(r1)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0366:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.ListFieldSchema r1 = r8.f32242n     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            long r2 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r0.x(r1)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0378:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.ListFieldSchema r1 = r8.f32242n     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            long r2 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r0.z(r1)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x038a:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.ListFieldSchema r1 = r8.f32242n     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            long r2 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r0.N(r1)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x039c:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.ListFieldSchema r1 = r8.f32242n     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            long r2 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r0.R(r1)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x03ae:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.ListFieldSchema r1 = r8.f32242n     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            long r2 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r0.s(r1)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x03c0:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.ListFieldSchema r1 = r8.f32242n     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            long r2 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r0.o(r1)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x03d2:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.ListFieldSchema r1 = r8.f32242n     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            long r2 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r0.A(r1)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x03e4:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.ListFieldSchema r1 = r8.f32242n     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            long r2 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r0.r(r1)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x03f6:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.ListFieldSchema r1 = r8.f32242n     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            long r4 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            java.util.List r4 = r1.e(r10, r4)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r0.C(r4)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            com.google.protobuf.Internal$EnumVerifier r5 = r8.r(r3)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r1 = r21
            r3 = r4
            r4 = r5
            r5 = r12
            r6 = r19
            java.lang.Object r5 = com.google.protobuf.SchemaUtil.A(r1, r2, r3, r4, r5, r6)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x06a4
        L_0x0417:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.ListFieldSchema r1 = r8.f32242n     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            long r2 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r0.t(r1)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0429:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.ListFieldSchema r1 = r8.f32242n     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            long r2 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r0.Q(r1)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x043b:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.Schema r5 = r8.t(r3)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r1 = r18
            r2 = r21
            r3 = r11
            r4 = r22
            r6 = r23
            r1.e0(r2, r3, r4, r5, r6)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0450:
            r12 = r5
            r13 = r6
            r14 = r7
            r8.g0(r10, r11, r0)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0458:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.ListFieldSchema r1 = r8.f32242n     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            long r2 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r0.I(r1)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x046a:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.ListFieldSchema r1 = r8.f32242n     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            long r2 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r0.F(r1)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x047c:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.ListFieldSchema r1 = r8.f32242n     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            long r2 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r0.T(r1)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x048e:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.ListFieldSchema r1 = r8.f32242n     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            long r2 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r0.B(r1)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x04a0:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.ListFieldSchema r1 = r8.f32242n     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            long r2 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r0.x(r1)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x04b2:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.ListFieldSchema r1 = r8.f32242n     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            long r2 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r0.z(r1)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x04c4:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.ListFieldSchema r1 = r8.f32242n     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            long r2 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r0.N(r1)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x04d6:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.ListFieldSchema r1 = r8.f32242n     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            long r2 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r0.R(r1)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x04e8:
            r12 = r5
            r13 = r6
            r14 = r7
            java.lang.Object r1 = r8.P(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            com.google.protobuf.MessageLite r1 = (com.google.protobuf.MessageLite) r1     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            com.google.protobuf.Schema r2 = r8.t(r3)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r0.c(r1, r2, r13)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r8.m0(r10, r3, r1)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x04fd:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            long r4 = r22.H()     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            com.google.protobuf.UnsafeUtil.X(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r8.i0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0510:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            int r4 = r22.G()     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            com.google.protobuf.UnsafeUtil.W(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r8.i0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0523:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            long r4 = r22.w()     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            com.google.protobuf.UnsafeUtil.X(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r8.i0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0536:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            int r4 = r22.P()     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            com.google.protobuf.UnsafeUtil.W(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r8.i0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0549:
            r12 = r5
            r13 = r6
            r14 = r7
            int r1 = r22.D()     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            com.google.protobuf.Internal$EnumVerifier r4 = r8.r(r3)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            if (r4 == 0) goto L_0x0563
            boolean r4 = r4.a(r1)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            if (r4 == 0) goto L_0x055d
            goto L_0x0563
        L_0x055d:
            java.lang.Object r5 = com.google.protobuf.SchemaUtil.L(r10, r2, r1, r12, r14)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x06a4
        L_0x0563:
            long r4 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            com.google.protobuf.UnsafeUtil.W(r10, r4, r1)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r8.i0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x056f:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            int r4 = r22.y()     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            com.google.protobuf.UnsafeUtil.W(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r8.i0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0582:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            com.google.protobuf.ByteString r4 = r22.M()     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            com.google.protobuf.UnsafeUtil.Y(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r8.i0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0595:
            r12 = r5
            r13 = r6
            r14 = r7
            java.lang.Object r1 = r8.P(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            com.google.protobuf.MessageLite r1 = (com.google.protobuf.MessageLite) r1     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            com.google.protobuf.Schema r2 = r8.t(r3)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r0.f(r1, r2, r13)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r8.m0(r10, r3, r1)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x05aa:
            r12 = r5
            r13 = r6
            r14 = r7
            r8.f0(r10, r11, r0)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r8.i0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x05b5:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            boolean r4 = r22.v()     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            com.google.protobuf.UnsafeUtil.N(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r8.i0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x05c8:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            int r4 = r22.u()     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            com.google.protobuf.UnsafeUtil.W(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r8.i0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x05db:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            long r4 = r22.q()     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            com.google.protobuf.UnsafeUtil.X(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r8.i0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x05ee:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            int r4 = r22.i()     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            com.google.protobuf.UnsafeUtil.W(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r8.i0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0600:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            long r4 = r22.p()     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            com.google.protobuf.UnsafeUtil.X(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r8.i0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0612:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            long r4 = r22.n()     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            com.google.protobuf.UnsafeUtil.X(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r8.i0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0624:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            float r4 = r22.readFloat()     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            com.google.protobuf.UnsafeUtil.V(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r8.i0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0636:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = V(r11)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            double r4 = r22.readDouble()     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            com.google.protobuf.UnsafeUtil.U(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
            r8.i0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x027e, all -> 0x02a1 }
        L_0x0647:
            r5 = r12
            goto L_0x06a4
        L_0x0649:
            boolean r1 = r14.q(r0)     // Catch:{ all -> 0x0675 }
            if (r1 == 0) goto L_0x0677
            boolean r1 = r22.O()     // Catch:{ all -> 0x0675 }
            if (r1 != 0) goto L_0x06a4
            int r0 = r8.f32239k
            r4 = r5
        L_0x0658:
            int r1 = r8.f32240l
            if (r0 >= r1) goto L_0x066f
            int[] r1 = r8.f32238j
            r3 = r1[r0]
            r1 = r18
            r2 = r21
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.o(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L_0x0658
        L_0x066f:
            if (r4 == 0) goto L_0x0674
            r14.o(r10, r4)
        L_0x0674:
            return
        L_0x0675:
            r0 = move-exception
            goto L_0x06ad
        L_0x0677:
            if (r5 != 0) goto L_0x067e
            java.lang.Object r1 = r14.f(r10)     // Catch:{ all -> 0x0675 }
            r5 = r1
        L_0x067e:
            boolean r1 = r14.m(r5, r0)     // Catch:{ all -> 0x0675 }
            if (r1 != 0) goto L_0x06a4
            int r0 = r8.f32239k
            r4 = r5
        L_0x0687:
            int r1 = r8.f32240l
            if (r0 >= r1) goto L_0x069e
            int[] r1 = r8.f32238j
            r3 = r1[r0]
            r1 = r18
            r2 = r21
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.o(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L_0x0687
        L_0x069e:
            if (r4 == 0) goto L_0x06a3
            r14.o(r10, r4)
        L_0x06a3:
            return
        L_0x06a4:
            r15 = r10
            r6 = r13
            r7 = r14
            goto L_0x000f
        L_0x06a9:
            r0 = move-exception
            r12 = r5
            goto L_0x005a
        L_0x06ad:
            int r1 = r8.f32239k
            r7 = r1
            r4 = r5
        L_0x06b1:
            int r1 = r8.f32240l
            if (r7 >= r1) goto L_0x06c8
            int[] r1 = r8.f32238j
            r3 = r1[r7]
            r1 = r18
            r2 = r21
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.o(r2, r3, r4, r5, r6)
            int r7 = r7 + 1
            goto L_0x06b1
        L_0x06c8:
            if (r4 == 0) goto L_0x06cd
            r14.o(r10, r4)
        L_0x06cd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.K(com.google.protobuf.UnknownFieldSchema, com.google.protobuf.ExtensionSchema, java.lang.Object, com.google.protobuf.Reader, com.google.protobuf.ExtensionRegistryLite):void");
    }

    public final void L(Object obj, int i2, Object obj2, ExtensionRegistryLite extensionRegistryLite, Reader reader) {
        long V = V(p0(i2));
        Object H = UnsafeUtil.H(obj, V);
        if (H == null) {
            H = this.f32245q.e(obj2);
            UnsafeUtil.Y(obj, V, H);
        } else if (this.f32245q.g(H)) {
            Object e2 = this.f32245q.e(obj2);
            this.f32245q.a(e2, H);
            UnsafeUtil.Y(obj, V, e2);
            H = e2;
        }
        reader.g(this.f32245q.d(H), this.f32245q.c(obj2), extensionRegistryLite);
    }

    public final void M(Object obj, Object obj2, int i2) {
        if (z(obj2, i2)) {
            long V = V(p0(i2));
            Unsafe unsafe = f32228s;
            Object object = unsafe.getObject(obj2, V);
            if (object != null) {
                Schema t2 = t(i2);
                if (!z(obj, i2)) {
                    if (!E(object)) {
                        unsafe.putObject(obj, V, object);
                    } else {
                        Object g2 = t2.g();
                        t2.a(g2, object);
                        unsafe.putObject(obj, V, g2);
                    }
                    i0(obj, i2);
                    return;
                }
                Object object2 = unsafe.getObject(obj, V);
                if (!E(object2)) {
                    Object g3 = t2.g();
                    t2.a(g3, object2);
                    unsafe.putObject(obj, V, g3);
                    object2 = g3;
                }
                t2.a(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + U(i2) + " is present but null: " + obj2);
        }
    }

    public final void N(Object obj, Object obj2, int i2) {
        int U = U(i2);
        if (G(obj2, U, i2)) {
            long V = V(p0(i2));
            Unsafe unsafe = f32228s;
            Object object = unsafe.getObject(obj2, V);
            if (object != null) {
                Schema t2 = t(i2);
                if (!G(obj, U, i2)) {
                    if (!E(object)) {
                        unsafe.putObject(obj, V, object);
                    } else {
                        Object g2 = t2.g();
                        t2.a(g2, object);
                        unsafe.putObject(obj, V, g2);
                    }
                    j0(obj, U, i2);
                    return;
                }
                Object object2 = unsafe.getObject(obj, V);
                if (!E(object2)) {
                    Object g3 = t2.g();
                    t2.a(g3, object2);
                    unsafe.putObject(obj, V, g3);
                    object2 = g3;
                }
                t2.a(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + U(i2) + " is present but null: " + obj2);
        }
    }

    public final void O(Object obj, Object obj2, int i2) {
        int p0 = p0(i2);
        long V = V(p0);
        int U = U(i2);
        switch (o0(p0)) {
            case 0:
                if (z(obj2, i2)) {
                    UnsafeUtil.U(obj, V, UnsafeUtil.B(obj2, V));
                    i0(obj, i2);
                    return;
                }
                return;
            case 1:
                if (z(obj2, i2)) {
                    UnsafeUtil.V(obj, V, UnsafeUtil.C(obj2, V));
                    i0(obj, i2);
                    return;
                }
                return;
            case 2:
                if (z(obj2, i2)) {
                    UnsafeUtil.X(obj, V, UnsafeUtil.F(obj2, V));
                    i0(obj, i2);
                    return;
                }
                return;
            case 3:
                if (z(obj2, i2)) {
                    UnsafeUtil.X(obj, V, UnsafeUtil.F(obj2, V));
                    i0(obj, i2);
                    return;
                }
                return;
            case 4:
                if (z(obj2, i2)) {
                    UnsafeUtil.W(obj, V, UnsafeUtil.D(obj2, V));
                    i0(obj, i2);
                    return;
                }
                return;
            case 5:
                if (z(obj2, i2)) {
                    UnsafeUtil.X(obj, V, UnsafeUtil.F(obj2, V));
                    i0(obj, i2);
                    return;
                }
                return;
            case 6:
                if (z(obj2, i2)) {
                    UnsafeUtil.W(obj, V, UnsafeUtil.D(obj2, V));
                    i0(obj, i2);
                    return;
                }
                return;
            case 7:
                if (z(obj2, i2)) {
                    UnsafeUtil.N(obj, V, UnsafeUtil.u(obj2, V));
                    i0(obj, i2);
                    return;
                }
                return;
            case 8:
                if (z(obj2, i2)) {
                    UnsafeUtil.Y(obj, V, UnsafeUtil.H(obj2, V));
                    i0(obj, i2);
                    return;
                }
                return;
            case 9:
                M(obj, obj2, i2);
                return;
            case 10:
                if (z(obj2, i2)) {
                    UnsafeUtil.Y(obj, V, UnsafeUtil.H(obj2, V));
                    i0(obj, i2);
                    return;
                }
                return;
            case 11:
                if (z(obj2, i2)) {
                    UnsafeUtil.W(obj, V, UnsafeUtil.D(obj2, V));
                    i0(obj, i2);
                    return;
                }
                return;
            case 12:
                if (z(obj2, i2)) {
                    UnsafeUtil.W(obj, V, UnsafeUtil.D(obj2, V));
                    i0(obj, i2);
                    return;
                }
                return;
            case 13:
                if (z(obj2, i2)) {
                    UnsafeUtil.W(obj, V, UnsafeUtil.D(obj2, V));
                    i0(obj, i2);
                    return;
                }
                return;
            case 14:
                if (z(obj2, i2)) {
                    UnsafeUtil.X(obj, V, UnsafeUtil.F(obj2, V));
                    i0(obj, i2);
                    return;
                }
                return;
            case 15:
                if (z(obj2, i2)) {
                    UnsafeUtil.W(obj, V, UnsafeUtil.D(obj2, V));
                    i0(obj, i2);
                    return;
                }
                return;
            case 16:
                if (z(obj2, i2)) {
                    UnsafeUtil.X(obj, V, UnsafeUtil.F(obj2, V));
                    i0(obj, i2);
                    return;
                }
                return;
            case 17:
                M(obj, obj2, i2);
                return;
            case 18:
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER:
            case 20:
            case 21:
            case 22:
            case 23:
            case Service.METRICS_FIELD_NUMBER:
            case Service.MONITORED_RESOURCES_FIELD_NUMBER:
            case Service.BILLING_FIELD_NUMBER:
            case 27:
            case Service.MONITORING_FIELD_NUMBER:
            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER:
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
            case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f32242n.d(obj, obj2, V);
                return;
            case 50:
                SchemaUtil.F(this.f32245q, obj, obj2, V);
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
                if (G(obj2, U, i2)) {
                    UnsafeUtil.Y(obj, V, UnsafeUtil.H(obj2, V));
                    j0(obj, U, i2);
                    return;
                }
                return;
            case 60:
                N(obj, obj2, i2);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (G(obj2, U, i2)) {
                    UnsafeUtil.Y(obj, V, UnsafeUtil.H(obj2, V));
                    j0(obj, U, i2);
                    return;
                }
                return;
            case 68:
                N(obj, obj2, i2);
                return;
            default:
                return;
        }
    }

    public final Object P(Object obj, int i2) {
        Schema t2 = t(i2);
        long V = V(p0(i2));
        if (!z(obj, i2)) {
            return t2.g();
        }
        Object object = f32228s.getObject(obj, V);
        if (E(object)) {
            return object;
        }
        Object g2 = t2.g();
        if (object != null) {
            t2.a(g2, object);
        }
        return g2;
    }

    public final Object Q(Object obj, int i2, int i3) {
        Schema t2 = t(i3);
        if (!G(obj, i2, i3)) {
            return t2.g();
        }
        Object object = f32228s.getObject(obj, V(p0(i3)));
        if (E(object)) {
            return object;
        }
        Object g2 = t2.g();
        if (object != null) {
            t2.a(g2, object);
        }
        return g2;
    }

    public final int U(int i2) {
        return this.f32229a[i2];
    }

    public void a(Object obj, Object obj2) {
        l(obj);
        obj2.getClass();
        for (int i2 = 0; i2 < this.f32229a.length; i2 += 3) {
            O(obj, obj2, i2);
        }
        SchemaUtil.G(this.f32243o, obj, obj2);
        if (this.f32234f) {
            SchemaUtil.E(this.f32244p, obj, obj2);
        }
    }

    public boolean b(Object obj, Object obj2) {
        int length = this.f32229a.length;
        for (int i2 = 0; i2 < length; i2 += 3) {
            if (!n(obj, obj2, i2)) {
                return false;
            }
        }
        if (!this.f32243o.g(obj).equals(this.f32243o.g(obj2))) {
            return false;
        }
        if (this.f32234f) {
            return this.f32244p.c(obj).equals(this.f32244p.c(obj2));
        }
        return true;
    }

    public final int b0(int i2) {
        if (i2 < this.f32231c || i2 > this.f32232d) {
            return -1;
        }
        return k0(i2, 0);
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
            int[] r0 = r8.f32229a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x022d
            int r3 = r8.p0(r1)
            int r4 = r8.U(r1)
            long r5 = V(r3)
            int r3 = o0(r3)
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
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            java.lang.Object r3 = com.google.protobuf.UnsafeUtil.H(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
        L_0x002e:
            int r2 = r2 + r3
            goto L_0x0229
        L_0x0031:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = a0(r9, r5)
            int r3 = com.google.protobuf.Internal.f(r3)
            goto L_0x002e
        L_0x0042:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = Z(r9, r5)
            goto L_0x002e
        L_0x004f:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = a0(r9, r5)
            int r3 = com.google.protobuf.Internal.f(r3)
            goto L_0x002e
        L_0x0060:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = Z(r9, r5)
            goto L_0x002e
        L_0x006d:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = Z(r9, r5)
            goto L_0x002e
        L_0x007a:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = Z(r9, r5)
            goto L_0x002e
        L_0x0087:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.UnsafeUtil.H(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x0098:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            java.lang.Object r3 = com.google.protobuf.UnsafeUtil.H(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x00a9:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.UnsafeUtil.H(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x00bd:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            boolean r3 = W(r9, r5)
            int r3 = com.google.protobuf.Internal.c(r3)
            goto L_0x002e
        L_0x00cf:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = Z(r9, r5)
            goto L_0x002e
        L_0x00dd:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = a0(r9, r5)
            int r3 = com.google.protobuf.Internal.f(r3)
            goto L_0x002e
        L_0x00ef:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = Z(r9, r5)
            goto L_0x002e
        L_0x00fd:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = a0(r9, r5)
            int r3 = com.google.protobuf.Internal.f(r3)
            goto L_0x002e
        L_0x010f:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = a0(r9, r5)
            int r3 = com.google.protobuf.Internal.f(r3)
            goto L_0x002e
        L_0x0121:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            float r3 = Y(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x002e
        L_0x0133:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            double r3 = X(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.protobuf.Internal.f(r3)
            goto L_0x002e
        L_0x0149:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.UnsafeUtil.H(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x0155:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.UnsafeUtil.H(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x0161:
            java.lang.Object r3 = com.google.protobuf.UnsafeUtil.H(r9, r5)
            if (r3 == 0) goto L_0x016b
            int r7 = r3.hashCode()
        L_0x016b:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0229
        L_0x0170:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.UnsafeUtil.F(r9, r5)
            int r3 = com.google.protobuf.Internal.f(r3)
            goto L_0x002e
        L_0x017c:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.UnsafeUtil.D(r9, r5)
            goto L_0x002e
        L_0x0184:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.UnsafeUtil.F(r9, r5)
            int r3 = com.google.protobuf.Internal.f(r3)
            goto L_0x002e
        L_0x0190:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.UnsafeUtil.D(r9, r5)
            goto L_0x002e
        L_0x0198:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.UnsafeUtil.D(r9, r5)
            goto L_0x002e
        L_0x01a0:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.UnsafeUtil.D(r9, r5)
            goto L_0x002e
        L_0x01a8:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.UnsafeUtil.H(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x01b4:
            java.lang.Object r3 = com.google.protobuf.UnsafeUtil.H(r9, r5)
            if (r3 == 0) goto L_0x016b
            int r7 = r3.hashCode()
            goto L_0x016b
        L_0x01bf:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.UnsafeUtil.H(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x01cd:
            int r2 = r2 * 53
            boolean r3 = com.google.protobuf.UnsafeUtil.u(r9, r5)
            int r3 = com.google.protobuf.Internal.c(r3)
            goto L_0x002e
        L_0x01d9:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.UnsafeUtil.D(r9, r5)
            goto L_0x002e
        L_0x01e1:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.UnsafeUtil.F(r9, r5)
            int r3 = com.google.protobuf.Internal.f(r3)
            goto L_0x002e
        L_0x01ed:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.UnsafeUtil.D(r9, r5)
            goto L_0x002e
        L_0x01f5:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.UnsafeUtil.F(r9, r5)
            int r3 = com.google.protobuf.Internal.f(r3)
            goto L_0x002e
        L_0x0201:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.UnsafeUtil.F(r9, r5)
            int r3 = com.google.protobuf.Internal.f(r3)
            goto L_0x002e
        L_0x020d:
            int r2 = r2 * 53
            float r3 = com.google.protobuf.UnsafeUtil.C(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x002e
        L_0x0219:
            int r2 = r2 * 53
            double r3 = com.google.protobuf.UnsafeUtil.B(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.protobuf.Internal.f(r3)
            goto L_0x002e
        L_0x0229:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022d:
            int r2 = r2 * 53
            com.google.protobuf.UnknownFieldSchema r0 = r8.f32243o
            java.lang.Object r0 = r0.g(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f32234f
            if (r0 == 0) goto L_0x024b
            int r2 = r2 * 53
            com.google.protobuf.ExtensionSchema r0 = r8.f32244p
            com.google.protobuf.FieldSet r9 = r0.c(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x024b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.c(java.lang.Object):int");
    }

    public final int c0(int i2) {
        return this.f32229a[i2 + 2];
    }

    public void d(Object obj) {
        if (E(obj)) {
            if (obj instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
                generatedMessageLite.y();
                generatedMessageLite.x();
                generatedMessageLite.S();
            }
            int length = this.f32229a.length;
            for (int i2 = 0; i2 < length; i2 += 3) {
                int p0 = p0(i2);
                long V = V(p0);
                int o0 = o0(p0);
                if (o0 != 9) {
                    switch (o0) {
                        case 17:
                            break;
                        case 18:
                        case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case Service.METRICS_FIELD_NUMBER:
                        case Service.MONITORED_RESOURCES_FIELD_NUMBER:
                        case Service.BILLING_FIELD_NUMBER:
                        case 27:
                        case Service.MONITORING_FIELD_NUMBER:
                        case Service.SYSTEM_PARAMETERS_FIELD_NUMBER:
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
                        case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.f32242n.c(obj, V);
                            continue;
                        case 50:
                            Unsafe unsafe = f32228s;
                            Object object = unsafe.getObject(obj, V);
                            if (object != null) {
                                unsafe.putObject(obj, V, this.f32245q.b(object));
                                break;
                            } else {
                                continue;
                            }
                    }
                }
                if (z(obj, i2)) {
                    t(i2).d(f32228s.getObject(obj, V));
                }
            }
            this.f32243o.j(obj);
            if (this.f32234f) {
                this.f32244p.f(obj);
            }
        }
    }

    public final void d0(Object obj, long j2, Reader reader, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        reader.a(this.f32242n.e(obj, j2), schema, extensionRegistryLite);
    }

    public final boolean e(Object obj) {
        int i2;
        int i3;
        Object obj2 = obj;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.f32239k) {
            int i7 = this.f32238j[i6];
            int U = U(i7);
            int p0 = p0(i7);
            int i8 = this.f32229a[i7 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i4) {
                if (i9 != 1048575) {
                    i5 = f32228s.getInt(obj2, (long) i9);
                }
                i2 = i5;
                i3 = i9;
            } else {
                i3 = i4;
                i2 = i5;
            }
            if (H(p0) && !A(obj, i7, i3, i2, i10)) {
                return false;
            }
            int o0 = o0(p0);
            if (o0 != 9 && o0 != 17) {
                if (o0 != 27) {
                    if (o0 == 60 || o0 == 68) {
                        if (G(obj2, U, i7) && !B(obj2, p0, t(i7))) {
                            return false;
                        }
                    } else if (o0 != 49) {
                        if (o0 == 50 && !D(obj2, p0, i7)) {
                            return false;
                        }
                    }
                }
                if (!C(obj2, p0, i7)) {
                    return false;
                }
            } else if (A(obj, i7, i3, i2, i10) && !B(obj2, p0, t(i7))) {
                return false;
            }
            i6++;
            i4 = i3;
            i5 = i2;
        }
        return !this.f32234f || this.f32244p.c(obj2).p();
    }

    public final void e0(Object obj, int i2, Reader reader, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        reader.d(this.f32242n.e(obj, V(i2)), schema, extensionRegistryLite);
    }

    public int f(Object obj) {
        return this.f32236h ? v(obj) : u(obj);
    }

    public final void f0(Object obj, int i2, Reader reader) {
        if (y(i2)) {
            UnsafeUtil.Y(obj, V(i2), reader.S());
        } else if (this.f32235g) {
            UnsafeUtil.Y(obj, V(i2), reader.h());
        } else {
            UnsafeUtil.Y(obj, V(i2), reader.M());
        }
    }

    public Object g() {
        return this.f32241m.a(this.f32233e);
    }

    public final void g0(Object obj, int i2, Reader reader) {
        if (y(i2)) {
            reader.L(this.f32242n.e(obj, V(i2)));
        } else {
            reader.K(this.f32242n.e(obj, V(i2)));
        }
    }

    public void h(Object obj, Writer writer) {
        if (writer.x() == Writer.FieldOrder.DESCENDING) {
            s0(obj, writer);
        } else if (this.f32236h) {
            r0(obj, writer);
        } else {
            q0(obj, writer);
        }
    }

    public void i(Object obj, Reader reader, ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.getClass();
        l(obj);
        K(this.f32243o, this.f32244p, obj, reader, extensionRegistryLite);
    }

    public final void i0(Object obj, int i2) {
        int c0 = c0(i2);
        long j2 = (long) (1048575 & c0);
        if (j2 != 1048575) {
            UnsafeUtil.W(obj, j2, (1 << (c0 >>> 20)) | UnsafeUtil.D(obj, j2));
        }
    }

    public final boolean j(Object obj, Object obj2, int i2) {
        return z(obj, i2) == z(obj2, i2);
    }

    public final void j0(Object obj, int i2, int i3) {
        UnsafeUtil.W(obj, (long) (c0(i3) & 1048575), i2);
    }

    public final int k0(int i2, int i3) {
        int length = (this.f32229a.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int U = U(i5);
            if (i2 == U) {
                return i5;
            }
            if (i2 < U) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    public final void m0(Object obj, int i2, Object obj2) {
        f32228s.putObject(obj, V(p0(i2)), obj2);
        i0(obj, i2);
    }

    public final boolean n(Object obj, Object obj2, int i2) {
        int p0 = p0(i2);
        long V = V(p0);
        switch (o0(p0)) {
            case 0:
                return j(obj, obj2, i2) && Double.doubleToLongBits(UnsafeUtil.B(obj, V)) == Double.doubleToLongBits(UnsafeUtil.B(obj2, V));
            case 1:
                return j(obj, obj2, i2) && Float.floatToIntBits(UnsafeUtil.C(obj, V)) == Float.floatToIntBits(UnsafeUtil.C(obj2, V));
            case 2:
                return j(obj, obj2, i2) && UnsafeUtil.F(obj, V) == UnsafeUtil.F(obj2, V);
            case 3:
                return j(obj, obj2, i2) && UnsafeUtil.F(obj, V) == UnsafeUtil.F(obj2, V);
            case 4:
                return j(obj, obj2, i2) && UnsafeUtil.D(obj, V) == UnsafeUtil.D(obj2, V);
            case 5:
                return j(obj, obj2, i2) && UnsafeUtil.F(obj, V) == UnsafeUtil.F(obj2, V);
            case 6:
                return j(obj, obj2, i2) && UnsafeUtil.D(obj, V) == UnsafeUtil.D(obj2, V);
            case 7:
                return j(obj, obj2, i2) && UnsafeUtil.u(obj, V) == UnsafeUtil.u(obj2, V);
            case 8:
                return j(obj, obj2, i2) && SchemaUtil.K(UnsafeUtil.H(obj, V), UnsafeUtil.H(obj2, V));
            case 9:
                return j(obj, obj2, i2) && SchemaUtil.K(UnsafeUtil.H(obj, V), UnsafeUtil.H(obj2, V));
            case 10:
                return j(obj, obj2, i2) && SchemaUtil.K(UnsafeUtil.H(obj, V), UnsafeUtil.H(obj2, V));
            case 11:
                return j(obj, obj2, i2) && UnsafeUtil.D(obj, V) == UnsafeUtil.D(obj2, V);
            case 12:
                return j(obj, obj2, i2) && UnsafeUtil.D(obj, V) == UnsafeUtil.D(obj2, V);
            case 13:
                return j(obj, obj2, i2) && UnsafeUtil.D(obj, V) == UnsafeUtil.D(obj2, V);
            case 14:
                return j(obj, obj2, i2) && UnsafeUtil.F(obj, V) == UnsafeUtil.F(obj2, V);
            case 15:
                return j(obj, obj2, i2) && UnsafeUtil.D(obj, V) == UnsafeUtil.D(obj2, V);
            case 16:
                return j(obj, obj2, i2) && UnsafeUtil.F(obj, V) == UnsafeUtil.F(obj2, V);
            case 17:
                return j(obj, obj2, i2) && SchemaUtil.K(UnsafeUtil.H(obj, V), UnsafeUtil.H(obj2, V));
            case 18:
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER:
            case 20:
            case 21:
            case 22:
            case 23:
            case Service.METRICS_FIELD_NUMBER:
            case Service.MONITORED_RESOURCES_FIELD_NUMBER:
            case Service.BILLING_FIELD_NUMBER:
            case 27:
            case Service.MONITORING_FIELD_NUMBER:
            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER:
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
            case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return SchemaUtil.K(UnsafeUtil.H(obj, V), UnsafeUtil.H(obj2, V));
            case 50:
                return SchemaUtil.K(UnsafeUtil.H(obj, V), UnsafeUtil.H(obj2, V));
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
                return F(obj, obj2, i2) && SchemaUtil.K(UnsafeUtil.H(obj, V), UnsafeUtil.H(obj2, V));
            default:
                return true;
        }
    }

    public final void n0(Object obj, int i2, int i3, Object obj2) {
        f32228s.putObject(obj, V(p0(i3)), obj2);
        j0(obj, i2, i3);
    }

    public final Object o(Object obj, int i2, Object obj2, UnknownFieldSchema unknownFieldSchema, Object obj3) {
        Internal.EnumVerifier r2;
        int U = U(i2);
        Object H = UnsafeUtil.H(obj, V(p0(i2)));
        if (H == null || (r2 = r(i2)) == null) {
            return obj2;
        }
        return p(i2, U, this.f32245q.d(H), r2, obj2, unknownFieldSchema, obj3);
    }

    public final Object p(int i2, int i3, Map map, Internal.EnumVerifier enumVerifier, Object obj, UnknownFieldSchema unknownFieldSchema, Object obj2) {
        MapEntryLite.Metadata c2 = this.f32245q.c(s(i2));
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

    public final int p0(int i2) {
        return this.f32229a[i2 + 1];
    }

    /* JADX WARNING: Removed duplicated region for block: B:168:0x048f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q0(java.lang.Object r18, com.google.protobuf.Writer r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.f32234f
            if (r3 == 0) goto L_0x0021
            com.google.protobuf.ExtensionSchema r3 = r0.f32244p
            com.google.protobuf.FieldSet r3 = r3.c(r1)
            boolean r5 = r3.n()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.t()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0023
        L_0x0021:
            r3 = 0
            r5 = 0
        L_0x0023:
            int[] r6 = r0.f32229a
            int r6 = r6.length
            sun.misc.Unsafe r7 = f32228s
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r11 = r8
            r10 = 0
            r12 = 0
        L_0x002e:
            if (r10 >= r6) goto L_0x048d
            int r13 = r0.p0(r10)
            int r14 = r0.U(r10)
            int r15 = o0(r13)
            r4 = 17
            if (r15 > r4) goto L_0x0056
            int[] r4 = r0.f32229a
            int r16 = r10 + 2
            r4 = r4[r16]
            r9 = r4 & r8
            if (r9 == r11) goto L_0x0050
            long r11 = (long) r9
            int r12 = r7.getInt(r1, r11)
            r11 = r9
        L_0x0050:
            int r4 = r4 >>> 20
            r9 = 1
            int r4 = r9 << r4
            goto L_0x0057
        L_0x0056:
            r4 = 0
        L_0x0057:
            if (r5 == 0) goto L_0x0075
            com.google.protobuf.ExtensionSchema r9 = r0.f32244p
            int r9 = r9.a(r5)
            if (r9 > r14) goto L_0x0075
            com.google.protobuf.ExtensionSchema r9 = r0.f32244p
            r9.j(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0073
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0057
        L_0x0073:
            r5 = 0
            goto L_0x0057
        L_0x0075:
            long r8 = V(r13)
            switch(r15) {
                case 0: goto L_0x047b;
                case 1: goto L_0x046f;
                case 2: goto L_0x0463;
                case 3: goto L_0x0457;
                case 4: goto L_0x044b;
                case 5: goto L_0x043f;
                case 6: goto L_0x0433;
                case 7: goto L_0x0427;
                case 8: goto L_0x041b;
                case 9: goto L_0x040a;
                case 10: goto L_0x03fb;
                case 11: goto L_0x03ee;
                case 12: goto L_0x03e1;
                case 13: goto L_0x03d4;
                case 14: goto L_0x03c7;
                case 15: goto L_0x03ba;
                case 16: goto L_0x03ad;
                case 17: goto L_0x039c;
                case 18: goto L_0x038c;
                case 19: goto L_0x037c;
                case 20: goto L_0x036c;
                case 21: goto L_0x035c;
                case 22: goto L_0x034c;
                case 23: goto L_0x033c;
                case 24: goto L_0x032c;
                case 25: goto L_0x031c;
                case 26: goto L_0x030d;
                case 27: goto L_0x02fa;
                case 28: goto L_0x02eb;
                case 29: goto L_0x02db;
                case 30: goto L_0x02cb;
                case 31: goto L_0x02bb;
                case 32: goto L_0x02ab;
                case 33: goto L_0x029b;
                case 34: goto L_0x028b;
                case 35: goto L_0x027b;
                case 36: goto L_0x026b;
                case 37: goto L_0x025b;
                case 38: goto L_0x024b;
                case 39: goto L_0x023b;
                case 40: goto L_0x022b;
                case 41: goto L_0x021b;
                case 42: goto L_0x020b;
                case 43: goto L_0x01fb;
                case 44: goto L_0x01eb;
                case 45: goto L_0x01db;
                case 46: goto L_0x01cb;
                case 47: goto L_0x01bb;
                case 48: goto L_0x01ab;
                case 49: goto L_0x0198;
                case 50: goto L_0x018f;
                case 51: goto L_0x0180;
                case 52: goto L_0x0171;
                case 53: goto L_0x0162;
                case 54: goto L_0x0153;
                case 55: goto L_0x0144;
                case 56: goto L_0x0135;
                case 57: goto L_0x0126;
                case 58: goto L_0x0117;
                case 59: goto L_0x0108;
                case 60: goto L_0x00f5;
                case 61: goto L_0x00e5;
                case 62: goto L_0x00d7;
                case 63: goto L_0x00c9;
                case 64: goto L_0x00bb;
                case 65: goto L_0x00ad;
                case 66: goto L_0x009f;
                case 67: goto L_0x0091;
                case 68: goto L_0x007f;
                default: goto L_0x007c;
            }
        L_0x007c:
            r13 = 0
            goto L_0x0486
        L_0x007f:
            boolean r4 = r0.G(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.Schema r8 = r0.t(r10)
            r2.d(r14, r4, r8)
            goto L_0x007c
        L_0x0091:
            boolean r4 = r0.G(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            long r8 = a0(r1, r8)
            r2.O(r14, r8)
            goto L_0x007c
        L_0x009f:
            boolean r4 = r0.G(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            int r4 = Z(r1, r8)
            r2.W(r14, r4)
            goto L_0x007c
        L_0x00ad:
            boolean r4 = r0.G(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            long r8 = a0(r1, r8)
            r2.J(r14, r8)
            goto L_0x007c
        L_0x00bb:
            boolean r4 = r0.G(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            int r4 = Z(r1, r8)
            r2.F(r14, r4)
            goto L_0x007c
        L_0x00c9:
            boolean r4 = r0.G(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            int r4 = Z(r1, r8)
            r2.S(r14, r4)
            goto L_0x007c
        L_0x00d7:
            boolean r4 = r0.G(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            int r4 = Z(r1, r8)
            r2.q(r14, r4)
            goto L_0x007c
        L_0x00e5:
            boolean r4 = r0.G(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.ByteString r4 = (com.google.protobuf.ByteString) r4
            r2.e(r14, r4)
            goto L_0x007c
        L_0x00f5:
            boolean r4 = r0.G(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.Schema r8 = r0.t(r10)
            r2.c(r14, r4, r8)
            goto L_0x007c
        L_0x0108:
            boolean r4 = r0.G(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.u0(r14, r4, r2)
            goto L_0x007c
        L_0x0117:
            boolean r4 = r0.G(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            boolean r4 = W(r1, r8)
            r2.E(r14, r4)
            goto L_0x007c
        L_0x0126:
            boolean r4 = r0.G(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            int r4 = Z(r1, r8)
            r2.s(r14, r4)
            goto L_0x007c
        L_0x0135:
            boolean r4 = r0.G(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            long r8 = a0(r1, r8)
            r2.w(r14, r8)
            goto L_0x007c
        L_0x0144:
            boolean r4 = r0.G(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            int r4 = Z(r1, r8)
            r2.o(r14, r4)
            goto L_0x007c
        L_0x0153:
            boolean r4 = r0.G(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            long r8 = a0(r1, r8)
            r2.A(r14, r8)
            goto L_0x007c
        L_0x0162:
            boolean r4 = r0.G(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            long r8 = a0(r1, r8)
            r2.D(r14, r8)
            goto L_0x007c
        L_0x0171:
            boolean r4 = r0.G(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            float r4 = Y(r1, r8)
            r2.P(r14, r4)
            goto L_0x007c
        L_0x0180:
            boolean r4 = r0.G(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            double r8 = X(r1, r8)
            r2.t(r14, r8)
            goto L_0x007c
        L_0x018f:
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.t0(r2, r14, r4, r10)
            goto L_0x007c
        L_0x0198:
            int r4 = r0.U(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.Schema r9 = r0.t(r10)
            com.google.protobuf.SchemaUtil.U(r4, r8, r2, r9)
            goto L_0x007c
        L_0x01ab:
            int r4 = r0.U(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r13 = 1
            com.google.protobuf.SchemaUtil.b0(r4, r8, r2, r13)
            goto L_0x007c
        L_0x01bb:
            r13 = 1
            int r4 = r0.U(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.a0(r4, r8, r2, r13)
            goto L_0x007c
        L_0x01cb:
            r13 = 1
            int r4 = r0.U(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.Z(r4, r8, r2, r13)
            goto L_0x007c
        L_0x01db:
            r13 = 1
            int r4 = r0.U(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.Y(r4, r8, r2, r13)
            goto L_0x007c
        L_0x01eb:
            r13 = 1
            int r4 = r0.U(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.Q(r4, r8, r2, r13)
            goto L_0x007c
        L_0x01fb:
            r13 = 1
            int r4 = r0.U(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.d0(r4, r8, r2, r13)
            goto L_0x007c
        L_0x020b:
            r13 = 1
            int r4 = r0.U(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.N(r4, r8, r2, r13)
            goto L_0x007c
        L_0x021b:
            r13 = 1
            int r4 = r0.U(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.R(r4, r8, r2, r13)
            goto L_0x007c
        L_0x022b:
            r13 = 1
            int r4 = r0.U(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.S(r4, r8, r2, r13)
            goto L_0x007c
        L_0x023b:
            r13 = 1
            int r4 = r0.U(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.V(r4, r8, r2, r13)
            goto L_0x007c
        L_0x024b:
            r13 = 1
            int r4 = r0.U(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.e0(r4, r8, r2, r13)
            goto L_0x007c
        L_0x025b:
            r13 = 1
            int r4 = r0.U(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.W(r4, r8, r2, r13)
            goto L_0x007c
        L_0x026b:
            r13 = 1
            int r4 = r0.U(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.T(r4, r8, r2, r13)
            goto L_0x007c
        L_0x027b:
            r13 = 1
            int r4 = r0.U(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.P(r4, r8, r2, r13)
            goto L_0x007c
        L_0x028b:
            int r4 = r0.U(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            com.google.protobuf.SchemaUtil.b0(r4, r8, r2, r13)
            goto L_0x0486
        L_0x029b:
            r13 = 0
            int r4 = r0.U(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.a0(r4, r8, r2, r13)
            goto L_0x0486
        L_0x02ab:
            r13 = 0
            int r4 = r0.U(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.Z(r4, r8, r2, r13)
            goto L_0x0486
        L_0x02bb:
            r13 = 0
            int r4 = r0.U(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.Y(r4, r8, r2, r13)
            goto L_0x0486
        L_0x02cb:
            r13 = 0
            int r4 = r0.U(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.Q(r4, r8, r2, r13)
            goto L_0x0486
        L_0x02db:
            r13 = 0
            int r4 = r0.U(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.d0(r4, r8, r2, r13)
            goto L_0x0486
        L_0x02eb:
            int r4 = r0.U(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.O(r4, r8, r2)
            goto L_0x007c
        L_0x02fa:
            int r4 = r0.U(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.Schema r9 = r0.t(r10)
            com.google.protobuf.SchemaUtil.X(r4, r8, r2, r9)
            goto L_0x007c
        L_0x030d:
            int r4 = r0.U(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.c0(r4, r8, r2)
            goto L_0x007c
        L_0x031c:
            int r4 = r0.U(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            com.google.protobuf.SchemaUtil.N(r4, r8, r2, r13)
            goto L_0x0486
        L_0x032c:
            r13 = 0
            int r4 = r0.U(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.R(r4, r8, r2, r13)
            goto L_0x0486
        L_0x033c:
            r13 = 0
            int r4 = r0.U(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.S(r4, r8, r2, r13)
            goto L_0x0486
        L_0x034c:
            r13 = 0
            int r4 = r0.U(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.V(r4, r8, r2, r13)
            goto L_0x0486
        L_0x035c:
            r13 = 0
            int r4 = r0.U(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.e0(r4, r8, r2, r13)
            goto L_0x0486
        L_0x036c:
            r13 = 0
            int r4 = r0.U(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.W(r4, r8, r2, r13)
            goto L_0x0486
        L_0x037c:
            r13 = 0
            int r4 = r0.U(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.T(r4, r8, r2, r13)
            goto L_0x0486
        L_0x038c:
            r13 = 0
            int r4 = r0.U(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.SchemaUtil.P(r4, r8, r2, r13)
            goto L_0x0486
        L_0x039c:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.Schema r8 = r0.t(r10)
            r2.d(r14, r4, r8)
            goto L_0x0486
        L_0x03ad:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            long r8 = r7.getLong(r1, r8)
            r2.O(r14, r8)
            goto L_0x0486
        L_0x03ba:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            int r4 = r7.getInt(r1, r8)
            r2.W(r14, r4)
            goto L_0x0486
        L_0x03c7:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            long r8 = r7.getLong(r1, r8)
            r2.J(r14, r8)
            goto L_0x0486
        L_0x03d4:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            int r4 = r7.getInt(r1, r8)
            r2.F(r14, r4)
            goto L_0x0486
        L_0x03e1:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            int r4 = r7.getInt(r1, r8)
            r2.S(r14, r4)
            goto L_0x0486
        L_0x03ee:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            int r4 = r7.getInt(r1, r8)
            r2.q(r14, r4)
            goto L_0x0486
        L_0x03fb:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.ByteString r4 = (com.google.protobuf.ByteString) r4
            r2.e(r14, r4)
            goto L_0x0486
        L_0x040a:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.Schema r8 = r0.t(r10)
            r2.c(r14, r4, r8)
            goto L_0x0486
        L_0x041b:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.u0(r14, r4, r2)
            goto L_0x0486
        L_0x0427:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            boolean r4 = k(r1, r8)
            r2.E(r14, r4)
            goto L_0x0486
        L_0x0433:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            int r4 = r7.getInt(r1, r8)
            r2.s(r14, r4)
            goto L_0x0486
        L_0x043f:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            long r8 = r7.getLong(r1, r8)
            r2.w(r14, r8)
            goto L_0x0486
        L_0x044b:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            int r4 = r7.getInt(r1, r8)
            r2.o(r14, r4)
            goto L_0x0486
        L_0x0457:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            long r8 = r7.getLong(r1, r8)
            r2.A(r14, r8)
            goto L_0x0486
        L_0x0463:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            long r8 = r7.getLong(r1, r8)
            r2.D(r14, r8)
            goto L_0x0486
        L_0x046f:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            float r4 = q(r1, r8)
            r2.P(r14, r4)
            goto L_0x0486
        L_0x047b:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            double r8 = m(r1, r8)
            r2.t(r14, r8)
        L_0x0486:
            int r10 = r10 + 3
            r8 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x002e
        L_0x048d:
            if (r5 == 0) goto L_0x04a4
            com.google.protobuf.ExtensionSchema r4 = r0.f32244p
            r4.j(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04a2
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r5 = r4
            goto L_0x048d
        L_0x04a2:
            r5 = 0
            goto L_0x048d
        L_0x04a4:
            com.google.protobuf.UnknownFieldSchema r3 = r0.f32243o
            r0.v0(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.q0(java.lang.Object, com.google.protobuf.Writer):void");
    }

    public final Internal.EnumVerifier r(int i2) {
        return (Internal.EnumVerifier) this.f32230b[((i2 / 3) * 2) + 1];
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x0588  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r0(java.lang.Object r13, com.google.protobuf.Writer r14) {
        /*
            r12 = this;
            boolean r0 = r12.f32234f
            r1 = 0
            if (r0 == 0) goto L_0x001c
            com.google.protobuf.ExtensionSchema r0 = r12.f32244p
            com.google.protobuf.FieldSet r0 = r0.c(r13)
            boolean r2 = r0.n()
            if (r2 != 0) goto L_0x001c
            java.util.Iterator r0 = r0.t()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x001e
        L_0x001c:
            r0 = r1
            r2 = r0
        L_0x001e:
            int[] r3 = r12.f32229a
            int r3 = r3.length
            r4 = 0
            r5 = r4
        L_0x0023:
            if (r5 >= r3) goto L_0x0586
            int r6 = r12.p0(r5)
            int r7 = r12.U(r5)
        L_0x002d:
            if (r2 == 0) goto L_0x004b
            com.google.protobuf.ExtensionSchema r8 = r12.f32244p
            int r8 = r8.a(r2)
            if (r8 > r7) goto L_0x004b
            com.google.protobuf.ExtensionSchema r8 = r12.f32244p
            r8.j(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0049
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x002d
        L_0x0049:
            r2 = r1
            goto L_0x002d
        L_0x004b:
            int r8 = o0(r6)
            r9 = 1
            switch(r8) {
                case 0: goto L_0x0571;
                case 1: goto L_0x055f;
                case 2: goto L_0x054d;
                case 3: goto L_0x053b;
                case 4: goto L_0x0529;
                case 5: goto L_0x0517;
                case 6: goto L_0x0505;
                case 7: goto L_0x04f2;
                case 8: goto L_0x04df;
                case 9: goto L_0x04c8;
                case 10: goto L_0x04b3;
                case 11: goto L_0x04a0;
                case 12: goto L_0x048d;
                case 13: goto L_0x047a;
                case 14: goto L_0x0467;
                case 15: goto L_0x0454;
                case 16: goto L_0x0441;
                case 17: goto L_0x042a;
                case 18: goto L_0x0417;
                case 19: goto L_0x0404;
                case 20: goto L_0x03f1;
                case 21: goto L_0x03de;
                case 22: goto L_0x03cb;
                case 23: goto L_0x03b8;
                case 24: goto L_0x03a5;
                case 25: goto L_0x0392;
                case 26: goto L_0x037f;
                case 27: goto L_0x0368;
                case 28: goto L_0x0355;
                case 29: goto L_0x0342;
                case 30: goto L_0x032f;
                case 31: goto L_0x031c;
                case 32: goto L_0x0309;
                case 33: goto L_0x02f6;
                case 34: goto L_0x02e3;
                case 35: goto L_0x02d0;
                case 36: goto L_0x02bd;
                case 37: goto L_0x02aa;
                case 38: goto L_0x0297;
                case 39: goto L_0x0284;
                case 40: goto L_0x0271;
                case 41: goto L_0x025e;
                case 42: goto L_0x024b;
                case 43: goto L_0x0238;
                case 44: goto L_0x0225;
                case 45: goto L_0x0212;
                case 46: goto L_0x01ff;
                case 47: goto L_0x01ec;
                case 48: goto L_0x01d9;
                case 49: goto L_0x01c2;
                case 50: goto L_0x01b5;
                case 51: goto L_0x01a2;
                case 52: goto L_0x018f;
                case 53: goto L_0x017c;
                case 54: goto L_0x0169;
                case 55: goto L_0x0156;
                case 56: goto L_0x0143;
                case 57: goto L_0x0130;
                case 58: goto L_0x011d;
                case 59: goto L_0x010a;
                case 60: goto L_0x00f3;
                case 61: goto L_0x00de;
                case 62: goto L_0x00cb;
                case 63: goto L_0x00b8;
                case 64: goto L_0x00a5;
                case 65: goto L_0x0092;
                case 66: goto L_0x007f;
                case 67: goto L_0x006c;
                case 68: goto L_0x0055;
                default: goto L_0x0053;
            }
        L_0x0053:
            goto L_0x0582
        L_0x0055:
            boolean r8 = r12.G(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r13, r8)
            com.google.protobuf.Schema r8 = r12.t(r5)
            r14.d(r7, r6, r8)
            goto L_0x0582
        L_0x006c:
            boolean r8 = r12.G(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            long r8 = a0(r13, r8)
            r14.O(r7, r8)
            goto L_0x0582
        L_0x007f:
            boolean r8 = r12.G(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            int r6 = Z(r13, r8)
            r14.W(r7, r6)
            goto L_0x0582
        L_0x0092:
            boolean r8 = r12.G(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            long r8 = a0(r13, r8)
            r14.J(r7, r8)
            goto L_0x0582
        L_0x00a5:
            boolean r8 = r12.G(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            int r6 = Z(r13, r8)
            r14.F(r7, r6)
            goto L_0x0582
        L_0x00b8:
            boolean r8 = r12.G(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            int r6 = Z(r13, r8)
            r14.S(r7, r6)
            goto L_0x0582
        L_0x00cb:
            boolean r8 = r12.G(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            int r6 = Z(r13, r8)
            r14.q(r7, r6)
            goto L_0x0582
        L_0x00de:
            boolean r8 = r12.G(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r13, r8)
            com.google.protobuf.ByteString r6 = (com.google.protobuf.ByteString) r6
            r14.e(r7, r6)
            goto L_0x0582
        L_0x00f3:
            boolean r8 = r12.G(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r13, r8)
            com.google.protobuf.Schema r8 = r12.t(r5)
            r14.c(r7, r6, r8)
            goto L_0x0582
        L_0x010a:
            boolean r8 = r12.G(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r13, r8)
            r12.u0(r7, r6, r14)
            goto L_0x0582
        L_0x011d:
            boolean r8 = r12.G(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            boolean r6 = W(r13, r8)
            r14.E(r7, r6)
            goto L_0x0582
        L_0x0130:
            boolean r8 = r12.G(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            int r6 = Z(r13, r8)
            r14.s(r7, r6)
            goto L_0x0582
        L_0x0143:
            boolean r8 = r12.G(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            long r8 = a0(r13, r8)
            r14.w(r7, r8)
            goto L_0x0582
        L_0x0156:
            boolean r8 = r12.G(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            int r6 = Z(r13, r8)
            r14.o(r7, r6)
            goto L_0x0582
        L_0x0169:
            boolean r8 = r12.G(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            long r8 = a0(r13, r8)
            r14.A(r7, r8)
            goto L_0x0582
        L_0x017c:
            boolean r8 = r12.G(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            long r8 = a0(r13, r8)
            r14.D(r7, r8)
            goto L_0x0582
        L_0x018f:
            boolean r8 = r12.G(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            float r6 = Y(r13, r8)
            r14.P(r7, r6)
            goto L_0x0582
        L_0x01a2:
            boolean r8 = r12.G(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            double r8 = X(r13, r8)
            r14.t(r7, r8)
            goto L_0x0582
        L_0x01b5:
            long r8 = V(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r13, r8)
            r12.t0(r14, r7, r6, r5)
            goto L_0x0582
        L_0x01c2:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.Schema r8 = r12.t(r5)
            com.google.protobuf.SchemaUtil.U(r7, r6, r14, r8)
            goto L_0x0582
        L_0x01d9:
            int r7 = r12.U(r5)
            long r10 = V(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.b0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x01ec:
            int r7 = r12.U(r5)
            long r10 = V(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.a0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x01ff:
            int r7 = r12.U(r5)
            long r10 = V(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.Z(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0212:
            int r7 = r12.U(r5)
            long r10 = V(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.Y(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0225:
            int r7 = r12.U(r5)
            long r10 = V(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.Q(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0238:
            int r7 = r12.U(r5)
            long r10 = V(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.d0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x024b:
            int r7 = r12.U(r5)
            long r10 = V(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.N(r7, r6, r14, r9)
            goto L_0x0582
        L_0x025e:
            int r7 = r12.U(r5)
            long r10 = V(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.R(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0271:
            int r7 = r12.U(r5)
            long r10 = V(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.S(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0284:
            int r7 = r12.U(r5)
            long r10 = V(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.V(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0297:
            int r7 = r12.U(r5)
            long r10 = V(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.e0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02aa:
            int r7 = r12.U(r5)
            long r10 = V(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.W(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02bd:
            int r7 = r12.U(r5)
            long r10 = V(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.T(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02d0:
            int r7 = r12.U(r5)
            long r10 = V(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.P(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02e3:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.b0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x02f6:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.a0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0309:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.Z(r7, r6, r14, r4)
            goto L_0x0582
        L_0x031c:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.Y(r7, r6, r14, r4)
            goto L_0x0582
        L_0x032f:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.Q(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0342:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.d0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0355:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.O(r7, r6, r14)
            goto L_0x0582
        L_0x0368:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.Schema r8 = r12.t(r5)
            com.google.protobuf.SchemaUtil.X(r7, r6, r14, r8)
            goto L_0x0582
        L_0x037f:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.c0(r7, r6, r14)
            goto L_0x0582
        L_0x0392:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.N(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03a5:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.R(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03b8:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.S(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03cb:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.V(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03de:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.e0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03f1:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.W(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0404:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.T(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0417:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.SchemaUtil.P(r7, r6, r14, r4)
            goto L_0x0582
        L_0x042a:
            boolean r8 = r12.z(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r13, r8)
            com.google.protobuf.Schema r8 = r12.t(r5)
            r14.d(r7, r6, r8)
            goto L_0x0582
        L_0x0441:
            boolean r8 = r12.z(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            long r8 = J(r13, r8)
            r14.O(r7, r8)
            goto L_0x0582
        L_0x0454:
            boolean r8 = r12.z(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            int r6 = x(r13, r8)
            r14.W(r7, r6)
            goto L_0x0582
        L_0x0467:
            boolean r8 = r12.z(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            long r8 = J(r13, r8)
            r14.J(r7, r8)
            goto L_0x0582
        L_0x047a:
            boolean r8 = r12.z(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            int r6 = x(r13, r8)
            r14.F(r7, r6)
            goto L_0x0582
        L_0x048d:
            boolean r8 = r12.z(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            int r6 = x(r13, r8)
            r14.S(r7, r6)
            goto L_0x0582
        L_0x04a0:
            boolean r8 = r12.z(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            int r6 = x(r13, r8)
            r14.q(r7, r6)
            goto L_0x0582
        L_0x04b3:
            boolean r8 = r12.z(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r13, r8)
            com.google.protobuf.ByteString r6 = (com.google.protobuf.ByteString) r6
            r14.e(r7, r6)
            goto L_0x0582
        L_0x04c8:
            boolean r8 = r12.z(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r13, r8)
            com.google.protobuf.Schema r8 = r12.t(r5)
            r14.c(r7, r6, r8)
            goto L_0x0582
        L_0x04df:
            boolean r8 = r12.z(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r13, r8)
            r12.u0(r7, r6, r14)
            goto L_0x0582
        L_0x04f2:
            boolean r8 = r12.z(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            boolean r6 = k(r13, r8)
            r14.E(r7, r6)
            goto L_0x0582
        L_0x0505:
            boolean r8 = r12.z(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            int r6 = x(r13, r8)
            r14.s(r7, r6)
            goto L_0x0582
        L_0x0517:
            boolean r8 = r12.z(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            long r8 = J(r13, r8)
            r14.w(r7, r8)
            goto L_0x0582
        L_0x0529:
            boolean r8 = r12.z(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            int r6 = x(r13, r8)
            r14.o(r7, r6)
            goto L_0x0582
        L_0x053b:
            boolean r8 = r12.z(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            long r8 = J(r13, r8)
            r14.A(r7, r8)
            goto L_0x0582
        L_0x054d:
            boolean r8 = r12.z(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            long r8 = J(r13, r8)
            r14.D(r7, r8)
            goto L_0x0582
        L_0x055f:
            boolean r8 = r12.z(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            float r6 = q(r13, r8)
            r14.P(r7, r6)
            goto L_0x0582
        L_0x0571:
            boolean r8 = r12.z(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            double r8 = m(r13, r8)
            r14.t(r7, r8)
        L_0x0582:
            int r5 = r5 + 3
            goto L_0x0023
        L_0x0586:
            if (r2 == 0) goto L_0x059c
            com.google.protobuf.ExtensionSchema r3 = r12.f32244p
            r3.j(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x059a
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0586
        L_0x059a:
            r2 = r1
            goto L_0x0586
        L_0x059c:
            com.google.protobuf.UnknownFieldSchema r0 = r12.f32243o
            r12.v0(r0, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.r0(java.lang.Object, com.google.protobuf.Writer):void");
    }

    public final Object s(int i2) {
        return this.f32230b[(i2 / 3) * 2];
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x058e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s0(java.lang.Object r11, com.google.protobuf.Writer r12) {
        /*
            r10 = this;
            com.google.protobuf.UnknownFieldSchema r0 = r10.f32243o
            r10.v0(r0, r11, r12)
            boolean r0 = r10.f32234f
            r1 = 0
            if (r0 == 0) goto L_0x0021
            com.google.protobuf.ExtensionSchema r0 = r10.f32244p
            com.google.protobuf.FieldSet r0 = r0.c(r11)
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
            int[] r3 = r10.f32229a
            int r3 = r3.length
            int r3 = r3 + -3
        L_0x0028:
            if (r3 < 0) goto L_0x058c
            int r4 = r10.p0(r3)
            int r5 = r10.U(r3)
        L_0x0032:
            if (r2 == 0) goto L_0x0050
            com.google.protobuf.ExtensionSchema r6 = r10.f32244p
            int r6 = r6.a(r2)
            if (r6 <= r5) goto L_0x0050
            com.google.protobuf.ExtensionSchema r6 = r10.f32244p
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
            int r6 = o0(r4)
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
            boolean r6 = r10.G(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = V(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.H(r11, r6)
            com.google.protobuf.Schema r6 = r10.t(r3)
            r12.d(r5, r4, r6)
            goto L_0x0588
        L_0x0072:
            boolean r6 = r10.G(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = V(r4)
            long r6 = a0(r11, r6)
            r12.O(r5, r6)
            goto L_0x0588
        L_0x0085:
            boolean r6 = r10.G(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = V(r4)
            int r4 = Z(r11, r6)
            r12.W(r5, r4)
            goto L_0x0588
        L_0x0098:
            boolean r6 = r10.G(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = V(r4)
            long r6 = a0(r11, r6)
            r12.J(r5, r6)
            goto L_0x0588
        L_0x00ab:
            boolean r6 = r10.G(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = V(r4)
            int r4 = Z(r11, r6)
            r12.F(r5, r4)
            goto L_0x0588
        L_0x00be:
            boolean r6 = r10.G(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = V(r4)
            int r4 = Z(r11, r6)
            r12.S(r5, r4)
            goto L_0x0588
        L_0x00d1:
            boolean r6 = r10.G(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = V(r4)
            int r4 = Z(r11, r6)
            r12.q(r5, r4)
            goto L_0x0588
        L_0x00e4:
            boolean r6 = r10.G(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = V(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.H(r11, r6)
            com.google.protobuf.ByteString r4 = (com.google.protobuf.ByteString) r4
            r12.e(r5, r4)
            goto L_0x0588
        L_0x00f9:
            boolean r6 = r10.G(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = V(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.H(r11, r6)
            com.google.protobuf.Schema r6 = r10.t(r3)
            r12.c(r5, r4, r6)
            goto L_0x0588
        L_0x0110:
            boolean r6 = r10.G(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = V(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.H(r11, r6)
            r10.u0(r5, r4, r12)
            goto L_0x0588
        L_0x0123:
            boolean r6 = r10.G(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = V(r4)
            boolean r4 = W(r11, r6)
            r12.E(r5, r4)
            goto L_0x0588
        L_0x0136:
            boolean r6 = r10.G(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = V(r4)
            int r4 = Z(r11, r6)
            r12.s(r5, r4)
            goto L_0x0588
        L_0x0149:
            boolean r6 = r10.G(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = V(r4)
            long r6 = a0(r11, r6)
            r12.w(r5, r6)
            goto L_0x0588
        L_0x015c:
            boolean r6 = r10.G(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = V(r4)
            int r4 = Z(r11, r6)
            r12.o(r5, r4)
            goto L_0x0588
        L_0x016f:
            boolean r6 = r10.G(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = V(r4)
            long r6 = a0(r11, r6)
            r12.A(r5, r6)
            goto L_0x0588
        L_0x0182:
            boolean r6 = r10.G(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = V(r4)
            long r6 = a0(r11, r6)
            r12.D(r5, r6)
            goto L_0x0588
        L_0x0195:
            boolean r6 = r10.G(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = V(r4)
            float r4 = Y(r11, r6)
            r12.P(r5, r4)
            goto L_0x0588
        L_0x01a8:
            boolean r6 = r10.G(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = V(r4)
            double r6 = X(r11, r6)
            r12.t(r5, r6)
            goto L_0x0588
        L_0x01bb:
            long r6 = V(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.H(r11, r6)
            r10.t0(r12, r5, r4, r3)
            goto L_0x0588
        L_0x01c8:
            int r5 = r10.U(r3)
            long r6 = V(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.H(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.Schema r6 = r10.t(r3)
            com.google.protobuf.SchemaUtil.U(r5, r4, r12, r6)
            goto L_0x0588
        L_0x01df:
            int r5 = r10.U(r3)
            long r6 = V(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.H(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.b0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x01f2:
            int r5 = r10.U(r3)
            long r6 = V(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.H(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.a0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0205:
            int r5 = r10.U(r3)
            long r6 = V(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.H(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.Z(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0218:
            int r5 = r10.U(r3)
            long r6 = V(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.H(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.Y(r5, r4, r12, r8)
            goto L_0x0588
        L_0x022b:
            int r5 = r10.U(r3)
            long r6 = V(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.H(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.Q(r5, r4, r12, r8)
            goto L_0x0588
        L_0x023e:
            int r5 = r10.U(r3)
            long r6 = V(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.H(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.d0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0251:
            int r5 = r10.U(r3)
            long r6 = V(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.H(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.N(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0264:
            int r5 = r10.U(r3)
            long r6 = V(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.H(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.R(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0277:
            int r5 = r10.U(r3)
            long r6 = V(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.H(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.S(r5, r4, r12, r8)
            goto L_0x0588
        L_0x028a:
            int r5 = r10.U(r3)
            long r6 = V(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.H(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.V(r5, r4, r12, r8)
            goto L_0x0588
        L_0x029d:
            int r5 = r10.U(r3)
            long r6 = V(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.H(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.e0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x02b0:
            int r5 = r10.U(r3)
            long r6 = V(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.H(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.W(r5, r4, r12, r8)
            goto L_0x0588
        L_0x02c3:
            int r5 = r10.U(r3)
            long r6 = V(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.H(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.T(r5, r4, r12, r8)
            goto L_0x0588
        L_0x02d6:
            int r5 = r10.U(r3)
            long r6 = V(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.H(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.P(r5, r4, r12, r8)
            goto L_0x0588
        L_0x02e9:
            int r5 = r10.U(r3)
            long r8 = V(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.H(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.b0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02fc:
            int r5 = r10.U(r3)
            long r8 = V(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.H(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.a0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x030f:
            int r5 = r10.U(r3)
            long r8 = V(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.H(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.Z(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0322:
            int r5 = r10.U(r3)
            long r8 = V(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.H(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.Y(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0335:
            int r5 = r10.U(r3)
            long r8 = V(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.H(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.Q(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0348:
            int r5 = r10.U(r3)
            long r8 = V(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.H(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.d0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x035b:
            int r5 = r10.U(r3)
            long r6 = V(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.H(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.O(r5, r4, r12)
            goto L_0x0588
        L_0x036e:
            int r5 = r10.U(r3)
            long r6 = V(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.H(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.Schema r6 = r10.t(r3)
            com.google.protobuf.SchemaUtil.X(r5, r4, r12, r6)
            goto L_0x0588
        L_0x0385:
            int r5 = r10.U(r3)
            long r6 = V(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.H(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.c0(r5, r4, r12)
            goto L_0x0588
        L_0x0398:
            int r5 = r10.U(r3)
            long r8 = V(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.H(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.N(r5, r4, r12, r7)
            goto L_0x0588
        L_0x03ab:
            int r5 = r10.U(r3)
            long r8 = V(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.H(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.R(r5, r4, r12, r7)
            goto L_0x0588
        L_0x03be:
            int r5 = r10.U(r3)
            long r8 = V(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.H(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.S(r5, r4, r12, r7)
            goto L_0x0588
        L_0x03d1:
            int r5 = r10.U(r3)
            long r8 = V(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.H(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.V(r5, r4, r12, r7)
            goto L_0x0588
        L_0x03e4:
            int r5 = r10.U(r3)
            long r8 = V(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.H(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.e0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x03f7:
            int r5 = r10.U(r3)
            long r8 = V(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.H(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.W(r5, r4, r12, r7)
            goto L_0x0588
        L_0x040a:
            int r5 = r10.U(r3)
            long r8 = V(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.H(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.T(r5, r4, r12, r7)
            goto L_0x0588
        L_0x041d:
            int r5 = r10.U(r3)
            long r8 = V(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.H(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.P(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0430:
            boolean r6 = r10.z(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = V(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.H(r11, r6)
            com.google.protobuf.Schema r6 = r10.t(r3)
            r12.d(r5, r4, r6)
            goto L_0x0588
        L_0x0447:
            boolean r6 = r10.z(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = V(r4)
            long r6 = J(r11, r6)
            r12.O(r5, r6)
            goto L_0x0588
        L_0x045a:
            boolean r6 = r10.z(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = V(r4)
            int r4 = x(r11, r6)
            r12.W(r5, r4)
            goto L_0x0588
        L_0x046d:
            boolean r6 = r10.z(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = V(r4)
            long r6 = J(r11, r6)
            r12.J(r5, r6)
            goto L_0x0588
        L_0x0480:
            boolean r6 = r10.z(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = V(r4)
            int r4 = x(r11, r6)
            r12.F(r5, r4)
            goto L_0x0588
        L_0x0493:
            boolean r6 = r10.z(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = V(r4)
            int r4 = x(r11, r6)
            r12.S(r5, r4)
            goto L_0x0588
        L_0x04a6:
            boolean r6 = r10.z(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = V(r4)
            int r4 = x(r11, r6)
            r12.q(r5, r4)
            goto L_0x0588
        L_0x04b9:
            boolean r6 = r10.z(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = V(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.H(r11, r6)
            com.google.protobuf.ByteString r4 = (com.google.protobuf.ByteString) r4
            r12.e(r5, r4)
            goto L_0x0588
        L_0x04ce:
            boolean r6 = r10.z(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = V(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.H(r11, r6)
            com.google.protobuf.Schema r6 = r10.t(r3)
            r12.c(r5, r4, r6)
            goto L_0x0588
        L_0x04e5:
            boolean r6 = r10.z(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = V(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.H(r11, r6)
            r10.u0(r5, r4, r12)
            goto L_0x0588
        L_0x04f8:
            boolean r6 = r10.z(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = V(r4)
            boolean r4 = k(r11, r6)
            r12.E(r5, r4)
            goto L_0x0588
        L_0x050b:
            boolean r6 = r10.z(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = V(r4)
            int r4 = x(r11, r6)
            r12.s(r5, r4)
            goto L_0x0588
        L_0x051d:
            boolean r6 = r10.z(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = V(r4)
            long r6 = J(r11, r6)
            r12.w(r5, r6)
            goto L_0x0588
        L_0x052f:
            boolean r6 = r10.z(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = V(r4)
            int r4 = x(r11, r6)
            r12.o(r5, r4)
            goto L_0x0588
        L_0x0541:
            boolean r6 = r10.z(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = V(r4)
            long r6 = J(r11, r6)
            r12.A(r5, r6)
            goto L_0x0588
        L_0x0553:
            boolean r6 = r10.z(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = V(r4)
            long r6 = J(r11, r6)
            r12.D(r5, r6)
            goto L_0x0588
        L_0x0565:
            boolean r6 = r10.z(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = V(r4)
            float r4 = q(r11, r6)
            r12.P(r5, r4)
            goto L_0x0588
        L_0x0577:
            boolean r6 = r10.z(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = V(r4)
            double r6 = m(r11, r6)
            r12.t(r5, r6)
        L_0x0588:
            int r3 = r3 + -3
            goto L_0x0028
        L_0x058c:
            if (r2 == 0) goto L_0x05a3
            com.google.protobuf.ExtensionSchema r11 = r10.f32244p
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.s0(java.lang.Object, com.google.protobuf.Writer):void");
    }

    public final Schema t(int i2) {
        int i3 = (i2 / 3) * 2;
        Schema schema = (Schema) this.f32230b[i3];
        if (schema != null) {
            return schema;
        }
        Schema c2 = Protobuf.a().c((Class) this.f32230b[i3 + 1]);
        this.f32230b[i3] = c2;
        return c2;
    }

    public final void t0(Writer writer, int i2, Object obj, int i3) {
        if (obj != null) {
            writer.f(i2, this.f32245q.c(s(i3)), this.f32245q.h(obj));
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x034c, code lost:
        r6 = r6 + r3;
        r11 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x051b, code lost:
        r5 = r5 + 3;
        r4 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ae, code lost:
        r6 = r6 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01bb, code lost:
        r4 = (r4 + r9) + r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int u(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            sun.misc.Unsafe r2 = f32228s
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r4
            r5 = 0
            r6 = 0
            r8 = 0
        L_0x000d:
            int[] r9 = r0.f32229a
            int r9 = r9.length
            if (r5 >= r9) goto L_0x0522
            int r9 = r0.p0(r5)
            int r10 = r0.U(r5)
            int r11 = o0(r9)
            r12 = 17
            r13 = 1
            if (r11 > r12) goto L_0x0038
            int[] r12 = r0.f32229a
            int r14 = r5 + 2
            r12 = r12[r14]
            r14 = r12 & r4
            int r15 = r12 >>> 20
            int r15 = r13 << r15
            if (r14 == r7) goto L_0x0057
            long r7 = (long) r14
            int r8 = r2.getInt(r1, r7)
            r7 = r14
            goto L_0x0057
        L_0x0038:
            boolean r12 = r0.f32237i
            if (r12 == 0) goto L_0x0055
            com.google.protobuf.FieldType r12 = com.google.protobuf.FieldType.DOUBLE_LIST_PACKED
            int r12 = r12.f()
            if (r11 < r12) goto L_0x0055
            com.google.protobuf.FieldType r12 = com.google.protobuf.FieldType.SINT64_LIST_PACKED
            int r12 = r12.f()
            if (r11 > r12) goto L_0x0055
            int[] r12 = r0.f32229a
            int r14 = r5 + 2
            r12 = r12[r14]
            r12 = r12 & r4
        L_0x0053:
            r15 = 0
            goto L_0x0057
        L_0x0055:
            r12 = 0
            goto L_0x0053
        L_0x0057:
            long r13 = V(r9)
            r9 = 0
            r3 = 0
            switch(r11) {
                case 0: goto L_0x050f;
                case 1: goto L_0x0505;
                case 2: goto L_0x04f7;
                case 3: goto L_0x04e9;
                case 4: goto L_0x04db;
                case 5: goto L_0x04d1;
                case 6: goto L_0x04c6;
                case 7: goto L_0x04bb;
                case 8: goto L_0x049f;
                case 9: goto L_0x048d;
                case 10: goto L_0x047d;
                case 11: goto L_0x046f;
                case 12: goto L_0x0461;
                case 13: goto L_0x0456;
                case 14: goto L_0x044c;
                case 15: goto L_0x043e;
                case 16: goto L_0x0430;
                case 17: goto L_0x041c;
                case 18: goto L_0x040f;
                case 19: goto L_0x0402;
                case 20: goto L_0x03f5;
                case 21: goto L_0x03e8;
                case 22: goto L_0x03db;
                case 23: goto L_0x03ce;
                case 24: goto L_0x03c1;
                case 25: goto L_0x03b5;
                case 26: goto L_0x03a9;
                case 27: goto L_0x0399;
                case 28: goto L_0x038d;
                case 29: goto L_0x0380;
                case 30: goto L_0x0374;
                case 31: goto L_0x0368;
                case 32: goto L_0x035c;
                case 33: goto L_0x0350;
                case 34: goto L_0x0341;
                case 35: goto L_0x0323;
                case 36: goto L_0x0305;
                case 37: goto L_0x02e7;
                case 38: goto L_0x02c9;
                case 39: goto L_0x02ab;
                case 40: goto L_0x028d;
                case 41: goto L_0x026f;
                case 42: goto L_0x0251;
                case 43: goto L_0x0233;
                case 44: goto L_0x0216;
                case 45: goto L_0x01f9;
                case 46: goto L_0x01dc;
                case 47: goto L_0x01bf;
                case 48: goto L_0x019f;
                case 49: goto L_0x018f;
                case 50: goto L_0x017f;
                case 51: goto L_0x0171;
                case 52: goto L_0x0165;
                case 53: goto L_0x0155;
                case 54: goto L_0x0145;
                case 55: goto L_0x0135;
                case 56: goto L_0x0129;
                case 57: goto L_0x011d;
                case 58: goto L_0x0110;
                case 59: goto L_0x00f2;
                case 60: goto L_0x00df;
                case 61: goto L_0x00ce;
                case 62: goto L_0x00bf;
                case 63: goto L_0x00b0;
                case 64: goto L_0x00a3;
                case 65: goto L_0x0098;
                case 66: goto L_0x0089;
                case 67: goto L_0x007a;
                case 68: goto L_0x0062;
                default: goto L_0x0061;
            }
        L_0x0061:
            goto L_0x0077
        L_0x0062:
            boolean r3 = r0.G(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.MessageLite r3 = (com.google.protobuf.MessageLite) r3
            com.google.protobuf.Schema r4 = r0.t(r5)
            int r3 = com.google.protobuf.CodedOutputStream.k0(r10, r3, r4)
        L_0x0076:
            int r6 = r6 + r3
        L_0x0077:
            r11 = 0
            goto L_0x051b
        L_0x007a:
            boolean r3 = r0.G(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            long r3 = a0(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.H0(r10, r3)
            goto L_0x0076
        L_0x0089:
            boolean r3 = r0.G(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            int r3 = Z(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.F0(r10, r3)
            goto L_0x0076
        L_0x0098:
            boolean r9 = r0.G(r1, r10, r5)
            if (r9 == 0) goto L_0x0077
            int r3 = com.google.protobuf.CodedOutputStream.D0(r10, r3)
            goto L_0x0076
        L_0x00a3:
            boolean r3 = r0.G(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            r3 = 0
            int r4 = com.google.protobuf.CodedOutputStream.B0(r10, r3)
        L_0x00ae:
            int r6 = r6 + r4
            goto L_0x0077
        L_0x00b0:
            boolean r3 = r0.G(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            int r3 = Z(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.c0(r10, r3)
            goto L_0x0076
        L_0x00bf:
            boolean r3 = r0.G(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            int r3 = Z(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.M0(r10, r3)
            goto L_0x0076
        L_0x00ce:
            boolean r3 = r0.G(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.ByteString r3 = (com.google.protobuf.ByteString) r3
            int r3 = com.google.protobuf.CodedOutputStream.Y(r10, r3)
            goto L_0x0076
        L_0x00df:
            boolean r3 = r0.G(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.Schema r4 = r0.t(r5)
            int r3 = com.google.protobuf.SchemaUtil.o(r10, r3, r4)
            goto L_0x0076
        L_0x00f2:
            boolean r3 = r0.G(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            java.lang.Object r3 = r2.getObject(r1, r13)
            boolean r4 = r3 instanceof com.google.protobuf.ByteString
            if (r4 == 0) goto L_0x0108
            com.google.protobuf.ByteString r3 = (com.google.protobuf.ByteString) r3
            int r3 = com.google.protobuf.CodedOutputStream.Y(r10, r3)
            goto L_0x0076
        L_0x0108:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.google.protobuf.CodedOutputStream.J0(r10, r3)
            goto L_0x0076
        L_0x0110:
            boolean r3 = r0.G(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            r3 = 1
            int r3 = com.google.protobuf.CodedOutputStream.l(r10, r3)
            goto L_0x0076
        L_0x011d:
            boolean r3 = r0.G(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            r3 = 0
            int r4 = com.google.protobuf.CodedOutputStream.e0(r10, r3)
            goto L_0x00ae
        L_0x0129:
            boolean r9 = r0.G(r1, r10, r5)
            if (r9 == 0) goto L_0x0077
            int r3 = com.google.protobuf.CodedOutputStream.g0(r10, r3)
            goto L_0x0076
        L_0x0135:
            boolean r3 = r0.G(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            int r3 = Z(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.n0(r10, r3)
            goto L_0x0076
        L_0x0145:
            boolean r3 = r0.G(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            long r3 = a0(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.O0(r10, r3)
            goto L_0x0076
        L_0x0155:
            boolean r3 = r0.G(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            long r3 = a0(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.p0(r10, r3)
            goto L_0x0076
        L_0x0165:
            boolean r3 = r0.G(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            int r3 = com.google.protobuf.CodedOutputStream.i0(r10, r9)
            goto L_0x0076
        L_0x0171:
            boolean r3 = r0.G(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            r3 = 0
            int r3 = com.google.protobuf.CodedOutputStream.a0(r10, r3)
            goto L_0x0076
        L_0x017f:
            com.google.protobuf.MapFieldSchema r3 = r0.f32245q
            java.lang.Object r4 = r2.getObject(r1, r13)
            java.lang.Object r9 = r0.s(r5)
            int r3 = r3.f(r10, r4, r9)
            goto L_0x0076
        L_0x018f:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.Schema r4 = r0.t(r5)
            int r3 = com.google.protobuf.SchemaUtil.j(r10, r3, r4)
            goto L_0x0076
        L_0x019f:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.t(r3)
            if (r3 <= 0) goto L_0x0077
            boolean r4 = r0.f32237i
            if (r4 == 0) goto L_0x01b3
            long r12 = (long) r12
            r2.putInt(r1, r12, r3)
        L_0x01b3:
            int r4 = com.google.protobuf.CodedOutputStream.L0(r10)
            int r9 = com.google.protobuf.CodedOutputStream.N0(r3)
        L_0x01bb:
            int r4 = r4 + r9
            int r4 = r4 + r3
            goto L_0x00ae
        L_0x01bf:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.r(r3)
            if (r3 <= 0) goto L_0x0077
            boolean r4 = r0.f32237i
            if (r4 == 0) goto L_0x01d3
            long r12 = (long) r12
            r2.putInt(r1, r12, r3)
        L_0x01d3:
            int r4 = com.google.protobuf.CodedOutputStream.L0(r10)
            int r9 = com.google.protobuf.CodedOutputStream.N0(r3)
            goto L_0x01bb
        L_0x01dc:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.i(r3)
            if (r3 <= 0) goto L_0x0077
            boolean r4 = r0.f32237i
            if (r4 == 0) goto L_0x01f0
            long r12 = (long) r12
            r2.putInt(r1, r12, r3)
        L_0x01f0:
            int r4 = com.google.protobuf.CodedOutputStream.L0(r10)
            int r9 = com.google.protobuf.CodedOutputStream.N0(r3)
            goto L_0x01bb
        L_0x01f9:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.g(r3)
            if (r3 <= 0) goto L_0x0077
            boolean r4 = r0.f32237i
            if (r4 == 0) goto L_0x020d
            long r12 = (long) r12
            r2.putInt(r1, r12, r3)
        L_0x020d:
            int r4 = com.google.protobuf.CodedOutputStream.L0(r10)
            int r9 = com.google.protobuf.CodedOutputStream.N0(r3)
            goto L_0x01bb
        L_0x0216:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.e(r3)
            if (r3 <= 0) goto L_0x0077
            boolean r4 = r0.f32237i
            if (r4 == 0) goto L_0x022a
            long r12 = (long) r12
            r2.putInt(r1, r12, r3)
        L_0x022a:
            int r4 = com.google.protobuf.CodedOutputStream.L0(r10)
            int r9 = com.google.protobuf.CodedOutputStream.N0(r3)
            goto L_0x01bb
        L_0x0233:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.w(r3)
            if (r3 <= 0) goto L_0x0077
            boolean r4 = r0.f32237i
            if (r4 == 0) goto L_0x0247
            long r12 = (long) r12
            r2.putInt(r1, r12, r3)
        L_0x0247:
            int r4 = com.google.protobuf.CodedOutputStream.L0(r10)
            int r9 = com.google.protobuf.CodedOutputStream.N0(r3)
            goto L_0x01bb
        L_0x0251:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.b(r3)
            if (r3 <= 0) goto L_0x0077
            boolean r4 = r0.f32237i
            if (r4 == 0) goto L_0x0265
            long r12 = (long) r12
            r2.putInt(r1, r12, r3)
        L_0x0265:
            int r4 = com.google.protobuf.CodedOutputStream.L0(r10)
            int r9 = com.google.protobuf.CodedOutputStream.N0(r3)
            goto L_0x01bb
        L_0x026f:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.g(r3)
            if (r3 <= 0) goto L_0x0077
            boolean r4 = r0.f32237i
            if (r4 == 0) goto L_0x0283
            long r12 = (long) r12
            r2.putInt(r1, r12, r3)
        L_0x0283:
            int r4 = com.google.protobuf.CodedOutputStream.L0(r10)
            int r9 = com.google.protobuf.CodedOutputStream.N0(r3)
            goto L_0x01bb
        L_0x028d:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.i(r3)
            if (r3 <= 0) goto L_0x0077
            boolean r4 = r0.f32237i
            if (r4 == 0) goto L_0x02a1
            long r12 = (long) r12
            r2.putInt(r1, r12, r3)
        L_0x02a1:
            int r4 = com.google.protobuf.CodedOutputStream.L0(r10)
            int r9 = com.google.protobuf.CodedOutputStream.N0(r3)
            goto L_0x01bb
        L_0x02ab:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.l(r3)
            if (r3 <= 0) goto L_0x0077
            boolean r4 = r0.f32237i
            if (r4 == 0) goto L_0x02bf
            long r12 = (long) r12
            r2.putInt(r1, r12, r3)
        L_0x02bf:
            int r4 = com.google.protobuf.CodedOutputStream.L0(r10)
            int r9 = com.google.protobuf.CodedOutputStream.N0(r3)
            goto L_0x01bb
        L_0x02c9:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.y(r3)
            if (r3 <= 0) goto L_0x0077
            boolean r4 = r0.f32237i
            if (r4 == 0) goto L_0x02dd
            long r12 = (long) r12
            r2.putInt(r1, r12, r3)
        L_0x02dd:
            int r4 = com.google.protobuf.CodedOutputStream.L0(r10)
            int r9 = com.google.protobuf.CodedOutputStream.N0(r3)
            goto L_0x01bb
        L_0x02e7:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.n(r3)
            if (r3 <= 0) goto L_0x0077
            boolean r4 = r0.f32237i
            if (r4 == 0) goto L_0x02fb
            long r12 = (long) r12
            r2.putInt(r1, r12, r3)
        L_0x02fb:
            int r4 = com.google.protobuf.CodedOutputStream.L0(r10)
            int r9 = com.google.protobuf.CodedOutputStream.N0(r3)
            goto L_0x01bb
        L_0x0305:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.g(r3)
            if (r3 <= 0) goto L_0x0077
            boolean r4 = r0.f32237i
            if (r4 == 0) goto L_0x0319
            long r12 = (long) r12
            r2.putInt(r1, r12, r3)
        L_0x0319:
            int r4 = com.google.protobuf.CodedOutputStream.L0(r10)
            int r9 = com.google.protobuf.CodedOutputStream.N0(r3)
            goto L_0x01bb
        L_0x0323:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.i(r3)
            if (r3 <= 0) goto L_0x0077
            boolean r4 = r0.f32237i
            if (r4 == 0) goto L_0x0337
            long r12 = (long) r12
            r2.putInt(r1, r12, r3)
        L_0x0337:
            int r4 = com.google.protobuf.CodedOutputStream.L0(r10)
            int r9 = com.google.protobuf.CodedOutputStream.N0(r3)
            goto L_0x01bb
        L_0x0341:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = com.google.protobuf.SchemaUtil.s(r10, r3, r4)
        L_0x034c:
            int r6 = r6 + r3
            r11 = r4
            goto L_0x051b
        L_0x0350:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.q(r10, r3, r4)
            goto L_0x034c
        L_0x035c:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.h(r10, r3, r4)
            goto L_0x034c
        L_0x0368:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.f(r10, r3, r4)
            goto L_0x034c
        L_0x0374:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.d(r10, r3, r4)
            goto L_0x034c
        L_0x0380:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.v(r10, r3, r4)
            goto L_0x0076
        L_0x038d:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.c(r10, r3)
            goto L_0x0076
        L_0x0399:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.Schema r4 = r0.t(r5)
            int r3 = com.google.protobuf.SchemaUtil.p(r10, r3, r4)
            goto L_0x0076
        L_0x03a9:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.u(r10, r3)
            goto L_0x0076
        L_0x03b5:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = com.google.protobuf.SchemaUtil.a(r10, r3, r4)
            goto L_0x034c
        L_0x03c1:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.f(r10, r3, r4)
            goto L_0x034c
        L_0x03ce:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.h(r10, r3, r4)
            goto L_0x034c
        L_0x03db:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.k(r10, r3, r4)
            goto L_0x034c
        L_0x03e8:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.x(r10, r3, r4)
            goto L_0x034c
        L_0x03f5:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.m(r10, r3, r4)
            goto L_0x034c
        L_0x0402:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.f(r10, r3, r4)
            goto L_0x034c
        L_0x040f:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.SchemaUtil.h(r10, r3, r4)
            goto L_0x0076
        L_0x041c:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0077
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.MessageLite r3 = (com.google.protobuf.MessageLite) r3
            com.google.protobuf.Schema r4 = r0.t(r5)
            int r3 = com.google.protobuf.CodedOutputStream.k0(r10, r3, r4)
            goto L_0x0076
        L_0x0430:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0077
            long r3 = r2.getLong(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.H0(r10, r3)
            goto L_0x0076
        L_0x043e:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0077
            int r3 = r2.getInt(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.F0(r10, r3)
            goto L_0x0076
        L_0x044c:
            r11 = r8 & r15
            if (r11 == 0) goto L_0x0077
            int r3 = com.google.protobuf.CodedOutputStream.D0(r10, r3)
            goto L_0x0076
        L_0x0456:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0077
            r3 = 0
            int r4 = com.google.protobuf.CodedOutputStream.B0(r10, r3)
            goto L_0x00ae
        L_0x0461:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0077
            int r3 = r2.getInt(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.c0(r10, r3)
            goto L_0x0076
        L_0x046f:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0077
            int r3 = r2.getInt(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.M0(r10, r3)
            goto L_0x0076
        L_0x047d:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0077
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.ByteString r3 = (com.google.protobuf.ByteString) r3
            int r3 = com.google.protobuf.CodedOutputStream.Y(r10, r3)
            goto L_0x0076
        L_0x048d:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0077
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.Schema r4 = r0.t(r5)
            int r3 = com.google.protobuf.SchemaUtil.o(r10, r3, r4)
            goto L_0x0076
        L_0x049f:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0077
            java.lang.Object r3 = r2.getObject(r1, r13)
            boolean r4 = r3 instanceof com.google.protobuf.ByteString
            if (r4 == 0) goto L_0x04b3
            com.google.protobuf.ByteString r3 = (com.google.protobuf.ByteString) r3
            int r3 = com.google.protobuf.CodedOutputStream.Y(r10, r3)
            goto L_0x0076
        L_0x04b3:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.google.protobuf.CodedOutputStream.J0(r10, r3)
            goto L_0x0076
        L_0x04bb:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0077
            r3 = 1
            int r3 = com.google.protobuf.CodedOutputStream.l(r10, r3)
            goto L_0x0076
        L_0x04c6:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0077
            r11 = 0
            int r3 = com.google.protobuf.CodedOutputStream.e0(r10, r11)
        L_0x04cf:
            int r6 = r6 + r3
            goto L_0x051b
        L_0x04d1:
            r11 = 0
            r9 = r8 & r15
            if (r9 == 0) goto L_0x051b
            int r3 = com.google.protobuf.CodedOutputStream.g0(r10, r3)
            goto L_0x04cf
        L_0x04db:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x051b
            int r3 = r2.getInt(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.n0(r10, r3)
            goto L_0x04cf
        L_0x04e9:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x051b
            long r3 = r2.getLong(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.O0(r10, r3)
            goto L_0x04cf
        L_0x04f7:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x051b
            long r3 = r2.getLong(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.p0(r10, r3)
            goto L_0x04cf
        L_0x0505:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x051b
            int r3 = com.google.protobuf.CodedOutputStream.i0(r10, r9)
            goto L_0x04cf
        L_0x050f:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x051b
            r3 = 0
            int r3 = com.google.protobuf.CodedOutputStream.a0(r10, r3)
            goto L_0x04cf
        L_0x051b:
            int r5 = r5 + 3
            r4 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000d
        L_0x0522:
            com.google.protobuf.UnknownFieldSchema r2 = r0.f32243o
            int r2 = r0.w(r2, r1)
            int r6 = r6 + r2
            boolean r2 = r0.f32234f
            if (r2 == 0) goto L_0x0538
            com.google.protobuf.ExtensionSchema r2 = r0.f32244p
            com.google.protobuf.FieldSet r1 = r2.c(r1)
            int r1 = r1.l()
            int r6 = r6 + r1
        L_0x0538:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.u(java.lang.Object):int");
    }

    public final void u0(int i2, Object obj, Writer writer) {
        if (obj instanceof String) {
            writer.z(i2, (String) obj);
        } else {
            writer.e(i2, (ByteString) obj);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int v(java.lang.Object r16) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            sun.misc.Unsafe r2 = f32228s
            r3 = 0
            r4 = r3
            r5 = r4
        L_0x0008:
            int[] r6 = r0.f32229a
            int r6 = r6.length
            if (r4 >= r6) goto L_0x04ed
            int r6 = r15.p0(r4)
            int r7 = o0(r6)
            int r8 = r15.U(r4)
            long r9 = V(r6)
            com.google.protobuf.FieldType r6 = com.google.protobuf.FieldType.DOUBLE_LIST_PACKED
            int r6 = r6.f()
            if (r7 < r6) goto L_0x0038
            com.google.protobuf.FieldType r6 = com.google.protobuf.FieldType.SINT64_LIST_PACKED
            int r6 = r6.f()
            if (r7 > r6) goto L_0x0038
            int[] r6 = r0.f32229a
            int r11 = r4 + 2
            r6 = r6[r11]
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r6 & r11
            goto L_0x0039
        L_0x0038:
            r6 = r3
        L_0x0039:
            r13 = 0
            r14 = 1
            r11 = 0
            switch(r7) {
                case 0: goto L_0x04db;
                case 1: goto L_0x04cf;
                case 2: goto L_0x04bf;
                case 3: goto L_0x04af;
                case 4: goto L_0x049f;
                case 5: goto L_0x0493;
                case 6: goto L_0x0487;
                case 7: goto L_0x047b;
                case 8: goto L_0x045d;
                case 9: goto L_0x0449;
                case 10: goto L_0x0437;
                case 11: goto L_0x0427;
                case 12: goto L_0x0417;
                case 13: goto L_0x040b;
                case 14: goto L_0x03ff;
                case 15: goto L_0x03ef;
                case 16: goto L_0x03df;
                case 17: goto L_0x03c9;
                case 18: goto L_0x03bf;
                case 19: goto L_0x03b5;
                case 20: goto L_0x03ab;
                case 21: goto L_0x03a1;
                case 22: goto L_0x0397;
                case 23: goto L_0x038d;
                case 24: goto L_0x0383;
                case 25: goto L_0x0379;
                case 26: goto L_0x036f;
                case 27: goto L_0x0361;
                case 28: goto L_0x0357;
                case 29: goto L_0x034d;
                case 30: goto L_0x0343;
                case 31: goto L_0x0339;
                case 32: goto L_0x032f;
                case 33: goto L_0x0325;
                case 34: goto L_0x031b;
                case 35: goto L_0x02fd;
                case 36: goto L_0x02df;
                case 37: goto L_0x02c1;
                case 38: goto L_0x02a3;
                case 39: goto L_0x0285;
                case 40: goto L_0x0267;
                case 41: goto L_0x0249;
                case 42: goto L_0x022b;
                case 43: goto L_0x020d;
                case 44: goto L_0x01f0;
                case 45: goto L_0x01d3;
                case 46: goto L_0x01b6;
                case 47: goto L_0x0199;
                case 48: goto L_0x0179;
                case 49: goto L_0x016b;
                case 50: goto L_0x015b;
                case 51: goto L_0x014d;
                case 52: goto L_0x0141;
                case 53: goto L_0x0131;
                case 54: goto L_0x0121;
                case 55: goto L_0x0111;
                case 56: goto L_0x0105;
                case 57: goto L_0x00f9;
                case 58: goto L_0x00ed;
                case 59: goto L_0x00cf;
                case 60: goto L_0x00bc;
                case 61: goto L_0x00ab;
                case 62: goto L_0x009c;
                case 63: goto L_0x008d;
                case 64: goto L_0x0082;
                case 65: goto L_0x0077;
                case 66: goto L_0x0068;
                case 67: goto L_0x0059;
                case 68: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x04e9
        L_0x0042:
            boolean r6 = r15.G(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r1, r9)
            com.google.protobuf.MessageLite r6 = (com.google.protobuf.MessageLite) r6
            com.google.protobuf.Schema r7 = r15.t(r4)
            int r6 = com.google.protobuf.CodedOutputStream.k0(r8, r6, r7)
        L_0x0056:
            int r5 = r5 + r6
            goto L_0x04e9
        L_0x0059:
            boolean r6 = r15.G(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            long r6 = a0(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.H0(r8, r6)
            goto L_0x0056
        L_0x0068:
            boolean r6 = r15.G(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = Z(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.F0(r8, r6)
            goto L_0x0056
        L_0x0077:
            boolean r6 = r15.G(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.protobuf.CodedOutputStream.D0(r8, r11)
            goto L_0x0056
        L_0x0082:
            boolean r6 = r15.G(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.protobuf.CodedOutputStream.B0(r8, r3)
            goto L_0x0056
        L_0x008d:
            boolean r6 = r15.G(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = Z(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.c0(r8, r6)
            goto L_0x0056
        L_0x009c:
            boolean r6 = r15.G(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = Z(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.M0(r8, r6)
            goto L_0x0056
        L_0x00ab:
            boolean r6 = r15.G(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r1, r9)
            com.google.protobuf.ByteString r6 = (com.google.protobuf.ByteString) r6
            int r6 = com.google.protobuf.CodedOutputStream.Y(r8, r6)
            goto L_0x0056
        L_0x00bc:
            boolean r6 = r15.G(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r1, r9)
            com.google.protobuf.Schema r7 = r15.t(r4)
            int r6 = com.google.protobuf.SchemaUtil.o(r8, r6, r7)
            goto L_0x0056
        L_0x00cf:
            boolean r6 = r15.G(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r1, r9)
            boolean r7 = r6 instanceof com.google.protobuf.ByteString
            if (r7 == 0) goto L_0x00e5
            com.google.protobuf.ByteString r6 = (com.google.protobuf.ByteString) r6
            int r6 = com.google.protobuf.CodedOutputStream.Y(r8, r6)
            goto L_0x0056
        L_0x00e5:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.google.protobuf.CodedOutputStream.J0(r8, r6)
            goto L_0x0056
        L_0x00ed:
            boolean r6 = r15.G(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.protobuf.CodedOutputStream.l(r8, r14)
            goto L_0x0056
        L_0x00f9:
            boolean r6 = r15.G(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.protobuf.CodedOutputStream.e0(r8, r3)
            goto L_0x0056
        L_0x0105:
            boolean r6 = r15.G(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.protobuf.CodedOutputStream.g0(r8, r11)
            goto L_0x0056
        L_0x0111:
            boolean r6 = r15.G(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = Z(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.n0(r8, r6)
            goto L_0x0056
        L_0x0121:
            boolean r6 = r15.G(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            long r6 = a0(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.O0(r8, r6)
            goto L_0x0056
        L_0x0131:
            boolean r6 = r15.G(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            long r6 = a0(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.p0(r8, r6)
            goto L_0x0056
        L_0x0141:
            boolean r6 = r15.G(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.protobuf.CodedOutputStream.i0(r8, r13)
            goto L_0x0056
        L_0x014d:
            boolean r6 = r15.G(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            r6 = 0
            int r6 = com.google.protobuf.CodedOutputStream.a0(r8, r6)
            goto L_0x0056
        L_0x015b:
            com.google.protobuf.MapFieldSchema r6 = r0.f32245q
            java.lang.Object r7 = com.google.protobuf.UnsafeUtil.H(r1, r9)
            java.lang.Object r9 = r15.s(r4)
            int r6 = r6.f(r8, r7, r9)
            goto L_0x0056
        L_0x016b:
            java.util.List r6 = I(r1, r9)
            com.google.protobuf.Schema r7 = r15.t(r4)
            int r6 = com.google.protobuf.SchemaUtil.j(r8, r6, r7)
            goto L_0x0056
        L_0x0179:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.SchemaUtil.t(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f32237i
            if (r9 == 0) goto L_0x018d
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x018d:
            int r6 = com.google.protobuf.CodedOutputStream.L0(r8)
            int r8 = com.google.protobuf.CodedOutputStream.N0(r7)
        L_0x0195:
            int r6 = r6 + r8
            int r6 = r6 + r7
            goto L_0x0056
        L_0x0199:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.SchemaUtil.r(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f32237i
            if (r9 == 0) goto L_0x01ad
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01ad:
            int r6 = com.google.protobuf.CodedOutputStream.L0(r8)
            int r8 = com.google.protobuf.CodedOutputStream.N0(r7)
            goto L_0x0195
        L_0x01b6:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.SchemaUtil.i(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f32237i
            if (r9 == 0) goto L_0x01ca
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01ca:
            int r6 = com.google.protobuf.CodedOutputStream.L0(r8)
            int r8 = com.google.protobuf.CodedOutputStream.N0(r7)
            goto L_0x0195
        L_0x01d3:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.SchemaUtil.g(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f32237i
            if (r9 == 0) goto L_0x01e7
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01e7:
            int r6 = com.google.protobuf.CodedOutputStream.L0(r8)
            int r8 = com.google.protobuf.CodedOutputStream.N0(r7)
            goto L_0x0195
        L_0x01f0:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.SchemaUtil.e(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f32237i
            if (r9 == 0) goto L_0x0204
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0204:
            int r6 = com.google.protobuf.CodedOutputStream.L0(r8)
            int r8 = com.google.protobuf.CodedOutputStream.N0(r7)
            goto L_0x0195
        L_0x020d:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.SchemaUtil.w(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f32237i
            if (r9 == 0) goto L_0x0221
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0221:
            int r6 = com.google.protobuf.CodedOutputStream.L0(r8)
            int r8 = com.google.protobuf.CodedOutputStream.N0(r7)
            goto L_0x0195
        L_0x022b:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.SchemaUtil.b(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f32237i
            if (r9 == 0) goto L_0x023f
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x023f:
            int r6 = com.google.protobuf.CodedOutputStream.L0(r8)
            int r8 = com.google.protobuf.CodedOutputStream.N0(r7)
            goto L_0x0195
        L_0x0249:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.SchemaUtil.g(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f32237i
            if (r9 == 0) goto L_0x025d
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x025d:
            int r6 = com.google.protobuf.CodedOutputStream.L0(r8)
            int r8 = com.google.protobuf.CodedOutputStream.N0(r7)
            goto L_0x0195
        L_0x0267:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.SchemaUtil.i(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f32237i
            if (r9 == 0) goto L_0x027b
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x027b:
            int r6 = com.google.protobuf.CodedOutputStream.L0(r8)
            int r8 = com.google.protobuf.CodedOutputStream.N0(r7)
            goto L_0x0195
        L_0x0285:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.SchemaUtil.l(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f32237i
            if (r9 == 0) goto L_0x0299
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0299:
            int r6 = com.google.protobuf.CodedOutputStream.L0(r8)
            int r8 = com.google.protobuf.CodedOutputStream.N0(r7)
            goto L_0x0195
        L_0x02a3:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.SchemaUtil.y(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f32237i
            if (r9 == 0) goto L_0x02b7
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02b7:
            int r6 = com.google.protobuf.CodedOutputStream.L0(r8)
            int r8 = com.google.protobuf.CodedOutputStream.N0(r7)
            goto L_0x0195
        L_0x02c1:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.SchemaUtil.n(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f32237i
            if (r9 == 0) goto L_0x02d5
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02d5:
            int r6 = com.google.protobuf.CodedOutputStream.L0(r8)
            int r8 = com.google.protobuf.CodedOutputStream.N0(r7)
            goto L_0x0195
        L_0x02df:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.SchemaUtil.g(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f32237i
            if (r9 == 0) goto L_0x02f3
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02f3:
            int r6 = com.google.protobuf.CodedOutputStream.L0(r8)
            int r8 = com.google.protobuf.CodedOutputStream.N0(r7)
            goto L_0x0195
        L_0x02fd:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.SchemaUtil.i(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f32237i
            if (r9 == 0) goto L_0x0311
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0311:
            int r6 = com.google.protobuf.CodedOutputStream.L0(r8)
            int r8 = com.google.protobuf.CodedOutputStream.N0(r7)
            goto L_0x0195
        L_0x031b:
            java.util.List r6 = I(r1, r9)
            int r6 = com.google.protobuf.SchemaUtil.s(r8, r6, r3)
            goto L_0x0056
        L_0x0325:
            java.util.List r6 = I(r1, r9)
            int r6 = com.google.protobuf.SchemaUtil.q(r8, r6, r3)
            goto L_0x0056
        L_0x032f:
            java.util.List r6 = I(r1, r9)
            int r6 = com.google.protobuf.SchemaUtil.h(r8, r6, r3)
            goto L_0x0056
        L_0x0339:
            java.util.List r6 = I(r1, r9)
            int r6 = com.google.protobuf.SchemaUtil.f(r8, r6, r3)
            goto L_0x0056
        L_0x0343:
            java.util.List r6 = I(r1, r9)
            int r6 = com.google.protobuf.SchemaUtil.d(r8, r6, r3)
            goto L_0x0056
        L_0x034d:
            java.util.List r6 = I(r1, r9)
            int r6 = com.google.protobuf.SchemaUtil.v(r8, r6, r3)
            goto L_0x0056
        L_0x0357:
            java.util.List r6 = I(r1, r9)
            int r6 = com.google.protobuf.SchemaUtil.c(r8, r6)
            goto L_0x0056
        L_0x0361:
            java.util.List r6 = I(r1, r9)
            com.google.protobuf.Schema r7 = r15.t(r4)
            int r6 = com.google.protobuf.SchemaUtil.p(r8, r6, r7)
            goto L_0x0056
        L_0x036f:
            java.util.List r6 = I(r1, r9)
            int r6 = com.google.protobuf.SchemaUtil.u(r8, r6)
            goto L_0x0056
        L_0x0379:
            java.util.List r6 = I(r1, r9)
            int r6 = com.google.protobuf.SchemaUtil.a(r8, r6, r3)
            goto L_0x0056
        L_0x0383:
            java.util.List r6 = I(r1, r9)
            int r6 = com.google.protobuf.SchemaUtil.f(r8, r6, r3)
            goto L_0x0056
        L_0x038d:
            java.util.List r6 = I(r1, r9)
            int r6 = com.google.protobuf.SchemaUtil.h(r8, r6, r3)
            goto L_0x0056
        L_0x0397:
            java.util.List r6 = I(r1, r9)
            int r6 = com.google.protobuf.SchemaUtil.k(r8, r6, r3)
            goto L_0x0056
        L_0x03a1:
            java.util.List r6 = I(r1, r9)
            int r6 = com.google.protobuf.SchemaUtil.x(r8, r6, r3)
            goto L_0x0056
        L_0x03ab:
            java.util.List r6 = I(r1, r9)
            int r6 = com.google.protobuf.SchemaUtil.m(r8, r6, r3)
            goto L_0x0056
        L_0x03b5:
            java.util.List r6 = I(r1, r9)
            int r6 = com.google.protobuf.SchemaUtil.f(r8, r6, r3)
            goto L_0x0056
        L_0x03bf:
            java.util.List r6 = I(r1, r9)
            int r6 = com.google.protobuf.SchemaUtil.h(r8, r6, r3)
            goto L_0x0056
        L_0x03c9:
            boolean r6 = r15.z(r1, r4)
            if (r6 == 0) goto L_0x04e9
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r1, r9)
            com.google.protobuf.MessageLite r6 = (com.google.protobuf.MessageLite) r6
            com.google.protobuf.Schema r7 = r15.t(r4)
            int r6 = com.google.protobuf.CodedOutputStream.k0(r8, r6, r7)
            goto L_0x0056
        L_0x03df:
            boolean r6 = r15.z(r1, r4)
            if (r6 == 0) goto L_0x04e9
            long r6 = com.google.protobuf.UnsafeUtil.F(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.H0(r8, r6)
            goto L_0x0056
        L_0x03ef:
            boolean r6 = r15.z(r1, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.protobuf.UnsafeUtil.D(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.F0(r8, r6)
            goto L_0x0056
        L_0x03ff:
            boolean r6 = r15.z(r1, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.protobuf.CodedOutputStream.D0(r8, r11)
            goto L_0x0056
        L_0x040b:
            boolean r6 = r15.z(r1, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.protobuf.CodedOutputStream.B0(r8, r3)
            goto L_0x0056
        L_0x0417:
            boolean r6 = r15.z(r1, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.protobuf.UnsafeUtil.D(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.c0(r8, r6)
            goto L_0x0056
        L_0x0427:
            boolean r6 = r15.z(r1, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.protobuf.UnsafeUtil.D(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.M0(r8, r6)
            goto L_0x0056
        L_0x0437:
            boolean r6 = r15.z(r1, r4)
            if (r6 == 0) goto L_0x04e9
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r1, r9)
            com.google.protobuf.ByteString r6 = (com.google.protobuf.ByteString) r6
            int r6 = com.google.protobuf.CodedOutputStream.Y(r8, r6)
            goto L_0x0056
        L_0x0449:
            boolean r6 = r15.z(r1, r4)
            if (r6 == 0) goto L_0x04e9
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r1, r9)
            com.google.protobuf.Schema r7 = r15.t(r4)
            int r6 = com.google.protobuf.SchemaUtil.o(r8, r6, r7)
            goto L_0x0056
        L_0x045d:
            boolean r6 = r15.z(r1, r4)
            if (r6 == 0) goto L_0x04e9
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.H(r1, r9)
            boolean r7 = r6 instanceof com.google.protobuf.ByteString
            if (r7 == 0) goto L_0x0473
            com.google.protobuf.ByteString r6 = (com.google.protobuf.ByteString) r6
            int r6 = com.google.protobuf.CodedOutputStream.Y(r8, r6)
            goto L_0x0056
        L_0x0473:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.google.protobuf.CodedOutputStream.J0(r8, r6)
            goto L_0x0056
        L_0x047b:
            boolean r6 = r15.z(r1, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.protobuf.CodedOutputStream.l(r8, r14)
            goto L_0x0056
        L_0x0487:
            boolean r6 = r15.z(r1, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.protobuf.CodedOutputStream.e0(r8, r3)
            goto L_0x0056
        L_0x0493:
            boolean r6 = r15.z(r1, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.protobuf.CodedOutputStream.g0(r8, r11)
            goto L_0x0056
        L_0x049f:
            boolean r6 = r15.z(r1, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.protobuf.UnsafeUtil.D(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.n0(r8, r6)
            goto L_0x0056
        L_0x04af:
            boolean r6 = r15.z(r1, r4)
            if (r6 == 0) goto L_0x04e9
            long r6 = com.google.protobuf.UnsafeUtil.F(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.O0(r8, r6)
            goto L_0x0056
        L_0x04bf:
            boolean r6 = r15.z(r1, r4)
            if (r6 == 0) goto L_0x04e9
            long r6 = com.google.protobuf.UnsafeUtil.F(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.p0(r8, r6)
            goto L_0x0056
        L_0x04cf:
            boolean r6 = r15.z(r1, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.protobuf.CodedOutputStream.i0(r8, r13)
            goto L_0x0056
        L_0x04db:
            boolean r6 = r15.z(r1, r4)
            if (r6 == 0) goto L_0x04e9
            r6 = 0
            int r6 = com.google.protobuf.CodedOutputStream.a0(r8, r6)
            goto L_0x0056
        L_0x04e9:
            int r4 = r4 + 3
            goto L_0x0008
        L_0x04ed:
            com.google.protobuf.UnknownFieldSchema r2 = r0.f32243o
            int r1 = r15.w(r2, r1)
            int r5 = r5 + r1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.v(java.lang.Object):int");
    }

    public final void v0(UnknownFieldSchema unknownFieldSchema, Object obj, Writer writer) {
        unknownFieldSchema.t(unknownFieldSchema.g(obj), writer);
    }

    public final int w(UnknownFieldSchema unknownFieldSchema, Object obj) {
        return unknownFieldSchema.h(unknownFieldSchema.g(obj));
    }

    public final boolean z(Object obj, int i2) {
        int c0 = c0(i2);
        long j2 = (long) (1048575 & c0);
        if (j2 == 1048575) {
            int p0 = p0(i2);
            long V = V(p0);
            switch (o0(p0)) {
                case 0:
                    return Double.doubleToRawLongBits(UnsafeUtil.B(obj, V)) != 0;
                case 1:
                    return Float.floatToRawIntBits(UnsafeUtil.C(obj, V)) != 0;
                case 2:
                    return UnsafeUtil.F(obj, V) != 0;
                case 3:
                    return UnsafeUtil.F(obj, V) != 0;
                case 4:
                    return UnsafeUtil.D(obj, V) != 0;
                case 5:
                    return UnsafeUtil.F(obj, V) != 0;
                case 6:
                    return UnsafeUtil.D(obj, V) != 0;
                case 7:
                    return UnsafeUtil.u(obj, V);
                case 8:
                    Object H = UnsafeUtil.H(obj, V);
                    if (H instanceof String) {
                        return !((String) H).isEmpty();
                    }
                    if (H instanceof ByteString) {
                        return !ByteString.f31983A.equals(H);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return UnsafeUtil.H(obj, V) != null;
                case 10:
                    return !ByteString.f31983A.equals(UnsafeUtil.H(obj, V));
                case 11:
                    return UnsafeUtil.D(obj, V) != 0;
                case 12:
                    return UnsafeUtil.D(obj, V) != 0;
                case 13:
                    return UnsafeUtil.D(obj, V) != 0;
                case 14:
                    return UnsafeUtil.F(obj, V) != 0;
                case 15:
                    return UnsafeUtil.D(obj, V) != 0;
                case 16:
                    return UnsafeUtil.F(obj, V) != 0;
                case 17:
                    return UnsafeUtil.H(obj, V) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            return (UnsafeUtil.D(obj, j2) & (1 << (c0 >>> 20))) != 0;
        }
    }
}
