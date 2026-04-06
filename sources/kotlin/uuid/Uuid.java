package kotlin.uuid;

import java.io.Serializable;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.HexExtensionsKt;
import kotlin.text.HexFormat;
import kotlin.text.StringsKt;

@Metadata
public final class Uuid implements Serializable {

    /* renamed from: B  reason: collision with root package name */
    public static final Companion f41225B = new Companion((DefaultConstructorMarker) null);
    public static final Uuid C = new Uuid(0, 0);
    public static final Comparator D = new a();

    /* renamed from: A  reason: collision with root package name */
    public final long f41226A;

    /* renamed from: z  reason: collision with root package name */
    public final long f41227z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Uuid a(long j2, long j3) {
            return (j2 == 0 && j3 == 0) ? b() : new Uuid(j2, j3);
        }

        public final Uuid b() {
            return Uuid.C;
        }

        public final Uuid c(String str) {
            String str2 = str;
            Intrinsics.i(str2, "uuidString");
            if (str.length() == 36) {
                long f2 = HexExtensionsKt.f(str, 0, 8, (HexFormat) null, 4, (Object) null);
                UuidKt__UuidKt.c(str2, 8);
                long f3 = HexExtensionsKt.f(str, 9, 13, (HexFormat) null, 4, (Object) null);
                UuidKt__UuidKt.c(str2, 13);
                long f4 = HexExtensionsKt.f(str, 14, 18, (HexFormat) null, 4, (Object) null);
                UuidKt__UuidKt.c(str2, 18);
                long f5 = HexExtensionsKt.f(str, 19, 23, (HexFormat) null, 4, (Object) null);
                UuidKt__UuidKt.c(str2, 23);
                return a((f2 << 32) | (f3 << 16) | f4, HexExtensionsKt.f(str, 24, 36, (HexFormat) null, 4, (Object) null) | (f5 << 48));
            }
            throw new IllegalArgumentException("Expected a 36-char string in the standard uuid format.");
        }

        public Companion() {
        }
    }

    public Uuid(long j2, long j3) {
        this.f41227z = j2;
        this.f41226A = j3;
    }

    public static final int b(Uuid uuid, Uuid uuid2) {
        Intrinsics.i(uuid, "a");
        Intrinsics.i(uuid2, "b");
        long j2 = uuid.f41227z;
        return j2 != uuid2.f41227z ? Long.compareUnsigned(ULong.f(j2), ULong.f(uuid2.f41227z)) : Long.compareUnsigned(ULong.f(uuid.f41226A), ULong.f(uuid2.f41226A));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Uuid)) {
            return false;
        }
        Uuid uuid = (Uuid) obj;
        return this.f41227z == uuid.f41227z && this.f41226A == uuid.f41226A;
    }

    public int hashCode() {
        long j2 = this.f41227z ^ this.f41226A;
        return ((int) j2) ^ ((int) (j2 >> 32));
    }

    public String toString() {
        byte[] bArr = new byte[36];
        UuidKt__UuidKt.d(this.f41226A, bArr, 24, 6);
        bArr[23] = 45;
        UuidKt__UuidKt.d(this.f41226A >>> 48, bArr, 19, 2);
        bArr[18] = 45;
        UuidKt__UuidKt.d(this.f41227z, bArr, 14, 2);
        bArr[13] = 45;
        UuidKt__UuidKt.d(this.f41227z >>> 16, bArr, 9, 2);
        bArr[8] = 45;
        UuidKt__UuidKt.d(this.f41227z >>> 32, bArr, 0, 4);
        return StringsKt.x(bArr);
    }
}
