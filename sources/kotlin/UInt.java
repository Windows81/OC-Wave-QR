package kotlin;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@JvmInline
@Metadata
public final class UInt implements Comparable<UInt> {

    /* renamed from: A  reason: collision with root package name */
    public static final Companion f40536A = new Companion((DefaultConstructorMarker) null);

    /* renamed from: z  reason: collision with root package name */
    public final int f40537z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public /* synthetic */ UInt(int i2) {
        this.f40537z = i2;
    }

    public static final /* synthetic */ UInt d(int i2) {
        return new UInt(i2);
    }

    public static int f(int i2) {
        return i2;
    }

    public static boolean h(int i2, Object obj) {
        return (obj instanceof UInt) && i2 == ((UInt) obj).l();
    }

    public static int j(int i2) {
        return Integer.hashCode(i2);
    }

    public static String k(int i2) {
        return String.valueOf(((long) i2) & 4294967295L);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return UnsignedKt.a(l(), ((UInt) obj).l());
    }

    public boolean equals(Object obj) {
        return h(this.f40537z, obj);
    }

    public int hashCode() {
        return j(this.f40537z);
    }

    public final /* synthetic */ int l() {
        return this.f40537z;
    }

    public String toString() {
        return k(this.f40537z);
    }
}
