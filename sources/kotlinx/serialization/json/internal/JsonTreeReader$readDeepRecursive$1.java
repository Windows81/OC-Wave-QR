package kotlinx.serialization.json.internal;

import kotlin.DeepRecursiveScope;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.serialization.json.JsonElement;

@Metadata
@DebugMetadata(c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", f = "JsonTreeReader.kt", l = {115}, m = "invokeSuspend")
public final class JsonTreeReader$readDeepRecursive$1 extends RestrictedSuspendLambda implements Function3<DeepRecursiveScope<Unit, JsonElement>, Unit, Continuation<? super JsonElement>, Object> {

    /* renamed from: B  reason: collision with root package name */
    public int f42427B;
    public /* synthetic */ Object C;
    public final /* synthetic */ JsonTreeReader D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JsonTreeReader$readDeepRecursive$1(JsonTreeReader jsonTreeReader, Continuation continuation) {
        super(3, continuation);
        this.D = jsonTreeReader;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.f42427B;
        if (i2 == 0) {
            ResultKt.b(obj);
            DeepRecursiveScope deepRecursiveScope = (DeepRecursiveScope) this.C;
            byte H = this.D.f42423a.H();
            if (H == 1) {
                return this.D.j(true);
            }
            if (H == 0) {
                return this.D.j(false);
            }
            if (H == 6) {
                JsonTreeReader jsonTreeReader = this.D;
                this.f42427B = 1;
                obj = jsonTreeReader.h(deepRecursiveScope, this);
                if (obj == f2) {
                    return f2;
                }
            } else if (H == 8) {
                return this.D.f();
            } else {
                AbstractJsonLexer.x(this.D.f42423a, "Can't begin reading element, unexpected token", 0, (String) null, 6, (Object) null);
                throw new KotlinNothingValueException();
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return (JsonElement) obj;
    }

    /* renamed from: z */
    public final Object d(DeepRecursiveScope deepRecursiveScope, Unit unit, Continuation continuation) {
        JsonTreeReader$readDeepRecursive$1 jsonTreeReader$readDeepRecursive$1 = new JsonTreeReader$readDeepRecursive$1(this.D, continuation);
        jsonTreeReader$readDeepRecursive$1.C = deepRecursiveScope;
        return jsonTreeReader$readDeepRecursive$1.x(Unit.f40552a);
    }
}
