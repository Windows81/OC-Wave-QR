package androidx.compose.ui.unit;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class TextUnitType {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f19181b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final long f19182c = e(0);

    /* renamed from: d  reason: collision with root package name */
    public static final long f19183d = e(4294967296L);

    /* renamed from: e  reason: collision with root package name */
    public static final long f19184e = e(8589934592L);

    /* renamed from: a  reason: collision with root package name */
    public final long f19185a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return TextUnitType.f19184e;
        }

        public final long b() {
            return TextUnitType.f19183d;
        }

        public final long c() {
            return TextUnitType.f19182c;
        }

        public Companion() {
        }
    }

    public /* synthetic */ TextUnitType(long j2) {
        this.f19185a = j2;
    }

    public static final /* synthetic */ TextUnitType d(long j2) {
        return new TextUnitType(j2);
    }

    public static long e(long j2) {
        return j2;
    }

    public static boolean f(long j2, Object obj) {
        return (obj instanceof TextUnitType) && j2 == ((TextUnitType) obj).j();
    }

    public static final boolean g(long j2, long j3) {
        return j2 == j3;
    }

    public static int h(long j2) {
        return Long.hashCode(j2);
    }

    public static String i(long j2) {
        return g(j2, f19182c) ? "Unspecified" : g(j2, f19183d) ? "Sp" : g(j2, f19184e) ? "Em" : "Invalid";
    }

    public boolean equals(Object obj) {
        return f(this.f19185a, obj);
    }

    public int hashCode() {
        return h(this.f19185a);
    }

    public final /* synthetic */ long j() {
        return this.f19185a;
    }

    public String toString() {
        return i(this.f19185a);
    }
}
