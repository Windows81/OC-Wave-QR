package androidx.compose.foundation.text;

import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BasicTextKt$BasicText$2$1 extends Lambda implements Function1<TextAnnotatedStringNode.TextSubstitutionValue, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MutableState f5582z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicTextKt$BasicText$2$1(MutableState mutableState) {
        super(1);
        this.f5582z = mutableState;
    }

    public final void b(TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue) {
        BasicTextKt.j(this.f5582z, textSubstitutionValue.d() ? textSubstitutionValue.c() : textSubstitutionValue.b());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((TextAnnotatedStringNode.TextSubstitutionValue) obj);
        return Unit.f40552a;
    }
}
