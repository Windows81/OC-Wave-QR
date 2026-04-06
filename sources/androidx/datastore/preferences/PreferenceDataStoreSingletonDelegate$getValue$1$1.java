package androidx.datastore.preferences;

import android.content.Context;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class PreferenceDataStoreSingletonDelegate$getValue$1$1 extends Lambda implements Function0<File> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PreferenceDataStoreSingletonDelegate f20692A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Context f20693z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreferenceDataStoreSingletonDelegate$getValue$1$1(Context context, PreferenceDataStoreSingletonDelegate preferenceDataStoreSingletonDelegate) {
        super(0);
        this.f20693z = context;
        this.f20692A = preferenceDataStoreSingletonDelegate;
    }

    /* renamed from: b */
    public final File invoke() {
        Context context = this.f20693z;
        Intrinsics.h(context, "applicationContext");
        return PreferenceDataStoreFile.a(context, this.f20692A.f20686a);
    }
}
