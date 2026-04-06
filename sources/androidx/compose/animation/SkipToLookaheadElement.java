package androidx.compose.animation;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SkipToLookaheadElement extends ModifierNodeElement<SkipToLookaheadNode> {

    /* renamed from: A  reason: collision with root package name */
    public final Function0 f2395A;

    /* renamed from: z  reason: collision with root package name */
    public final ScaleToBoundsImpl f2396z;

    public SkipToLookaheadElement(ScaleToBoundsImpl scaleToBoundsImpl, Function0 function0) {
        this.f2396z = scaleToBoundsImpl;
        this.f2395A = function0;
    }

    /* renamed from: c */
    public SkipToLookaheadNode a() {
        return new SkipToLookaheadNode(this.f2396z, this.f2395A);
    }

    /* renamed from: d */
    public void b(SkipToLookaheadNode skipToLookaheadNode) {
        skipToLookaheadNode.d3(this.f2396z);
        skipToLookaheadNode.c3(this.f2395A);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkipToLookaheadElement)) {
            return false;
        }
        SkipToLookaheadElement skipToLookaheadElement = (SkipToLookaheadElement) obj;
        return Intrinsics.d(this.f2396z, skipToLookaheadElement.f2396z) && Intrinsics.d(this.f2395A, skipToLookaheadElement.f2395A);
    }

    public int hashCode() {
        ScaleToBoundsImpl scaleToBoundsImpl = this.f2396z;
        return ((scaleToBoundsImpl == null ? 0 : scaleToBoundsImpl.hashCode()) * 31) + this.f2395A.hashCode();
    }

    public String toString() {
        return "SkipToLookaheadElement(scaleToBounds=" + this.f2396z + ", isEnabled=" + this.f2395A + ')';
    }
}
