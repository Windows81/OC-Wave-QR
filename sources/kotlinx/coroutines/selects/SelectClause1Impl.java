package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.jvm.functions.Function3;

@Metadata
public final class SelectClause1Impl<Q> implements SelectClause1<Q> {

    /* renamed from: a  reason: collision with root package name */
    public final Object f41924a;

    /* renamed from: b  reason: collision with root package name */
    public final Function3 f41925b;

    /* renamed from: c  reason: collision with root package name */
    public final Function3 f41926c;

    /* renamed from: d  reason: collision with root package name */
    public final Function3 f41927d;

    public SelectClause1Impl(Object obj, Function3 function3, Function3 function32, Function3 function33) {
        this.f41924a = obj;
        this.f41925b = function3;
        this.f41926c = function32;
        this.f41927d = function33;
    }

    public Function3 a() {
        return this.f41925b;
    }

    public Object b() {
        return this.f41924a;
    }

    public Function3 c() {
        return this.f41927d;
    }

    public Function3 d() {
        return this.f41926c;
    }
}
