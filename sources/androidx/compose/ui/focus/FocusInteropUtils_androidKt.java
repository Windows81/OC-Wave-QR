package androidx.compose.ui.focus;

import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusInteropUtils;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

@Metadata
public final class FocusInteropUtils_androidKt {
    public static final Rect a(View view, View view2) {
        FocusInteropUtils.Companion companion = FocusInteropUtils.f15741a;
        view.getLocationInWindow(companion.a());
        int i2 = companion.a()[0];
        int i3 = companion.a()[1];
        view2.getLocationInWindow(companion.a());
        float f2 = (float) (i2 - companion.a()[0]);
        float f3 = (float) (i3 - companion.a()[1]);
        return new Rect(f2, f3, ((float) view.getWidth()) + f2, ((float) view.getHeight()) + f3);
    }

    public static final boolean b(View view, Integer num, android.graphics.Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !view.hasFocus()) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (view instanceof AndroidComposeView) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return findNextFocusFromRect != null ? findNextFocusFromRect.requestFocus(num.intValue(), rect) : view.requestFocus(num.intValue(), rect);
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, view.hasFocus() ? view.findFocus() : null, num.intValue());
        return findNextFocus != null ? findNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    public static final Integer c(int i2) {
        FocusDirection.Companion companion = FocusDirection.f15729b;
        if (FocusDirection.l(i2, companion.h())) {
            return 33;
        }
        if (FocusDirection.l(i2, companion.a())) {
            return 130;
        }
        if (FocusDirection.l(i2, companion.d())) {
            return 17;
        }
        if (FocusDirection.l(i2, companion.g())) {
            return 66;
        }
        if (FocusDirection.l(i2, companion.e())) {
            return 2;
        }
        return FocusDirection.l(i2, companion.f()) ? 1 : null;
    }

    public static final FocusDirection d(int i2) {
        if (i2 == 1) {
            return FocusDirection.i(FocusDirection.f15729b.f());
        }
        if (i2 == 2) {
            return FocusDirection.i(FocusDirection.f15729b.e());
        }
        if (i2 == 17) {
            return FocusDirection.i(FocusDirection.f15729b.d());
        }
        if (i2 == 33) {
            return FocusDirection.i(FocusDirection.f15729b.h());
        }
        if (i2 == 66) {
            return FocusDirection.i(FocusDirection.f15729b.g());
        }
        if (i2 != 130) {
            return null;
        }
        return FocusDirection.i(FocusDirection.f15729b.a());
    }

    public static final LayoutDirection e(int i2) {
        if (i2 == 0) {
            return LayoutDirection.Ltr;
        }
        if (i2 != 1) {
            return null;
        }
        return LayoutDirection.Rtl;
    }
}
