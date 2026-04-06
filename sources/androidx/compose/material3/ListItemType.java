package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@JvmInline
@Metadata
final class ListItemType implements Comparable<ListItemType> {

    /* renamed from: A  reason: collision with root package name */
    public static final Companion f10250A = new Companion((DefaultConstructorMarker) null);

    /* renamed from: B  reason: collision with root package name */
    public static final int f10251B = l(1);
    public static final int C = l(2);
    public static final int D = l(3);

    /* renamed from: z  reason: collision with root package name */
    public final int f10252z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return ListItemType.f10251B;
        }

        public final int b() {
            return ListItemType.D;
        }

        public final int c() {
            return ListItemType.C;
        }

        public final int d(boolean z2, boolean z3, boolean z4) {
            return ((!z2 || !z3) && !z4) ? (z2 || z3) ? c() : a() : b();
        }

        public Companion() {
        }
    }

    public static int k(int i2, int i3) {
        return Intrinsics.k(i2, i3);
    }

    public static int l(int i2) {
        return i2;
    }

    public static boolean m(int i2, Object obj) {
        return (obj instanceof ListItemType) && i2 == ((ListItemType) obj).r();
    }

    public static final boolean n(int i2, int i3) {
        return i2 == i3;
    }

    public static int o(int i2) {
        return Integer.hashCode(i2);
    }

    public static String p(int i2) {
        return "ListItemType(lines=" + i2 + ')';
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return j(((ListItemType) obj).r());
    }

    public boolean equals(Object obj) {
        return m(this.f10252z, obj);
    }

    public int hashCode() {
        return o(this.f10252z);
    }

    public int j(int i2) {
        return k(this.f10252z, i2);
    }

    public final /* synthetic */ int r() {
        return this.f10252z;
    }

    public String toString() {
        return p(this.f10252z);
    }
}
