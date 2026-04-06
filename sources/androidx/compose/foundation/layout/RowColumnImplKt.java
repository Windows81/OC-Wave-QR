package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;

@Metadata
public final class RowColumnImplKt {
    public static final CrossAxisAlignment a(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.a();
        }
        return null;
    }

    public static final boolean b(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.b();
        }
        return true;
    }

    public static final RowColumnParentData c(IntrinsicMeasurable intrinsicMeasurable) {
        Object t2 = intrinsicMeasurable.t();
        if (t2 instanceof RowColumnParentData) {
            return (RowColumnParentData) t2;
        }
        return null;
    }

    public static final RowColumnParentData d(Placeable placeable) {
        Object t2 = placeable.t();
        if (t2 instanceof RowColumnParentData) {
            return (RowColumnParentData) t2;
        }
        return null;
    }

    public static final float e(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.d();
        }
        return 0.0f;
    }

    public static final boolean f(RowColumnParentData rowColumnParentData) {
        CrossAxisAlignment a2 = a(rowColumnParentData);
        if (a2 != null) {
            return a2.c();
        }
        return false;
    }
}
