package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class StartOffsetType {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f2683b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f2684c = b(-1);

    /* renamed from: d  reason: collision with root package name */
    public static final int f2685d = b(1);

    /* renamed from: a  reason: collision with root package name */
    public final int f2686a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return StartOffsetType.f2684c;
        }

        public Companion() {
        }
    }

    public static int b(int i2) {
        return i2;
    }

    public static boolean c(int i2, Object obj) {
        return (obj instanceof StartOffsetType) && i2 == ((StartOffsetType) obj).f();
    }

    public static int d(int i2) {
        return Integer.hashCode(i2);
    }

    public static String e(int i2) {
        return "StartOffsetType(value=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f2686a, obj);
    }

    public final /* synthetic */ int f() {
        return this.f2686a;
    }

    public int hashCode() {
        return d(this.f2686a);
    }

    public String toString() {
        return e(this.f2686a);
    }
}
