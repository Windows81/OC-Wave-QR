package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AbstractClickableNode$applySemantics$1 extends Lambda implements Function0<Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AbstractClickableNode f2874z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$applySemantics$1(AbstractClickableNode abstractClickableNode) {
        super(0);
        this.f2874z = abstractClickableNode;
    }

    /* renamed from: b */
    public final Boolean invoke() {
        this.f2874z.t3().invoke();
        return Boolean.TRUE;
    }
}
