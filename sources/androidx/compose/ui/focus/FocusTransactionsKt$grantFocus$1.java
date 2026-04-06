package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class FocusTransactionsKt$grantFocus$1 extends Lambda implements Function0<Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FocusTargetNode f15830z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FocusTransactionsKt$grantFocus$1(FocusTargetNode focusTargetNode) {
        super(0);
        this.f15830z = focusTargetNode;
    }

    public final void invoke() {
        this.f15830z.g3();
    }
}
