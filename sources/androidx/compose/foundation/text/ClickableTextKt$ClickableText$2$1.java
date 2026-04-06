package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ClickableTextKt$ClickableText$2$1 extends Lambda implements Function1<TextLayoutResult, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f5621A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MutableState f5622z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickableTextKt$ClickableText$2$1(MutableState mutableState, Function1 function1) {
        super(1);
        this.f5622z = mutableState;
        this.f5621A = function1;
    }

    public final void b(TextLayoutResult textLayoutResult) {
        this.f5622z.setValue(textLayoutResult);
        this.f5621A.invoke(textLayoutResult);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((TextLayoutResult) obj);
        return Unit.f40552a;
    }
}
