package androidx.datastore.preferences.core;

import java.io.File;
import kotlin.Metadata;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class PreferenceDataStoreFactory$create$delegate$1 extends Lambda implements Function0<File> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f20707z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreferenceDataStoreFactory$create$delegate$1(Function0 function0) {
        super(0);
        this.f20707z = function0;
    }

    /* renamed from: b */
    public final File invoke() {
        File file = (File) this.f20707z.invoke();
        if (Intrinsics.d(FilesKt.c(file), "preferences_pb")) {
            File absoluteFile = file.getAbsoluteFile();
            Intrinsics.h(absoluteFile, "file.absoluteFile");
            return absoluteFile;
        }
        throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
    }
}
