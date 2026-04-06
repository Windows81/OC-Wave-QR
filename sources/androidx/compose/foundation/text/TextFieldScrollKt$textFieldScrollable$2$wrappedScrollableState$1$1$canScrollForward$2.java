package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1$canScrollForward$2 extends Lambda implements Function0<Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldScrollerPosition f5958z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1$canScrollForward$2(TextFieldScrollerPosition textFieldScrollerPosition) {
        super(0);
        this.f5958z = textFieldScrollerPosition;
    }

    /* renamed from: b */
    public final Boolean invoke() {
        return Boolean.valueOf(this.f5958z.d() < this.f5958z.c());
    }
}
