package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager;
import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager_androidKt;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class HandwritingHandlerNode$composeImm$2 extends Lambda implements Function0<ComposeInputMethodManager> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ HandwritingHandlerNode f6045z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandwritingHandlerNode$composeImm$2(HandwritingHandlerNode handwritingHandlerNode) {
        super(0);
        this.f6045z = handwritingHandlerNode;
    }

    /* renamed from: b */
    public final ComposeInputMethodManager invoke() {
        return ComposeInputMethodManager_androidKt.a(DelegatableNode_androidKt.a(this.f6045z));
    }
}
