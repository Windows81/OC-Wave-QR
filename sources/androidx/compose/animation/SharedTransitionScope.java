package androidx.compose.animation;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

@Metadata
public interface SharedTransitionScope extends LookaheadScope {

    @Metadata
    public interface OverlayClip {
        Path a(SharedContentState sharedContentState, Rect rect, LayoutDirection layoutDirection, Density density);
    }

    @Metadata
    public interface PlaceHolderSize {

        @Metadata
        public static final class Companion {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ Companion f2332a = new Companion();

            /* renamed from: b  reason: collision with root package name */
            public static final PlaceHolderSize f2333b = SharedTransitionScope$PlaceHolderSize$Companion$animatedSize$1.f2335a;

            /* renamed from: c  reason: collision with root package name */
            public static final PlaceHolderSize f2334c = SharedTransitionScope$PlaceHolderSize$Companion$contentSize$1.f2336a;
        }

        long a(long j2, long j3);
    }

    @Metadata
    public interface ResizeMode {

        @Metadata
        public static final class Companion {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ Companion f2337a = new Companion();

            /* renamed from: b  reason: collision with root package name */
            public static final ResizeMode f2338b = RemeasureImpl.f2290a;
        }
    }

    @Metadata
    public static final class SharedContentState {

        /* renamed from: a  reason: collision with root package name */
        public final Object f2339a;

        /* renamed from: b  reason: collision with root package name */
        public final MutableState f2340b;

        public final Path a() {
            return d().g();
        }

        public final SharedElementInternalState b() {
            return (SharedElementInternalState) this.f2340b.getValue();
        }

        public final Object c() {
            return this.f2339a;
        }

        public final SharedElementInternalState d() {
            SharedElementInternalState b2 = b();
            if (b2 != null) {
                return b2;
            }
            throw new IllegalArgumentException("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not bee initialized.");
        }

        public final SharedContentState e() {
            SharedElementInternalState l2 = d().l();
            if (l2 != null) {
                return l2.t();
            }
            return null;
        }

        public final boolean f() {
            SharedElement p2;
            SharedElementInternalState b2 = b();
            if (b2 == null || (p2 = b2.p()) == null) {
                return false;
            }
            return p2.d();
        }

        public final void g(SharedElementInternalState sharedElementInternalState) {
            this.f2340b.setValue(sharedElementInternalState);
        }
    }

    boolean q();
}
