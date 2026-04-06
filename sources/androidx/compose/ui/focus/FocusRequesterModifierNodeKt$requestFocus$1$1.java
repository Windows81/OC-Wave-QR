package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class FocusRequesterModifierNodeKt$requestFocus$1$1 extends Lambda implements Function1<FocusTargetNode, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public static final FocusRequesterModifierNodeKt$requestFocus$1$1 f15810z = new FocusRequesterModifierNodeKt$requestFocus$1$1();

    public FocusRequesterModifierNodeKt$requestFocus$1$1() {
        super(1);
    }

    /* renamed from: b */
    public final Boolean invoke(FocusTargetNode focusTargetNode) {
        return Boolean.valueOf(FocusTargetModifierNode.v1(focusTargetNode, 0, 1, (Object) null));
    }
}
