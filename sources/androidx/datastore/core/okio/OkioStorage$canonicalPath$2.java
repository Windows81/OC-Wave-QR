package androidx.datastore.core.okio;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import okio.Path;

@Metadata
public final class OkioStorage$canonicalPath$2 extends Lambda implements Function0<Path> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ OkioStorage f20664z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OkioStorage$canonicalPath$2(OkioStorage okioStorage) {
        super(0);
        this.f20664z = okioStorage;
    }

    /* renamed from: b */
    public final Path invoke() {
        Path path = (Path) this.f20664z.f20661d.invoke();
        boolean k2 = path.k();
        OkioStorage okioStorage = this.f20664z;
        if (k2) {
            return path.n();
        }
        throw new IllegalStateException(("OkioStorage requires absolute paths, but did not get an absolute path from producePath = " + okioStorage.f20661d + ", instead got " + path).toString());
    }
}
