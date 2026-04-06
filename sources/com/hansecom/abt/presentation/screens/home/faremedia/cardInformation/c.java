package com.hansecom.abt.presentation.screens.home.faremedia.cardInformation;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ImmutableList;

public final /* synthetic */ class c implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ImmutableList f36449A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f36450B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f36451z;

    public /* synthetic */ c(String str, ImmutableList immutableList, int i2) {
        this.f36451z = str;
        this.f36449A = immutableList;
        this.f36450B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return CardInformationScreenKt.l(this.f36451z, this.f36449A, this.f36450B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
