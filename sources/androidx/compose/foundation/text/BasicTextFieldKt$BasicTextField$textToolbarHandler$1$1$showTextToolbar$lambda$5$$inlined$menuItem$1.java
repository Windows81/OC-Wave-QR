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
public final class BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$5$$inlined$menuItem$1 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TextToolbarState f5507A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f5508B;
    public final /* synthetic */ TextFieldSelectionState C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f5509z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$5$$inlined$menuItem$1(TextFieldSelectionState textFieldSelectionState, TextToolbarState textToolbarState, CoroutineScope coroutineScope, TextFieldSelectionState textFieldSelectionState2) {
        super(0);
        this.f5509z = textFieldSelectionState;
        this.f5507A = textToolbarState;
        this.f5508B = coroutineScope;
        this.C = textFieldSelectionState2;
    }

    public final void invoke() {
        Job unused = BuildersKt__Builders_commonKt.d(this.f5508B, (CoroutineContext) null, CoroutineStart.UNDISPATCHED, new BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$2$1$1(this.C, (Continuation) null), 1, (Object) null);
        this.f5509z.L0(this.f5507A);
    }
}
