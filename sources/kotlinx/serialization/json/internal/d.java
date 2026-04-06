package kotlinx.serialization.json.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlinx.serialization.json.JsonElement;

public final /* synthetic */ class d implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f42466z;

    public /* synthetic */ d(Ref.ObjectRef objectRef) {
        this.f42466z = objectRef;
    }

    public final Object invoke(Object obj) {
        return TreeJsonEncoderKt.e(this.f42466z, (JsonElement) obj);
    }
}
