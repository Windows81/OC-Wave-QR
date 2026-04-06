package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class ArcMode {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f2493b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f2494c = b(5);

    /* renamed from: d  reason: collision with root package name */
    public static final int f2495d = b(4);

    /* renamed from: e  reason: collision with root package name */
    public static final int f2496e = b(0);

    /* renamed from: a  reason: collision with root package name */
    public final int f2497a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return ArcMode.f2496e;
        }

        public Companion() {
        }
    }

    public static int b(int i2) {
        return i2;
    }

    public static boolean c(int i2, Object obj) {
        return (obj instanceof ArcMode) && i2 == ((ArcMode) obj).g();
    }

    public static final boolean d(int i2, int i3) {
        return i2 == i3;
    }

    public static int e(int i2) {
        return Integer.hashCode(i2);
    }

    public static String f(int i2) {
        return "ArcMode(value=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f2497a, obj);
    }

    public final /* synthetic */ int g() {
        return this.f2497a;
    }

    public int hashCode() {
        return e(this.f2497a);
    }

    public String toString() {
        return f(this.f2497a);
    }
}
