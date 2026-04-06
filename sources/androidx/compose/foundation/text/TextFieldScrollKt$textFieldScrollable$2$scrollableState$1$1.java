package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldScrollKt$textFieldScrollable$2$scrollableState$1$1 extends Lambda implements Function1<Float, Float> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldScrollerPosition f5953z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldScrollKt$textFieldScrollable$2$scrollableState$1$1(TextFieldScrollerPosition textFieldScrollerPosition) {
        super(1);
        this.f5953z = textFieldScrollerPosition;
    }

    public final Float b(float f2) {
        float d2 = this.f5953z.d() + f2;
        if (d2 > this.f5953z.c()) {
            f2 = this.f5953z.c() - this.f5953z.d();
        } else if (d2 < 0.0f) {
            f2 = -this.f5953z.d();
        }
        TextFieldScrollerPosition textFieldScrollerPosition = this.f5953z;
        textFieldScrollerPosition.h(textFieldScrollerPosition.d() + f2);
        return Float.valueOf(f2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).floatValue());
    }
}
