package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CombinedClickableNode$applyAdditionalSemantics$1 extends Lambda implements Function0<Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CombinedClickableNode f3039z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CombinedClickableNode$applyAdditionalSemantics$1(CombinedClickableNode combinedClickableNode) {
        super(0);
        this.f3039z = combinedClickableNode;
    }

    /* renamed from: b */
    public final Boolean invoke() {
        Function0 F3 = this.f3039z.j0;
        if (F3 != null) {
            F3.invoke();
        }
        return Boolean.TRUE;
    }
}
