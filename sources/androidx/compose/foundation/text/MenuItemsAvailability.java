package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class MenuItemsAvailability {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f5856b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f5857c = c(0);

    /* renamed from: a  reason: collision with root package name */
    public final int f5858a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return MenuItemsAvailability.f5857c;
        }

        public Companion() {
        }
    }

    public /* synthetic */ MenuItemsAvailability(int i2) {
        this.f5858a = i2;
    }

    public static final /* synthetic */ MenuItemsAvailability b(int i2) {
        return new MenuItemsAvailability(i2);
    }

    public static int c(int i2) {
        return i2;
    }

    public static int d(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        char c2 = 0;
        boolean z7 = z2 | (z3 ? (char) 2 : 0) | (z4 ? (char) 4 : 0) | (z5 ? (char) 8 : 0);
        if (z6) {
            c2 = 16;
        }
        return c(z7 | c2 ? 1 : 0);
    }

    public static boolean e(int i2, Object obj) {
        return (obj instanceof MenuItemsAvailability) && i2 == ((MenuItemsAvailability) obj).m();
    }

    public static final boolean f(int i2) {
        return (i2 & 16) == 16;
    }

    public static final boolean g(int i2) {
        return (i2 & 1) == 1;
    }

    public static final boolean h(int i2) {
        return (i2 & 4) == 4;
    }

    public static final boolean i(int i2) {
        return (i2 & 2) == 2;
    }

    public static final boolean j(int i2) {
        return (i2 & 8) == 8;
    }

    public static int k(int i2) {
        return Integer.hashCode(i2);
    }

    public static String l(int i2) {
        return "MenuItemsAvailability(value=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f5858a, obj);
    }

    public int hashCode() {
        return k(this.f5858a);
    }

    public final /* synthetic */ int m() {
        return this.f5858a;
    }

    public String toString() {
        return l(this.f5858a);
    }
}
