package androidx.compose.material.ripple;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.DelegatableNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class Ripple_androidKt {
    public static final RippleContainer c(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof RippleContainer) {
                return (RippleContainer) childAt;
            }
        }
        RippleContainer rippleContainer = new RippleContainer(viewGroup.getContext());
        viewGroup.addView(rippleContainer);
        return rippleContainer;
    }

    public static final DelegatableNode d(InteractionSource interactionSource, boolean z2, float f2, ColorProducer colorProducer, Function0 function0) {
        return new AndroidRippleNode(interactionSource, z2, f2, colorProducer, function0, (DefaultConstructorMarker) null);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.view.ViewGroup e(android.view.View r2) {
        /*
        L_0x0000:
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 != 0) goto L_0x0031
            r0 = r2
            android.view.View r0 = (android.view.View) r0
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x0011
            r2 = r0
            goto L_0x0000
        L_0x0011:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Couldn't find a valid parent for "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0031:
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.Ripple_androidKt.e(android.view.View):android.view.ViewGroup");
    }
}
