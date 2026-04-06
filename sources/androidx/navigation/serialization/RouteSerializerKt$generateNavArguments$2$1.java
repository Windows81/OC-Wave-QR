package androidx.navigation.serialization;

import androidx.navigation.NavArgumentBuilder;
import androidx.navigation.NavType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata
public final class RouteSerializerKt$generateNavArguments$2$1 extends Lambda implements Function1<NavArgumentBuilder, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f22624A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Map f22625B;
    public final /* synthetic */ String C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ KSerializer f22626z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RouteSerializerKt$generateNavArguments$2$1(KSerializer kSerializer, int i2, Map map, String str) {
        super(1);
        this.f22626z = kSerializer;
        this.f22624A = i2;
        this.f22625B = map;
        this.C = str;
    }

    public final void b(NavArgumentBuilder navArgumentBuilder) {
        Intrinsics.i(navArgumentBuilder, "$this$navArgument");
        SerialDescriptor j2 = this.f22626z.a().j(this.f22624A);
        boolean c2 = j2.c();
        NavType a2 = RouteSerializerKt.d(j2, this.f22625B);
        if (a2 != null) {
            navArgumentBuilder.c(a2);
            navArgumentBuilder.b(c2);
            if (this.f22626z.a().k(this.f22624A)) {
                navArgumentBuilder.d(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(RouteSerializerKt.m(this.C, j2.a(), this.f22626z.a().a(), this.f22625B.toString()));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((NavArgumentBuilder) obj);
        return Unit.f40552a;
    }
}
