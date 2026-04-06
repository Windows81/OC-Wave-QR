package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.TextInputSession;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class TextFieldDelegate$Companion$restartInput$1 extends Lambda implements Function1<List<? extends EditCommand>, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f5900A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f5901B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ EditProcessor f5902z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldDelegate$Companion$restartInput$1(EditProcessor editProcessor, Function1 function1, Ref.ObjectRef objectRef) {
        super(1);
        this.f5902z = editProcessor;
        this.f5900A = function1;
        this.f5901B = objectRef;
    }

    public final void b(List list) {
        TextFieldDelegate.f5899a.g(list, this.f5902z, this.f5900A, (TextInputSession) this.f5901B.f40908z);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((List) obj);
        return Unit.f40552a;
    }
}
