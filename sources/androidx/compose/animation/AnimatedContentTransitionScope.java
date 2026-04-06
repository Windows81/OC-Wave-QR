package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public interface AnimatedContentTransitionScope<S> extends Transition.Segment<S> {

    @JvmInline
    @Metadata
    public static final class SlideDirection {

        /* renamed from: b  reason: collision with root package name */
        public static final Companion f2053b = new Companion((DefaultConstructorMarker) null);

        /* renamed from: c  reason: collision with root package name */
        public static final int f2054c = a(0);

        /* renamed from: d  reason: collision with root package name */
        public static final int f2055d = a(1);

        /* renamed from: e  reason: collision with root package name */
        public static final int f2056e = a(2);

        /* renamed from: f  reason: collision with root package name */
        public static final int f2057f = a(3);

        /* renamed from: g  reason: collision with root package name */
        public static final int f2058g = a(4);

        /* renamed from: h  reason: collision with root package name */
        public static final int f2059h = a(5);

        /* renamed from: a  reason: collision with root package name */
        public final int f2060a;

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
            return (obj instanceof SlideDirection) && i2 == ((SlideDirection) obj).f();
        }

        public static final boolean c(int i2, int i3) {
            return i2 == i3;
        }

        public static int d(int i2) {
            return Integer.hashCode(i2);
        }

        public static String e(int i2) {
            return c(i2, f2054c) ? "Left" : c(i2, f2055d) ? "Right" : c(i2, f2056e) ? "Up" : c(i2, f2057f) ? "Down" : c(i2, f2058g) ? "Start" : c(i2, f2059h) ? "End" : "Invalid";
        }

        public boolean equals(Object obj) {
            return b(this.f2060a, obj);
        }

        public final /* synthetic */ int f() {
            return this.f2060a;
        }

        public int hashCode() {
            return d(this.f2060a);
        }

        public String toString() {
            return e(this.f2060a);
        }
    }

    ContentTransform a(ContentTransform contentTransform, SizeTransform sizeTransform);
}
