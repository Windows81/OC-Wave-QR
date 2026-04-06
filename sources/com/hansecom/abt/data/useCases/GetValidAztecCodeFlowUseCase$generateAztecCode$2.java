package com.hansecom.abt.data.useCases;

import android.graphics.Bitmap;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.aztec.AztecWriter;
import com.google.zxing.common.BitMatrix;
import com.hansecom.abt.util.BarcodeGenerator;
import com.hansecom.abt.util.BitmapExtKt;
import com.hansecom.mapi.models.FareMedium;
import com.hansecom.mapi.models.PrivKey;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.GetValidAztecCodeFlowUseCase$generateAztecCode$2", f = "GetValidAztecCodeFlowUseCase.kt", l = {}, m = "invokeSuspend")
public final class GetValidAztecCodeFlowUseCase$generateAztecCode$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {
    public int D;
    public final /* synthetic */ FareMedium E;
    public final /* synthetic */ GetValidAztecCodeFlowUseCase F;
    public final /* synthetic */ PrivKey G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;
    public final /* synthetic */ Bitmap.Config K;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetValidAztecCodeFlowUseCase$generateAztecCode$2(FareMedium fareMedium, GetValidAztecCodeFlowUseCase getValidAztecCodeFlowUseCase, PrivKey privKey, int i2, int i3, int i4, Bitmap.Config config, Continuation continuation) {
        super(2, continuation);
        this.E = fareMedium;
        this.F = getValidAztecCodeFlowUseCase;
        this.G = privKey;
        this.H = i2;
        this.I = i3;
        this.J = i4;
        this.K = config;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((GetValidAztecCodeFlowUseCase$generateAztecCode$2) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new GetValidAztecCodeFlowUseCase$generateAztecCode$2(this.E, this.F, this.G, this.H, this.I, this.J, this.K, continuation);
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            BarcodeGenerator barcodeGenerator = new BarcodeGenerator();
            String n2 = this.E.n();
            Intrinsics.f(n2);
            long epochSecond = Instant.now().plusMillis(this.F.f33741c.j()).getEpochSecond();
            String a2 = this.G.a();
            Intrinsics.f(a2);
            Integer b2 = this.G.b();
            Intrinsics.f(b2);
            String str = new String(barcodeGenerator.a(n2, a2, epochSecond, b2.intValue()), Charsets.f41123g);
            AztecWriter aztecWriter = new AztecWriter();
            BarcodeFormat barcodeFormat = BarcodeFormat.AZTEC;
            int i2 = this.H;
            BitMatrix b3 = aztecWriter.b(str, barcodeFormat, i2, i2);
            Intrinsics.f(b3);
            return BitmapExtKt.a(b3, this.I, this.J, this.K);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
