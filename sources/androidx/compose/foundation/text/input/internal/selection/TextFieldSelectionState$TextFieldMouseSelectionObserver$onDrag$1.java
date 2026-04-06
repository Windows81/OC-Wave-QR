package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldSelectionState$TextFieldMouseSelectionObserver$onDrag$1 extends Lambda implements Function0<String> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f6492z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$TextFieldMouseSelectionObserver$onDrag$1(long j2) {
        super(0);
        this.f6492z = j2;
    }

    public final String invoke() {
        return "Mouse.onDrag " + Offset.s(this.f6492z);
    }
}
