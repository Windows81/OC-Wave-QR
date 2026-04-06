package androidx.customview.widget;

import android.graphics.Rect;
import java.util.Comparator;

class FocusStrategy {

    public interface BoundsAdapter<T> {
        void a(Object obj, Rect rect);
    }

    public interface CollectionAdapter<T, V> {
    }

    public static class SequentialComparator<T> implements Comparator<T> {

        /* renamed from: A  reason: collision with root package name */
        public final Rect f20504A;

        /* renamed from: B  reason: collision with root package name */
        public final boolean f20505B;
        public final BoundsAdapter C;

        /* renamed from: z  reason: collision with root package name */
        public final Rect f20506z;

        public int compare(Object obj, Object obj2) {
            Rect rect = this.f20506z;
            Rect rect2 = this.f20504A;
            this.C.a(obj, rect);
            this.C.a(obj2, rect2);
            int i2 = rect.top;
            int i3 = rect2.top;
            if (i2 < i3) {
                return -1;
            }
            if (i2 > i3) {
                return 1;
            }
            int i4 = rect.left;
            int i5 = rect2.left;
            if (i4 < i5) {
                return this.f20505B ? 1 : -1;
            }
            if (i4 > i5) {
                return this.f20505B ? -1 : 1;
            }
            int i6 = rect.bottom;
            int i7 = rect2.bottom;
            if (i6 < i7) {
                return -1;
            }
            if (i6 > i7) {
                return 1;
            }
            int i8 = rect.right;
            int i9 = rect2.right;
            if (i8 < i9) {
                return this.f20505B ? 1 : -1;
            }
            if (i8 > i9) {
                return this.f20505B ? -1 : 1;
            }
            return 0;
        }
    }
}
