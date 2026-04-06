package com.hansecom.abt.presentation.screens.home.account.address;

import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ObjectSerializer;

@Metadata
@Serializable
public final class ChangeAddressChooseStateDestination {
    public static final ChangeAddressChooseStateDestination INSTANCE = new ChangeAddressChooseStateDestination();

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ Lazy f35133a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new C0454d());

    public static final /* synthetic */ KSerializer b() {
        return new ObjectSerializer("com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressChooseStateDestination", INSTANCE, new Annotation[0]);
    }

    public final /* synthetic */ KSerializer c() {
        return (KSerializer) f35133a.getValue();
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof ChangeAddressChooseStateDestination);
    }

    public int hashCode() {
        return -714893305;
    }

    public final KSerializer<ChangeAddressChooseStateDestination> serializer() {
        return c();
    }

    public String toString() {
        return "ChangeAddressChooseStateDestination";
    }
}
