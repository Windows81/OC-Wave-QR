package androidx.compose.foundation;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ScrollingLayoutElement extends ModifierNodeElement<ScrollNode> {

    /* renamed from: A  reason: collision with root package name */
    public final boolean f3183A;

    /* renamed from: B  reason: collision with root package name */
    public final boolean f3184B;

    /* renamed from: z  reason: collision with root package name */
    public final ScrollState f3185z;

    public ScrollingLayoutElement(ScrollState scrollState, boolean z2, boolean z3) {
        this.f3185z = scrollState;
        this.f3183A = z2;
        this.f3184B = z3;
    }

    /* renamed from: c */
    public ScrollNode a() {
        return new ScrollNode(this.f3185z, this.f3183A, this.f3184B);
    }

    /* renamed from: d */
    public void b(ScrollNode scrollNode) {
        scrollNode.d3(this.f3185z);
        scrollNode.c3(this.f3183A);
        scrollNode.e3(this.f3184B);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        return Intrinsics.d(this.f3185z, scrollingLayoutElement.f3185z) && this.f3183A == scrollingLayoutElement.f3183A && this.f3184B == scrollingLayoutElement.f3184B;
    }

    public int hashCode() {
        return (((this.f3185z.hashCode() * 31) + Boolean.hashCode(this.f3183A)) * 31) + Boolean.hashCode(this.f3184B);
    }
}
