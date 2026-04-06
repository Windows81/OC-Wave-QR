package androidx.datastore.core;

import androidx.datastore.core.SharedCounter;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class MultiProcessCoordinator$lazySharedCounter$1 extends Lambda implements Function0<SharedCounter> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MultiProcessCoordinator f20610z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiProcessCoordinator$lazySharedCounter$1(MultiProcessCoordinator multiProcessCoordinator) {
        super(0);
        this.f20610z = multiProcessCoordinator;
    }

    /* renamed from: b */
    public final SharedCounter invoke() {
        SharedCounter.Factory factory = SharedCounter.f20626b;
        factory.d();
        final MultiProcessCoordinator multiProcessCoordinator = this.f20610z;
        return factory.a(new Function0<File>() {
            /* renamed from: b */
            public final File invoke() {
                MultiProcessCoordinator multiProcessCoordinator = multiProcessCoordinator;
                File g2 = multiProcessCoordinator.p(multiProcessCoordinator.f20605e);
                multiProcessCoordinator.n(g2);
                return g2;
            }
        });
    }
}
