package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class EnterExitTransitionElement extends ModifierNodeElement<EnterExitTransitionModifierNode> {

    /* renamed from: A  reason: collision with root package name */
    public Transition.DeferredAnimation f2211A;

    /* renamed from: B  reason: collision with root package name */
    public Transition.DeferredAnimation f2212B;
    public Transition.DeferredAnimation C;
    public EnterTransition D;
    public ExitTransition E;
    public Function0 F;
    public GraphicsLayerBlockForEnterExit G;

    /* renamed from: z  reason: collision with root package name */
    public final Transition f2213z;

    public EnterExitTransitionElement(Transition transition, Transition.DeferredAnimation deferredAnimation, Transition.DeferredAnimation deferredAnimation2, Transition.DeferredAnimation deferredAnimation3, EnterTransition enterTransition, ExitTransition exitTransition, Function0 function0, GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit) {
        this.f2213z = transition;
        this.f2211A = deferredAnimation;
        this.f2212B = deferredAnimation2;
        this.C = deferredAnimation3;
        this.D = enterTransition;
        this.E = exitTransition;
        this.F = function0;
        this.G = graphicsLayerBlockForEnterExit;
    }

    /* renamed from: c */
    public EnterExitTransitionModifierNode a() {
        return new EnterExitTransitionModifierNode(this.f2213z, this.f2211A, this.f2212B, this.C, this.D, this.E, this.F, this.G);
    }

    /* renamed from: d */
    public void b(EnterExitTransitionModifierNode enterExitTransitionModifierNode) {
        enterExitTransitionModifierNode.k3(this.f2213z);
        enterExitTransitionModifierNode.i3(this.f2211A);
        enterExitTransitionModifierNode.h3(this.f2212B);
        enterExitTransitionModifierNode.j3(this.C);
        enterExitTransitionModifierNode.d3(this.D);
        enterExitTransitionModifierNode.e3(this.E);
        enterExitTransitionModifierNode.c3(this.F);
        enterExitTransitionModifierNode.f3(this.G);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        return Intrinsics.d(this.f2213z, enterExitTransitionElement.f2213z) && Intrinsics.d(this.f2211A, enterExitTransitionElement.f2211A) && Intrinsics.d(this.f2212B, enterExitTransitionElement.f2212B) && Intrinsics.d(this.C, enterExitTransitionElement.C) && Intrinsics.d(this.D, enterExitTransitionElement.D) && Intrinsics.d(this.E, enterExitTransitionElement.E) && Intrinsics.d(this.F, enterExitTransitionElement.F) && Intrinsics.d(this.G, enterExitTransitionElement.G);
    }

    public int hashCode() {
        int hashCode = this.f2213z.hashCode() * 31;
        Transition.DeferredAnimation deferredAnimation = this.f2211A;
        int i2 = 0;
        int hashCode2 = (hashCode + (deferredAnimation == null ? 0 : deferredAnimation.hashCode())) * 31;
        Transition.DeferredAnimation deferredAnimation2 = this.f2212B;
        int hashCode3 = (hashCode2 + (deferredAnimation2 == null ? 0 : deferredAnimation2.hashCode())) * 31;
        Transition.DeferredAnimation deferredAnimation3 = this.C;
        if (deferredAnimation3 != null) {
            i2 = deferredAnimation3.hashCode();
        }
        return ((((((((hashCode3 + i2) * 31) + this.D.hashCode()) * 31) + this.E.hashCode()) * 31) + this.F.hashCode()) * 31) + this.G.hashCode();
    }

    public String toString() {
        return "EnterExitTransitionElement(transition=" + this.f2213z + ", sizeAnimation=" + this.f2211A + ", offsetAnimation=" + this.f2212B + ", slideAnimation=" + this.C + ", enter=" + this.D + ", exit=" + this.E + ", isEnabled=" + this.F + ", graphicsLayerBlock=" + this.G + ')';
    }
}
