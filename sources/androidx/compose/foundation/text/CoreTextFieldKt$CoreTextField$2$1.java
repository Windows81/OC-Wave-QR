package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.TextInputService;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$1", f = "CoreTextField.kt", l = {347}, m = "invokeSuspend")
public final class CoreTextFieldKt$CoreTextField$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ LegacyTextFieldState E;
    public final /* synthetic */ State F;
    public final /* synthetic */ TextInputService G;
    public final /* synthetic */ TextFieldSelectionManager H;
    public final /* synthetic */ ImeOptions I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$2$1(LegacyTextFieldState legacyTextFieldState, State state, TextInputService textInputService, TextFieldSelectionManager textFieldSelectionManager, ImeOptions imeOptions, Continuation continuation) {
        super(2, continuation);
        this.E = legacyTextFieldState;
        this.F = state;
        this.G = textInputService;
        this.H = textFieldSelectionManager;
        this.I = imeOptions;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((CoreTextFieldKt$CoreTextField$2$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new CoreTextFieldKt$CoreTextField$2$1(this.E, this.F, this.G, this.H, this.I, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            final State state = this.F;
            Flow q2 = SnapshotStateKt.q(new Function0<Boolean>() {
                /* renamed from: b */
                public final Boolean invoke() {
                    return Boolean.valueOf(CoreTextFieldKt.b(state));
                }
            });
            final LegacyTextFieldState legacyTextFieldState = this.E;
            final TextInputService textInputService = this.G;
            final TextFieldSelectionManager textFieldSelectionManager = this.H;
            final ImeOptions imeOptions = this.I;
            AnonymousClass2 r1 = new FlowCollector() {
                public final Object a(boolean z2, Continuation continuation) {
                    if (!z2 || !legacyTextFieldState.f()) {
                        CoreTextFieldKt.m(legacyTextFieldState);
                    } else {
                        CoreTextFieldKt.p(textInputService, legacyTextFieldState, textFieldSelectionManager.U(), imeOptions, textFieldSelectionManager.N());
                    }
                    return Unit.f40552a;
                }

                public /* bridge */ /* synthetic */ Object c(Object obj, Continuation continuation) {
                    return a(((Boolean) obj).booleanValue(), continuation);
                }
            };
            this.D = 1;
            if (q2.a(r1, this) == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            try {
                ResultKt.b(obj);
            } catch (Throwable th) {
                CoreTextFieldKt.m(this.E);
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        CoreTextFieldKt.m(this.E);
        return Unit.f40552a;
    }
}
