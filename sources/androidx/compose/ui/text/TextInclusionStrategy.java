package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;

@Metadata
public interface TextInclusionStrategy {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f18459a = Companion.f18460a;

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f18460a = new Companion();

        /* renamed from: b  reason: collision with root package name */
        public static final TextInclusionStrategy f18461b = new a();

        /* renamed from: c  reason: collision with root package name */
        public static final TextInclusionStrategy f18462c = new b();

        /* renamed from: d  reason: collision with root package name */
        public static final TextInclusionStrategy f18463d = new c();

        public static final boolean d(Rect rect, Rect rect2) {
            return rect.z(rect2);
        }

        public static final boolean e(Rect rect, Rect rect2) {
            return !rect2.y() && rect.o() >= rect2.o() && rect.p() <= rect2.p() && rect.r() >= rect2.r() && rect.i() <= rect2.i();
        }

        public static final boolean f(Rect rect, Rect rect2) {
            return rect2.f(rect.m());
        }

        public final TextInclusionStrategy g() {
            return f18461b;
        }

        public final TextInclusionStrategy h() {
            return f18463d;
        }
    }

    boolean a(Rect rect, Rect rect2);
}
