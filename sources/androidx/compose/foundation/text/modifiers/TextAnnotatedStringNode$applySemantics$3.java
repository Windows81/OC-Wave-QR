package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextAnnotatedStringNode$applySemantics$3 extends Lambda implements Function1<Boolean, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextAnnotatedStringNode f6682z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextAnnotatedStringNode$applySemantics$3(TextAnnotatedStringNode textAnnotatedStringNode) {
        super(1);
        this.f6682z = textAnnotatedStringNode;
    }

    public final Boolean b(boolean z2) {
        if (this.f6682z.k3() == null) {
            return Boolean.FALSE;
        }
        Function1 a3 = this.f6682z.a0;
        if (a3 != null) {
            TextAnnotatedStringNode.TextSubstitutionValue k3 = this.f6682z.k3();
            Intrinsics.f(k3);
            a3.invoke(k3);
        }
        TextAnnotatedStringNode.TextSubstitutionValue k32 = this.f6682z.k3();
        if (k32 != null) {
            k32.f(z2);
        }
        this.f6682z.l3();
        return Boolean.TRUE;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Boolean) obj).booleanValue());
    }
}
