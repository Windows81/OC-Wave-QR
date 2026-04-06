package androidx.compose.ui.platform;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;

@Metadata
public final class AndroidComposeView$bringIntoViewNode$1 extends ModifierNodeElement<BringIntoViewOnScreenResponderNode> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f17503z;

    public AndroidComposeView$bringIntoViewNode$1(AndroidComposeView androidComposeView) {
        this.f17503z = androidComposeView;
    }

    /* renamed from: c */
    public BringIntoViewOnScreenResponderNode a() {
        return new BringIntoViewOnScreenResponderNode(this.f17503z);
    }

    /* renamed from: d */
    public void b(BringIntoViewOnScreenResponderNode bringIntoViewOnScreenResponderNode) {
        bringIntoViewOnScreenResponderNode.Z2(this.f17503z);
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return this.f17503z.hashCode();
    }
}
