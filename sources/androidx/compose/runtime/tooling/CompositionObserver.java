package androidx.compose.runtime.tooling;

import androidx.compose.runtime.RecomposeScope;
import kotlin.Metadata;

@Metadata
public interface CompositionObserver {
    void a(ObservableComposition observableComposition);

    void b(RecomposeScope recomposeScope);

    void c(RecomposeScope recomposeScope);

    void d(RecomposeScope recomposeScope, Object obj);

    void e(ObservableComposition observableComposition);

    void f(RecomposeScope recomposeScope);

    void g(RecomposeScope recomposeScope, Object obj);
}
