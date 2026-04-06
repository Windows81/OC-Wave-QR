package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior", f = "SearchBar.kt", l = {972, 986}, m = "settleSearchBar-OhffZ5M")
public final class EnterAlwaysSearchBarScrollBehavior$settleSearchBar$1 extends ContinuationImpl {
    public float C;
    public Object D;
    public /* synthetic */ Object E;
    public final /* synthetic */ EnterAlwaysSearchBarScrollBehavior F;
    public int G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EnterAlwaysSearchBarScrollBehavior$settleSearchBar$1(EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior, Continuation continuation) {
        super(continuation);
        this.F = enterAlwaysSearchBarScrollBehavior;
    }

    public final Object x(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.i(0.0f, this);
    }
}
