package com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode;

import android.graphics.Bitmap;
import com.hansecom.abt.api.ApiExceptionsKt;
import com.hansecom.abt.data.useCases.GetCashPaymentBarcodeUseCase;
import com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode.FareMediaAddValueCashPaymentBarcode;
import com.hansecom.abt.ui.components.barcode.BarcodeState;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode.FareMediaAddValueCashPaymentBarcodeViewModel$generateBarcode$1", f = "FareMediaAddValueCashPaymentBarcodeViewModel.kt", l = {70}, m = "invokeSuspend")
public final class FareMediaAddValueCashPaymentBarcodeViewModel$generateBarcode$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ FareMediaAddValueCashPaymentBarcodeViewModel E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareMediaAddValueCashPaymentBarcodeViewModel$generateBarcode$1(FareMediaAddValueCashPaymentBarcodeViewModel fareMediaAddValueCashPaymentBarcodeViewModel, int i2, int i3, Continuation continuation) {
        super(2, continuation);
        this.E = fareMediaAddValueCashPaymentBarcodeViewModel;
        this.F = i2;
        this.G = i3;
    }

    public static final FareMediaAddValueCashPaymentBarcode.State E(FareMediaAddValueCashPaymentBarcode.State state) {
        return FareMediaAddValueCashPaymentBarcode.State.b(state, BarcodeState.Loading.f37964z, (String) null, (StringValue) null, 6, (Object) null);
    }

    public static final FareMediaAddValueCashPaymentBarcode.State F(Pair pair, FareMediaAddValueCashPaymentBarcode.State state) {
        return FareMediaAddValueCashPaymentBarcode.State.b(state, new BarcodeState.Success((String) pair.e(), (Bitmap) pair.f()), (String) null, (StringValue) null, 6, (Object) null);
    }

    public static final FareMediaAddValueCashPaymentBarcode.State G(Throwable th, FareMediaAddValueCashPaymentBarcode.State state) {
        return FareMediaAddValueCashPaymentBarcode.State.b(state, new BarcodeState.Error(ApiExceptionsKt.a(th)), (String) null, (StringValue) null, 6, (Object) null);
    }

    /* renamed from: D */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((FareMediaAddValueCashPaymentBarcodeViewModel$generateBarcode$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new FareMediaAddValueCashPaymentBarcodeViewModel$generateBarcode$1(this.E, this.F, this.G, continuation);
    }

    public final Object x(Object obj) {
        Object obj2;
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            this.E.r(new l());
            GetCashPaymentBarcodeUseCase w2 = this.E.f36136i;
            String v2 = this.E.f36138k;
            int i3 = this.F;
            int i4 = this.G;
            this.D = 1;
            obj2 = GetCashPaymentBarcodeUseCase.c(w2, v2, i3, i4, 0, 0, (Bitmap.Config) null, this, 56, (Object) null);
            if (obj2 == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
            obj2 = ((Result) obj).j();
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        FareMediaAddValueCashPaymentBarcodeViewModel fareMediaAddValueCashPaymentBarcodeViewModel = this.E;
        Throwable e2 = Result.e(obj2);
        if (e2 == null) {
            fareMediaAddValueCashPaymentBarcodeViewModel.r(new m((Pair) obj2));
        } else {
            fareMediaAddValueCashPaymentBarcodeViewModel.r(new n(e2));
        }
        return Unit.f40552a;
    }
}
