package com.google.firebase.installations;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata
public final class FirebaseInstallationsKtxRegistrar implements ComponentRegistrar {
    public List getComponents() {
        return CollectionsKt.m();
    }
}
