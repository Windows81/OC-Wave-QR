package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class FocusFinderCompat_androidKt {
    public static final View b(View view, View view2, Function1 function1) {
        View view3 = null;
        while (true) {
            View c2 = c(view2, function1, view3);
            if (c2 != null || view2 == view) {
                return c2;
            }
            ViewParent parent = view2.getParent();
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            View view4 = (View) parent;
            view3 = view2;
            view2 = view4;
        }
        return null;
    }

    public static final View c(View view, Function1 function1, View view2) {
        View c2;
        if (((Boolean) function1.invoke(view)).booleanValue()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt != view2 && (c2 = c(childAt, function1, view2)) != null) {
                return c2;
            }
        }
        return null;
    }

    public static final View d(View view, View view2, int i2) {
        return b(view, view2, new FocusFinderCompat_androidKt$findViewInsideOutShouldExist$1(i2));
    }
}
