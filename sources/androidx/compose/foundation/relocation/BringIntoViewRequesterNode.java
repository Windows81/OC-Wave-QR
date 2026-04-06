package androidx.compose.foundation.relocation;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class BringIntoViewRequesterNode extends Modifier.Node {
    public BringIntoViewRequester N;
    public final boolean O;

    public BringIntoViewRequesterNode(BringIntoViewRequester bringIntoViewRequester) {
        this.N = bringIntoViewRequester;
    }

    public boolean D2() {
        return this.O;
    }

    public void I2() {
        a3(this.N);
    }

    public void J2() {
        Z2();
    }

    public final void Z2() {
        BringIntoViewRequester bringIntoViewRequester = this.N;
        if (bringIntoViewRequester instanceof BringIntoViewRequesterImpl) {
            Intrinsics.g(bringIntoViewRequester, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((BringIntoViewRequesterImpl) bringIntoViewRequester).b().v(this);
        }
    }

    public final void a3(BringIntoViewRequester bringIntoViewRequester) {
        Z2();
        if (bringIntoViewRequester instanceof BringIntoViewRequesterImpl) {
            ((BringIntoViewRequesterImpl) bringIntoViewRequester).b().d(this);
        }
        this.N = bringIntoViewRequester;
    }
}
