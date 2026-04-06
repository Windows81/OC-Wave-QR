package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public abstract class DragEvent {

    @Metadata
    public static final class DragCancelled extends DragEvent {

        /* renamed from: a  reason: collision with root package name */
        public static final DragCancelled f3456a = new DragCancelled();

        public DragCancelled() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata
    public static final class DragDelta extends DragEvent {

        /* renamed from: a  reason: collision with root package name */
        public final long f3457a;

        public /* synthetic */ DragDelta(long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j2);
        }

        public final long a() {
            return this.f3457a;
        }

        public DragDelta(long j2) {
            super((DefaultConstructorMarker) null);
            this.f3457a = j2;
        }
    }

    @Metadata
    public static final class DragStarted extends DragEvent {

        /* renamed from: a  reason: collision with root package name */
        public final long f3458a;

        public /* synthetic */ DragStarted(long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j2);
        }

        public final long a() {
            return this.f3458a;
        }

        public DragStarted(long j2) {
            super((DefaultConstructorMarker) null);
            this.f3458a = j2;
        }
    }

    @Metadata
    public static final class DragStopped extends DragEvent {

        /* renamed from: a  reason: collision with root package name */
        public final long f3459a;

        public /* synthetic */ DragStopped(long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j2);
        }

        public final long a() {
            return this.f3459a;
        }

        public DragStopped(long j2) {
            super((DefaultConstructorMarker) null);
            this.f3459a = j2;
        }
    }

    public /* synthetic */ DragEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public DragEvent() {
    }
}
