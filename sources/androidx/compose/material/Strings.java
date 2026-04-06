package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class Strings {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f8507b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f8508c = i(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f8509d = i(1);

    /* renamed from: e  reason: collision with root package name */
    public static final int f8510e = i(2);

    /* renamed from: f  reason: collision with root package name */
    public static final int f8511f = i(3);

    /* renamed from: g  reason: collision with root package name */
    public static final int f8512g = i(4);

    /* renamed from: h  reason: collision with root package name */
    public static final int f8513h = i(5);

    /* renamed from: i  reason: collision with root package name */
    public static final int f8514i = i(6);

    /* renamed from: j  reason: collision with root package name */
    public static final int f8515j = i(7);

    /* renamed from: a  reason: collision with root package name */
    public final int f8516a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return Strings.f8509d;
        }

        public final int b() {
            return Strings.f8510e;
        }

        public final int c() {
            return Strings.f8511f;
        }

        public final int d() {
            return Strings.f8512g;
        }

        public final int e() {
            return Strings.f8508c;
        }

        public final int f() {
            return Strings.f8514i;
        }

        public final int g() {
            return Strings.f8513h;
        }

        public final int h() {
            return Strings.f8515j;
        }

        public Companion() {
        }
    }

    public static int i(int i2) {
        return i2;
    }

    public static boolean j(int i2, Object obj) {
        return (obj instanceof Strings) && i2 == ((Strings) obj).n();
    }

    public static final boolean k(int i2, int i3) {
        return i2 == i3;
    }

    public static int l(int i2) {
        return Integer.hashCode(i2);
    }

    public static String m(int i2) {
        return "Strings(value=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return j(this.f8516a, obj);
    }

    public int hashCode() {
        return l(this.f8516a);
    }

    public final /* synthetic */ int n() {
        return this.f8516a;
    }

    public String toString() {
        return m(this.f8516a);
    }
}
