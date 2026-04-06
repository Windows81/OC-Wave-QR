package okio.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ResourceFileSystem$toJarRoot$zip$1 extends Lambda implements Function1<ZipEntry, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public static final ResourceFileSystem$toJarRoot$zip$1 f43487z = new ResourceFileSystem$toJarRoot$zip$1();

    public ResourceFileSystem$toJarRoot$zip$1() {
        super(1);
    }

    /* renamed from: b */
    public final Boolean invoke(ZipEntry zipEntry) {
        Intrinsics.i(zipEntry, "entry");
        return Boolean.valueOf(ResourceFileSystem.f43481h.c(zipEntry.a()));
    }
}
