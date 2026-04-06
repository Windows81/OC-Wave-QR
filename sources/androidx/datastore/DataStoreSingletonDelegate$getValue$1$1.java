package androidx.datastore;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okio.Path;

@Metadata
public final class DataStoreSingletonDelegate$getValue$1$1 extends Lambda implements Function0<Path> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ DataStoreSingletonDelegate f20539A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Context f20540z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DataStoreSingletonDelegate$getValue$1$1(Context context, DataStoreSingletonDelegate dataStoreSingletonDelegate) {
        super(0);
        this.f20540z = context;
        this.f20539A = dataStoreSingletonDelegate;
    }

    /* renamed from: b */
    public final Path invoke() {
        Path.Companion companion = Path.f43404A;
        Context context = this.f20540z;
        Intrinsics.h(context, "applicationContext");
        String absolutePath = DataStoreFile.a(context, this.f20539A.f20532a).getAbsolutePath();
        Intrinsics.h(absolutePath, "applicationContext.dataS…le(fileName).absolutePath");
        return Path.Companion.e(companion, absolutePath, false, 1, (Object) null);
    }
}
