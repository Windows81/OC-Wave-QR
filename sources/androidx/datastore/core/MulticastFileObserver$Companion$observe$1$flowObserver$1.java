package androidx.datastore.core;

import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ProducerScope;

@Metadata
public final class MulticastFileObserver$Companion$observe$1$flowObserver$1 extends Lambda implements Function1<String, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ProducerScope f20621A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ File f20622z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MulticastFileObserver$Companion$observe$1$flowObserver$1(File file, ProducerScope producerScope) {
        super(1);
        this.f20622z = file;
        this.f20621A = producerScope;
    }

    public final void b(String str) {
        if (Intrinsics.d(str, this.f20622z.getName())) {
            ChannelsKt.w(this.f20621A, Unit.f40552a);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((String) obj);
        return Unit.f40552a;
    }
}
