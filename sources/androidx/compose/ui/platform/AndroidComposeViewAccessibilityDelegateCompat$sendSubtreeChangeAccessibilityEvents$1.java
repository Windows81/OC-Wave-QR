package androidx.compose.ui.platform;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1 extends Lambda implements Function1<LayoutNode, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public static final AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1 f17569z = new AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1();

    public AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1() {
        super(1);
    }

    /* renamed from: b */
    public final Boolean invoke(LayoutNode layoutNode) {
        SemanticsConfiguration a0 = layoutNode.a0();
        boolean z2 = false;
        if (a0 != null && a0.u()) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }
}
