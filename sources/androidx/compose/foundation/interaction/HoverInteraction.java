package androidx.compose.foundation.interaction;

import kotlin.Metadata;

@Metadata
public interface HoverInteraction extends Interaction {

    @Metadata
    public static final class Enter implements HoverInteraction {
    }

    @Metadata
    public static final class Exit implements HoverInteraction {

        /* renamed from: a  reason: collision with root package name */
        public final Enter f3686a;

        public Exit(Enter enter) {
            this.f3686a = enter;
        }

        public final Enter a() {
            return this.f3686a;
        }
    }
}
