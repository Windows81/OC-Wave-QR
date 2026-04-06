package androidx.datastore.core.okio;

import androidx.datastore.core.okio.OkioStorage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class OkioStorage$createConnection$2 extends Lambda implements Function0<Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ OkioStorage f20665z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OkioStorage$createConnection$2(OkioStorage okioStorage) {
        super(0);
        this.f20665z = okioStorage;
    }

    public final void invoke() {
        OkioStorage.Companion companion = OkioStorage.f20655f;
        Synchronizer b2 = companion.b();
        OkioStorage okioStorage = this.f20665z;
        synchronized (b2) {
            companion.a().remove(okioStorage.f().toString());
            Unit unit = Unit.f40552a;
        }
    }
}
