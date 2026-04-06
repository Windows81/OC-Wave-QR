package okio;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
final class ForwardingFileSystem$listRecursively$1 extends Lambda implements Function1<Path, Path> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ForwardingFileSystem f43379z;

    /* renamed from: b */
    public final Path invoke(Path path) {
        Intrinsics.i(path, "it");
        return this.f43379z.v(path, "listRecursively");
    }
}
