package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class PaddingValuesElement extends ModifierNodeElement<PaddingValuesModifier> {

    /* renamed from: A  reason: collision with root package name */
    public final Function1 f4125A;

    /* renamed from: z  reason: collision with root package name */
    public final PaddingValues f4126z;

    public PaddingValuesElement(PaddingValues paddingValues, Function1 function1) {
        this.f4126z = paddingValues;
        this.f4125A = function1;
    }

    /* renamed from: c */
    public PaddingValuesModifier a() {
        return new PaddingValuesModifier(this.f4126z);
    }

    /* renamed from: d */
    public void b(PaddingValuesModifier paddingValuesModifier) {
        paddingValuesModifier.Z2(this.f4126z);
    }

    public boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return Intrinsics.d(this.f4126z, paddingValuesElement.f4126z);
    }

    public int hashCode() {
        return this.f4126z.hashCode();
    }
}
