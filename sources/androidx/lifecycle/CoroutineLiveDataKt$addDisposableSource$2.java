package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2", f = "CoroutineLiveData.kt", l = {}, m = "invokeSuspend")
public final class CoroutineLiveDataKt$addDisposableSource$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super EmittedSource>, Object> {
    public int D;
    public final /* synthetic */ MediatorLiveData E;
    public final /* synthetic */ LiveData F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineLiveDataKt$addDisposableSource$2(MediatorLiveData mediatorLiveData, LiveData liveData, Continuation continuation) {
        super(2, continuation);
        this.E = mediatorLiveData;
        this.F = liveData;
    }

    public static final Unit C(MediatorLiveData mediatorLiveData, Object obj) {
        mediatorLiveData.o(obj);
        return Unit.f40552a;
    }

    /* renamed from: B */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((CoroutineLiveDataKt$addDisposableSource$2) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new CoroutineLiveDataKt$addDisposableSource$2(this.E, this.F, continuation);
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            MediatorLiveData mediatorLiveData = this.E;
            mediatorLiveData.p(this.F, new CoroutineLiveDataKt$sam$androidx_lifecycle_Observer$0(new a(mediatorLiveData)));
            return new EmittedSource(this.F, this.E);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
