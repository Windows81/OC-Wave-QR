package androidx.compose.foundation.interaction;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public interface PressInteraction extends Interaction {

    @Metadata
    public static final class Cancel implements PressInteraction {

        /* renamed from: a  reason: collision with root package name */
        public final Press f3690a;

        public Cancel(Press press) {
            this.f3690a = press;
        }

        public final Press a() {
            return this.f3690a;
        }
    }

    @Metadata
    public static final class Press implements PressInteraction {

        /* renamed from: a  reason: collision with root package name */
        public final long f3691a;

        public /* synthetic */ Press(long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j2);
        }

        public final long a() {
            return this.f3691a;
        }

        public Press(long j2) {
            this.f3691a = j2;
        }
    }

    @Metadata
    public static final class Release implements PressInteraction {

        /* renamed from: a  reason: collision with root package name */
        public final Press f3692a;

        public Release(Press press) {
            this.f3692a = press;
        }

        public final Press a() {
            return this.f3692a;
        }
    }
}
