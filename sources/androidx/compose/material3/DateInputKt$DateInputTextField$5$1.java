package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.compose.material3.DateInputKt$DateInputTextField$5$1", f = "DateInput.kt", l = {}, m = "invokeSuspend")
public final class DateInputKt$DateInputTextField$5$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ Long E;
    public final /* synthetic */ CalendarModel F;
    public final /* synthetic */ DateInputFormat G;
    public final /* synthetic */ Locale H;
    public final /* synthetic */ MutableState I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DateInputKt$DateInputTextField$5$1(Long l2, CalendarModel calendarModel, DateInputFormat dateInputFormat, Locale locale, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.E = l2;
        this.F = calendarModel;
        this.G = dateInputFormat;
        this.H = locale;
        this.I = mutableState;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((DateInputKt$DateInputTextField$5$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new DateInputKt$DateInputTextField$5$1(this.E, this.F, this.G, this.H, this.I, continuation);
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            Long l2 = this.E;
            if (l2 != null) {
                CalendarModel calendarModel = this.F;
                DateInputFormat dateInputFormat = this.G;
                Locale locale = this.H;
                MutableState mutableState = this.I;
                String a2 = calendarModel.a(l2.longValue(), dateInputFormat.c(), locale);
                DateInputKt.o(mutableState, new TextFieldValue(a2, a2.length() == 0 ? TextRange.f18496b.a() : TextRangeKt.b(a2.length(), a2.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
            }
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
