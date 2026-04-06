package androidx.datastore.core;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class MultiProcessCoordinator$lockFile$2 extends Lambda implements Function0<File> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MultiProcessCoordinator f20612z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiProcessCoordinator$lockFile$2(MultiProcessCoordinator multiProcessCoordinator) {
        super(0);
        this.f20612z = multiProcessCoordinator;
    }

    /* renamed from: b */
    public final File invoke() {
        MultiProcessCoordinator multiProcessCoordinator = this.f20612z;
        File g2 = multiProcessCoordinator.p(multiProcessCoordinator.f20604d);
        this.f20612z.n(g2);
        return g2;
    }
}
