package kotlin;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@JvmInline
@Metadata
public final class UShort implements Comparable<UShort> {

    /* renamed from: A  reason: collision with root package name */
    public static final Companion f40547A = new Companion((DefaultConstructorMarker) null);

    /* renamed from: z  reason: collision with root package name */
    public final short f40548z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public /* synthetic */ UShort(short s2) {
        this.f40548z = s2;
    }

    public static final /* synthetic */ UShort d(short s2) {
        return new UShort(s2);
    }

    public static short f(short s2) {
        return s2;
    }

    public static boolean h(short s2, Object obj) {
        return (obj instanceof UShort) && s2 == ((UShort) obj).l();
    }

    public static int j(short s2) {
        return Short.hashCode(s2);
    }

    public static String k(short s2) {
        return String.valueOf(s2 & 65535);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Intrinsics.k(l() & 65535, ((UShort) obj).l() & 65535);
    }

    public boolean equals(Object obj) {
        return h(this.f40548z, obj);
    }

    public int hashCode() {
        return j(this.f40548z);
    }

    public final /* synthetic */ short l() {
        return this.f40548z;
    }

    public String toString() {
        return k(this.f40548z);
    }
}
