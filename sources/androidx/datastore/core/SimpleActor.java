package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ClosedSendChannelException;

@Metadata
public final class SimpleActor<T> {

    /* renamed from: a  reason: collision with root package name */
    public final CoroutineScope f20629a;

    /* renamed from: b  reason: collision with root package name */
    public final Function2 f20630b;

    /* renamed from: c  reason: collision with root package name */
    public final Channel f20631c = ChannelKt.b(Integer.MAX_VALUE, (BufferOverflow) null, (Function1) null, 6, (Object) null);

    /* renamed from: d  reason: collision with root package name */
    public final AtomicInt f20632d = new AtomicInt(0);

    public SimpleActor(CoroutineScope coroutineScope, final Function1 function1, final Function2 function2, Function2 function22) {
        Intrinsics.i(coroutineScope, "scope");
        Intrinsics.i(function1, "onComplete");
        Intrinsics.i(function2, "onUndeliveredElement");
        Intrinsics.i(function22, "consumeMessage");
        this.f20629a = coroutineScope;
        this.f20630b = function22;
        Job job = (Job) coroutineScope.getCoroutineContext().d(Job.f41415x);
        if (job != null) {
            job.S(new Function1<Throwable, Unit>() {
                public final void b(Throwable th) {
                    Unit unit;
                    function1.invoke(th);
                    this.f20631c.z(th);
                    do {
                        Object f2 = ChannelResult.f(this.f20631c.n());
                        if (f2 != null) {
                            function2.m(f2, th);
                            unit = Unit.f40552a;
                            continue;
                        } else {
                            unit = null;
                            continue;
                        }
                    } while (unit != null);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((Throwable) obj);
                    return Unit.f40552a;
                }
            });
        }
    }

    public final void e(Object obj) {
        Object L = this.f20631c.L(obj);
        if (L instanceof ChannelResult.Closed) {
            Throwable e2 = ChannelResult.e(L);
            if (e2 == null) {
                e2 = new ClosedSendChannelException("Channel was closed normally");
            }
            throw e2;
        } else if (!ChannelResult.j(L)) {
            throw new IllegalStateException("Check failed.");
        } else if (this.f20632d.c() == 0) {
            Job unused = BuildersKt__Builders_commonKt.d(this.f20629a, (CoroutineContext) null, (CoroutineStart) null, new SimpleActor$offer$2(this, (Continuation) null), 3, (Object) null);
        }
    }
}
