package androidx.compose.ui.platform;

import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidComposeView$requestFocus$1 extends Lambda implements Function1<FocusTargetNode, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f17520z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$requestFocus$1(int i2) {
        super(1);
        this.f17520z = i2;
    }

    /* renamed from: b */
    public final Boolean invoke(FocusTargetNode focusTargetNode) {
        return Boolean.valueOf(focusTargetNode.c0(this.f17520z));
    }
}
