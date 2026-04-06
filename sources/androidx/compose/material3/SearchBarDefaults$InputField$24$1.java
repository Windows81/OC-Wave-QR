package androidx.compose.material3;

import androidx.compose.ui.focus.FocusManager;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

@Metadata
@DebugMetadata(c = "androidx.compose.material3.SearchBarDefaults$InputField$24$1", f = "SearchBar.kt", l = {1742}, m = "invokeSuspend")
public final class SearchBarDefaults$InputField$24$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ FocusManager F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchBarDefaults$InputField$24$1(boolean z2, FocusManager focusManager, Continuation continuation) {
        super(2, continuation);
        this.E = z2;
        this.F = focusManager;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SearchBarDefaults$InputField$24$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new SearchBarDefaults$InputField$24$1(this.E, this.F, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            if (this.E) {
                this.D = 1;
                if (DelayKt.b(100, this) == f2) {
                    return f2;
                }
            }
            return Unit.f40552a;
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        FocusManager.g(this.F, false, 1, (Object) null);
        return Unit.f40552a;
    }
}
