package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
abstract class TransformEvent {

    @Metadata
    public static final class TransformDelta extends TransformEvent {

        /* renamed from: a  reason: collision with root package name */
        public final float f3605a;

        /* renamed from: b  reason: collision with root package name */
        public final long f3606b;

        /* renamed from: c  reason: collision with root package name */
        public final float f3607c;

        public /* synthetic */ TransformDelta(float f2, long j2, float f3, DefaultConstructorMarker defaultConstructorMarker) {
            this(f2, j2, f3);
        }

        public final long a() {
            return this.f3606b;
        }

        public final float b() {
            return this.f3607c;
        }

        public final float c() {
            return this.f3605a;
        }

        public TransformDelta(float f2, long j2, float f3) {
            super((DefaultConstructorMarker) null);
            this.f3605a = f2;
            this.f3606b = j2;
            this.f3607c = f3;
        }
    }

    @Metadata
    public static final class TransformStarted extends TransformEvent {

        /* renamed from: a  reason: collision with root package name */
        public static final TransformStarted f3608a = new TransformStarted();

        public TransformStarted() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata
    public static final class TransformStopped extends TransformEvent {

        /* renamed from: a  reason: collision with root package name */
        public static final TransformStopped f3609a = new TransformStopped();

        public TransformStopped() {
            super((DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ TransformEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public TransformEvent() {
    }
}
