package androidx.navigation.serialization;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.ContextAwareKt;

@Metadata
public final class RouteSerializerKt$generateRoutePattern$1 extends Lambda implements Function0<Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ KSerializer f22627z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RouteSerializerKt$generateRoutePattern$1(KSerializer kSerializer) {
        super(0);
        this.f22627z = kSerializer;
    }

    public final void invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot generate route pattern from polymorphic class ");
        KClass a2 = ContextAwareKt.a(this.f22627z.a());
        sb.append(a2 != null ? a2.e() : null);
        sb.append(". Routes can only be generated from concrete classes or objects.");
        throw new IllegalArgumentException(sb.toString());
    }
}
