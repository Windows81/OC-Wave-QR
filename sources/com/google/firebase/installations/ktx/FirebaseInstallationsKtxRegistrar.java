package com.google.firebase.installations.ktx;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata
@Deprecated
public final class FirebaseInstallationsKtxRegistrar implements ComponentRegistrar {
    public List getComponents() {
        return CollectionsKt.m();
    }
}
