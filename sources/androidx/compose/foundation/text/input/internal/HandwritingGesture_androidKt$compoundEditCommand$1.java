package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.EditingBuffer;
import kotlin.Metadata;

@Metadata
public final class HandwritingGesture_androidKt$compoundEditCommand$1 implements EditCommand {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ EditCommand[] f6195a;

    public HandwritingGesture_androidKt$compoundEditCommand$1(EditCommand[] editCommandArr) {
        this.f6195a = editCommandArr;
    }

    public void a(EditingBuffer editingBuffer) {
        for (EditCommand a2 : this.f6195a) {
            a2.a(editingBuffer);
        }
    }
}
