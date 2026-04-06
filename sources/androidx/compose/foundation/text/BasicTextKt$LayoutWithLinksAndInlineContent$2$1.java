package androidx.compose.foundation.text;

import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BasicTextKt$LayoutWithLinksAndInlineContent$2$1 extends Lambda implements Function1<TextLayoutResult, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f5606A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextLinkScope f5607z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicTextKt$LayoutWithLinksAndInlineContent$2$1(TextLinkScope textLinkScope, Function1 function1) {
        super(1);
        this.f5607z = textLinkScope;
        this.f5606A = function1;
    }

    public final void b(TextLayoutResult textLayoutResult) {
        TextLinkScope textLinkScope = this.f5607z;
        if (textLinkScope != null) {
            textLinkScope.r(textLayoutResult);
        }
        Function1 function1 = this.f5606A;
        if (function1 != null) {
            function1.invoke(textLayoutResult);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((TextLayoutResult) obj);
        return Unit.f40552a;
    }
}
