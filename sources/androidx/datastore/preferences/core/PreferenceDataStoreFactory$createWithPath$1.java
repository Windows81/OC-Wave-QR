package androidx.datastore.preferences.core;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import okio.Path;

@Metadata
final class PreferenceDataStoreFactory$createWithPath$1 extends Lambda implements Function0<File> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f20708z;

    /* renamed from: b */
    public final File invoke() {
        return ((Path) this.f20708z.invoke()).z();
    }
}
