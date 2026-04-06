package com.hansecom.abt.presentation.screens.home.faremedia.transferBalance;

import androidx.compose.foundation.lazy.LazyListScope;
import kotlin.jvm.functions.Function1;
import kotlinx.collections.immutable.ImmutableList;

/* renamed from: com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.a  reason: case insensitive filesystem */
public final /* synthetic */ class C0599a implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ImmutableList f37334A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f37335B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ImmutableList f37336z;

    public /* synthetic */ C0599a(ImmutableList immutableList, ImmutableList immutableList2, Function1 function1) {
        this.f37336z = immutableList;
        this.f37334A = immutableList2;
        this.f37335B = function1;
    }

    public final Object invoke(Object obj) {
        return FareMediaSelectorKt.v(this.f37336z, this.f37334A, this.f37335B, (LazyListScope) obj);
    }
}
