package androidx.compose.ui.semantics;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;

@Metadata
public final class EmptySemanticsElement extends ModifierNodeElement<EmptySemanticsModifier> {

    /* renamed from: z  reason: collision with root package name */
    public final EmptySemanticsModifier f18030z;

    public EmptySemanticsElement(EmptySemanticsModifier emptySemanticsModifier) {
        this.f18030z = emptySemanticsModifier;
    }

    /* renamed from: c */
    public EmptySemanticsModifier a() {
        return this.f18030z;
    }

    /* renamed from: d */
    public void b(EmptySemanticsModifier emptySemanticsModifier) {
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return System.identityHashCode(this);
    }
}
