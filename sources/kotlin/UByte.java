package kotlin;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@JvmInline
@Metadata
public final class UByte implements Comparable<UByte> {

    /* renamed from: A  reason: collision with root package name */
    public static final Companion f40531A = new Companion((DefaultConstructorMarker) null);

    /* renamed from: z  reason: collision with root package name */
    public final byte f40532z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public /* synthetic */ UByte(byte b2) {
        this.f40532z = b2;
    }

    public static final /* synthetic */ UByte d(byte b2) {
        return new UByte(b2);
    }

    public static byte f(byte b2) {
        return b2;
    }

    public static boolean h(byte b2, Object obj) {
        return (obj instanceof UByte) && b2 == ((UByte) obj).l();
    }

    public static int j(byte b2) {
        return Byte.hashCode(b2);
    }

    public static String k(byte b2) {
        return String.valueOf(b2 & 255);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Intrinsics.k(l() & 255, ((UByte) obj).l() & 255);
    }

    public boolean equals(Object obj) {
        return h(this.f40532z, obj);
    }

    public int hashCode() {
        return j(this.f40532z);
    }

    public final /* synthetic */ byte l() {
        return this.f40532z;
    }

    public String toString() {
        return k(this.f40532z);
    }
}
