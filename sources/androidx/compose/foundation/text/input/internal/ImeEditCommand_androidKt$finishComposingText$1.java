package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ImeEditCommand_androidKt$finishComposingText$1 extends Lambda implements Function1<TextFieldBuffer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ImeEditCommand_androidKt$finishComposingText$1 f6202z = new ImeEditCommand_androidKt$finishComposingText$1();

    public ImeEditCommand_androidKt$finishComposingText$1() {
        super(1);
    }

    public final void b(TextFieldBuffer textFieldBuffer) {
        textFieldBuffer.d();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((TextFieldBuffer) obj);
        return Unit.f40552a;
    }
}
