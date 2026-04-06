package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class SelectClause2Impl<P, Q> implements SelectClause2<P, Q> {

    /* renamed from: a  reason: collision with root package name */
    public final Object f41928a;

    /* renamed from: b  reason: collision with root package name */
    public final Function3 f41929b;

    /* renamed from: c  reason: collision with root package name */
    public final Function3 f41930c;

    /* renamed from: d  reason: collision with root package name */
    public final Function3 f41931d;

    public SelectClause2Impl(Object obj, Function3 function3, Function3 function32, Function3 function33) {
        this.f41928a = obj;
        this.f41929b = function3;
        this.f41930c = function32;
        this.f41931d = function33;
    }

    public Function3 a() {
        return this.f41929b;
    }

    public Function3 d() {
        return this.f41930c;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SelectClause2Impl(Object obj, Function3 function3, Function3 function32, Function3 function33, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, function3, function32, (i2 & 8) != 0 ? null : function33);
    }
}
