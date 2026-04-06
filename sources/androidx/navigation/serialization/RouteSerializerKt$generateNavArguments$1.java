package androidx.navigation.serialization;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.KSerializer;

@Metadata
public final class RouteSerializerKt$generateNavArguments$1 extends Lambda implements Function0<Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ KSerializer f22623z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RouteSerializerKt$generateNavArguments$1(KSerializer kSerializer) {
        super(0);
        this.f22623z = kSerializer;
    }

    public final void invoke() {
        throw new IllegalArgumentException("Cannot generate NavArguments for polymorphic serializer " + this.f22623z + ". Arguments can only be generated from concrete classes or objects.");
    }
}
