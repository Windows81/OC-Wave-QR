package androidx.compose.foundation.interaction;

import kotlin.Metadata;

@Metadata
public interface FocusInteraction extends Interaction {

    @Metadata
    public static final class Focus implements FocusInteraction {
    }

    @Metadata
    public static final class Unfocus implements FocusInteraction {

        /* renamed from: a  reason: collision with root package name */
        public final Focus f3683a;

        public Unfocus(Focus focus) {
            this.f3683a = focus;
        }

        public final Focus a() {
            return this.f3683a;
        }
    }
}
