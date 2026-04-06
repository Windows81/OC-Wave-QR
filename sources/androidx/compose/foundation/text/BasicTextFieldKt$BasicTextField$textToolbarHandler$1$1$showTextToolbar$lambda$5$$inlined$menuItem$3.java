package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextToolbarState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$5$$inlined$menuItem$3 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TextToolbarState f5513A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f5514B;
    public final /* synthetic */ TextFieldSelectionState C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f5515z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$5$$inlined$menuItem$3(TextFieldSelectionState textFieldSelectionState, TextToolbarState textToolbarState, CoroutineScope coroutineScope, TextFieldSelectionState textFieldSelectionState2) {
        super(0);
        this.f5515z = textFieldSelectionState;
        this.f5513A = textToolbarState;
        this.f5514B = coroutineScope;
        this.C = textFieldSelectionState2;
    }

    public final void invoke() {
        Job unused = BuildersKt__Builders_commonKt.d(this.f5514B, (CoroutineContext) null, CoroutineStart.UNDISPATCHED, new BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$2$3$1(this.C, (Continuation) null), 1, (Object) null);
        this.f5515z.L0(this.f5513A);
    }
}
