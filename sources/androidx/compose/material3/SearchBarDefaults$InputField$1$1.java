package androidx.compose.material3;

import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
final class SearchBarDefaults$InputField$1$1 implements Function1<KeyEvent, Boolean> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SearchBarState f10791A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f10792B;
    public final /* synthetic */ FocusManager C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f10793z;

    @Metadata
    @DebugMetadata(c = "androidx.compose.material3.SearchBarDefaults$InputField$1$1$1", f = "SearchBar.kt", l = {1346}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.SearchBarDefaults$InputField$1$1$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int D;

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            return new AnonymousClass1(searchBarState, continuation);
        }

        public final Object x(Object obj) {
            Object f2 = IntrinsicsKt.f();
            int i2 = this.D;
            if (i2 == 0) {
                ResultKt.b(obj);
                SearchBarState searchBarState = searchBarState;
                this.D = 1;
                if (searchBarState.b(this) == f2) {
                    return f2;
                }
            } else if (i2 == 1) {
                ResultKt.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.f40552a;
        }
    }

    public final Boolean b(android.view.KeyEvent keyEvent) {
        if (!this.f10793z && !SearchBarKt.N(this.f10791A) && Key.r(KeyEvent_androidKt.a(keyEvent), Key.f16750b.c())) {
            CoroutineScope coroutineScope = this.f10792B;
            final SearchBarState searchBarState = this.f10791A;
            Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1((Continuation) null), 3, (Object) null);
            return Boolean.TRUE;
        } else if (!SearchBarKt.N(this.f10791A) || !Key.r(KeyEvent_androidKt.a(keyEvent), Key.f16750b.c())) {
            return Boolean.FALSE;
        } else {
            this.C.p(FocusDirection.f15729b.a());
            return Boolean.TRUE;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((KeyEvent) obj).f());
    }
}
