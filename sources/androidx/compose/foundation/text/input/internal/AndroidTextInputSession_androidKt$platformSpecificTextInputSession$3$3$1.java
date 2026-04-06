package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$1 extends Lambda implements Function0<String> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TransformedTextFieldState f6113z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$1(TransformedTextFieldState transformedTextFieldState) {
        super(0);
        this.f6113z = transformedTextFieldState;
    }

    public final String invoke() {
        return "createInputConnection(value=\"" + this.f6113z.o() + "\")";
    }
}
