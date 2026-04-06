package androidx.datastore.core;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

@Metadata
final class MultiProcessDataStoreFactory$create$1 extends Lambda implements Function1<File, InterProcessCoordinator> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f20614z;

    /* renamed from: b */
    public final InterProcessCoordinator invoke(File file) {
        Intrinsics.i(file, "it");
        return new MultiProcessCoordinator(this.f20614z.getCoroutineContext(), file);
    }
}
