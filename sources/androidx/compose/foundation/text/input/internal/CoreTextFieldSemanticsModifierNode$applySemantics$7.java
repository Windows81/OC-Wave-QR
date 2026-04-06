package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.CoreTextFieldKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CoreTextFieldSemanticsModifierNode$applySemantics$7 extends Lambda implements Function0<Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CoreTextFieldSemanticsModifierNode f6154z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldSemanticsModifierNode$applySemantics$7(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode) {
        super(0);
        this.f6154z = coreTextFieldSemanticsModifierNode;
    }

    /* renamed from: b */
    public final Boolean invoke() {
        CoreTextFieldKt.q(this.f6154z.l3(), this.f6154z.d1(), !this.f6154z.k3());
        return Boolean.TRUE;
    }
}
