package androidx.compose.ui.viewinterop;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusModifierKt;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.node.DelegatableNodeKt;
import kotlin.Metadata;

@Metadata
public final class FocusGroupNode_androidKt {
    public static final boolean d(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    public static final Modifier e(Modifier modifier) {
        return FocusModifierKt.a(FocusModifierKt.a(modifier.o0(FocusGroupPropertiesElement.f19249z)).o0(FocusTargetPropertiesElement.f19252z));
    }

    public static final Rect f(FocusOwner focusOwner, View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        androidx.compose.ui.geometry.Rect n2 = focusOwner.n();
        if (n2 == null) {
            return null;
        }
        return new Rect((((int) n2.o()) + iArr[0]) - iArr2[0], (((int) n2.r()) + iArr[1]) - iArr2[1], (((int) n2.p()) + iArr[0]) - iArr2[0], (((int) n2.i()) + iArr[1]) - iArr2[1]);
    }

    public static final View g(Modifier.Node node) {
        View X = DelegatableNodeKt.o(node.M()).X();
        if (X != null) {
            return X;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }
}
