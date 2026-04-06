package androidx.compose.ui.text.android.selection;

import kotlin.Metadata;

@Metadata
public abstract class GraphemeClusterSegmentFinder implements SegmentFinder {
    public int a(int i2) {
        int e2 = e(i2);
        if (e2 == -1) {
            return -1;
        }
        if (e(e2) == -1) {
            return -1;
        }
        return e2;
    }

    public int b(int i2) {
        int f2 = f(i2);
        if (f2 == -1) {
            return -1;
        }
        if (f(f2) == -1) {
            return -1;
        }
        return f2;
    }

    public int c(int i2) {
        return f(i2);
    }

    public int d(int i2) {
        return e(i2);
    }

    public abstract int e(int i2);

    public abstract int f(int i2);
}
