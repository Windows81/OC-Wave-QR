package okio.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import okio.FileSystem;
import okio.Path;

@Metadata
public final class ResourceFileSystem$roots$2 extends Lambda implements Function0<List<? extends Pair<? extends FileSystem, ? extends Path>>> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ResourceFileSystem f43486z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ResourceFileSystem$roots$2(ResourceFileSystem resourceFileSystem) {
        super(0);
        this.f43486z = resourceFileSystem;
    }

    /* renamed from: b */
    public final List invoke() {
        ResourceFileSystem resourceFileSystem = this.f43486z;
        return resourceFileSystem.A(resourceFileSystem.f43483e);
    }
}
