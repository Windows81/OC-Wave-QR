package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.text.SecureTextFieldController$observeHideEvents$2", f = "BasicSecureTextField.kt", l = {242}, m = "invokeSuspend")
public final class SecureTextFieldController$observeHideEvents$2 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ SecureTextFieldController E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SecureTextFieldController$observeHideEvents$2(SecureTextFieldController secureTextFieldController, Continuation continuation) {
        super(2, continuation);
        this.E = secureTextFieldController;
    }

    /* renamed from: A */
    public final Object m(Unit unit, Continuation continuation) {
        return ((SecureTextFieldController$observeHideEvents$2) s(unit, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new SecureTextFieldController$observeHideEvents$2(this.E, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            this.D = 1;
            if (DelayKt.b(1500, this) == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.E.f().b();
        return Unit.f40552a;
    }
}
