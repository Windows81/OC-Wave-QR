package com.google.protobuf;

import com.google.protobuf.WireFormat;

public class MapEntryLite<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public final Metadata f32214a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f32215b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f32216c;

    /* renamed from: com.google.protobuf.MapEntryLite$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f32217a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.google.protobuf.WireFormat$FieldType[] r0 = com.google.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f32217a = r0
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f32217a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f32217a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.GROUP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MapEntryLite.AnonymousClass1.<clinit>():void");
        }
    }

    public static class Metadata<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final WireFormat.FieldType f32218a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f32219b;

        /* renamed from: c  reason: collision with root package name */
        public final WireFormat.FieldType f32220c;

        /* renamed from: d  reason: collision with root package name */
        public final Object f32221d;

        public Metadata(WireFormat.FieldType fieldType, Object obj, WireFormat.FieldType fieldType2, Object obj2) {
            this.f32218a = fieldType;
            this.f32219b = obj;
            this.f32220c = fieldType2;
            this.f32221d = obj2;
        }
    }

    public MapEntryLite(WireFormat.FieldType fieldType, Object obj, WireFormat.FieldType fieldType2, Object obj2) {
        this.f32214a = new Metadata(fieldType, obj, fieldType2, obj2);
        this.f32215b = obj;
        this.f32216c = obj2;
    }

    public static int b(Metadata metadata, Object obj, Object obj2) {
        return FieldSet.d(metadata.f32218a, 1, obj) + FieldSet.d(metadata.f32220c, 2, obj2);
    }

    public static MapEntryLite d(WireFormat.FieldType fieldType, Object obj, WireFormat.FieldType fieldType2, Object obj2) {
        return new MapEntryLite(fieldType, obj, fieldType2, obj2);
    }

    public static void e(CodedOutputStream codedOutputStream, Metadata metadata, Object obj, Object obj2) {
        FieldSet.A(codedOutputStream, metadata.f32218a, 1, obj);
        FieldSet.A(codedOutputStream, metadata.f32220c, 2, obj2);
    }

    public int a(int i2, Object obj, Object obj2) {
        return CodedOutputStream.L0(i2) + CodedOutputStream.u0(b(this.f32214a, obj, obj2));
    }

    public Metadata c() {
        return this.f32214a;
    }
}
