package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class FocusOwnerImpl$takeFocus$1 extends Lambda implements Function1<FocusTargetNode, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f15781z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FocusOwnerImpl$takeFocus$1(int i2) {
        super(1);
        this.f15781z = i2;
    }

    /* renamed from: b */
    public final Boolean invoke(FocusTargetNode focusTargetNode) {
        return Boolean.valueOf(focusTargetNode.c0(this.f15781z));
    }
}
