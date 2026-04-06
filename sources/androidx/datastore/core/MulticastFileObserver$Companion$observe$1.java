package androidx.datastore.core;

import androidx.datastore.core.MulticastFileObserver;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

@Metadata
@DebugMetadata(c = "androidx.datastore.core.MulticastFileObserver$Companion$observe$1", f = "MulticastFileObserver.android.kt", l = {84, 85}, m = "invokeSuspend")
public final class MulticastFileObserver$Companion$observe$1 extends SuspendLambda implements Function2<ProducerScope<? super Unit>, Continuation<? super Unit>, Object> {
    public Object D;
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ File G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MulticastFileObserver$Companion$observe$1(File file, Continuation continuation) {
        super(2, continuation);
        this.G = file;
    }

    /* renamed from: A */
    public final Object m(ProducerScope producerScope, Continuation continuation) {
        return ((MulticastFileObserver$Companion$observe$1) s(producerScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        MulticastFileObserver$Companion$observe$1 multicastFileObserver$Companion$observe$1 = new MulticastFileObserver$Companion$observe$1(this.G, continuation);
        multicastFileObserver$Companion$observe$1.F = obj;
        return multicastFileObserver$Companion$observe$1;
    }

    public final Object x(Object obj) {
        ProducerScope producerScope;
        final DisposableHandle disposableHandle;
        Object f2 = IntrinsicsKt.f();
        int i2 = this.E;
        if (i2 == 0) {
            ResultKt.b(obj);
            ProducerScope producerScope2 = (ProducerScope) this.F;
            MulticastFileObserver$Companion$observe$1$flowObserver$1 multicastFileObserver$Companion$observe$1$flowObserver$1 = new MulticastFileObserver$Companion$observe$1$flowObserver$1(this.G, producerScope2);
            MulticastFileObserver.Companion companion = MulticastFileObserver.f20615c;
            File parentFile = this.G.getParentFile();
            Intrinsics.f(parentFile);
            disposableHandle = companion.d(parentFile, multicastFileObserver$Companion$observe$1$flowObserver$1);
            Unit unit = Unit.f40552a;
            this.F = producerScope2;
            this.D = disposableHandle;
            this.E = 1;
            if (producerScope2.O(unit, this) == f2) {
                return f2;
            }
            producerScope = producerScope2;
        } else if (i2 == 1) {
            disposableHandle = (DisposableHandle) this.D;
            producerScope = (ProducerScope) this.F;
            ResultKt.b(obj);
        } else if (i2 == 2) {
            ResultKt.b(obj);
            return Unit.f40552a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AnonymousClass1 r7 = new Function0<Unit>() {
            public final void invoke() {
                disposableHandle.d();
            }
        };
        this.F = null;
        this.D = null;
        this.E = 2;
        if (ProduceKt.a(producerScope, r7, this) == f2) {
            return f2;
        }
        return Unit.f40552a;
    }
}
