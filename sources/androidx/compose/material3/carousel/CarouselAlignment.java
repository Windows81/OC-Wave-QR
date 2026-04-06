package androidx.compose.material3.carousel;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class CarouselAlignment {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f11900b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f11901c = a(-1);

    /* renamed from: d  reason: collision with root package name */
    public static final int f11902d = a(0);

    /* renamed from: e  reason: collision with root package name */
    public static final int f11903e = a(1);

    /* renamed from: a  reason: collision with root package name */
    public final int f11904a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public static int a(int i2) {
        return i2;
    }

    public static boolean b(int i2, Object obj) {
        return (obj instanceof CarouselAlignment) && i2 == ((CarouselAlignment) obj).e();
    }

    public static int c(int i2) {
        return Integer.hashCode(i2);
    }

    public static String d(int i2) {
        return "CarouselAlignment(value=" + i2 + ')';
    }

    public final /* synthetic */ int e() {
        return this.f11904a;
    }

    public boolean equals(Object obj) {
        return b(this.f11904a, obj);
    }

    public int hashCode() {
        return c(this.f11904a);
    }

    public String toString() {
        return d(this.f11904a);
    }
}
