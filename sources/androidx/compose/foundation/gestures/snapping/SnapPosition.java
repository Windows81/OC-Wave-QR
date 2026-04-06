package androidx.compose.foundation.gestures.snapping;

import kotlin.Metadata;

@Metadata
public interface SnapPosition {

    @Metadata
    public static final class Center implements SnapPosition {

        /* renamed from: a  reason: collision with root package name */
        public static final Center f3675a = new Center();

        public int a(int i2, int i3, int i4, int i5, int i6, int i7) {
            return (((i2 - i4) - i5) / 2) - (i3 / 2);
        }

        public String toString() {
            return "Center";
        }
    }

    @Metadata
    public static final class End implements SnapPosition {

        /* renamed from: a  reason: collision with root package name */
        public static final End f3676a = new End();

        public int a(int i2, int i3, int i4, int i5, int i6, int i7) {
            return ((i2 - i4) - i5) - i3;
        }

        public String toString() {
            return "End";
        }
    }

    @Metadata
    public static final class Start implements SnapPosition {

        /* renamed from: a  reason: collision with root package name */
        public static final Start f3677a = new Start();

        public int a(int i2, int i3, int i4, int i5, int i6, int i7) {
            return 0;
        }

        public String toString() {
            return "Start";
        }
    }

    int a(int i2, int i3, int i4, int i5, int i6, int i7);
}
