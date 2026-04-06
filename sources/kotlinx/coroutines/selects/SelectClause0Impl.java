package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class SelectClause0Impl implements SelectClause0 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f41920a;

    /* renamed from: b  reason: collision with root package name */
    public final Function3 f41921b;

    /* renamed from: c  reason: collision with root package name */
    public final Function3 f41922c;

    /* renamed from: d  reason: collision with root package name */
    public final Function3 f41923d;

    public SelectClause0Impl(Object obj, Function3 function3, Function3 function32) {
        this.f41920a = obj;
        this.f41921b = function3;
        this.f41922c = function32;
        this.f41923d = SelectKt.f41944a;
    }

    public Function3 a() {
        return this.f41921b;
    }

    public Object b() {
        return this.f41920a;
    }

    public Function3 c() {
        return this.f41922c;
    }

    public Function3 d() {
        return this.f41923d;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SelectClause0Impl(Object obj, Function3 function3, Function3 function32, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, function3, (i2 & 4) != 0 ? null : function32);
    }
}
