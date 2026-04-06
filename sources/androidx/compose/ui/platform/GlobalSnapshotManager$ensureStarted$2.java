package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.Channel;

@Metadata
public final class GlobalSnapshotManager$ensureStarted$2 extends Lambda implements Function1<Object, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Channel f17781z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GlobalSnapshotManager$ensureStarted$2(Channel channel) {
        super(1);
        this.f17781z = channel;
    }

    public final void b(Object obj) {
        if (GlobalSnapshotManager.f17779c.compareAndSet(false, true)) {
            this.f17781z.L(Unit.f40552a);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b(obj);
        return Unit.f40552a;
    }
}
