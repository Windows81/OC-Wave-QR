package androidx.activity.compose;

import androidx.activity.BackEventCompat;
import androidx.activity.OnBackPressedCallback;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.SendChannel;

@Metadata
final class OnBackInstance {

    /* renamed from: a  reason: collision with root package name */
    public boolean f159a;

    /* renamed from: b  reason: collision with root package name */
    public final Channel f160b = ChannelKt.b(-2, BufferOverflow.SUSPEND, (Function1) null, 4, (Object) null);

    /* renamed from: c  reason: collision with root package name */
    public final Job f161c;

    public OnBackInstance(CoroutineScope coroutineScope, boolean z2, Function2 function2, OnBackPressedCallback onBackPressedCallback) {
        this.f159a = z2;
        this.f161c = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new OnBackInstance$job$1(onBackPressedCallback, function2, this, (Continuation) null), 3, (Object) null);
    }

    public final void a() {
        this.f160b.c(new CancellationException("onBack cancelled"));
        Job.DefaultImpls.a(this.f161c, (CancellationException) null, 1, (Object) null);
    }

    public final boolean b() {
        return SendChannel.DefaultImpls.a(this.f160b, (Throwable) null, 1, (Object) null);
    }

    public final Channel c() {
        return this.f160b;
    }

    public final boolean d() {
        return this.f159a;
    }

    public final Object e(BackEventCompat backEventCompat) {
        return this.f160b.L(backEventCompat);
    }

    public final void f(boolean z2) {
        this.f159a = z2;
    }
}
