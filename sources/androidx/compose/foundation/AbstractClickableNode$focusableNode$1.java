package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata
public /* synthetic */ class AbstractClickableNode$focusableNode$1 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    public AbstractClickableNode$focusableNode$1(Object obj) {
        super(1, obj, AbstractClickableNode.class, "onFocusChange", "onFocusChange(Z)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v(((Boolean) obj).booleanValue());
        return Unit.f40552a;
    }

    public final void v(boolean z2) {
        ((AbstractClickableNode) this.f40885A).z3(z2);
    }
}
