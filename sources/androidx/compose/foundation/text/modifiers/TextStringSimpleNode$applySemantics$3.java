package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.modifiers.TextStringSimpleNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextStringSimpleNode$applySemantics$3 extends Lambda implements Function1<Boolean, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextStringSimpleNode f6694z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextStringSimpleNode$applySemantics$3(TextStringSimpleNode textStringSimpleNode) {
        super(1);
        this.f6694z = textStringSimpleNode;
    }

    public final Boolean b(boolean z2) {
        if (this.f6694z.Y == null) {
            return Boolean.FALSE;
        }
        TextStringSimpleNode.TextSubstitutionValue d3 = this.f6694z.Y;
        if (d3 != null) {
            d3.e(z2);
        }
        this.f6694z.l3();
        return Boolean.TRUE;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Boolean) obj).booleanValue());
    }
}
