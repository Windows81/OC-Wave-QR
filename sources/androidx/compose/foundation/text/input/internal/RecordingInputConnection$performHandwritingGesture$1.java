package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.text.input.EditCommand;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class RecordingInputConnection$performHandwritingGesture$1 extends Lambda implements Function1<EditCommand, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ RecordingInputConnection f6276z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecordingInputConnection$performHandwritingGesture$1(RecordingInputConnection recordingInputConnection) {
        super(1);
        this.f6276z = recordingInputConnection;
    }

    public final void b(EditCommand editCommand) {
        this.f6276z.c(editCommand);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((EditCommand) obj);
        return Unit.f40552a;
    }
}
