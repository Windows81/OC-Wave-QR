package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.DataStoreFile;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PreferenceDataStoreFile {
    public static final File a(Context context, String str) {
        Intrinsics.i(context, "<this>");
        Intrinsics.i(str, "name");
        return DataStoreFile.a(context, str + ".preferences_pb");
    }
}
