package com.google.protobuf;

import com.google.protobuf.Internal;
import java.lang.reflect.Field;

@CheckReturnValue
final class FieldInfo implements Comparable<FieldInfo> {

    /* renamed from: A  reason: collision with root package name */
    public final FieldType f32126A;

    /* renamed from: B  reason: collision with root package name */
    public final Class f32127B;
    public final int C;
    public final Field D;
    public final int E;
    public final boolean F;
    public final boolean G;
    public final OneofInfo H;
    public final Field I;
    public final Class J;
    public final Object K;
    public final Internal.EnumVerifier L;

    /* renamed from: z  reason: collision with root package name */
    public final Field f32128z;

    /* renamed from: com.google.protobuf.FieldInfo$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f32129a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.google.protobuf.FieldType[] r0 = com.google.protobuf.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f32129a = r0
                com.google.protobuf.FieldType r1 = com.google.protobuf.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f32129a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.FieldType r1 = com.google.protobuf.FieldType.GROUP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f32129a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.FieldType r1 = com.google.protobuf.FieldType.MESSAGE_LIST     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f32129a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.FieldType r1 = com.google.protobuf.FieldType.GROUP_LIST     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.FieldInfo.AnonymousClass1.<clinit>():void");
        }
    }

    public static final class Builder {
    }

    /* renamed from: d */
    public int compareTo(FieldInfo fieldInfo) {
        return this.C - fieldInfo.C;
    }

    public Field f() {
        return this.I;
    }

    public Internal.EnumVerifier h() {
        return this.L;
    }

    public Field j() {
        return this.f32128z;
    }

    public int k() {
        return this.C;
    }

    public Object l() {
        return this.K;
    }

    public Class m() {
        int i2 = AnonymousClass1.f32129a[this.f32126A.ordinal()];
        if (i2 == 1 || i2 == 2) {
            Field field = this.f32128z;
            return field != null ? field.getType() : this.J;
        } else if (i2 == 3 || i2 == 4) {
            return this.f32127B;
        } else {
            return null;
        }
    }

    public OneofInfo n() {
        return this.H;
    }

    public Field o() {
        return this.D;
    }

    public int p() {
        return this.E;
    }

    public FieldType r() {
        return this.f32126A;
    }

    public boolean t() {
        return this.G;
    }

    public boolean x() {
        return this.F;
    }
}
