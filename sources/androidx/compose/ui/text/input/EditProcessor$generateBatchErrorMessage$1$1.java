package androidx.compose.ui.text.input;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class EditProcessor$generateBatchErrorMessage$1$1 extends Lambda implements Function1<EditCommand, CharSequence> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ EditProcessor f18808A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ EditCommand f18809z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditProcessor$generateBatchErrorMessage$1$1(EditCommand editCommand, EditProcessor editProcessor) {
        super(1);
        this.f18809z = editCommand;
        this.f18808A = editProcessor;
    }

    /* renamed from: b */
    public final CharSequence invoke(EditCommand editCommand) {
        String str = this.f18809z == editCommand ? " > " : "   ";
        return str + this.f18808A.e(editCommand);
    }
}
