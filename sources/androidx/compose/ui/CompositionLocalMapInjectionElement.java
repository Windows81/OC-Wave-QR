package androidx.compose.ui;

import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CompositionLocalMapInjectionElement extends ModifierNodeElement<CompositionLocalMapInjectionNode> {

    /* renamed from: z  reason: collision with root package name */
    public final CompositionLocalMap f15484z;

    public CompositionLocalMapInjectionElement(CompositionLocalMap compositionLocalMap) {
        this.f15484z = compositionLocalMap;
    }

    /* renamed from: c */
    public CompositionLocalMapInjectionNode a() {
        return new CompositionLocalMapInjectionNode(this.f15484z);
    }

    /* renamed from: d */
    public void b(CompositionLocalMapInjectionNode compositionLocalMapInjectionNode) {
        compositionLocalMapInjectionNode.Z2(this.f15484z);
    }

    public boolean equals(Object obj) {
        return (obj instanceof CompositionLocalMapInjectionElement) && Intrinsics.d(((CompositionLocalMapInjectionElement) obj).f15484z, this.f15484z);
    }

    public int hashCode() {
        return this.f15484z.hashCode();
    }
}
