package com.hansecom.abt.data.useCases;

import android.graphics.Bitmap;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;
import com.hansecom.abt.data.managers.FareMediaManager;
import com.hansecom.abt.util.BitmapExtKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.GetCashPaymentBarcodeUseCase$invoke$2", f = "GetCashPaymentBarcodeUseCase.kt", l = {25}, m = "invokeSuspend")
public final class GetCashPaymentBarcodeUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Pair<? extends String, ? extends Bitmap>>>, Object> {
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public /* synthetic */ Object I;
    public final /* synthetic */ GetCashPaymentBarcodeUseCase J;
    public final /* synthetic */ String K;
    public final /* synthetic */ int L;
    public final /* synthetic */ int M;
    public final /* synthetic */ int N;
    public final /* synthetic */ int O;
    public final /* synthetic */ Bitmap.Config P;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetCashPaymentBarcodeUseCase$invoke$2(GetCashPaymentBarcodeUseCase getCashPaymentBarcodeUseCase, String str, int i2, int i3, int i4, int i5, Bitmap.Config config, Continuation continuation) {
        super(2, continuation);
        this.J = getCashPaymentBarcodeUseCase;
        this.K = str;
        this.L = i2;
        this.M = i3;
        this.N = i4;
        this.O = i5;
        this.P = config;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((GetCashPaymentBarcodeUseCase$invoke$2) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        GetCashPaymentBarcodeUseCase$invoke$2 getCashPaymentBarcodeUseCase$invoke$2 = new GetCashPaymentBarcodeUseCase$invoke$2(this.J, this.K, this.L, this.M, this.N, this.O, this.P, continuation);
        getCashPaymentBarcodeUseCase$invoke$2.I = obj;
        return getCashPaymentBarcodeUseCase$invoke$2;
    }

    public final Object x(Object obj) {
        Object obj2;
        Object obj3;
        Bitmap.Config config;
        int i2;
        int i3;
        int i4;
        int i5;
        Object f2 = IntrinsicsKt.f();
        int i6 = this.H;
        if (i6 == 0) {
            ResultKt.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.I;
            GetCashPaymentBarcodeUseCase getCashPaymentBarcodeUseCase = this.J;
            String str = this.K;
            i2 = this.L;
            int i7 = this.M;
            int i8 = this.N;
            int i9 = this.O;
            Bitmap.Config config2 = this.P;
            Result.Companion companion = Result.f40519A;
            FareMediaManager a2 = getCashPaymentBarcodeUseCase.f33727a;
            this.I = config2;
            this.D = i2;
            this.E = i7;
            this.F = i8;
            this.G = i9;
            this.H = 1;
            obj3 = a2.f(str, this);
            if (obj3 == f2) {
                return f2;
            }
            i3 = i7;
            i4 = i8;
            i5 = i9;
            config = config2;
        } else if (i6 == 1) {
            i5 = this.G;
            i4 = this.F;
            i3 = this.E;
            i2 = this.D;
            config = (Bitmap.Config) this.I;
            try {
                ResultKt.b(obj);
                obj3 = ((Result) obj).j();
            } catch (Throwable th) {
                Result.Companion companion2 = Result.f40519A;
                obj2 = Result.b(ResultKt.a(th));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj3);
        String str2 = (String) obj3;
        if (str2 != null) {
            BitMatrix b2 = new MultiFormatWriter().b(str2, BarcodeFormat.CODE_128, i2, i3);
            Intrinsics.f(b2);
            obj2 = Result.b(TuplesKt.a(str2, BitmapExtKt.a(b2, i4, i5, config)));
            return Result.a(obj2);
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
