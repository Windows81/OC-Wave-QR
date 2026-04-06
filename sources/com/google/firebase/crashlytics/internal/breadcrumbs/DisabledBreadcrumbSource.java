package com.google.firebase.crashlytics.internal.breadcrumbs;

import com.google.firebase.crashlytics.internal.Logger;

public class DisabledBreadcrumbSource implements BreadcrumbSource {
    public void a(BreadcrumbHandler breadcrumbHandler) {
        Logger.f().b("Could not register handler for breadcrumbs events.");
    }
}
