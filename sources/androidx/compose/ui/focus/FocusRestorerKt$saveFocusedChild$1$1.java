package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class FocusRestorerKt$saveFocusedChild$1$1 extends Lambda implements Function0<Object> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FocusTargetNode f15812z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FocusRestorerKt$saveFocusedChild$1$1(FocusTargetNode focusTargetNode) {
        super(0);
        this.f15812z = focusTargetNode;
    }

    public final Object invoke() {
        return Integer.valueOf(this.f15812z.k3());
    }
}
