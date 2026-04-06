package androidx.compose.material3.internal;

import kotlin.Metadata;

@Metadata
public interface BackEventProgress {

    @Metadata
    public static final class Completed implements BackEventProgress {

        /* renamed from: a  reason: collision with root package name */
        public static final Completed f12151a = new Completed();
    }

    @Metadata
    public static final class InProgress implements BackEventProgress {

        /* renamed from: a  reason: collision with root package name */
        public final float f12152a;

        /* renamed from: b  reason: collision with root package name */
        public final float f12153b;

        /* renamed from: c  reason: collision with root package name */
        public final float f12154c;

        /* renamed from: d  reason: collision with root package name */
        public final SwipeEdge f12155d;

        public InProgress(float f2, float f3, float f4, SwipeEdge swipeEdge) {
            this.f12152a = f2;
            this.f12153b = f3;
            this.f12154c = f4;
            this.f12155d = swipeEdge;
        }

        public final float a() {
            return this.f12154c;
        }

        public final SwipeEdge b() {
            return this.f12155d;
        }

        public final float c() {
            return this.f12153b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InProgress)) {
                return false;
            }
            InProgress inProgress = (InProgress) obj;
            return Float.compare(this.f12152a, inProgress.f12152a) == 0 && Float.compare(this.f12153b, inProgress.f12153b) == 0 && Float.compare(this.f12154c, inProgress.f12154c) == 0 && this.f12155d == inProgress.f12155d;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f12152a) * 31) + Float.hashCode(this.f12153b)) * 31) + Float.hashCode(this.f12154c)) * 31) + this.f12155d.hashCode();
        }

        public String toString() {
            return "InProgress(touchX=" + this.f12152a + ", touchY=" + this.f12153b + ", progress=" + this.f12154c + ", swipeEdge=" + this.f12155d + ')';
        }
    }

    @Metadata
    public static final class NotRunning implements BackEventProgress {

        /* renamed from: a  reason: collision with root package name */
        public static final NotRunning f12156a = new NotRunning();
    }
}
