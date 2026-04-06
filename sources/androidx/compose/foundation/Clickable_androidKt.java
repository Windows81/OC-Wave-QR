package androidx.compose.foundation;

import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import kotlin.Metadata;

@Metadata
public final class Clickable_androidKt {

    /* renamed from: a  reason: collision with root package name */
    public static final long f3032a = ((long) ViewConfiguration.getTapTimeout());

    public static final long a() {
        return f3032a;
    }

    public static final boolean b(DelegatableNode delegatableNode) {
        return c(DelegatableNode_androidKt.a(delegatableNode));
    }

    public static final boolean c(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }
}
