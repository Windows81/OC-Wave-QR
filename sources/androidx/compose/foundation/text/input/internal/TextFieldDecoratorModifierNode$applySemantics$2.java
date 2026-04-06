package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.text.TextLayoutResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldDecoratorModifierNode$applySemantics$2 extends Lambda implements Function1<List<TextLayoutResult>, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldDecoratorModifierNode f6308z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$applySemantics$2(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        super(1);
        this.f6308z = textFieldDecoratorModifierNode;
    }

    /* renamed from: b */
    public final Boolean invoke(List list) {
        TextLayoutResult f2 = this.f6308z.C3().f();
        return Boolean.valueOf(f2 != null ? list.add(f2) : false);
    }
}
