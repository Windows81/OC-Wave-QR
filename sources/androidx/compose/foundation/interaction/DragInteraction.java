package androidx.compose.foundation.interaction;

import kotlin.Metadata;

@Metadata
public interface DragInteraction extends Interaction {

    @Metadata
    public static final class Cancel implements DragInteraction {

        /* renamed from: a  reason: collision with root package name */
        public final Start f3679a;

        public Cancel(Start start) {
            this.f3679a = start;
        }

        public final Start a() {
            return this.f3679a;
        }
    }

    @Metadata
    public static final class Start implements DragInteraction {
    }

    @Metadata
    public static final class Stop implements DragInteraction {

        /* renamed from: a  reason: collision with root package name */
        public final Start f3680a;

        public Stop(Start start) {
            this.f3680a = start;
        }

        public final Start a() {
            return this.f3680a;
        }
    }
}
