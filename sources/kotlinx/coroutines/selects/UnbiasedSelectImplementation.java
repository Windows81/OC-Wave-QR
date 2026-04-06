package kotlinx.coroutines.selects;

import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.selects.SelectImplementation;

@Metadata
public class UnbiasedSelectImplementation<R> extends SelectImplementation<R> {
    public final List F;

    public final void E() {
        try {
            Collections.shuffle(this.F);
            for (SelectImplementation.ClauseData y2 : this.F) {
                SelectImplementation.y(this, y2, false, 1, (Object) null);
            }
        } finally {
            this.F.clear();
        }
    }

    public void b(SelectClause0 selectClause0, Function1 function1) {
        this.F.add(new SelectImplementation.ClauseData(selectClause0.b(), selectClause0.a(), selectClause0.d(), SelectKt.i(), function1, selectClause0.c()));
    }

    public void g(SelectClause1 selectClause1, Function2 function2) {
        this.F.add(new SelectImplementation.ClauseData(selectClause1.b(), selectClause1.a(), selectClause1.d(), (Object) null, function2, selectClause1.c()));
    }

    public Object q(Continuation continuation) {
        return E();
    }
}
