package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.core.DataMigration;
import androidx.datastore.preferences.core.Preferences;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class PreferenceDataStoreDelegateKt$preferencesDataStore$1 extends Lambda implements Function1<Context, List<? extends DataMigration<Preferences>>> {

    /* renamed from: z  reason: collision with root package name */
    public static final PreferenceDataStoreDelegateKt$preferencesDataStore$1 f20685z = new PreferenceDataStoreDelegateKt$preferencesDataStore$1();

    public PreferenceDataStoreDelegateKt$preferencesDataStore$1() {
        super(1);
    }

    /* renamed from: b */
    public final List invoke(Context context) {
        Intrinsics.i(context, "it");
        return CollectionsKt.m();
    }
}
