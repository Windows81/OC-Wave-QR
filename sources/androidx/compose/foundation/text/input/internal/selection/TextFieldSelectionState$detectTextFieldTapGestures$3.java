package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.input.internal.TextLayoutStateKt;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldSelectionState$detectTextFieldTapGestures$3 extends Lambda implements Function1<Offset, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6534A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f6535B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f6536z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$detectTextFieldTapGestures$3(Function0 function0, TextFieldSelectionState textFieldSelectionState, Function0 function02) {
        super(1);
        this.f6536z = function0;
        this.f6534A = textFieldSelectionState;
        this.f6535B = function02;
    }

    public final void b(long j2) {
        TextFieldSelectionStateKt.c(AnonymousClass1.f6537z);
        this.f6536z.invoke();
        if (this.f6534A.f6466d && this.f6534A.l0()) {
            if (!this.f6534A.f6467e) {
                this.f6535B.invoke();
                if (this.f6534A.f6463a.o().length() > 0) {
                    this.f6534A.C0(true);
                }
            }
            this.f6534A.L0(TextToolbarState.None);
            long b2 = this.f6534A.f6464b.b(j2);
            TextFieldSelectionState textFieldSelectionState = this.f6534A;
            boolean unused = textFieldSelectionState.s0(TextLayoutStateKt.b(textFieldSelectionState.f6464b, b2));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b(((Offset) obj).t());
        return Unit.f40552a;
    }
}
