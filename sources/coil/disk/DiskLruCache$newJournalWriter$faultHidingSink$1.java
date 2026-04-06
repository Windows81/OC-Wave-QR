package coil.disk;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DiskLruCache$newJournalWriter$faultHidingSink$1 extends Lambda implements Function1<IOException, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DiskLruCache f23418z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiskLruCache$newJournalWriter$faultHidingSink$1(DiskLruCache diskLruCache) {
        super(1);
        this.f23418z = diskLruCache;
    }

    public final void b(IOException iOException) {
        this.f23418z.L = true;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((IOException) obj);
        return Unit.f40552a;
    }
}
