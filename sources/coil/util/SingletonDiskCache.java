package coil.util;

import android.content.Context;
import coil.disk.DiskCache;
import kotlin.Metadata;
import kotlin.io.FilesKt;

@Metadata
public final class SingletonDiskCache {

    /* renamed from: a  reason: collision with root package name */
    public static final SingletonDiskCache f23761a = new SingletonDiskCache();

    /* renamed from: b  reason: collision with root package name */
    public static DiskCache f23762b;

    public final synchronized DiskCache a(Context context) {
        DiskCache diskCache;
        diskCache = f23762b;
        if (diskCache == null) {
            diskCache = new DiskCache.Builder().b(FilesKt.e(Utils.n(context), "image_cache")).a();
            f23762b = diskCache;
        }
        return diskCache;
    }
}
