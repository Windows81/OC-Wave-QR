package com.hansecom.abt.data;

import android.content.Context;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.PreferenceDataStoreFile;
import com.hansecom.abt.api.JsonParser;
import com.hansecom.abt.data.preferences.base.DataStoreFileProducer;
import dagger.Module;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;

@Metadata
@Module
public final class DataModule {

    /* renamed from: a  reason: collision with root package name */
    public static final DataModule f33171a = new DataModule();

    public static final File c(Context context, String str) {
        Intrinsics.i(str, "name");
        String packageName = context.getPackageName();
        return PreferenceDataStoreFile.a(context, packageName + "." + str);
    }

    public final DataStoreFileProducer b(Context context) {
        Intrinsics.i(context, "context");
        return new DataStoreFileProducer(new a(context));
    }

    public final Json d() {
        return JsonParser.f33114a.c();
    }

    public final ReadOnlyProperty e() {
        return PreferenceDataStoreDelegateKt.b("dataStore", (ReplaceFileCorruptionHandler) null, (Function1) null, (CoroutineScope) null, 14, (Object) null);
    }
}
