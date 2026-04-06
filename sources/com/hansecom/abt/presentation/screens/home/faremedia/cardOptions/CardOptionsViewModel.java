package com.hansecom.abt.presentation.screens.home.faremedia.cardOptions;

import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.SavedStateHandleKt;
import com.hansecom.abt.data.useCases.configurations.GetCardOptionsMenuConfigurationUseCase;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptions;
import com.hansecom.abt.ui.components.listItem.MenuItemListState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
public final class CardOptionsViewModel extends MviViewModel<CardOptions.Action, CardOptions.State, CardOptions.Effect> {

    /* renamed from: i  reason: collision with root package name */
    public final String f36576i;

    @Metadata
    @DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsViewModel$1", f = "CardOptionsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsViewModel$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int D;
        public /* synthetic */ Object E;

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            AnonymousClass1 r0 = new AnonymousClass1(getCardOptionsMenuConfigurationUseCase, this, continuation);
            r0.E = obj;
            return r0;
        }

        public final Object x(Object obj) {
            IntrinsicsKt.f();
            if (this.D == 0) {
                ResultKt.b(obj);
                Flow c2 = getCardOptionsMenuConfigurationUseCase.c(this.f36576i);
                final CardOptionsViewModel cardOptionsViewModel = this;
                FlowKt.P(FlowKt.V(c2, new Function2<MenuItemListState, Continuation<? super Unit>, Object>((Continuation) null) {
                    public int D;
                    public /* synthetic */ Object E;

                    public static final CardOptions.State C(MenuItemListState menuItemListState, CardOptions.State state) {
                        return state.a(menuItemListState);
                    }

                    /* renamed from: B */
                    public final Object m(MenuItemListState menuItemListState, Continuation continuation) {
                        return ((AnonymousClass1) s(menuItemListState, continuation)).x(Unit.f40552a);
                    }

                    public final Continuation s(Object obj, Continuation continuation) {
                        AnonymousClass1 r0 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public CardOptionsViewModel(SavedStateHandle savedStateHandle, final GetCardOptionsMenuConfigurationUseCase getCardOptionsMenuConfigurationUseCase) {
                            super(savedStateHandle, new CardOptions.State((MenuItemListState) null, 1, (DefaultConstructorMarker) null));
                            Intrinsics.i(savedStateHandle, "savedStateHandle");
                            Intrinsics.i(getCardOptionsMenuConfigurationUseCase, "getCardOptionsMenuConfigurationUseCase");
                            this.f36576i = ((CardOptionsDestination) SavedStateHandleKt.a(savedStateHandle, Reflection.b(CardOptionsDestination.class), MapsKt.h())).a();
                            MviViewModel.t(this, (CoroutineScope) null, 0, 0, new AnonymousClass1((Continuation) null), 7, (Object) null);
                        }

                        /* JADX WARNING: Can't fix incorrect switch cases order */
                        /* renamed from: w */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public java.lang.Object o(com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptions.Action r3, kotlin.coroutines.Continuation r4) {
                            /*
                                r2 = this;
                                boolean r4 = r3 instanceof com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptions.Action.MenuItemClick
                                if (r4 == 0) goto L_0x00fe
                                com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptions$Action$MenuItemClick r3 = (com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptions.Action.MenuItemClick) r3
                                com.hansecom.abt.ui.components.listItem.MenuItemState r4 = r3.a()
                                java.lang.String r4 = r4.O()
                                if (r4 == 0) goto L_0x00da
                                int r0 = r4.hashCode()
                                switch(r0) {
                                    case -1244699312: goto L_0x00cb;
                                    case -995381121: goto L_0x00bc;
                                    case -859927436: goto L_0x00ad;
                                    case 1098057140: goto L_0x009e;
                                    case 1114677361: goto L_0x008f;
                                    case 1439445781: goto L_0x007f;
                                    case 1496084324: goto L_0x006e;
                                    case 1700861948: goto L_0x005d;
                                    case 1737175965: goto L_0x004c;
                                    case 1768527926: goto L_0x003b;
                                    case 1879773627: goto L_0x002a;
                                    case 1908811483: goto L_0x0019;
                                    default: goto L_0x0017;
                                }
                            L_0x0017:
                                goto L_0x00da
                            L_0x0019:
                                java.lang.String r0 = "lockCard"
                                boolean r4 = r4.equals(r0)
                                if (r4 != 0) goto L_0x0023
                                goto L_0x00da
                            L_0x0023:
                                com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptions$Effect$LockCard r3 = com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptions.Effect.LockCard.f36478a
                                r2.p(r3)
                                goto L_0x00fb
                            L_0x002a:
                                java.lang.String r0 = "institutions"
                                boolean r4 = r4.equals(r0)
                                if (r4 != 0) goto L_0x0034
                                goto L_0x00da
                            L_0x0034:
                                com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptions$Effect$Institutions r3 = com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptions.Effect.Institutions.f36477a
                                r2.p(r3)
                                goto L_0x00fb
                            L_0x003b:
                                java.lang.String r0 = "fareCapping"
                                boolean r4 = r4.equals(r0)
                                if (r4 != 0) goto L_0x0045
                                goto L_0x00da
                            L_0x0045:
                                com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptions$Effect$FareCapping r3 = com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptions.Effect.FareCapping.f36476a
                                r2.p(r3)
                                goto L_0x00fb
                            L_0x004c:
                                java.lang.String r0 = "convertToVirtual"
                                boolean r4 = r4.equals(r0)
                                if (r4 != 0) goto L_0x0056
                                goto L_0x00da
                            L_0x0056:
                                com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptions$Effect$ConvertToVirtual r3 = com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptions.Effect.ConvertToVirtual.f36475a
                                r2.p(r3)
                                goto L_0x00fb
                            L_0x005d:
                                java.lang.String r0 = "cardInformation"
                                boolean r4 = r4.equals(r0)
                                if (r4 != 0) goto L_0x0067
                                goto L_0x00da
                            L_0x0067:
                                com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptions$Effect$CardInformation r3 = com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptions.Effect.CardInformation.f36474a
                                r2.p(r3)
                                goto L_0x00fb
                            L_0x006e:
                                java.lang.String r0 = "cardHistory"
                                boolean r4 = r4.equals(r0)
                                if (r4 != 0) goto L_0x0078
                                goto L_0x00da
                            L_0x0078:
                                com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptions$Effect$CardHistory r3 = com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptions.Effect.CardHistory.f36473a
                                r2.p(r3)
                                goto L_0x00fb
                            L_0x007f:
                                java.lang.String r0 = "autoload"
                                boolean r4 = r4.equals(r0)
                                if (r4 != 0) goto L_0x0088
                                goto L_0x00da
                            L_0x0088:
                                com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptions$Effect$Autoload r3 = com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptions.Effect.Autoload.f36472a
                                r2.p(r3)
                                goto L_0x00fb
                            L_0x008f:
                                java.lang.String r0 = "transferBalance"
                                boolean r4 = r4.equals(r0)
                                if (r4 != 0) goto L_0x0098
                                goto L_0x00da
                            L_0x0098:
                                com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptions$Effect$TransferBalance r3 = com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptions.Effect.TransferBalance.f36481a
                                r2.p(r3)
                                goto L_0x00fb
                            L_0x009e:
                                java.lang.String r0 = "removeCard"
                                boolean r4 = r4.equals(r0)
                                if (r4 != 0) goto L_0x00a7
                                goto L_0x00da
                            L_0x00a7:
                                com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptions$Effect$RemoveCard r3 = com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptions.Effect.RemoveCard.f36480a
                                r2.p(r3)
                                goto L_0x00fb
                            L_0x00ad:
                                java.lang.String r0 = "unlockCard"
                                boolean r4 = r4.equals(r0)
                                if (r4 != 0) goto L_0x00b6
                                goto L_0x00da
                            L_0x00b6:
                                com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptions$Effect$UnlockCard r3 = com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptions.Effect.UnlockCard.f36482a
                                r2.p(r3)
                                goto L_0x00fb
                            L_0x00bc:
                                java.lang.String r0 = "passes"
                                boolean r4 = r4.equals(r0)
                                if (r4 != 0) goto L_0x00c5
                                goto L_0x00da
                            L_0x00c5:
                                com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptions$Effect$Passes r3 = com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptions.Effect.Passes.f36479a
                                r2.p(r3)
                                goto L_0x00fb
                            L_0x00cb:
                                java.lang.String r0 = "addValue"
                                boolean r4 = r4.equals(r0)
                                if (r4 != 0) goto L_0x00d4
                                goto L_0x00da
                            L_0x00d4:
                                com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptions$Effect$AddValue r3 = com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptions.Effect.AddValue.f36471a
                                r2.p(r3)
                                goto L_0x00fb
                            L_0x00da:
                                timber.log.Timber$Forest r4 = timber.log.Timber.f44337a
                                com.hansecom.abt.ui.components.listItem.MenuItemState r3 = r3.a()
                                java.lang.String r3 = r3.O()
                                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                                r0.<init>()
                                java.lang.String r1 = "Unhandled menu item click action="
                                r0.append(r1)
                                r0.append(r3)
                                java.lang.String r3 = r0.toString()
                                r0 = 0
                                java.lang.Object[] r0 = new java.lang.Object[r0]
                                r4.b(r3, r0)
                            L_0x00fb:
                                kotlin.Unit r3 = kotlin.Unit.f40552a
                                return r3
                            L_0x00fe:
                                kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
                                r3.<init>()
                                throw r3
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsViewModel.o(com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptions$Action, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }
