package androidx.compose.ui.platform;

import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidComposeView$getFocusedRect$1 extends Lambda implements Function1<FocusTargetNode, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public static final AndroidComposeView$getFocusedRect$1 f17508z = new AndroidComposeView$getFocusedRect$1();

    public AndroidComposeView$getFocusedRect$1() {
        super(1);
    }

    /* renamed from: b */
    public final Boolean invoke(FocusTargetNode focusTargetNode) {
        return Boolean.TRUE;
    }
}
