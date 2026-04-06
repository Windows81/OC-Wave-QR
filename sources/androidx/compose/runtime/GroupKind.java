package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
final class GroupKind {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f14669b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f14670c = d(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f14671d = d(1);

    /* renamed from: e  reason: collision with root package name */
    public static final int f14672e = d(2);

    /* renamed from: a  reason: collision with root package name */
    public final int f14673a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return GroupKind.f14670c;
        }

        public final int b() {
            return GroupKind.f14671d;
        }

        public final int c() {
            return GroupKind.f14672e;
        }

        public Companion() {
        }
    }

    public static int d(int i2) {
        return i2;
    }

    public static boolean e(int i2, Object obj) {
        return (obj instanceof GroupKind) && i2 == ((GroupKind) obj).h();
    }

    public static int f(int i2) {
        return Integer.hashCode(i2);
    }

    public static String g(int i2) {
        return "GroupKind(value=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f14673a, obj);
    }

    public final /* synthetic */ int h() {
        return this.f14673a;
    }

    public int hashCode() {
        return f(this.f14673a);
    }

    public String toString() {
        return g(this.f14673a);
    }
}
