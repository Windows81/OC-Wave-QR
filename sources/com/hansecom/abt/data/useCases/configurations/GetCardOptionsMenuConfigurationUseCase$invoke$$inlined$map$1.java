package com.hansecom.abt.data.useCases.configurations;

import com.hansecom.abt.ui.components.listItem.MenuItemListState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
public final class GetCardOptionsMenuConfigurationUseCase$invoke$$inlined$map$1 implements Flow<MenuItemListState> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ GetCardOptionsMenuConfigurationUseCase f33860A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ String f33861B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Flow f33862z;

    public GetCardOptionsMenuConfigurationUseCase$invoke$$inlined$map$1(Flow flow, GetCardOptionsMenuConfigurationUseCase getCardOptionsMenuConfigurationUseCase, String str) {
        this.f33862z = flow;
        this.f33860A = getCardOptionsMenuConfigurationUseCase;
        this.f33861B = str;
    }

    public Object a(final FlowCollector flowCollector, Continuation continuation) {
        Flow flow = this.f33862z;
        final GetCardOptionsMenuConfigurationUseCase getCardOptionsMenuConfigurationUseCase = this.f33860A;
        final String str = this.f33861B;
        Object a2 = flow.a(new FlowCollector() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object c(java.lang.Object r10, kotlin.coroutines.Continuation r11) {
                /*
                    r9 = this;
                    boolean r0 = r11 instanceof com.hansecom.abt.data.useCases.configurations.GetCardOptionsMenuConfigurationUseCase$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r11
                    com.hansecom.abt.data.useCases.configurations.GetCardOptionsMenuConfigurationUseCase$invoke$$inlined$map$1$2$1 r0 = (com.hansecom.abt.data.useCases.configurations.GetCardOptionsMenuConfigurationUseCase$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.D
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.D = r1
                    goto L_0x0018
                L_0x0013:
                    com.hansecom.abt.data.useCases.configurations.GetCardOptionsMenuConfigurationUseCase$invoke$$inlined$map$1$2$1 r0 = new com.hansecom.abt.data.useCases.configurations.GetCardOptionsMenuConfigurationUseCase$invoke$$inlined$map$1$2$1
                    r0.<init>(r9, r11)
                L_0x0018:
                    java.lang.Object r11 = r0.C
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.D
                    r3 = 1
                    if (r2 == 0) goto L_0x0032
                    if (r2 != r3) goto L_0x002a
                    kotlin.ResultKt.b(r11)
                    goto L_0x00c6
                L_0x002a:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r11)
                    throw r10
                L_0x0032:
                    kotlin.ResultKt.b(r11)
                    kotlinx.coroutines.flow.FlowCollector r11 = r5
                    java.util.List r10 = (java.util.List) r10
                    java.lang.Iterable r10 = (java.lang.Iterable) r10
                    java.util.Iterator r2 = r10.iterator()
                L_0x003f:
                    boolean r4 = r2.hasNext()
                    if (r4 == 0) goto L_0x0059
                    java.lang.Object r4 = r2.next()
                    r5 = r4
                    com.hansecom.mapi.models.FareMedium r5 = (com.hansecom.mapi.models.FareMedium) r5
                    java.lang.String r5 = r5.f()
                    java.lang.String r6 = r3
                    boolean r5 = kotlin.jvm.internal.Intrinsics.d(r5, r6)
                    if (r5 == 0) goto L_0x003f
                    goto L_0x005a
                L_0x0059:
                    r4 = 0
                L_0x005a:
                    com.hansecom.mapi.models.FareMedium r4 = (com.hansecom.mapi.models.FareMedium) r4
                    if (r4 != 0) goto L_0x0068
                    com.hansecom.abt.ui.components.listItem.MenuItemListState r10 = new com.hansecom.abt.ui.components.listItem.MenuItemListState
                    kotlinx.collections.immutable.PersistentList r2 = kotlinx.collections.immutable.ExtensionsKt.a()
                    r10.<init>(r2)
                    goto L_0x00bd
                L_0x0068:
                    com.hansecom.abt.data.useCases.configurations.GetCardOptionsMenuConfigurationUseCase r2 = r2
                    com.hansecom.abt.data.config.menu.FareMediaMenuConfigConverter r2 = r2.f33859c
                    com.hansecom.abt.data.config.RemoteConfig r5 = com.hansecom.abt.data.config.RemoteConfig.CARD_OPTIONS
                    boolean r6 = r10 instanceof java.util.Collection
                    r7 = 0
                    if (r6 == 0) goto L_0x0080
                    r6 = r10
                    java.util.Collection r6 = (java.util.Collection) r6
                    boolean r6 = r6.isEmpty()
                    if (r6 == 0) goto L_0x0080
                    r6 = r7
                    goto L_0x00a7
                L_0x0080:
                    java.util.Iterator r10 = r10.iterator()
                    r6 = r7
                L_0x0085:
                    boolean r8 = r10.hasNext()
                    if (r8 == 0) goto L_0x00a7
                    java.lang.Object r8 = r10.next()
                    com.hansecom.mapi.models.FareMedium r8 = (com.hansecom.mapi.models.FareMedium) r8
                    java.lang.Boolean r8 = r8.q()
                    if (r8 == 0) goto L_0x009c
                    boolean r8 = r8.booleanValue()
                    goto L_0x009d
                L_0x009c:
                    r8 = r7
                L_0x009d:
                    if (r8 == 0) goto L_0x0085
                    int r6 = r6 + 1
                    if (r6 >= 0) goto L_0x0085
                    kotlin.collections.CollectionsKt.v()
                    goto L_0x0085
                L_0x00a7:
                    com.hansecom.abt.data.useCases.configurations.GetCardOptionsMenuConfigurationUseCase r10 = r2
                    com.hansecom.abt.AppFeatures r10 = r10.f33858b
                    int r10 = r10.J()
                    if (r6 < r10) goto L_0x00b4
                    r7 = r3
                L_0x00b4:
                    com.hansecom.abt.data.config.menu.FareMediaMenuConfigConverter$Params r10 = new com.hansecom.abt.data.config.menu.FareMediaMenuConfigConverter$Params
                    r10.<init>(r4, r7)
                    com.hansecom.abt.ui.components.listItem.MenuItemListState r10 = r2.e(r5, r10)
                L_0x00bd:
                    r0.D = r3
                    java.lang.Object r10 = r11.c(r10, r0)
                    if (r10 != r1) goto L_0x00c6
                    return r1
                L_0x00c6:
                    kotlin.Unit r10 = kotlin.Unit.f40552a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.configurations.GetCardOptionsMenuConfigurationUseCase$invoke$$inlined$map$1.AnonymousClass2.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }, continuation);
        return a2 == IntrinsicsKt.f() ? a2 : Unit.f40552a;
    }
}
