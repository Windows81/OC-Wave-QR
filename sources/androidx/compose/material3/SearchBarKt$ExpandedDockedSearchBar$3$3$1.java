package androidx.compose.material3;

import androidx.compose.ui.platform.SoftwareKeyboardController;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.compose.material3.SearchBarKt$ExpandedDockedSearchBar$3$3$1", f = "SearchBar.kt", l = {}, m = "invokeSuspend")
public final class SearchBarKt$ExpandedDockedSearchBar$3$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ SearchBarState E;
    public final /* synthetic */ SoftwareKeyboardController F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchBarKt$ExpandedDockedSearchBar$3$3$1(SearchBarState searchBarState, SoftwareKeyboardController softwareKeyboardController, Continuation continuation) {
        super(2, continuation);
        this.E = searchBarState;
        this.F = softwareKeyboardController;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SearchBarKt$ExpandedDockedSearchBar$3$3$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new SearchBarKt$ExpandedDockedSearchBar$3$3$1(this.E, this.F, continuation);
    }

    public final Object x(Object obj) {
        SoftwareKeyboardController softwareKeyboardController;
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            if (this.E.f() == SearchBarValue.Collapsed && (softwareKeyboardController = this.F) != null) {
                softwareKeyboardController.a();
            }
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
