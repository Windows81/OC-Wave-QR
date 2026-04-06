package okio.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
final class ZipFilesKt$openZip$1 extends Lambda implements Function1<ZipEntry, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public static final ZipFilesKt$openZip$1 f43498z = new ZipFilesKt$openZip$1();

    public ZipFilesKt$openZip$1() {
        super(1);
    }

    /* renamed from: b */
    public final Boolean invoke(ZipEntry zipEntry) {
        Intrinsics.i(zipEntry, "it");
        return Boolean.TRUE;
    }
}
