package com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import androidx.navigation.SavedStateHandleKt;
import com.hansecom.abt.data.config.links.LinksConfigItem;
import com.hansecom.abt.data.repositories.generalData.EnvironmentConfigurationRepository;
import com.hansecom.abt.data.useCases.GetCashPaymentBarcodeUseCase;
import com.hansecom.abt.data.useCases.configurations.GetLinksConfigurationUseCase;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.home.faremedia.FareMediaAddValuePaymentCashBarcodeDestination;
import com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode.FareMediaAddValueCashPaymentBarcode;
import com.hansecom.abt.ui.components.barcode.BarcodeState;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import com.hansecom.mapi.models.EnvironmentConfiguration;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
public final class FareMediaAddValueCashPaymentBarcodeViewModel extends MviViewModel<FareMediaAddValueCashPaymentBarcode.Action, FareMediaAddValueCashPaymentBarcode.State, FareMediaAddValueCashPaymentBarcode.Effect> {

    /* renamed from: i  reason: collision with root package name */
    public final GetCashPaymentBarcodeUseCase f36136i;

    /* renamed from: j  reason: collision with root package name */
    public final EnvironmentConfigurationRepository f36137j;

    /* renamed from: k  reason: collision with root package name */
    public final String f36138k;

    @Metadata
    @DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode.FareMediaAddValueCashPaymentBarcodeViewModel$1", f = "FareMediaAddValueCashPaymentBarcodeViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode.FareMediaAddValueCashPaymentBarcodeViewModel$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int D;
        public /* synthetic */ Object E;
        public final /* synthetic */ FareMediaAddValueCashPaymentBarcodeViewModel F;

        {
            this.F = r1;
        }

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            AnonymousClass1 r0 = new AnonymousClass1(this.F, getLinksConfigurationUseCase, continuation);
            r0.E = obj;
            return r0;
        }

        public final Object x(Object obj) {
            IntrinsicsKt.f();
            if (this.D == 0) {
                ResultKt.b(obj);
                Flow o2 = this.F.f36137j.o();
                final GetLinksConfigurationUseCase getLinksConfigurationUseCase = getLinksConfigurationUseCase;
                final FareMediaAddValueCashPaymentBarcodeViewModel fareMediaAddValueCashPaymentBarcodeViewModel = this.F;
                FlowKt.P(FlowKt.V(o2, new Function2<EnvironmentConfiguration, Continuation<? super Unit>, Object>((Continuation) null) {
                    public int D;
                    public /* synthetic */ Object E;

                    public static final FareMediaAddValueCashPaymentBarcode.State C(String str, LinksConfigItem linksConfigItem, FareMediaAddValueCashPaymentBarcode.State state) {
                        return FareMediaAddValueCashPaymentBarcode.State.b(state, (BarcodeState) null, str, linksConfigItem.c(), 1, (Object) null);
                    }

                    /* renamed from: B */
                    public final Object m(EnvironmentConfiguration environmentConfiguration, Continuation continuation) {
                        return ((AnonymousClass1) s(environmentConfiguration, continuation)).x(Unit.f40552a);
                    }

                    public final Continuation s(Object obj, Continuation continuation) {
                        AnonymousClass1 r0 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public FareMediaAddValueCashPaymentBarcodeViewModel(SavedStateHandle savedStateHandle, GetCashPaymentBarcodeUseCase getCashPaymentBarcodeUseCase, EnvironmentConfigurationRepository environmentConfigurationRepository, final GetLinksConfigurationUseCase getLinksConfigurationUseCase) {
                            super(savedStateHandle, new FareMediaAddValueCashPaymentBarcode.State((BarcodeState) null, (String) null, (StringValue) null, 7, (DefaultConstructorMarker) null));
                            Intrinsics.i(savedStateHandle, "savedStateHandle");
                            Intrinsics.i(getCashPaymentBarcodeUseCase, "getCashPaymentBarcodeUseCase");
                            Intrinsics.i(environmentConfigurationRepository, "environmentConfigurationRepository");
                            Intrinsics.i(getLinksConfigurationUseCase, "getLinksConfigurationUseCase");
                            this.f36136i = getCashPaymentBarcodeUseCase;
                            this.f36137j = environmentConfigurationRepository;
                            this.f36138k = ((FareMediaAddValuePaymentCashBarcodeDestination) SavedStateHandleKt.a(savedStateHandle, Reflection.b(FareMediaAddValuePaymentCashBarcodeDestination.class), MapsKt.h())).a();
                            MviViewModel.t(this, (CoroutineScope) null, 0, 0, new AnonymousClass1(this, (Continuation) null), 7, (Object) null);
                        }

                        public final void y(int i2, int i3) {
                            Job unused = BuildersKt__Builders_commonKt.d(ViewModelKt.a(this), (CoroutineContext) null, (CoroutineStart) null, new FareMediaAddValueCashPaymentBarcodeViewModel$generateBarcode$1(this, i2, i3, (Continuation) null), 3, (Object) null);
                        }

                        /* renamed from: z */
                        public Object o(FareMediaAddValueCashPaymentBarcode.Action action, Continuation continuation) {
                            if (action instanceof FareMediaAddValueCashPaymentBarcode.Action.GenerateBarcode) {
                                FareMediaAddValueCashPaymentBarcode.Action.GenerateBarcode generateBarcode = (FareMediaAddValueCashPaymentBarcode.Action.GenerateBarcode) action;
                                y(generateBarcode.b(), generateBarcode.a());
                                return Unit.f40552a;
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                    }
